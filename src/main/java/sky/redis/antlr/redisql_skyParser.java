// $ANTLR 3.4 /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g 2013-01-24 10:58:25

package sky.redis.antlr;
import java.util.*;
import sky.redis.data.model.*;
import sky.redis.core.*;
import sky.redis.exception.*;


import org.antlr.runtime.*;
import org.antlr.runtime.BitSet;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class redisql_skyParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "CONFIG", "CREATE", "FROM", "GROUP", "SELECT", "SET", "UPDATE", "VALUE", "WHERE", "WS", "','", "';'", "'='", "'counted'", "'create counter'", "'desc counter'", "'distinct filter'", "'excluded filter'", "'filter'", "'group filter'", "'insert'", "'main filter'", "'ttl filter'", "'ttl'", "'ttlsign'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int AND=4;
    public static final int CONFIG=5;
    public static final int CREATE=6;
    public static final int FROM=7;
    public static final int GROUP=8;
    public static final int SELECT=9;
    public static final int SET=10;
    public static final int UPDATE=11;
    public static final int VALUE=12;
    public static final int WHERE=13;
    public static final int WS=14;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public redisql_skyParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public redisql_skyParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return redisql_skyParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g"; }


    private RedisCreater creater=new RedisCreater();
    private RedisInsertor insertor=new RedisInsertor();
    private RedisUpdater updater=new RedisUpdater();
    private RedisSelecter selecter=new RedisSelecter();
    private RedisConfig config=new RedisConfig();
    private RedisCounterManager manager=new RedisCounterManager();



    // $ANTLR start "rule"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:32:1: rule : ( set_ttl_sign | set_ttl | desc | update | create | insert | select | config );
    public final void rule() throws FilterNotExistsException, DistinctFilterNotExistsException, MainFilterNotExistsException, RecognitionException, CounterNotExistsException, GroupFilterNotExistsException, CountedNotExistsException {
        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:32:184: ( set_ttl_sign | set_ttl | desc | update | create | insert | select | config )
            int alt1=8;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:32:186: set_ttl_sign
                    {
                    pushFollow(FOLLOW_set_ttl_sign_in_rule61);
                    set_ttl_sign();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:32:199: set_ttl
                    {
                    pushFollow(FOLLOW_set_ttl_in_rule63);
                    set_ttl();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:32:207: desc
                    {
                    pushFollow(FOLLOW_desc_in_rule65);
                    desc();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:32:212: update
                    {
                    pushFollow(FOLLOW_update_in_rule67);
                    update();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:32:219: create
                    {
                    pushFollow(FOLLOW_create_in_rule69);
                    create();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:32:226: insert
                    {
                    pushFollow(FOLLOW_insert_in_rule71);
                    insert();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:32:233: select
                    {
                    pushFollow(FOLLOW_select_in_rule73);
                    select();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:32:240: config
                    {
                    pushFollow(FOLLOW_config_in_rule75);
                    config();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "rule"



    // $ANTLR start "desc"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:34:1: desc returns [String info] : ( WS )* 'desc counter' ( WS )+ name= VALUE ( WS )* ';' ;
    public final String desc() throws RecognitionException {
        String info = null;


        Token name=null;

        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:34:26: ( ( WS )* 'desc counter' ( WS )+ name= VALUE ( WS )* ';' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:34:28: ( WS )* 'desc counter' ( WS )+ name= VALUE ( WS )* ';'
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:34:28: ( WS )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==WS) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:34:28: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_desc85); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,20,FOLLOW_20_in_desc88); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:34:47: ( WS )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==WS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:34:47: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_desc90); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            name=(Token)match(input,VALUE,FOLLOW_VALUE_in_desc95); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:34:62: ( WS )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==WS) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:34:62: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_desc97); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,16,FOLLOW_16_in_desc100); 


              info = manager.desc((name!=null?name.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return info;
    }
    // $ANTLR end "desc"



    // $ANTLR start "manager"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:38:1: manager : ( set_ttl | set_ttl_sign );
    public final void manager() throws RecognitionException {
        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:38:9: ( set_ttl | set_ttl_sign )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:38:11: set_ttl
                    {
                    pushFollow(FOLLOW_set_ttl_in_manager109);
                    set_ttl();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:38:19: set_ttl_sign
                    {
                    pushFollow(FOLLOW_set_ttl_sign_in_manager111);
                    set_ttl_sign();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "manager"



    // $ANTLR start "set_ttl"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:40:1: set_ttl : ( WS )* SET ( WS )* 'ttl' ( WS )* '=' time= VALUE ( WS )+ FROM ( WS )+ name= VALUE ( WS )* ';' ;
    public final void set_ttl() throws RecognitionException {
        Token time=null;
        Token name=null;

        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:40:9: ( ( WS )* SET ( WS )* 'ttl' ( WS )* '=' time= VALUE ( WS )+ FROM ( WS )+ name= VALUE ( WS )* ';' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:40:11: ( WS )* SET ( WS )* 'ttl' ( WS )* '=' time= VALUE ( WS )+ FROM ( WS )+ name= VALUE ( WS )* ';'
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:40:11: ( WS )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==WS) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:40:11: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_set_ttl119); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match(input,SET,FOLLOW_SET_in_set_ttl122); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:40:19: ( WS )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==WS) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:40:19: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_set_ttl124); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input,28,FOLLOW_28_in_set_ttl127); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:40:29: ( WS )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==WS) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:40:29: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_set_ttl129); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match(input,17,FOLLOW_17_in_set_ttl132); 

            time=(Token)match(input,VALUE,FOLLOW_VALUE_in_set_ttl136); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:40:48: ( WS )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==WS) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:40:48: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_set_ttl138); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            match(input,FROM,FOLLOW_FROM_in_set_ttl141); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:40:57: ( WS )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==WS) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:40:57: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_set_ttl143); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            name=(Token)match(input,VALUE,FOLLOW_VALUE_in_set_ttl148); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:40:72: ( WS )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==WS) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:40:72: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_set_ttl150); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match(input,16,FOLLOW_16_in_set_ttl152); 


              manager.setTtl((name!=null?name.getText():null), (time!=null?time.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "set_ttl"



    // $ANTLR start "set_ttl_sign"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:44:1: set_ttl_sign : ( WS )* SET ( WS )* 'ttlsign' ( WS )* '=' time= VALUE ( WS )+ FROM ( WS )+ name= VALUE ( WS )* ';' ;
    public final void set_ttl_sign() throws RecognitionException {
        Token time=null;
        Token name=null;

        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:44:14: ( ( WS )* SET ( WS )* 'ttlsign' ( WS )* '=' time= VALUE ( WS )+ FROM ( WS )+ name= VALUE ( WS )* ';' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:44:16: ( WS )* SET ( WS )* 'ttlsign' ( WS )* '=' time= VALUE ( WS )+ FROM ( WS )+ name= VALUE ( WS )* ';'
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:44:16: ( WS )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==WS) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:44:16: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_set_ttl_sign161); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            match(input,SET,FOLLOW_SET_in_set_ttl_sign164); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:44:24: ( WS )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==WS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:44:24: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_set_ttl_sign166); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match(input,29,FOLLOW_29_in_set_ttl_sign169); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:44:38: ( WS )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==WS) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:44:38: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_set_ttl_sign171); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            match(input,17,FOLLOW_17_in_set_ttl_sign174); 

            time=(Token)match(input,VALUE,FOLLOW_VALUE_in_set_ttl_sign178); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:44:57: ( WS )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==WS) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:44:57: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_set_ttl_sign180); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            match(input,FROM,FOLLOW_FROM_in_set_ttl_sign183); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:44:66: ( WS )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==WS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:44:66: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_set_ttl_sign185); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            name=(Token)match(input,VALUE,FOLLOW_VALUE_in_set_ttl_sign190); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:44:81: ( WS )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==WS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:44:81: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_set_ttl_sign192); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            match(input,16,FOLLOW_16_in_set_ttl_sign194); 


              manager.setTtl((name!=null?name.getText():null), (time!=null?time.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "set_ttl_sign"



    // $ANTLR start "config"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:48:1: config : ( WS )* CONFIG ( WS )+ SET ( WS )* key= VALUE ( WS )* '=' ( WS )* val= VALUE ( ( WS )+ AND ( WS )+ key= VALUE ( WS )* '=' ( WS )* val= VALUE )* ( WS )* ';' ;
    public final void config() throws RecognitionException {
        Token key=null;
        Token val=null;

        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:48:8: ( ( WS )* CONFIG ( WS )+ SET ( WS )* key= VALUE ( WS )* '=' ( WS )* val= VALUE ( ( WS )+ AND ( WS )+ key= VALUE ( WS )* '=' ( WS )* val= VALUE )* ( WS )* ';' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:48:10: ( WS )* CONFIG ( WS )+ SET ( WS )* key= VALUE ( WS )* '=' ( WS )* val= VALUE ( ( WS )+ AND ( WS )+ key= VALUE ( WS )* '=' ( WS )* val= VALUE )* ( WS )* ';'
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:48:10: ( WS )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==WS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:48:10: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_config203); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            match(input,CONFIG,FOLLOW_CONFIG_in_config206); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:48:21: ( WS )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==WS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:48:21: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_config208); 

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            match(input,SET,FOLLOW_SET_in_config211); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:48:29: ( WS )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==WS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:48:29: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_config213); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);



            Map<String, String> configMap = new HashMap<String,String>();


            key=(Token)match(input,VALUE,FOLLOW_VALUE_in_config220); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:51:11: ( WS )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==WS) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:51:11: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_config222); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            match(input,17,FOLLOW_17_in_config225); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:51:19: ( WS )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==WS) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:51:19: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_config227); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            val=(Token)match(input,VALUE,FOLLOW_VALUE_in_config232); 


            configMap.put((key!=null?key.getText():null), (val!=null?val.getText():null));


            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:53:2: ( ( WS )+ AND ( WS )+ key= VALUE ( WS )* '=' ( WS )* val= VALUE )*
            loop27:
            do {
                int alt27=2;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:53:3: ( WS )+ AND ( WS )+ key= VALUE ( WS )* '=' ( WS )* val= VALUE
            	    {
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:53:3: ( WS )+
            	    int cnt23=0;
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==WS) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:53:3: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_config236); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt23 >= 1 ) break loop23;
            	                EarlyExitException eee =
            	                    new EarlyExitException(23, input);
            	                throw eee;
            	        }
            	        cnt23++;
            	    } while (true);


            	    match(input,AND,FOLLOW_AND_in_config239); 

            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:53:11: ( WS )+
            	    int cnt24=0;
            	    loop24:
            	    do {
            	        int alt24=2;
            	        int LA24_0 = input.LA(1);

            	        if ( (LA24_0==WS) ) {
            	            alt24=1;
            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:53:11: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_config241); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt24 >= 1 ) break loop24;
            	                EarlyExitException eee =
            	                    new EarlyExitException(24, input);
            	                throw eee;
            	        }
            	        cnt24++;
            	    } while (true);


            	    key=(Token)match(input,VALUE,FOLLOW_VALUE_in_config246); 

            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:53:25: ( WS )*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==WS) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:53:25: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_config248); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop25;
            	        }
            	    } while (true);


            	    match(input,17,FOLLOW_17_in_config251); 

            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:53:33: ( WS )*
            	    loop26:
            	    do {
            	        int alt26=2;
            	        int LA26_0 = input.LA(1);

            	        if ( (LA26_0==WS) ) {
            	            alt26=1;
            	        }


            	        switch (alt26) {
            	    	case 1 :
            	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:53:33: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_config253); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop26;
            	        }
            	    } while (true);


            	    val=(Token)match(input,VALUE,FOLLOW_VALUE_in_config258); 


            	    configMap.put((key!=null?key.getText():null), (val!=null?val.getText():null));


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:55:5: ( WS )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==WS) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:55:5: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_config264); 

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            match(input,16,FOLLOW_16_in_config266); 


            config.config(configMap);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "config"



    // $ANTLR start "create"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:59:1: create : ( WS )* 'create counter' ( WS )+ name= VALUE ( WS )+ 'filter' ( WS )* '{' c= counted_define ',' e= filter_define ( WS )* '}' other_define ( WS )* ';' ;
    public final void create() throws FilterNotExistsException, DistinctFilterNotExistsException, MainFilterNotExistsException, RecognitionException {
        Token name=null;
        String c =null;

        List<RFilter> e =null;


        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:59:103: ( ( WS )* 'create counter' ( WS )+ name= VALUE ( WS )+ 'filter' ( WS )* '{' c= counted_define ',' e= filter_define ( WS )* '}' other_define ( WS )* ';' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:59:105: ( WS )* 'create counter' ( WS )+ name= VALUE ( WS )+ 'filter' ( WS )* '{' c= counted_define ',' e= filter_define ( WS )* '}' other_define ( WS )* ';'
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:59:105: ( WS )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==WS) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:59:105: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_create284); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            match(input,19,FOLLOW_19_in_create287); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:59:126: ( WS )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==WS) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:59:126: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_create289); 

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


            name=(Token)match(input,VALUE,FOLLOW_VALUE_in_create294); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:59:141: ( WS )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==WS) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:59:141: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_create296); 

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            match(input,23,FOLLOW_23_in_create299); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:59:154: ( WS )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==WS) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:59:154: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_create301); 

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            match(input,30,FOLLOW_30_in_create304); 

            pushFollow(FOLLOW_counted_define_in_create308);
            c=counted_define();

            state._fsp--;


            match(input,15,FOLLOW_15_in_create310); 

            pushFollow(FOLLOW_filter_define_in_create314);
            e=filter_define();

            state._fsp--;


            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:59:199: ( WS )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==WS) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:59:199: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_create316); 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            match(input,31,FOLLOW_31_in_create319); 


             creater.finishCounter((name!=null?name.getText():null), e, c);


            pushFollow(FOLLOW_other_define_in_create323);
            other_define();

            state._fsp--;


            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:62:14: ( WS )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==WS) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:62:14: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_create325); 

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            match(input,16,FOLLOW_16_in_create328); 


              creater.create();


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "create"



    // $ANTLR start "counted_define"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:66:1: counted_define returns [String cname] : ( WS )* name= VALUE ( WS )* 'counted' ( WS )* ;
    public final String counted_define() throws RecognitionException {
        String cname = null;


        Token name=null;

        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:66:38: ( ( WS )* name= VALUE ( WS )* 'counted' ( WS )* )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:66:40: ( WS )* name= VALUE ( WS )* 'counted' ( WS )*
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:66:40: ( WS )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==WS) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:66:40: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_counted_define340); 

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            name=(Token)match(input,VALUE,FOLLOW_VALUE_in_counted_define345); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:66:55: ( WS )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==WS) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:66:55: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_counted_define347); 

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            match(input,18,FOLLOW_18_in_counted_define350); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:66:70: ( WS )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==WS) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:66:70: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_counted_define353); 

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);



             cname =(name!=null?name.getText():null);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return cname;
    }
    // $ANTLR end "counted_define"



    // $ANTLR start "ttl_define"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:70:1: ttl_define : ( WS )+ SET ( WS )* 'ttl' ( WS )* '=' ( WS )* time= VALUE ;
    public final void ttl_define() throws RecognitionException {
        Token time=null;

        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:70:12: ( ( WS )+ SET ( WS )* 'ttl' ( WS )* '=' ( WS )* time= VALUE )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:70:14: ( WS )+ SET ( WS )* 'ttl' ( WS )* '=' ( WS )* time= VALUE
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:70:14: ( WS )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==WS) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:70:14: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_ttl_define363); 

            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);


            match(input,SET,FOLLOW_SET_in_ttl_define366); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:70:22: ( WS )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==WS) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:70:22: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_ttl_define368); 

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            match(input,28,FOLLOW_28_in_ttl_define371); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:70:32: ( WS )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==WS) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:70:32: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_ttl_define373); 

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            match(input,17,FOLLOW_17_in_ttl_define376); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:70:40: ( WS )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==WS) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:70:40: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_ttl_define378); 

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            time=(Token)match(input,VALUE,FOLLOW_VALUE_in_ttl_define383); 


              creater.setTtl((time!=null?time.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "ttl_define"



    // $ANTLR start "ttl_sign_define"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:74:1: ttl_sign_define : ( WS )+ SET ( WS )* 'ttlsign' ( WS )* '=' ( WS )* sign= VALUE ;
    public final void ttl_sign_define() throws RecognitionException {
        Token sign=null;

        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:74:17: ( ( WS )+ SET ( WS )* 'ttlsign' ( WS )* '=' ( WS )* sign= VALUE )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:74:19: ( WS )+ SET ( WS )* 'ttlsign' ( WS )* '=' ( WS )* sign= VALUE
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:74:19: ( WS )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==WS) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:74:19: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_ttl_sign_define393); 

            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);


            match(input,SET,FOLLOW_SET_in_ttl_sign_define396); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:74:27: ( WS )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==WS) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:74:27: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_ttl_sign_define398); 

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            match(input,29,FOLLOW_29_in_ttl_sign_define401); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:74:41: ( WS )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==WS) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:74:41: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_ttl_sign_define403); 

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            match(input,17,FOLLOW_17_in_ttl_sign_define406); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:74:49: ( WS )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==WS) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:74:49: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_ttl_sign_define408); 

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            sign=(Token)match(input,VALUE,FOLLOW_VALUE_in_ttl_sign_define413); 


              creater.setTtlSign((sign!=null?sign.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "ttl_sign_define"



    // $ANTLR start "filter_define"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:78:1: filter_define returns [List<RFilter> filters] : ( WS )* name= VALUE ( ',' ( WS )* name= VALUE )* ;
    public final List<RFilter> filter_define() throws RecognitionException {
        List<RFilter> filters = null;


        Token name=null;

        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:78:45: ( ( WS )* name= VALUE ( ',' ( WS )* name= VALUE )* )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:78:47: ( WS )* name= VALUE ( ',' ( WS )* name= VALUE )*
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:78:47: ( WS )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==WS) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:78:47: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_filter_define425); 

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            name=(Token)match(input,VALUE,FOLLOW_VALUE_in_filter_define430); 


              filters = new ArrayList<RFilter>();
              filters.add(new RFilter((name!=null?name.getText():null)));


            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:81:3: ( ',' ( WS )* name= VALUE )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==15) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:81:4: ',' ( WS )* name= VALUE
            	    {
            	    match(input,15,FOLLOW_15_in_filter_define434); 

            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:81:8: ( WS )*
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( (LA47_0==WS) ) {
            	            alt47=1;
            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:81:8: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_filter_define436); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop47;
            	        }
            	    } while (true);


            	    name=(Token)match(input,VALUE,FOLLOW_VALUE_in_filter_define441); 


            	      filters.add(new RFilter((name!=null?name.getText():null)));


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return filters;
    }
    // $ANTLR end "filter_define"



    // $ANTLR start "other_define"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:85:1: other_define : ( excluded_filter_define | ttl_define | ttl_sign_define | main_filter_define | distinct_filter_define | group_filter_define | ttl_filter_define )* ;
    public final void other_define() throws FilterNotExistsException, RecognitionException {
        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:85:45: ( ( excluded_filter_define | ttl_define | ttl_sign_define | main_filter_define | distinct_filter_define | group_filter_define | ttl_filter_define )* )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:85:47: ( excluded_filter_define | ttl_define | ttl_sign_define | main_filter_define | distinct_filter_define | group_filter_define | ttl_filter_define )*
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:85:47: ( excluded_filter_define | ttl_define | ttl_sign_define | main_filter_define | distinct_filter_define | group_filter_define | ttl_filter_define )*
            loop49:
            do {
                int alt49=8;
                alt49 = dfa49.predict(input);
                switch (alt49) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:85:48: excluded_filter_define
            	    {
            	    pushFollow(FOLLOW_excluded_filter_define_in_other_define456);
            	    excluded_filter_define();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:85:71: ttl_define
            	    {
            	    pushFollow(FOLLOW_ttl_define_in_other_define458);
            	    ttl_define();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:85:82: ttl_sign_define
            	    {
            	    pushFollow(FOLLOW_ttl_sign_define_in_other_define460);
            	    ttl_sign_define();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:85:98: main_filter_define
            	    {
            	    pushFollow(FOLLOW_main_filter_define_in_other_define462);
            	    main_filter_define();

            	    state._fsp--;


            	    }
            	    break;
            	case 5 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:85:117: distinct_filter_define
            	    {
            	    pushFollow(FOLLOW_distinct_filter_define_in_other_define464);
            	    distinct_filter_define();

            	    state._fsp--;


            	    }
            	    break;
            	case 6 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:85:140: group_filter_define
            	    {
            	    pushFollow(FOLLOW_group_filter_define_in_other_define466);
            	    group_filter_define();

            	    state._fsp--;


            	    }
            	    break;
            	case 7 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:85:160: ttl_filter_define
            	    {
            	    pushFollow(FOLLOW_ttl_filter_define_in_other_define468);
            	    ttl_filter_define();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "other_define"



    // $ANTLR start "main_filter_define"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:87:1: main_filter_define : ( WS )* 'main filter' ( WS )* '{' e= filter_define ( WS )* '}' ;
    public final void main_filter_define() throws FilterNotExistsException, RecognitionException {
        List<RFilter> e =null;


        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:87:51: ( ( WS )* 'main filter' ( WS )* '{' e= filter_define ( WS )* '}' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:87:53: ( WS )* 'main filter' ( WS )* '{' e= filter_define ( WS )* '}'
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:87:53: ( WS )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==WS) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:87:53: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_main_filter_define481); 

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            match(input,26,FOLLOW_26_in_main_filter_define484); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:87:71: ( WS )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==WS) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:87:71: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_main_filter_define486); 

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            match(input,30,FOLLOW_30_in_main_filter_define489); 

            pushFollow(FOLLOW_filter_define_in_main_filter_define493);
            e=filter_define();

            state._fsp--;


            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:87:95: ( WS )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==WS) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:87:95: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_main_filter_define495); 

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            match(input,31,FOLLOW_31_in_main_filter_define498); 


              creater.setMainFilter(e);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "main_filter_define"



    // $ANTLR start "ttl_filter_define"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:91:1: ttl_filter_define : ( WS )* 'ttl filter' ( WS )* '{' e= filter_define ( WS )* '}' ;
    public final void ttl_filter_define() throws FilterNotExistsException, RecognitionException {
        List<RFilter> e =null;


        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:91:50: ( ( WS )* 'ttl filter' ( WS )* '{' e= filter_define ( WS )* '}' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:91:52: ( WS )* 'ttl filter' ( WS )* '{' e= filter_define ( WS )* '}'
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:91:52: ( WS )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==WS) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:91:52: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_ttl_filter_define511); 

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            match(input,27,FOLLOW_27_in_ttl_filter_define514); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:91:69: ( WS )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==WS) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:91:69: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_ttl_filter_define516); 

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            match(input,30,FOLLOW_30_in_ttl_filter_define519); 

            pushFollow(FOLLOW_filter_define_in_ttl_filter_define523);
            e=filter_define();

            state._fsp--;


            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:91:93: ( WS )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==WS) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:91:93: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_ttl_filter_define525); 

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            match(input,31,FOLLOW_31_in_ttl_filter_define528); 


              creater.setTtlFilter(e);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "ttl_filter_define"



    // $ANTLR start "distinct_filter_define"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:95:1: distinct_filter_define : ( WS )* 'distinct filter' ( WS )* '{' e= filter_define ( WS )* '}' ;
    public final void distinct_filter_define() throws FilterNotExistsException, RecognitionException {
        List<RFilter> e =null;


        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:95:55: ( ( WS )* 'distinct filter' ( WS )* '{' e= filter_define ( WS )* '}' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:95:57: ( WS )* 'distinct filter' ( WS )* '{' e= filter_define ( WS )* '}'
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:95:57: ( WS )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==WS) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:95:57: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_distinct_filter_define541); 

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            match(input,21,FOLLOW_21_in_distinct_filter_define544); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:95:79: ( WS )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==WS) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:95:79: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_distinct_filter_define546); 

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            match(input,30,FOLLOW_30_in_distinct_filter_define549); 

            pushFollow(FOLLOW_filter_define_in_distinct_filter_define552);
            e=filter_define();

            state._fsp--;


            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:95:102: ( WS )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==WS) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:95:102: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_distinct_filter_define554); 

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            match(input,31,FOLLOW_31_in_distinct_filter_define557); 


              creater.setDisFilter(e);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "distinct_filter_define"



    // $ANTLR start "group_filter_define"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:99:1: group_filter_define : ( WS )* 'group filter' ( WS )* '{' e= filter_define ( WS )* '}' ;
    public final void group_filter_define() throws FilterNotExistsException, RecognitionException {
        List<RFilter> e =null;


        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:99:52: ( ( WS )* 'group filter' ( WS )* '{' e= filter_define ( WS )* '}' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:99:54: ( WS )* 'group filter' ( WS )* '{' e= filter_define ( WS )* '}'
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:99:54: ( WS )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==WS) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:99:54: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_group_filter_define570); 

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            match(input,24,FOLLOW_24_in_group_filter_define573); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:99:73: ( WS )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==WS) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:99:73: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_group_filter_define575); 

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            match(input,30,FOLLOW_30_in_group_filter_define578); 

            pushFollow(FOLLOW_filter_define_in_group_filter_define581);
            e=filter_define();

            state._fsp--;


            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:99:96: ( WS )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==WS) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:99:96: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_group_filter_define583); 

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            match(input,31,FOLLOW_31_in_group_filter_define586); 


              creater.setGroupFilter(e);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "group_filter_define"



    // $ANTLR start "excluded_filter_define"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:103:1: excluded_filter_define : ( WS )* 'excluded filter' ( WS )* '{' e= filter_define ( WS )* '}' ;
    public final void excluded_filter_define() throws FilterNotExistsException, RecognitionException {
        List<RFilter> e =null;


        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:103:55: ( ( WS )* 'excluded filter' ( WS )* '{' e= filter_define ( WS )* '}' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:103:57: ( WS )* 'excluded filter' ( WS )* '{' e= filter_define ( WS )* '}'
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:103:57: ( WS )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==WS) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:103:57: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_excluded_filter_define599); 

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            match(input,22,FOLLOW_22_in_excluded_filter_define602); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:103:79: ( WS )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==WS) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:103:79: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_excluded_filter_define604); 

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            match(input,30,FOLLOW_30_in_excluded_filter_define607); 

            pushFollow(FOLLOW_filter_define_in_excluded_filter_define610);
            e=filter_define();

            state._fsp--;


            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:103:102: ( WS )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==WS) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:103:102: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_excluded_filter_define612); 

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            match(input,31,FOLLOW_31_in_excluded_filter_define615); 


              creater.setExcludeFilter(e);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "excluded_filter_define"



    // $ANTLR start "update"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:107:1: update returns [List<String> done] : ( WS )* UPDATE ( WS )+ name= VALUE ( ( WS )+ SET ( WS )* val= VALUE ( WS )* '=' ( WS )* num= VALUE )* ( WS )* '{' e= insert_atom '}' ( WS )* ';' ;
    public final List<String> update() throws FilterNotExistsException, DistinctFilterNotExistsException, MainFilterNotExistsException, RecognitionException, CounterNotExistsException, CountedNotExistsException {
        List<String> done = null;


        Token name=null;
        Token val=null;
        Token num=null;
        Map<String, List<String>> e =null;


        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:107:184: ( ( WS )* UPDATE ( WS )+ name= VALUE ( ( WS )+ SET ( WS )* val= VALUE ( WS )* '=' ( WS )* num= VALUE )* ( WS )* '{' e= insert_atom '}' ( WS )* ';' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:107:186: ( WS )* UPDATE ( WS )+ name= VALUE ( ( WS )+ SET ( WS )* val= VALUE ( WS )* '=' ( WS )* num= VALUE )* ( WS )* '{' e= insert_atom '}' ( WS )* ';'
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:107:186: ( WS )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==WS) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:107:186: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_update643); 

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            match(input,UPDATE,FOLLOW_UPDATE_in_update646); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:108:2: ( WS )+
            int cnt66=0;
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==WS) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:108:2: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_update649); 

            	    }
            	    break;

            	default :
            	    if ( cnt66 >= 1 ) break loop66;
                        EarlyExitException eee =
                            new EarlyExitException(66, input);
                        throw eee;
                }
                cnt66++;
            } while (true);


            name=(Token)match(input,VALUE,FOLLOW_VALUE_in_update654); 


              updater.initCounter((name!=null?name.getText():null));


            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:110:3: ( ( WS )+ SET ( WS )* val= VALUE ( WS )* '=' ( WS )* num= VALUE )*
            loop71:
            do {
                int alt71=2;
                alt71 = dfa71.predict(input);
                switch (alt71) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:110:4: ( WS )+ SET ( WS )* val= VALUE ( WS )* '=' ( WS )* num= VALUE
            	    {
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:110:4: ( WS )+
            	    int cnt67=0;
            	    loop67:
            	    do {
            	        int alt67=2;
            	        int LA67_0 = input.LA(1);

            	        if ( (LA67_0==WS) ) {
            	            alt67=1;
            	        }


            	        switch (alt67) {
            	    	case 1 :
            	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:110:4: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_update659); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt67 >= 1 ) break loop67;
            	                EarlyExitException eee =
            	                    new EarlyExitException(67, input);
            	                throw eee;
            	        }
            	        cnt67++;
            	    } while (true);


            	    match(input,SET,FOLLOW_SET_in_update662); 

            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:110:12: ( WS )*
            	    loop68:
            	    do {
            	        int alt68=2;
            	        int LA68_0 = input.LA(1);

            	        if ( (LA68_0==WS) ) {
            	            alt68=1;
            	        }


            	        switch (alt68) {
            	    	case 1 :
            	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:110:12: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_update664); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop68;
            	        }
            	    } while (true);


            	    val=(Token)match(input,VALUE,FOLLOW_VALUE_in_update669); 

            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:110:26: ( WS )*
            	    loop69:
            	    do {
            	        int alt69=2;
            	        int LA69_0 = input.LA(1);

            	        if ( (LA69_0==WS) ) {
            	            alt69=1;
            	        }


            	        switch (alt69) {
            	    	case 1 :
            	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:110:26: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_update671); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop69;
            	        }
            	    } while (true);


            	    match(input,17,FOLLOW_17_in_update674); 

            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:110:34: ( WS )*
            	    loop70:
            	    do {
            	        int alt70=2;
            	        int LA70_0 = input.LA(1);

            	        if ( (LA70_0==WS) ) {
            	            alt70=1;
            	        }


            	        switch (alt70) {
            	    	case 1 :
            	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:110:34: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_update676); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop70;
            	        }
            	    } while (true);


            	    num=(Token)match(input,VALUE,FOLLOW_VALUE_in_update681); 


            	      updater.setValue((val!=null?val.getText():null), (num!=null?num.getText():null));


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:112:5: ( WS )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==WS) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:112:5: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_update687); 

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            match(input,30,FOLLOW_30_in_update690); 

            pushFollow(FOLLOW_insert_atom_in_update694);
            e=insert_atom();

            state._fsp--;


            match(input,31,FOLLOW_31_in_update696); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:112:31: ( WS )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==WS) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:112:31: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_update698); 

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            match(input,16,FOLLOW_16_in_update701); 


              done =updater.update(e);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return done;
    }
    // $ANTLR end "update"



    // $ANTLR start "insert"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:116:1: insert returns [List<String> done] : ( WS )* 'insert' ( WS )+ name= VALUE ( set_value )* ( WS )* '{' e= insert_atom '}' ( WS )* ';' ;
    public final List<String> insert() throws FilterNotExistsException, DistinctFilterNotExistsException, MainFilterNotExistsException, RecognitionException, CounterNotExistsException, CountedNotExistsException {
        List<String> done = null;


        Token name=null;
        Map<String, List<String>> e =null;


        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:116:184: ( ( WS )* 'insert' ( WS )+ name= VALUE ( set_value )* ( WS )* '{' e= insert_atom '}' ( WS )* ';' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:116:186: ( WS )* 'insert' ( WS )+ name= VALUE ( set_value )* ( WS )* '{' e= insert_atom '}' ( WS )* ';'
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:116:186: ( WS )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==WS) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:116:186: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_insert728); 

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            match(input,25,FOLLOW_25_in_insert731); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:117:2: ( WS )+
            int cnt75=0;
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==WS) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:117:2: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_insert734); 

            	    }
            	    break;

            	default :
            	    if ( cnt75 >= 1 ) break loop75;
                        EarlyExitException eee =
                            new EarlyExitException(75, input);
                        throw eee;
                }
                cnt75++;
            } while (true);


            name=(Token)match(input,VALUE,FOLLOW_VALUE_in_insert739); 


              insertor.initCounter((name!=null?name.getText():null));


            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:119:3: ( set_value )*
            loop76:
            do {
                int alt76=2;
                alt76 = dfa76.predict(input);
                switch (alt76) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:119:4: set_value
            	    {
            	    pushFollow(FOLLOW_set_value_in_insert744);
            	    set_value();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:119:16: ( WS )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==WS) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:119:16: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_insert748); 

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            match(input,30,FOLLOW_30_in_insert751); 

            pushFollow(FOLLOW_insert_atom_in_insert755);
            e=insert_atom();

            state._fsp--;


            match(input,31,FOLLOW_31_in_insert757); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:119:42: ( WS )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==WS) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:119:42: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_insert759); 

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            match(input,16,FOLLOW_16_in_insert762); 


              done =insertor.insert(e);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return done;
    }
    // $ANTLR end "insert"



    // $ANTLR start "set_value"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:123:1: set_value : ( WS )+ SET ( WS )* val= VALUE ( WS )* '=' ( WS )* num= VALUE ;
    public final void set_value() throws RecognitionException, CountedNotExistsException {
        Token val=null;
        Token num=null;

        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:123:43: ( ( WS )+ SET ( WS )* val= VALUE ( WS )* '=' ( WS )* num= VALUE )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:123:44: ( WS )+ SET ( WS )* val= VALUE ( WS )* '=' ( WS )* num= VALUE
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:123:44: ( WS )+
            int cnt79=0;
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==WS) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:123:44: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_set_value773); 

            	    }
            	    break;

            	default :
            	    if ( cnt79 >= 1 ) break loop79;
                        EarlyExitException eee =
                            new EarlyExitException(79, input);
                        throw eee;
                }
                cnt79++;
            } while (true);


            match(input,SET,FOLLOW_SET_in_set_value776); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:124:1: ( WS )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==WS) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:124:1: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_set_value778); 

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            val=(Token)match(input,VALUE,FOLLOW_VALUE_in_set_value783); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:124:15: ( WS )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==WS) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:124:15: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_set_value785); 

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            match(input,17,FOLLOW_17_in_set_value788); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:124:23: ( WS )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==WS) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:124:23: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_set_value790); 

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            num=(Token)match(input,VALUE,FOLLOW_VALUE_in_set_value795); 


              insertor.setValue((val!=null?val.getText():null), (num!=null?num.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "set_value"



    // $ANTLR start "insert_atom"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:128:1: insert_atom returns [Map<String, List<String>> insert_atom] : ( WS )* name= VALUE ( WS )* '=' ( WS )* val= VALUE ( WS )* ( ',' ( WS )* name= VALUE ( WS )* '=' ( WS )* val= VALUE ( WS )* )* ;
    public final Map<String, List<String>> insert_atom() throws RecognitionException {
        Map<String, List<String>> insert_atom = null;


        Token name=null;
        Token val=null;

        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:128:59: ( ( WS )* name= VALUE ( WS )* '=' ( WS )* val= VALUE ( WS )* ( ',' ( WS )* name= VALUE ( WS )* '=' ( WS )* val= VALUE ( WS )* )* )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:128:61: ( WS )* name= VALUE ( WS )* '=' ( WS )* val= VALUE ( WS )* ( ',' ( WS )* name= VALUE ( WS )* '=' ( WS )* val= VALUE ( WS )* )*
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:128:61: ( WS )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==WS) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:128:61: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_insert_atom807); 

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            name=(Token)match(input,VALUE,FOLLOW_VALUE_in_insert_atom812); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:128:76: ( WS )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==WS) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:128:76: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_insert_atom814); 

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            match(input,17,FOLLOW_17_in_insert_atom817); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:128:84: ( WS )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==WS) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:128:84: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_insert_atom819); 

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            val=(Token)match(input,VALUE,FOLLOW_VALUE_in_insert_atom824); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:128:98: ( WS )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==WS) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:128:98: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_insert_atom826); 

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);



              insert_atom = new HashMap<String, List<String>>();
              List<String> list = new ArrayList<String>();
              list.add((val!=null?val.getText():null));
              insert_atom.put((name!=null?name.getText():null), list);


            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:133:2: ( ',' ( WS )* name= VALUE ( WS )* '=' ( WS )* val= VALUE ( WS )* )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==15) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:133:3: ',' ( WS )* name= VALUE ( WS )* '=' ( WS )* val= VALUE ( WS )*
            	    {
            	    match(input,15,FOLLOW_15_in_insert_atom830); 

            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:133:7: ( WS )*
            	    loop87:
            	    do {
            	        int alt87=2;
            	        int LA87_0 = input.LA(1);

            	        if ( (LA87_0==WS) ) {
            	            alt87=1;
            	        }


            	        switch (alt87) {
            	    	case 1 :
            	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:133:7: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_insert_atom832); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop87;
            	        }
            	    } while (true);


            	    name=(Token)match(input,VALUE,FOLLOW_VALUE_in_insert_atom837); 

            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:133:22: ( WS )*
            	    loop88:
            	    do {
            	        int alt88=2;
            	        int LA88_0 = input.LA(1);

            	        if ( (LA88_0==WS) ) {
            	            alt88=1;
            	        }


            	        switch (alt88) {
            	    	case 1 :
            	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:133:22: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_insert_atom839); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop88;
            	        }
            	    } while (true);


            	    match(input,17,FOLLOW_17_in_insert_atom842); 

            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:133:30: ( WS )*
            	    loop89:
            	    do {
            	        int alt89=2;
            	        int LA89_0 = input.LA(1);

            	        if ( (LA89_0==WS) ) {
            	            alt89=1;
            	        }


            	        switch (alt89) {
            	    	case 1 :
            	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:133:30: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_insert_atom844); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop89;
            	        }
            	    } while (true);


            	    val=(Token)match(input,VALUE,FOLLOW_VALUE_in_insert_atom849); 

            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:133:44: ( WS )*
            	    loop90:
            	    do {
            	        int alt90=2;
            	        int LA90_0 = input.LA(1);

            	        if ( (LA90_0==WS) ) {
            	            alt90=1;
            	        }


            	        switch (alt90) {
            	    	case 1 :
            	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:133:44: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_insert_atom851); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop90;
            	        }
            	    } while (true);



            	      list = new ArrayList<String>();
            	      list.add((val!=null?val.getText():null));
            	      insert_atom.put((name!=null?name.getText():null), list);


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return insert_atom;
    }
    // $ANTLR end "insert_atom"



    // $ANTLR start "select"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:139:1: select returns [Map<String,String> map] : (s= select_normal ) ;
    public final Map<String,String> select() throws MainFilterNotExistsException, FilterNotExistsException, RecognitionException, CounterNotExistsException, GroupFilterNotExistsException, CountedNotExistsException {
        Map<String,String> map = null;


        Map<String,String> s =null;


        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:139:184: ( (s= select_normal ) )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:140:2: (s= select_normal )
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:140:2: (s= select_normal )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:140:2: s= select_normal
            {
            pushFollow(FOLLOW_select_normal_in_select882);
            s=select_normal();

            state._fsp--;


            }



            map = s;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return map;
    }
    // $ANTLR end "select"



    // $ANTLR start "select_normal"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:144:1: select_normal returns [Map<String,String> resMap] : ( WS )* SELECT ( WS )+ v= VALUE ( WS )+ FROM ( WS )+ counter_name= VALUE ( WS )+ WHERE ( WS )+ e= select_atom ( WS )* ';' ;
    public final Map<String,String> select_normal() throws MainFilterNotExistsException, FilterNotExistsException, RecognitionException, CounterNotExistsException, GroupFilterNotExistsException, CountedNotExistsException {
        Map<String,String> resMap = null;


        Token v=null;
        Token counter_name=null;
        Map<String, List<String>> e =null;


        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:144:193: ( ( WS )* SELECT ( WS )+ v= VALUE ( WS )+ FROM ( WS )+ counter_name= VALUE ( WS )+ WHERE ( WS )+ e= select_atom ( WS )* ';' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:144:195: ( WS )* SELECT ( WS )+ v= VALUE ( WS )+ FROM ( WS )+ counter_name= VALUE ( WS )+ WHERE ( WS )+ e= select_atom ( WS )* ';'
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:144:195: ( WS )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==WS) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:144:195: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_select_normal908); 

            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);


            match(input,SELECT,FOLLOW_SELECT_in_select_normal911); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:144:206: ( WS )+
            int cnt93=0;
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==WS) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:144:206: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_select_normal913); 

            	    }
            	    break;

            	default :
            	    if ( cnt93 >= 1 ) break loop93;
                        EarlyExitException eee =
                            new EarlyExitException(93, input);
                        throw eee;
                }
                cnt93++;
            } while (true);


            v=(Token)match(input,VALUE,FOLLOW_VALUE_in_select_normal918); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:144:218: ( WS )+
            int cnt94=0;
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==WS) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:144:218: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_select_normal920); 

            	    }
            	    break;

            	default :
            	    if ( cnt94 >= 1 ) break loop94;
                        EarlyExitException eee =
                            new EarlyExitException(94, input);
                        throw eee;
                }
                cnt94++;
            } while (true);


            match(input,FROM,FOLLOW_FROM_in_select_normal923); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:144:227: ( WS )+
            int cnt95=0;
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==WS) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:144:227: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_select_normal925); 

            	    }
            	    break;

            	default :
            	    if ( cnt95 >= 1 ) break loop95;
                        EarlyExitException eee =
                            new EarlyExitException(95, input);
                        throw eee;
                }
                cnt95++;
            } while (true);


            counter_name=(Token)match(input,VALUE,FOLLOW_VALUE_in_select_normal930); 


              selecter.initCounter((counter_name!=null?counter_name.getText():null));


            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:146:2: ( WS )+
            int cnt96=0;
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==WS) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:146:2: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_select_normal933); 

            	    }
            	    break;

            	default :
            	    if ( cnt96 >= 1 ) break loop96;
                        EarlyExitException eee =
                            new EarlyExitException(96, input);
                        throw eee;
                }
                cnt96++;
            } while (true);


            match(input,WHERE,FOLLOW_WHERE_in_select_normal936); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:146:12: ( WS )+
            int cnt97=0;
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==WS) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:146:12: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_select_normal938); 

            	    }
            	    break;

            	default :
            	    if ( cnt97 >= 1 ) break loop97;
                        EarlyExitException eee =
                            new EarlyExitException(97, input);
                        throw eee;
                }
                cnt97++;
            } while (true);


            pushFollow(FOLLOW_select_atom_in_select_normal943);
            e=select_atom();

            state._fsp--;



              resMap =selecter.select((v!=null?v.getText():null), e);


            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:148:2: ( WS )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==WS) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:148:2: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_select_normal946); 

            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);


            match(input,16,FOLLOW_16_in_select_normal948); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return resMap;
    }
    // $ANTLR end "select_normal"



    // $ANTLR start "group"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:150:1: group returns [List<String> groupList] : ( WS )+ GROUP ( WS )+ name= VALUE ;
    public final List<String> group() throws RecognitionException {
        List<String> groupList = null;


        Token name=null;

        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:150:38: ( ( WS )+ GROUP ( WS )+ name= VALUE )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:150:40: ( WS )+ GROUP ( WS )+ name= VALUE
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:150:40: ( WS )+
            int cnt99=0;
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==WS) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:150:40: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_group958); 

            	    }
            	    break;

            	default :
            	    if ( cnt99 >= 1 ) break loop99;
                        EarlyExitException eee =
                            new EarlyExitException(99, input);
                        throw eee;
                }
                cnt99++;
            } while (true);


            match(input,GROUP,FOLLOW_GROUP_in_group961); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:150:50: ( WS )+
            int cnt100=0;
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==WS) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:150:50: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_group963); 

            	    }
            	    break;

            	default :
            	    if ( cnt100 >= 1 ) break loop100;
                        EarlyExitException eee =
                            new EarlyExitException(100, input);
                        throw eee;
                }
                cnt100++;
            } while (true);


            name=(Token)match(input,VALUE,FOLLOW_VALUE_in_group968); 


              groupList = new ArrayList<String>();
              groupList.add((name!=null?name.getText():null));


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return groupList;
    }
    // $ANTLR end "group"



    // $ANTLR start "select_atom"
    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:155:1: select_atom returns [Map<String, List<String>> select_atom] : name= VALUE ( WS )* '=' ( WS )* val= VALUE ( ( WS )* ',' ( WS )* val= VALUE )* ( ( WS )+ AND ( WS )+ name= VALUE ( WS )* '=' ( WS )* val= VALUE ( ( WS )* ',' ( WS )* val= VALUE )* )* (g= group )* ;
    public final Map<String, List<String>> select_atom() throws FilterNotExistsException, RecognitionException, GroupFilterNotExistsException {
        Map<String, List<String>> select_atom = null;


        Token name=null;
        Token val=null;
        List<String> g =null;


        try {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:155:123: (name= VALUE ( WS )* '=' ( WS )* val= VALUE ( ( WS )* ',' ( WS )* val= VALUE )* ( ( WS )+ AND ( WS )+ name= VALUE ( WS )* '=' ( WS )* val= VALUE ( ( WS )* ',' ( WS )* val= VALUE )* )* (g= group )* )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:155:125: name= VALUE ( WS )* '=' ( WS )* val= VALUE ( ( WS )* ',' ( WS )* val= VALUE )* ( ( WS )+ AND ( WS )+ name= VALUE ( WS )* '=' ( WS )* val= VALUE ( ( WS )* ',' ( WS )* val= VALUE )* )* (g= group )*
            {
            name=(Token)match(input,VALUE,FOLLOW_VALUE_in_select_atom990); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:155:136: ( WS )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==WS) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:155:136: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_select_atom992); 

            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);


            match(input,17,FOLLOW_17_in_select_atom995); 

            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:155:144: ( WS )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==WS) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:155:144: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_select_atom997); 

            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);


            val=(Token)match(input,VALUE,FOLLOW_VALUE_in_select_atom1002); 


                select_atom = new HashMap<String, List<String>>();
                List<String> list = new ArrayList<String>();
                list.add((val!=null?val.getText():null));


            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:159:2: ( ( WS )* ',' ( WS )* val= VALUE )*
            loop105:
            do {
                int alt105=2;
                alt105 = dfa105.predict(input);
                switch (alt105) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:159:3: ( WS )* ',' ( WS )* val= VALUE
            	    {
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:159:3: ( WS )*
            	    loop103:
            	    do {
            	        int alt103=2;
            	        int LA103_0 = input.LA(1);

            	        if ( (LA103_0==WS) ) {
            	            alt103=1;
            	        }


            	        switch (alt103) {
            	    	case 1 :
            	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:159:3: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_select_atom1006); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop103;
            	        }
            	    } while (true);


            	    match(input,15,FOLLOW_15_in_select_atom1009); 

            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:159:11: ( WS )*
            	    loop104:
            	    do {
            	        int alt104=2;
            	        int LA104_0 = input.LA(1);

            	        if ( (LA104_0==WS) ) {
            	            alt104=1;
            	        }


            	        switch (alt104) {
            	    	case 1 :
            	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:159:11: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_select_atom1011); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop104;
            	        }
            	    } while (true);


            	    val=(Token)match(input,VALUE,FOLLOW_VALUE_in_select_atom1016); 


            	        list.add((val!=null?val.getText():null));


            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);



                select_atom.put((name!=null?name.getText():null), list);


            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:163:2: ( ( WS )+ AND ( WS )+ name= VALUE ( WS )* '=' ( WS )* val= VALUE ( ( WS )* ',' ( WS )* val= VALUE )* )*
            loop113:
            do {
                int alt113=2;
                alt113 = dfa113.predict(input);
                switch (alt113) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:163:3: ( WS )+ AND ( WS )+ name= VALUE ( WS )* '=' ( WS )* val= VALUE ( ( WS )* ',' ( WS )* val= VALUE )*
            	    {
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:163:3: ( WS )+
            	    int cnt106=0;
            	    loop106:
            	    do {
            	        int alt106=2;
            	        int LA106_0 = input.LA(1);

            	        if ( (LA106_0==WS) ) {
            	            alt106=1;
            	        }


            	        switch (alt106) {
            	    	case 1 :
            	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:163:3: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_select_atom1024); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt106 >= 1 ) break loop106;
            	                EarlyExitException eee =
            	                    new EarlyExitException(106, input);
            	                throw eee;
            	        }
            	        cnt106++;
            	    } while (true);


            	    match(input,AND,FOLLOW_AND_in_select_atom1027); 

            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:163:11: ( WS )+
            	    int cnt107=0;
            	    loop107:
            	    do {
            	        int alt107=2;
            	        int LA107_0 = input.LA(1);

            	        if ( (LA107_0==WS) ) {
            	            alt107=1;
            	        }


            	        switch (alt107) {
            	    	case 1 :
            	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:163:11: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_select_atom1029); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt107 >= 1 ) break loop107;
            	                EarlyExitException eee =
            	                    new EarlyExitException(107, input);
            	                throw eee;
            	        }
            	        cnt107++;
            	    } while (true);


            	    name=(Token)match(input,VALUE,FOLLOW_VALUE_in_select_atom1034); 

            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:163:26: ( WS )*
            	    loop108:
            	    do {
            	        int alt108=2;
            	        int LA108_0 = input.LA(1);

            	        if ( (LA108_0==WS) ) {
            	            alt108=1;
            	        }


            	        switch (alt108) {
            	    	case 1 :
            	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:163:26: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_select_atom1036); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop108;
            	        }
            	    } while (true);


            	    match(input,17,FOLLOW_17_in_select_atom1039); 

            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:163:34: ( WS )*
            	    loop109:
            	    do {
            	        int alt109=2;
            	        int LA109_0 = input.LA(1);

            	        if ( (LA109_0==WS) ) {
            	            alt109=1;
            	        }


            	        switch (alt109) {
            	    	case 1 :
            	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:163:34: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_select_atom1041); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop109;
            	        }
            	    } while (true);


            	    val=(Token)match(input,VALUE,FOLLOW_VALUE_in_select_atom1046); 


            	        list = new ArrayList<String>();
            	        list.add((val!=null?val.getText():null));


            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:166:2: ( ( WS )* ',' ( WS )* val= VALUE )*
            	    loop112:
            	    do {
            	        int alt112=2;
            	        alt112 = dfa112.predict(input);
            	        switch (alt112) {
            	    	case 1 :
            	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:166:3: ( WS )* ',' ( WS )* val= VALUE
            	    	    {
            	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:166:3: ( WS )*
            	    	    loop110:
            	    	    do {
            	    	        int alt110=2;
            	    	        int LA110_0 = input.LA(1);

            	    	        if ( (LA110_0==WS) ) {
            	    	            alt110=1;
            	    	        }


            	    	        switch (alt110) {
            	    	    	case 1 :
            	    	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:166:3: WS
            	    	    	    {
            	    	    	    match(input,WS,FOLLOW_WS_in_select_atom1050); 

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop110;
            	    	        }
            	    	    } while (true);


            	    	    match(input,15,FOLLOW_15_in_select_atom1053); 

            	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:166:11: ( WS )*
            	    	    loop111:
            	    	    do {
            	    	        int alt111=2;
            	    	        int LA111_0 = input.LA(1);

            	    	        if ( (LA111_0==WS) ) {
            	    	            alt111=1;
            	    	        }


            	    	        switch (alt111) {
            	    	    	case 1 :
            	    	    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:166:11: WS
            	    	    	    {
            	    	    	    match(input,WS,FOLLOW_WS_in_select_atom1055); 

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop111;
            	    	        }
            	    	    } while (true);


            	    	    val=(Token)match(input,VALUE,FOLLOW_VALUE_in_select_atom1060); 


            	    	        list.add((val!=null?val.getText():null));


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop112;
            	        }
            	    } while (true);



            	        select_atom.put((name!=null?name.getText():null), list);


            	    }
            	    break;

            	default :
            	    break loop113;
                }
            } while (true);


            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:170:4: (g= group )*
            loop114:
            do {
                int alt114=2;
                alt114 = dfa114.predict(input);
                switch (alt114) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:170:5: g= group
            	    {
            	    pushFollow(FOLLOW_group_in_select_atom1071);
            	    g=group();

            	    state._fsp--;



            	      selecter.group(select_atom, g);


            	    }
            	    break;

            	default :
            	    break loop114;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return select_atom;
    }
    // $ANTLR end "select_atom"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA105 dfa105 = new DFA105(this);
    protected DFA113 dfa113 = new DFA113(this);
    protected DFA112 dfa112 = new DFA112(this);
    protected DFA114 dfa114 = new DFA114(this);
    static final String DFA1_eotS =
        "\14\uffff";
    static final String DFA1_eofS =
        "\14\uffff";
    static final String DFA1_minS =
        "\2\5\1\16\6\uffff\1\16\2\uffff";
    static final String DFA1_maxS =
        "\2\31\1\35\6\uffff\1\35\2\uffff";
    static final String DFA1_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\1\1\2";
    static final String DFA1_specialS =
        "\14\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\10\3\uffff\1\7\1\2\1\4\2\uffff\1\1\4\uffff\1\5\1\3\4\uffff"+
            "\1\6",
            "\1\10\3\uffff\1\7\1\2\1\4\2\uffff\1\1\4\uffff\1\5\1\3\4\uffff"+
            "\1\6",
            "\1\11\15\uffff\1\13\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\15\uffff\1\13\1\12",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "32:1: rule : ( set_ttl_sign | set_ttl | desc | update | create | insert | select | config );";
        }
    }
    static final String DFA5_eotS =
        "\6\uffff";
    static final String DFA5_eofS =
        "\6\uffff";
    static final String DFA5_minS =
        "\2\12\2\16\2\uffff";
    static final String DFA5_maxS =
        "\2\16\2\35\2\uffff";
    static final String DFA5_acceptS =
        "\4\uffff\1\1\1\2";
    static final String DFA5_specialS =
        "\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\2\3\uffff\1\1",
            "\1\2\3\uffff\1\1",
            "\1\3\15\uffff\1\4\1\5",
            "\1\3\15\uffff\1\4\1\5",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "38:1: manager : ( set_ttl | set_ttl_sign );";
        }
    }
    static final String DFA27_eotS =
        "\4\uffff";
    static final String DFA27_eofS =
        "\4\uffff";
    static final String DFA27_minS =
        "\1\16\1\4\2\uffff";
    static final String DFA27_maxS =
        "\2\20\2\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA27_specialS =
        "\4\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1\1\uffff\1\2",
            "\1\3\11\uffff\1\1\1\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "()* loopback of 53:2: ( ( WS )+ AND ( WS )+ key= VALUE ( WS )* '=' ( WS )* val= VALUE )*";
        }
    }
    static final String DFA49_eotS =
        "\14\uffff";
    static final String DFA49_eofS =
        "\14\uffff";
    static final String DFA49_minS =
        "\1\16\1\12\6\uffff\2\16\2\uffff";
    static final String DFA49_maxS =
        "\2\33\6\uffff\2\35\2\uffff";
    static final String DFA49_acceptS =
        "\2\uffff\1\10\1\1\1\4\1\5\1\6\1\7\2\uffff\1\2\1\3";
    static final String DFA49_specialS =
        "\14\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\1\1\uffff\1\2\4\uffff\1\5\1\3\1\uffff\1\6\1\uffff\1\4\1\7",
            "\1\10\3\uffff\1\1\1\uffff\1\2\4\uffff\1\5\1\3\1\uffff\1\6\1"+
            "\uffff\1\4\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\15\uffff\1\12\1\13",
            "\1\11\15\uffff\1\12\1\13",
            "",
            ""
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "()* loopback of 85:47: ( excluded_filter_define | ttl_define | ttl_sign_define | main_filter_define | distinct_filter_define | group_filter_define | ttl_filter_define )*";
        }
    }
    static final String DFA71_eotS =
        "\4\uffff";
    static final String DFA71_eofS =
        "\4\uffff";
    static final String DFA71_minS =
        "\1\16\1\12\2\uffff";
    static final String DFA71_maxS =
        "\2\36\2\uffff";
    static final String DFA71_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA71_specialS =
        "\4\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\1\17\uffff\1\2",
            "\1\3\3\uffff\1\1\17\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "()* loopback of 110:3: ( ( WS )+ SET ( WS )* val= VALUE ( WS )* '=' ( WS )* num= VALUE )*";
        }
    }
    static final String DFA76_eotS =
        "\4\uffff";
    static final String DFA76_eofS =
        "\4\uffff";
    static final String DFA76_minS =
        "\1\16\1\12\2\uffff";
    static final String DFA76_maxS =
        "\2\36\2\uffff";
    static final String DFA76_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA76_specialS =
        "\4\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\1\17\uffff\1\2",
            "\1\3\3\uffff\1\1\17\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "()* loopback of 119:3: ( set_value )*";
        }
    }
    static final String DFA105_eotS =
        "\4\uffff";
    static final String DFA105_eofS =
        "\4\uffff";
    static final String DFA105_minS =
        "\1\16\1\4\2\uffff";
    static final String DFA105_maxS =
        "\2\20\2\uffff";
    static final String DFA105_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA105_specialS =
        "\4\uffff}>";
    static final String[] DFA105_transitionS = {
            "\1\1\1\3\1\2",
            "\1\2\3\uffff\1\2\5\uffff\1\1\1\3\1\2",
            "",
            ""
    };

    static final short[] DFA105_eot = DFA.unpackEncodedString(DFA105_eotS);
    static final short[] DFA105_eof = DFA.unpackEncodedString(DFA105_eofS);
    static final char[] DFA105_min = DFA.unpackEncodedStringToUnsignedChars(DFA105_minS);
    static final char[] DFA105_max = DFA.unpackEncodedStringToUnsignedChars(DFA105_maxS);
    static final short[] DFA105_accept = DFA.unpackEncodedString(DFA105_acceptS);
    static final short[] DFA105_special = DFA.unpackEncodedString(DFA105_specialS);
    static final short[][] DFA105_transition;

    static {
        int numStates = DFA105_transitionS.length;
        DFA105_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA105_transition[i] = DFA.unpackEncodedString(DFA105_transitionS[i]);
        }
    }

    class DFA105 extends DFA {

        public DFA105(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 105;
            this.eot = DFA105_eot;
            this.eof = DFA105_eof;
            this.min = DFA105_min;
            this.max = DFA105_max;
            this.accept = DFA105_accept;
            this.special = DFA105_special;
            this.transition = DFA105_transition;
        }
        public String getDescription() {
            return "()* loopback of 159:2: ( ( WS )* ',' ( WS )* val= VALUE )*";
        }
    }
    static final String DFA113_eotS =
        "\4\uffff";
    static final String DFA113_eofS =
        "\4\uffff";
    static final String DFA113_minS =
        "\1\16\1\4\2\uffff";
    static final String DFA113_maxS =
        "\2\20\2\uffff";
    static final String DFA113_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA113_specialS =
        "\4\uffff}>";
    static final String[] DFA113_transitionS = {
            "\1\1\1\uffff\1\2",
            "\1\3\3\uffff\1\2\5\uffff\1\1\1\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA113_eot = DFA.unpackEncodedString(DFA113_eotS);
    static final short[] DFA113_eof = DFA.unpackEncodedString(DFA113_eofS);
    static final char[] DFA113_min = DFA.unpackEncodedStringToUnsignedChars(DFA113_minS);
    static final char[] DFA113_max = DFA.unpackEncodedStringToUnsignedChars(DFA113_maxS);
    static final short[] DFA113_accept = DFA.unpackEncodedString(DFA113_acceptS);
    static final short[] DFA113_special = DFA.unpackEncodedString(DFA113_specialS);
    static final short[][] DFA113_transition;

    static {
        int numStates = DFA113_transitionS.length;
        DFA113_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA113_transition[i] = DFA.unpackEncodedString(DFA113_transitionS[i]);
        }
    }

    class DFA113 extends DFA {

        public DFA113(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 113;
            this.eot = DFA113_eot;
            this.eof = DFA113_eof;
            this.min = DFA113_min;
            this.max = DFA113_max;
            this.accept = DFA113_accept;
            this.special = DFA113_special;
            this.transition = DFA113_transition;
        }
        public String getDescription() {
            return "()* loopback of 163:2: ( ( WS )+ AND ( WS )+ name= VALUE ( WS )* '=' ( WS )* val= VALUE ( ( WS )* ',' ( WS )* val= VALUE )* )*";
        }
    }
    static final String DFA112_eotS =
        "\4\uffff";
    static final String DFA112_eofS =
        "\4\uffff";
    static final String DFA112_minS =
        "\1\16\1\4\2\uffff";
    static final String DFA112_maxS =
        "\2\20\2\uffff";
    static final String DFA112_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA112_specialS =
        "\4\uffff}>";
    static final String[] DFA112_transitionS = {
            "\1\1\1\3\1\2",
            "\1\2\3\uffff\1\2\5\uffff\1\1\1\3\1\2",
            "",
            ""
    };

    static final short[] DFA112_eot = DFA.unpackEncodedString(DFA112_eotS);
    static final short[] DFA112_eof = DFA.unpackEncodedString(DFA112_eofS);
    static final char[] DFA112_min = DFA.unpackEncodedStringToUnsignedChars(DFA112_minS);
    static final char[] DFA112_max = DFA.unpackEncodedStringToUnsignedChars(DFA112_maxS);
    static final short[] DFA112_accept = DFA.unpackEncodedString(DFA112_acceptS);
    static final short[] DFA112_special = DFA.unpackEncodedString(DFA112_specialS);
    static final short[][] DFA112_transition;

    static {
        int numStates = DFA112_transitionS.length;
        DFA112_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA112_transition[i] = DFA.unpackEncodedString(DFA112_transitionS[i]);
        }
    }

    class DFA112 extends DFA {

        public DFA112(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 112;
            this.eot = DFA112_eot;
            this.eof = DFA112_eof;
            this.min = DFA112_min;
            this.max = DFA112_max;
            this.accept = DFA112_accept;
            this.special = DFA112_special;
            this.transition = DFA112_transition;
        }
        public String getDescription() {
            return "()* loopback of 166:2: ( ( WS )* ',' ( WS )* val= VALUE )*";
        }
    }
    static final String DFA114_eotS =
        "\4\uffff";
    static final String DFA114_eofS =
        "\4\uffff";
    static final String DFA114_minS =
        "\1\16\1\10\2\uffff";
    static final String DFA114_maxS =
        "\2\20\2\uffff";
    static final String DFA114_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA114_specialS =
        "\4\uffff}>";
    static final String[] DFA114_transitionS = {
            "\1\1\1\uffff\1\2",
            "\1\3\5\uffff\1\1\1\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA114_eot = DFA.unpackEncodedString(DFA114_eotS);
    static final short[] DFA114_eof = DFA.unpackEncodedString(DFA114_eofS);
    static final char[] DFA114_min = DFA.unpackEncodedStringToUnsignedChars(DFA114_minS);
    static final char[] DFA114_max = DFA.unpackEncodedStringToUnsignedChars(DFA114_maxS);
    static final short[] DFA114_accept = DFA.unpackEncodedString(DFA114_acceptS);
    static final short[] DFA114_special = DFA.unpackEncodedString(DFA114_specialS);
    static final short[][] DFA114_transition;

    static {
        int numStates = DFA114_transitionS.length;
        DFA114_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA114_transition[i] = DFA.unpackEncodedString(DFA114_transitionS[i]);
        }
    }

    class DFA114 extends DFA {

        public DFA114(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 114;
            this.eot = DFA114_eot;
            this.eof = DFA114_eof;
            this.min = DFA114_min;
            this.max = DFA114_max;
            this.accept = DFA114_accept;
            this.special = DFA114_special;
            this.transition = DFA114_transition;
        }
        public String getDescription() {
            return "()* loopback of 170:4: (g= group )*";
        }
    }
 

    public static final BitSet FOLLOW_set_ttl_sign_in_rule61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_ttl_in_rule63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_desc_in_rule65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_in_rule67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_in_rule69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_in_rule71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_in_rule73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_config_in_rule75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_desc85 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_20_in_desc88 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_WS_in_desc90 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_desc95 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_WS_in_desc97 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_desc100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_ttl_in_manager109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_ttl_sign_in_manager111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_set_ttl119 = new BitSet(new long[]{0x0000000000004400L});
    public static final BitSet FOLLOW_SET_in_set_ttl122 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_WS_in_set_ttl124 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_28_in_set_ttl127 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_WS_in_set_ttl129 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_set_ttl132 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_VALUE_in_set_ttl136 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_WS_in_set_ttl138 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_FROM_in_set_ttl141 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_WS_in_set_ttl143 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_set_ttl148 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_WS_in_set_ttl150 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_set_ttl152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_set_ttl_sign161 = new BitSet(new long[]{0x0000000000004400L});
    public static final BitSet FOLLOW_SET_in_set_ttl_sign164 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_WS_in_set_ttl_sign166 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_29_in_set_ttl_sign169 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_WS_in_set_ttl_sign171 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_set_ttl_sign174 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_VALUE_in_set_ttl_sign178 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_WS_in_set_ttl_sign180 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_FROM_in_set_ttl_sign183 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_WS_in_set_ttl_sign185 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_set_ttl_sign190 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_WS_in_set_ttl_sign192 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_set_ttl_sign194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_config203 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_CONFIG_in_config206 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_WS_in_config208 = new BitSet(new long[]{0x0000000000004400L});
    public static final BitSet FOLLOW_SET_in_config211 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_WS_in_config213 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_config220 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_WS_in_config222 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_config225 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_WS_in_config227 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_config232 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_WS_in_config236 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_AND_in_config239 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_WS_in_config241 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_config246 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_WS_in_config248 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_config251 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_WS_in_config253 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_config258 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_WS_in_config264 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_config266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_create284 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_19_in_create287 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_WS_in_create289 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_create294 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_WS_in_create296 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_23_in_create299 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_WS_in_create301 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_30_in_create304 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_counted_define_in_create308 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_create310 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_filter_define_in_create314 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_WS_in_create316 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_31_in_create319 = new BitSet(new long[]{0x000000000D614000L});
    public static final BitSet FOLLOW_other_define_in_create323 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_WS_in_create325 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_create328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_counted_define340 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_counted_define345 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_WS_in_counted_define347 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_18_in_counted_define350 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_WS_in_counted_define353 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_WS_in_ttl_define363 = new BitSet(new long[]{0x0000000000004400L});
    public static final BitSet FOLLOW_SET_in_ttl_define366 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_WS_in_ttl_define368 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_28_in_ttl_define371 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_WS_in_ttl_define373 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ttl_define376 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_WS_in_ttl_define378 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_ttl_define383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_ttl_sign_define393 = new BitSet(new long[]{0x0000000000004400L});
    public static final BitSet FOLLOW_SET_in_ttl_sign_define396 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_WS_in_ttl_sign_define398 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_29_in_ttl_sign_define401 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_WS_in_ttl_sign_define403 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ttl_sign_define406 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_WS_in_ttl_sign_define408 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_ttl_sign_define413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_filter_define425 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_filter_define430 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_filter_define434 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_WS_in_filter_define436 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_filter_define441 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_excluded_filter_define_in_other_define456 = new BitSet(new long[]{0x000000000D604002L});
    public static final BitSet FOLLOW_ttl_define_in_other_define458 = new BitSet(new long[]{0x000000000D604002L});
    public static final BitSet FOLLOW_ttl_sign_define_in_other_define460 = new BitSet(new long[]{0x000000000D604002L});
    public static final BitSet FOLLOW_main_filter_define_in_other_define462 = new BitSet(new long[]{0x000000000D604002L});
    public static final BitSet FOLLOW_distinct_filter_define_in_other_define464 = new BitSet(new long[]{0x000000000D604002L});
    public static final BitSet FOLLOW_group_filter_define_in_other_define466 = new BitSet(new long[]{0x000000000D604002L});
    public static final BitSet FOLLOW_ttl_filter_define_in_other_define468 = new BitSet(new long[]{0x000000000D604002L});
    public static final BitSet FOLLOW_WS_in_main_filter_define481 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_26_in_main_filter_define484 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_WS_in_main_filter_define486 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_30_in_main_filter_define489 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_filter_define_in_main_filter_define493 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_WS_in_main_filter_define495 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_31_in_main_filter_define498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_ttl_filter_define511 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_27_in_ttl_filter_define514 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_WS_in_ttl_filter_define516 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_30_in_ttl_filter_define519 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_filter_define_in_ttl_filter_define523 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_WS_in_ttl_filter_define525 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_31_in_ttl_filter_define528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_distinct_filter_define541 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_21_in_distinct_filter_define544 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_WS_in_distinct_filter_define546 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_30_in_distinct_filter_define549 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_filter_define_in_distinct_filter_define552 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_WS_in_distinct_filter_define554 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_31_in_distinct_filter_define557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_group_filter_define570 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_24_in_group_filter_define573 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_WS_in_group_filter_define575 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_30_in_group_filter_define578 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_filter_define_in_group_filter_define581 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_WS_in_group_filter_define583 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_31_in_group_filter_define586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_excluded_filter_define599 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_22_in_excluded_filter_define602 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_WS_in_excluded_filter_define604 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_30_in_excluded_filter_define607 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_filter_define_in_excluded_filter_define610 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_WS_in_excluded_filter_define612 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_31_in_excluded_filter_define615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_update643 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_UPDATE_in_update646 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_WS_in_update649 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_update654 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_WS_in_update659 = new BitSet(new long[]{0x0000000000004400L});
    public static final BitSet FOLLOW_SET_in_update662 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_WS_in_update664 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_update669 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_WS_in_update671 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_update674 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_WS_in_update676 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_update681 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_WS_in_update687 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_30_in_update690 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_insert_atom_in_update694 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_update696 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_WS_in_update698 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_update701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_insert728 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_insert731 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_WS_in_insert734 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_insert739 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_set_value_in_insert744 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_WS_in_insert748 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_30_in_insert751 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_insert_atom_in_insert755 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_insert757 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_WS_in_insert759 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_insert762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_set_value773 = new BitSet(new long[]{0x0000000000004400L});
    public static final BitSet FOLLOW_SET_in_set_value776 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_WS_in_set_value778 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_set_value783 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_WS_in_set_value785 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_set_value788 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_WS_in_set_value790 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_set_value795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_insert_atom807 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_insert_atom812 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_WS_in_insert_atom814 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_insert_atom817 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_WS_in_insert_atom819 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_insert_atom824 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_WS_in_insert_atom826 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_15_in_insert_atom830 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_WS_in_insert_atom832 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_insert_atom837 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_WS_in_insert_atom839 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_insert_atom842 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_WS_in_insert_atom844 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_insert_atom849 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_WS_in_insert_atom851 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_select_normal_in_select882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_select_normal908 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_SELECT_in_select_normal911 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_WS_in_select_normal913 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_select_normal918 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_WS_in_select_normal920 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_FROM_in_select_normal923 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_WS_in_select_normal925 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_select_normal930 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_WS_in_select_normal933 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_WHERE_in_select_normal936 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_WS_in_select_normal938 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_select_atom_in_select_normal943 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_WS_in_select_normal946 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_select_normal948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_group958 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_GROUP_in_group961 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_WS_in_group963 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_group968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_in_select_atom990 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_WS_in_select_atom992 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_select_atom995 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_WS_in_select_atom997 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_select_atom1002 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_WS_in_select_atom1006 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_select_atom1009 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_WS_in_select_atom1011 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_select_atom1016 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_WS_in_select_atom1024 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_AND_in_select_atom1027 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_WS_in_select_atom1029 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_select_atom1034 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_WS_in_select_atom1036 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_select_atom1039 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_WS_in_select_atom1041 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_select_atom1046 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_WS_in_select_atom1050 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_select_atom1053 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_WS_in_select_atom1055 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_VALUE_in_select_atom1060 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_group_in_select_atom1071 = new BitSet(new long[]{0x0000000000004002L});

}