grammar redisql_sky;

options {
  language = Java;
}

@header {
package sky.redis.antlr;
import java.util.*;
import sky.redis.data.model.*;
import sky.redis.core.*;
import sky.redis.exception.*;
}

@lexer::header {
package sky.redis.antlr;
import java.util.*;
import sky.redis.data.model.*;
import sky.redis.core.*;
import sky.redis.exception.*;
}

@members {
private RedisCreater creater=new RedisCreater();
private RedisInsertor insertor=new RedisInsertor();
private RedisUpdater updater=new RedisUpdater();
private RedisSelecter selecter=new RedisSelecter();
private RedisConfig config=new RedisConfig();
private RedisCounterManager manager=new RedisCounterManager();
}

rule throws GroupFilterNotExistsException,CountedNotExistsException,FilterNotExistsException, DistinctFilterNotExistsException, CounterNotExistsException, MainFilterNotExistsException: set_ttl_sign|set_ttl|desc|update|create|insert|select|config;

desc returns[String info]: WS* 'desc counter' WS+ name=VALUE WS* ';'{
  $info = manager.desc($name.text);
};

manager : set_ttl|set_ttl_sign;

set_ttl : WS* SET WS* 'ttl' WS* '=' time=VALUE WS+ FROM WS+ name=VALUE WS*';'{
  manager.setTtl($name.text, $time.text);
};

set_ttl_sign : WS* SET WS* 'ttlsign' WS* '=' time=VALUE WS+ FROM WS+ name=VALUE WS*';'{
  manager.setTtl($name.text, $time.text);
};

config : WS* CONFIG WS+ SET WS* {
Map<String, String> configMap = new HashMap<String,String>();
}
key=VALUE WS* '=' WS* val=VALUE {
configMap.put($key.text, $val.text);
}(WS+ AND WS+ key=VALUE WS* '=' WS* val=VALUE {
configMap.put($key.text, $val.text);
})* WS*';'{
config.config(configMap);
};

create throws FilterNotExistsException, DistinctFilterNotExistsException, MainFilterNotExistsException: WS* 'create counter' WS+ name=VALUE WS+ 'filter' WS* '{' c=counted_define ',' e=filter_define WS* '}' {
 creater.finishCounter($name.text, $e.filters, $c.cname);
}
other_define WS* ';'{
  creater.create();
};

counted_define returns[String cname] : WS* name=VALUE WS* 'counted'  WS*{
 $cname=$name.text;
};

ttl_define : WS+ SET WS* 'ttl' WS* '=' WS* time=VALUE {
  creater.setTtl($time.text);
};

ttl_sign_define : WS+ SET WS* 'ttlsign' WS* '=' WS* sign=VALUE {
  creater.setTtlSign($sign.text);
};

filter_define returns[List<RFilter> filters]: WS* name=VALUE{
  $filters = new ArrayList<RFilter>();
  $filters.add(new RFilter($name.text));
} (',' WS* name=VALUE{
  $filters.add(new RFilter($name.text));
})*;

other_define throws FilterNotExistsException: (excluded_filter_define|ttl_define|ttl_sign_define|main_filter_define|distinct_filter_define|group_filter_define|ttl_filter_define)*;

main_filter_define throws FilterNotExistsException: WS* 'main filter' WS* '{' e=filter_define WS* '}' {
  creater.setMainFilter($e.filters);
};

ttl_filter_define throws FilterNotExistsException: WS* 'ttl filter' WS* '{' e=filter_define WS* '}' {
  creater.setTtlFilter($e.filters);
};

distinct_filter_define throws FilterNotExistsException: WS* 'distinct filter' WS* '{'e=filter_define WS* '}' {
  creater.setDisFilter($e.filters);
};

group_filter_define throws FilterNotExistsException: WS* 'group filter' WS* '{'e=filter_define WS* '}' {
  creater.setGroupFilter($e.filters);
};

excluded_filter_define throws FilterNotExistsException: WS* 'excluded filter' WS* '{'e=filter_define WS* '}' {
  creater.setExcludeFilter($e.filters);
};

update returns [List<String> done] throws CountedNotExistsException,FilterNotExistsException, DistinctFilterNotExistsException, MainFilterNotExistsException, CounterNotExistsException: WS* UPDATE
 WS+ name=VALUE {
  updater.initCounter($name.text);
} (WS+ SET WS* val=VALUE WS* '=' WS* num=VALUE {
  updater.setValue($val.text, $num.text);
})* WS* '{' e=insert_atom '}' WS* ';'{
  $done=updater.update($e.insert_atom);
};

insert returns [List<String> done] throws CountedNotExistsException,FilterNotExistsException, DistinctFilterNotExistsException, MainFilterNotExistsException, CounterNotExistsException: WS* 'insert'
 WS+ name=VALUE {
  insertor.initCounter($name.text);
} (set_value)* WS* '{' e=insert_atom '}' WS* ';'{
  $done=insertor.insert($e.insert_atom);
};

set_value throws CountedNotExistsException:WS+ SET
WS* val=VALUE WS* '=' WS* num=VALUE {
  insertor.setValue($val.text, $num.text);
};

insert_atom returns[Map<String, List<String>> insert_atom]: WS* name=VALUE WS* '=' WS* val=VALUE WS*{
  $insert_atom = new HashMap<String, List<String>>();
  List<String> list = new ArrayList<String>();
  list.add($val.text);
  $insert_atom.put($name.text, list);
}(',' WS* name=VALUE WS* '=' WS* val=VALUE WS*{
  list = new ArrayList<String>();
  list.add($val.text);
  $insert_atom.put($name.text, list);
})*;

select returns[Map<String,String> map] throws MainFilterNotExistsException,GroupFilterNotExistsException,CountedNotExistsException,CounterNotExistsException, FilterNotExistsException :
(s=select_normal) {
$map = $s.resMap;
};

select_normal returns[Map<String,String> resMap] throws MainFilterNotExistsException,GroupFilterNotExistsException,CountedNotExistsException,CounterNotExistsException, FilterNotExistsException: WS* SELECT WS+ v=VALUE WS+ FROM WS+ counter_name=VALUE {
  selecter.initCounter($counter_name.text);
}WS+ WHERE WS+ e=select_atom {
  $resMap=selecter.select($v.text, $e.select_atom);
}WS*';';

group returns[List<String> groupList]: WS+ GROUP WS+ name=VALUE {
  $groupList = new ArrayList<String>();
  $groupList.add($name.text);
};

select_atom returns[Map<String, List<String>> select_atom] throws GroupFilterNotExistsException, FilterNotExistsException : name=VALUE WS* '=' WS* val=VALUE {
    $select_atom = new HashMap<String, List<String>>();
    List<String> list = new ArrayList<String>();
    list.add($val.text);
}(WS* ',' WS* val=VALUE {
    list.add($val.text);
})* {
    $select_atom.put($name.text, list);
}(WS+ AND WS+ name=VALUE WS* '=' WS* val=VALUE {
    list = new ArrayList<String>();
    list.add($val.text);
}(WS* ',' WS* val=VALUE {
    list.add($val.text);
})*{
    $select_atom.put($name.text, list);
})*(g=group{
  selecter.group($select_atom, $g.groupList);
})*;

//selectall returns[Map<String,String> resMap] throws CounterNotExistsException, FilterNotExistsException, GroupFilterNotExistsException, MainFilterNotExistsException: WS* 'selectAll' WS+ FROM WS+ name=VALUE {
//  selecter.initCounter($name.text);
//} WS+ WHERE WS+ e=select_atom WS* {
//  $resMap=selecter.selectAll($e.select_atom);
//}';';

WS
  :
  (
    ' '
    | '\t'
    | '\n'
    | '\r'
  )+
  ;
SET : 'set ';
SELECT : 'select'|'SELECT';
UPDATE : 'update' | 'UPDATE';
CREATE : 'create' | 'CREATE';
AND : 'AND'|'and';
FROM : 'from' | 'FROM';
WHERE : 'where' | 'WHERE';
GROUP : 'group'WS+'by'|'GROUP'WS*'BY';
CONFIG : 'config'|'CONFIG';
VALUE
  :
  
    (~(' '|'\t'|'\n'|'='|';'|'\''|'{'|'}'|','))+
  
  ;
