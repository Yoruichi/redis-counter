// $ANTLR 3.4 /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g 2013-01-24 10:58:26

package sky.redis.antlr;
import java.util.*;
import sky.redis.data.model.*;
import sky.redis.core.*;
import sky.redis.exception.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class redisql_skyLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public redisql_skyLexer() {} 
    public redisql_skyLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public redisql_skyLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:15:7: ( ',' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:16:7: ( ';' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:16:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:17:7: ( '=' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:17:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:18:7: ( 'counted' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:18:9: 'counted'
            {
            match("counted"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:19:7: ( 'create counter' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:19:9: 'create counter'
            {
            match("create counter"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:20:7: ( 'desc counter' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:20:9: 'desc counter'
            {
            match("desc counter"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:21:7: ( 'distinct filter' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:21:9: 'distinct filter'
            {
            match("distinct filter"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:22:7: ( 'excluded filter' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:22:9: 'excluded filter'
            {
            match("excluded filter"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:23:7: ( 'filter' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:23:9: 'filter'
            {
            match("filter"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:24:7: ( 'group filter' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:24:9: 'group filter'
            {
            match("group filter"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:25:7: ( 'insert' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:25:9: 'insert'
            {
            match("insert"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:26:7: ( 'main filter' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:26:9: 'main filter'
            {
            match("main filter"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:27:7: ( 'ttl filter' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:27:9: 'ttl filter'
            {
            match("ttl filter"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:28:7: ( 'ttl' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:28:9: 'ttl'
            {
            match("ttl"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:29:7: ( 'ttlsign' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:29:9: 'ttlsign'
            {
            match("ttlsign"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:30:7: ( '{' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:30:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:31:7: ( '}' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:31:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:181:3: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:182:3: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:182:3: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:189:5: ( 'set ' )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:189:7: 'set '
            {
            match("set "); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:190:8: ( 'select' | 'SELECT' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='s') ) {
                alt2=1;
            }
            else if ( (LA2_0=='S') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:190:10: 'select'
                    {
                    match("select"); 



                    }
                    break;
                case 2 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:190:19: 'SELECT'
                    {
                    match("SELECT"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "UPDATE"
    public final void mUPDATE() throws RecognitionException {
        try {
            int _type = UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:191:8: ( 'update' | 'UPDATE' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='u') ) {
                alt3=1;
            }
            else if ( (LA3_0=='U') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:191:10: 'update'
                    {
                    match("update"); 



                    }
                    break;
                case 2 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:191:21: 'UPDATE'
                    {
                    match("UPDATE"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UPDATE"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:192:8: ( 'create' | 'CREATE' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='c') ) {
                alt4=1;
            }
            else if ( (LA4_0=='C') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:192:10: 'create'
                    {
                    match("create"); 



                    }
                    break;
                case 2 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:192:21: 'CREATE'
                    {
                    match("CREATE"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:193:5: ( 'AND' | 'and' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='A') ) {
                alt5=1;
            }
            else if ( (LA5_0=='a') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:193:7: 'AND'
                    {
                    match("AND"); 



                    }
                    break;
                case 2 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:193:13: 'and'
                    {
                    match("and"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:194:6: ( 'from' | 'FROM' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='f') ) {
                alt6=1;
            }
            else if ( (LA6_0=='F') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:194:8: 'from'
                    {
                    match("from"); 



                    }
                    break;
                case 2 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:194:17: 'FROM'
                    {
                    match("FROM"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:195:7: ( 'where' | 'WHERE' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='w') ) {
                alt7=1;
            }
            else if ( (LA7_0=='W') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:195:9: 'where'
                    {
                    match("where"); 



                    }
                    break;
                case 2 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:195:19: 'WHERE'
                    {
                    match("WHERE"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "GROUP"
    public final void mGROUP() throws RecognitionException {
        try {
            int _type = GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:196:7: ( 'group' ( WS )+ 'by' | 'GROUP' ( WS )* 'BY' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='g') ) {
                alt10=1;
            }
            else if ( (LA10_0=='G') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:196:9: 'group' ( WS )+ 'by'
                    {
                    match("group"); 



                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:196:16: ( WS )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||LA8_0=='\r'||LA8_0==' ') ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:196:16: WS
                    	    {
                    	    mWS(); 


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    match("by"); 



                    }
                    break;
                case 2 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:196:24: 'GROUP' ( WS )* 'BY'
                    {
                    match("GROUP"); 



                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:196:31: ( WS )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||LA9_0=='\r'||LA9_0==' ') ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:196:31: WS
                    	    {
                    	    mWS(); 


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    match("BY"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GROUP"

    // $ANTLR start "CONFIG"
    public final void mCONFIG() throws RecognitionException {
        try {
            int _type = CONFIG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:197:8: ( 'config' | 'CONFIG' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='c') ) {
                alt11=1;
            }
            else if ( (LA11_0=='C') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:197:10: 'config'
                    {
                    match("config"); 



                    }
                    break;
                case 2 :
                    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:197:19: 'CONFIG'
                    {
                    match("CONFIG"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONFIG"

    // $ANTLR start "VALUE"
    public final void mVALUE() throws RecognitionException {
        try {
            int _type = VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:199:3: ( (~ ( ' ' | '\\t' | '\\n' | '=' | ';' | '\\'' | '{' | '}' | ',' ) )+ )
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:201:5: (~ ( ' ' | '\\t' | '\\n' | '=' | ';' | '\\'' | '{' | '}' | ',' ) )+
            {
            // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:201:5: (~ ( ' ' | '\\t' | '\\n' | '=' | ';' | '\\'' | '{' | '}' | ',' ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\b')||(LA12_0 >= '\u000B' && LA12_0 <= '\u001F')||(LA12_0 >= '!' && LA12_0 <= '&')||(LA12_0 >= '(' && LA12_0 <= '+')||(LA12_0 >= '-' && LA12_0 <= ':')||LA12_0=='<'||(LA12_0 >= '>' && LA12_0 <= 'z')||LA12_0=='|'||(LA12_0 >= '~' && LA12_0 <= '\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\u001F')||(input.LA(1) >= '!' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= ':')||input.LA(1)=='<'||(input.LA(1) >= '>' && input.LA(1) <= 'z')||input.LA(1)=='|'||(input.LA(1) >= '~' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VALUE"

    public void mTokens() throws RecognitionException {
        // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | WS | SET | SELECT | UPDATE | CREATE | AND | FROM | WHERE | GROUP | CONFIG | VALUE )
        int alt13=28;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:10: T__15
                {
                mT__15(); 


                }
                break;
            case 2 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:16: T__16
                {
                mT__16(); 


                }
                break;
            case 3 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:22: T__17
                {
                mT__17(); 


                }
                break;
            case 4 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:28: T__18
                {
                mT__18(); 


                }
                break;
            case 5 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:34: T__19
                {
                mT__19(); 


                }
                break;
            case 6 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:40: T__20
                {
                mT__20(); 


                }
                break;
            case 7 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:46: T__21
                {
                mT__21(); 


                }
                break;
            case 8 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:52: T__22
                {
                mT__22(); 


                }
                break;
            case 9 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:58: T__23
                {
                mT__23(); 


                }
                break;
            case 10 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:64: T__24
                {
                mT__24(); 


                }
                break;
            case 11 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:70: T__25
                {
                mT__25(); 


                }
                break;
            case 12 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:76: T__26
                {
                mT__26(); 


                }
                break;
            case 13 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:82: T__27
                {
                mT__27(); 


                }
                break;
            case 14 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:88: T__28
                {
                mT__28(); 


                }
                break;
            case 15 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:94: T__29
                {
                mT__29(); 


                }
                break;
            case 16 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:100: T__30
                {
                mT__30(); 


                }
                break;
            case 17 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:106: T__31
                {
                mT__31(); 


                }
                break;
            case 18 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:112: WS
                {
                mWS(); 


                }
                break;
            case 19 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:115: SET
                {
                mSET(); 


                }
                break;
            case 20 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:119: SELECT
                {
                mSELECT(); 


                }
                break;
            case 21 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:126: UPDATE
                {
                mUPDATE(); 


                }
                break;
            case 22 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:133: CREATE
                {
                mCREATE(); 


                }
                break;
            case 23 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:140: AND
                {
                mAND(); 


                }
                break;
            case 24 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:144: FROM
                {
                mFROM(); 


                }
                break;
            case 25 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:149: WHERE
                {
                mWHERE(); 


                }
                break;
            case 26 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:155: GROUP
                {
                mGROUP(); 


                }
                break;
            case 27 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:161: CONFIG
                {
                mCONFIG(); 


                }
                break;
            case 28 :
                // /Users/apple/git/game-redisproxy/src/main/java/sky/redis/antlr/redisql_sky.g:1:168: VALUE
                {
                mVALUE(); 


                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\4\uffff\10\33\2\uffff\1\32\13\33\2\uffff\42\33\1\131\7\33\2\141"+
        "\13\33\1\155\3\33\1\uffff\1\33\2\uffff\6\33\1\uffff\1\155\6\33\1"+
        "\uffff\3\33\1\uffff\2\33\1\uffff\7\33\2\u008c\2\33\1\u0090\1\u0092"+
        "\2\33\1\u0095\1\uffff\1\33\1\uffff\1\u0098\1\33\2\u009a\2\u009b"+
        "\1\u0092\1\u0090\1\uffff\2\33\1\u009d\3\uffff\2\33\2\uffff\1\33"+
        "\1\uffff\1\u00a1\2\uffff\1\u0083\1\uffff\2\33\1\u0083\3\uffff";
    static final String DFA13_eofS =
        "\u00a4\uffff";
    static final String DFA13_minS =
        "\1\0\3\uffff\1\157\1\145\1\170\1\151\1\162\1\156\1\141\1\164\2\uffff"+
        "\1\0\1\145\1\105\1\160\1\120\1\117\1\116\1\156\1\122\1\150\1\110"+
        "\1\122\2\uffff\1\156\1\145\2\163\1\143\1\154\2\157\1\163\1\151\2"+
        "\154\1\114\1\144\1\104\1\105\1\116\1\104\1\144\1\117\1\145\1\105"+
        "\1\117\1\156\1\146\1\141\1\143\1\164\1\154\1\164\1\155\1\165\1\145"+
        "\1\156\1\0\1\40\1\145\1\105\1\141\2\101\1\106\2\0\1\115\1\162\1"+
        "\122\1\125\1\164\1\151\1\164\1\40\1\151\1\165\1\145\1\0\1\160\1"+
        "\162\1\40\1\uffff\1\151\2\uffff\1\143\1\103\1\164\2\124\1\111\1"+
        "\uffff\1\0\1\145\1\105\1\120\1\145\1\147\1\145\1\uffff\1\156\1\144"+
        "\1\162\1\uffff\1\11\1\164\1\uffff\1\147\1\164\1\124\1\145\2\105"+
        "\1\107\2\0\1\11\1\144\2\0\1\143\1\145\1\0\2\11\1\uffff\1\0\1\156"+
        "\6\0\1\uffff\1\11\1\131\1\0\3\uffff\1\164\1\144\2\uffff\1\171\1"+
        "\uffff\1\0\2\uffff\1\0\1\uffff\2\40\1\0\3\uffff";
    static final String DFA13_maxS =
        "\1\uffff\3\uffff\1\162\1\151\1\170\2\162\1\156\1\141\1\164\2\uffff"+
        "\1\uffff\1\145\1\105\1\160\1\120\1\122\1\116\1\156\1\122\1\150\1"+
        "\110\1\122\2\uffff\1\165\1\145\2\163\1\143\1\154\2\157\1\163\1\151"+
        "\1\154\1\164\1\114\1\144\1\104\1\105\1\116\1\104\1\144\1\117\1\145"+
        "\1\105\1\117\1\156\1\146\1\141\1\143\1\164\1\154\1\164\1\155\1\165"+
        "\1\145\1\156\1\uffff\1\40\1\145\1\105\1\141\2\101\1\106\2\uffff"+
        "\1\115\1\162\1\122\1\125\1\164\1\151\1\164\1\40\1\151\1\165\1\145"+
        "\1\uffff\1\160\1\162\1\40\1\uffff\1\151\2\uffff\1\143\1\103\1\164"+
        "\2\124\1\111\1\uffff\1\uffff\1\145\1\105\1\120\1\145\1\147\1\145"+
        "\1\uffff\1\156\1\144\1\162\1\uffff\1\40\1\164\1\uffff\1\147\1\164"+
        "\1\124\1\145\2\105\1\107\2\uffff\1\102\1\144\2\uffff\1\143\1\145"+
        "\1\uffff\1\146\1\142\1\uffff\1\uffff\1\156\6\uffff\1\uffff\1\102"+
        "\1\131\1\uffff\3\uffff\1\164\1\144\2\uffff\1\171\1\uffff\1\uffff"+
        "\2\uffff\1\uffff\1\uffff\2\40\1\uffff\3\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\1\3\10\uffff\1\20\1\21\14\uffff\1\22\1\34\73\uffff"+
        "\1\15\1\uffff\1\16\1\23\6\uffff\1\27\7\uffff\1\6\3\uffff\1\30\2"+
        "\uffff\1\14\22\uffff\1\32\10\uffff\1\31\3\uffff\1\33\1\5\1\26\2"+
        "\uffff\1\11\1\12\1\uffff\1\13\1\uffff\1\24\1\25\1\uffff\1\4\3\uffff"+
        "\1\17\1\7\1\10";
    static final String DFA13_specialS =
        "\1\20\15\uffff\1\2\57\uffff\1\16\7\uffff\1\24\1\22\13\uffff\1\6"+
        "\16\uffff\1\3\25\uffff\1\0\1\1\2\uffff\1\15\1\5\2\uffff\1\10\3\uffff"+
        "\1\4\1\uffff\1\11\1\12\1\17\1\13\1\26\1\14\3\uffff\1\23\11\uffff"+
        "\1\25\2\uffff\1\21\3\uffff\1\7\3\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\33\2\32\2\33\1\16\22\33\1\32\6\33\1\uffff\4\33\1\1\16\33"+
            "\1\2\1\33\1\3\3\33\1\24\1\33\1\23\2\33\1\26\1\31\13\33\1\20"+
            "\1\33\1\22\1\33\1\30\11\33\1\25\1\33\1\4\1\5\1\6\1\7\1\10\1"+
            "\33\1\11\3\33\1\12\5\33\1\17\1\13\1\21\1\33\1\27\3\33\1\14\1"+
            "\33\1\15\uff82\33",
            "",
            "",
            "",
            "\1\34\2\uffff\1\35",
            "\1\36\3\uffff\1\37",
            "\1\40",
            "\1\41\10\uffff\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "",
            "",
            "\11\33\2\uffff\2\33\1\16\22\33\1\uffff\6\33\1\uffff\4\33\1"+
            "\uffff\16\33\1\uffff\1\33\1\uffff\75\33\1\uffff\1\33\1\uffff"+
            "\uff82\33",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\54\2\uffff\1\53",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "",
            "",
            "\1\64\6\uffff\1\63",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\100\7\uffff\1\77",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\11\33\2\uffff\25\33\1\127\6\33\1\uffff\4\33\1\uffff\16\33"+
            "\1\uffff\1\33\1\uffff\65\33\1\130\7\33\1\uffff\1\33\1\uffff"+
            "\uff82\33",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\11\33\2\uffff\25\33\1\uffff\6\33\1\uffff\4\33\1\uffff\16\33"+
            "\1\uffff\1\33\1\uffff\75\33\1\uffff\1\33\1\uffff\uff82\33",
            "\11\33\2\uffff\25\33\1\uffff\6\33\1\uffff\4\33\1\uffff\16\33"+
            "\1\uffff\1\33\1\uffff\75\33\1\uffff\1\33\1\uffff\uff82\33",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\11\33\2\uffff\25\33\1\uffff\6\33\1\uffff\4\33\1\uffff\16\33"+
            "\1\uffff\1\33\1\uffff\75\33\1\uffff\1\33\1\uffff\uff82\33",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "\1\161",
            "",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "\11\33\2\uffff\25\33\1\uffff\6\33\1\uffff\4\33\1\uffff\16\33"+
            "\1\uffff\1\33\1\uffff\75\33\1\uffff\1\33\1\uffff\uff82\33",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "",
            "\2\u0083\2\uffff\1\u0082\22\uffff\1\u0081",
            "\1\u0084",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\11\33\2\uffff\25\33\1\uffff\6\33\1\uffff\4\33\1\uffff\16\33"+
            "\1\uffff\1\33\1\uffff\75\33\1\uffff\1\33\1\uffff\uff82\33",
            "\11\33\2\uffff\25\33\1\uffff\6\33\1\uffff\4\33\1\uffff\16\33"+
            "\1\uffff\1\33\1\uffff\75\33\1\uffff\1\33\1\uffff\uff82\33",
            "\2\u0083\2\uffff\1\u008d\22\uffff\1\u0083\41\uffff\1\u008e",
            "\1\u008f",
            "\11\33\2\uffff\25\33\1\uffff\6\33\1\uffff\4\33\1\uffff\16\33"+
            "\1\uffff\1\33\1\uffff\75\33\1\uffff\1\33\1\uffff\uff82\33",
            "\11\33\2\uffff\25\33\1\u0091\6\33\1\uffff\4\33\1\uffff\16\33"+
            "\1\uffff\1\33\1\uffff\75\33\1\uffff\1\33\1\uffff\uff82\33",
            "\1\u0093",
            "\1\u0094",
            "\11\33\2\uffff\25\33\1\uffff\6\33\1\uffff\4\33\1\uffff\16\33"+
            "\1\uffff\1\33\1\uffff\75\33\1\uffff\1\33\1\uffff\uff82\33",
            "\2\u0083\2\uffff\1\u0083\22\uffff\1\u0083\101\uffff\1\u0083"+
            "\3\uffff\1\u0096",
            "\2\u0083\2\uffff\1\u0082\22\uffff\1\u0083\101\uffff\1\u0097",
            "",
            "\11\33\2\uffff\25\33\1\uffff\6\33\1\uffff\4\33\1\uffff\16\33"+
            "\1\uffff\1\33\1\uffff\75\33\1\uffff\1\33\1\uffff\uff82\33",
            "\1\u0099",
            "\11\33\2\uffff\25\33\1\uffff\6\33\1\uffff\4\33\1\uffff\16\33"+
            "\1\uffff\1\33\1\uffff\75\33\1\uffff\1\33\1\uffff\uff82\33",
            "\11\33\2\uffff\25\33\1\uffff\6\33\1\uffff\4\33\1\uffff\16\33"+
            "\1\uffff\1\33\1\uffff\75\33\1\uffff\1\33\1\uffff\uff82\33",
            "\11\33\2\uffff\25\33\1\uffff\6\33\1\uffff\4\33\1\uffff\16\33"+
            "\1\uffff\1\33\1\uffff\75\33\1\uffff\1\33\1\uffff\uff82\33",
            "\11\33\2\uffff\25\33\1\uffff\6\33\1\uffff\4\33\1\uffff\16\33"+
            "\1\uffff\1\33\1\uffff\75\33\1\uffff\1\33\1\uffff\uff82\33",
            "\11\33\2\uffff\25\33\1\uffff\6\33\1\uffff\4\33\1\uffff\16\33"+
            "\1\uffff\1\33\1\uffff\75\33\1\uffff\1\33\1\uffff\uff82\33",
            "\11\33\2\uffff\25\33\1\uffff\6\33\1\uffff\4\33\1\uffff\16\33"+
            "\1\uffff\1\33\1\uffff\75\33\1\uffff\1\33\1\uffff\uff82\33",
            "",
            "\2\u0083\2\uffff\1\u008d\22\uffff\1\u0083\41\uffff\1\u008e",
            "\1\u009c",
            "\11\33\2\uffff\25\33\1\uffff\6\33\1\uffff\4\33\1\uffff\16\33"+
            "\1\uffff\1\33\1\uffff\75\33\1\uffff\1\33\1\uffff\uff82\33",
            "",
            "",
            "",
            "\1\u009e",
            "\1\u009f",
            "",
            "",
            "\1\u00a0",
            "",
            "\11\33\2\uffff\25\33\1\uffff\6\33\1\uffff\4\33\1\uffff\16\33"+
            "\1\uffff\1\33\1\uffff\75\33\1\uffff\1\33\1\uffff\uff82\33",
            "",
            "",
            "\11\33\2\uffff\25\33\1\uffff\6\33\1\uffff\4\33\1\uffff\16\33"+
            "\1\uffff\1\33\1\uffff\75\33\1\uffff\1\33\1\uffff\uff82\33",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\11\33\2\uffff\25\33\1\uffff\6\33\1\uffff\4\33\1\uffff\16\33"+
            "\1\uffff\1\33\1\uffff\75\33\1\uffff\1\33\1\uffff\uff82\33",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | WS | SET | SELECT | UPDATE | CREATE | AND | FROM | WHERE | GROUP | CONFIG | VALUE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_120 = input.LA(1);

                        s = -1;
                        if ( ((LA13_120 >= '\u0000' && LA13_120 <= '\b')||(LA13_120 >= '\u000B' && LA13_120 <= '\u001F')||(LA13_120 >= '!' && LA13_120 <= '&')||(LA13_120 >= '(' && LA13_120 <= '+')||(LA13_120 >= '-' && LA13_120 <= ':')||LA13_120=='<'||(LA13_120 >= '>' && LA13_120 <= 'z')||LA13_120=='|'||(LA13_120 >= '~' && LA13_120 <= '\uFFFF')) ) {s = 27;}

                        else s = 140;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_121 = input.LA(1);

                        s = -1;
                        if ( ((LA13_121 >= '\u0000' && LA13_121 <= '\b')||(LA13_121 >= '\u000B' && LA13_121 <= '\u001F')||(LA13_121 >= '!' && LA13_121 <= '&')||(LA13_121 >= '(' && LA13_121 <= '+')||(LA13_121 >= '-' && LA13_121 <= ':')||LA13_121=='<'||(LA13_121 >= '>' && LA13_121 <= 'z')||LA13_121=='|'||(LA13_121 >= '~' && LA13_121 <= '\uFFFF')) ) {s = 27;}

                        else s = 140;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_14 = input.LA(1);

                        s = -1;
                        if ( (LA13_14=='\r') ) {s = 14;}

                        else if ( ((LA13_14 >= '\u0000' && LA13_14 <= '\b')||(LA13_14 >= '\u000B' && LA13_14 <= '\f')||(LA13_14 >= '\u000E' && LA13_14 <= '\u001F')||(LA13_14 >= '!' && LA13_14 <= '&')||(LA13_14 >= '(' && LA13_14 <= '+')||(LA13_14 >= '-' && LA13_14 <= ':')||LA13_14=='<'||(LA13_14 >= '>' && LA13_14 <= 'z')||LA13_14=='|'||(LA13_14 >= '~' && LA13_14 <= '\uFFFF')) ) {s = 27;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_98 = input.LA(1);

                        s = -1;
                        if ( ((LA13_98 >= '\u0000' && LA13_98 <= '\b')||(LA13_98 >= '\u000B' && LA13_98 <= '\u001F')||(LA13_98 >= '!' && LA13_98 <= '&')||(LA13_98 >= '(' && LA13_98 <= '+')||(LA13_98 >= '-' && LA13_98 <= ':')||LA13_98=='<'||(LA13_98 >= '>' && LA13_98 <= 'z')||LA13_98=='|'||(LA13_98 >= '~' && LA13_98 <= '\uFFFF')) ) {s = 27;}

                        else s = 109;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_132 = input.LA(1);

                        s = -1;
                        if ( ((LA13_132 >= '\u0000' && LA13_132 <= '\b')||(LA13_132 >= '\u000B' && LA13_132 <= '\u001F')||(LA13_132 >= '!' && LA13_132 <= '&')||(LA13_132 >= '(' && LA13_132 <= '+')||(LA13_132 >= '-' && LA13_132 <= ':')||LA13_132=='<'||(LA13_132 >= '>' && LA13_132 <= 'z')||LA13_132=='|'||(LA13_132 >= '~' && LA13_132 <= '\uFFFF')) ) {s = 27;}

                        else s = 152;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_125 = input.LA(1);

                        s = -1;
                        if ( (LA13_125==' ') ) {s = 145;}

                        else if ( ((LA13_125 >= '\u0000' && LA13_125 <= '\b')||(LA13_125 >= '\u000B' && LA13_125 <= '\u001F')||(LA13_125 >= '!' && LA13_125 <= '&')||(LA13_125 >= '(' && LA13_125 <= '+')||(LA13_125 >= '-' && LA13_125 <= ':')||LA13_125=='<'||(LA13_125 >= '>' && LA13_125 <= 'z')||LA13_125=='|'||(LA13_125 >= '~' && LA13_125 <= '\uFFFF')) ) {s = 27;}

                        else s = 146;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_83 = input.LA(1);

                        s = -1;
                        if ( ((LA13_83 >= '\u0000' && LA13_83 <= '\b')||(LA13_83 >= '\u000B' && LA13_83 <= '\u001F')||(LA13_83 >= '!' && LA13_83 <= '&')||(LA13_83 >= '(' && LA13_83 <= '+')||(LA13_83 >= '-' && LA13_83 <= ':')||LA13_83=='<'||(LA13_83 >= '>' && LA13_83 <= 'z')||LA13_83=='|'||(LA13_83 >= '~' && LA13_83 <= '\uFFFF')) ) {s = 27;}

                        else s = 109;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_160 = input.LA(1);

                        s = -1;
                        if ( ((LA13_160 >= '\u0000' && LA13_160 <= '\b')||(LA13_160 >= '\u000B' && LA13_160 <= '\u001F')||(LA13_160 >= '!' && LA13_160 <= '&')||(LA13_160 >= '(' && LA13_160 <= '+')||(LA13_160 >= '-' && LA13_160 <= ':')||LA13_160=='<'||(LA13_160 >= '>' && LA13_160 <= 'z')||LA13_160=='|'||(LA13_160 >= '~' && LA13_160 <= '\uFFFF')) ) {s = 27;}

                        else s = 131;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA13_128 = input.LA(1);

                        s = -1;
                        if ( ((LA13_128 >= '\u0000' && LA13_128 <= '\b')||(LA13_128 >= '\u000B' && LA13_128 <= '\u001F')||(LA13_128 >= '!' && LA13_128 <= '&')||(LA13_128 >= '(' && LA13_128 <= '+')||(LA13_128 >= '-' && LA13_128 <= ':')||LA13_128=='<'||(LA13_128 >= '>' && LA13_128 <= 'z')||LA13_128=='|'||(LA13_128 >= '~' && LA13_128 <= '\uFFFF')) ) {s = 27;}

                        else s = 149;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA13_134 = input.LA(1);

                        s = -1;
                        if ( ((LA13_134 >= '\u0000' && LA13_134 <= '\b')||(LA13_134 >= '\u000B' && LA13_134 <= '\u001F')||(LA13_134 >= '!' && LA13_134 <= '&')||(LA13_134 >= '(' && LA13_134 <= '+')||(LA13_134 >= '-' && LA13_134 <= ':')||LA13_134=='<'||(LA13_134 >= '>' && LA13_134 <= 'z')||LA13_134=='|'||(LA13_134 >= '~' && LA13_134 <= '\uFFFF')) ) {s = 27;}

                        else s = 154;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA13_135 = input.LA(1);

                        s = -1;
                        if ( ((LA13_135 >= '\u0000' && LA13_135 <= '\b')||(LA13_135 >= '\u000B' && LA13_135 <= '\u001F')||(LA13_135 >= '!' && LA13_135 <= '&')||(LA13_135 >= '(' && LA13_135 <= '+')||(LA13_135 >= '-' && LA13_135 <= ':')||LA13_135=='<'||(LA13_135 >= '>' && LA13_135 <= 'z')||LA13_135=='|'||(LA13_135 >= '~' && LA13_135 <= '\uFFFF')) ) {s = 27;}

                        else s = 154;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA13_137 = input.LA(1);

                        s = -1;
                        if ( ((LA13_137 >= '\u0000' && LA13_137 <= '\b')||(LA13_137 >= '\u000B' && LA13_137 <= '\u001F')||(LA13_137 >= '!' && LA13_137 <= '&')||(LA13_137 >= '(' && LA13_137 <= '+')||(LA13_137 >= '-' && LA13_137 <= ':')||LA13_137=='<'||(LA13_137 >= '>' && LA13_137 <= 'z')||LA13_137=='|'||(LA13_137 >= '~' && LA13_137 <= '\uFFFF')) ) {s = 27;}

                        else s = 155;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA13_139 = input.LA(1);

                        s = -1;
                        if ( ((LA13_139 >= '\u0000' && LA13_139 <= '\b')||(LA13_139 >= '\u000B' && LA13_139 <= '\u001F')||(LA13_139 >= '!' && LA13_139 <= '&')||(LA13_139 >= '(' && LA13_139 <= '+')||(LA13_139 >= '-' && LA13_139 <= ':')||LA13_139=='<'||(LA13_139 >= '>' && LA13_139 <= 'z')||LA13_139=='|'||(LA13_139 >= '~' && LA13_139 <= '\uFFFF')) ) {s = 27;}

                        else s = 144;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA13_124 = input.LA(1);

                        s = -1;
                        if ( ((LA13_124 >= '\u0000' && LA13_124 <= '\b')||(LA13_124 >= '\u000B' && LA13_124 <= '\u001F')||(LA13_124 >= '!' && LA13_124 <= '&')||(LA13_124 >= '(' && LA13_124 <= '+')||(LA13_124 >= '-' && LA13_124 <= ':')||LA13_124=='<'||(LA13_124 >= '>' && LA13_124 <= 'z')||LA13_124=='|'||(LA13_124 >= '~' && LA13_124 <= '\uFFFF')) ) {s = 27;}

                        else s = 144;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA13_62 = input.LA(1);

                        s = -1;
                        if ( (LA13_62==' ') ) {s = 87;}

                        else if ( (LA13_62=='s') ) {s = 88;}

                        else if ( ((LA13_62 >= '\u0000' && LA13_62 <= '\b')||(LA13_62 >= '\u000B' && LA13_62 <= '\u001F')||(LA13_62 >= '!' && LA13_62 <= '&')||(LA13_62 >= '(' && LA13_62 <= '+')||(LA13_62 >= '-' && LA13_62 <= ':')||LA13_62=='<'||(LA13_62 >= '>' && LA13_62 <= 'r')||(LA13_62 >= 't' && LA13_62 <= 'z')||LA13_62=='|'||(LA13_62 >= '~' && LA13_62 <= '\uFFFF')) ) {s = 27;}

                        else s = 89;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA13_136 = input.LA(1);

                        s = -1;
                        if ( ((LA13_136 >= '\u0000' && LA13_136 <= '\b')||(LA13_136 >= '\u000B' && LA13_136 <= '\u001F')||(LA13_136 >= '!' && LA13_136 <= '&')||(LA13_136 >= '(' && LA13_136 <= '+')||(LA13_136 >= '-' && LA13_136 <= ':')||LA13_136=='<'||(LA13_136 >= '>' && LA13_136 <= 'z')||LA13_136=='|'||(LA13_136 >= '~' && LA13_136 <= '\uFFFF')) ) {s = 27;}

                        else s = 155;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0==',') ) {s = 1;}

                        else if ( (LA13_0==';') ) {s = 2;}

                        else if ( (LA13_0=='=') ) {s = 3;}

                        else if ( (LA13_0=='c') ) {s = 4;}

                        else if ( (LA13_0=='d') ) {s = 5;}

                        else if ( (LA13_0=='e') ) {s = 6;}

                        else if ( (LA13_0=='f') ) {s = 7;}

                        else if ( (LA13_0=='g') ) {s = 8;}

                        else if ( (LA13_0=='i') ) {s = 9;}

                        else if ( (LA13_0=='m') ) {s = 10;}

                        else if ( (LA13_0=='t') ) {s = 11;}

                        else if ( (LA13_0=='{') ) {s = 12;}

                        else if ( (LA13_0=='}') ) {s = 13;}

                        else if ( (LA13_0=='\r') ) {s = 14;}

                        else if ( (LA13_0=='s') ) {s = 15;}

                        else if ( (LA13_0=='S') ) {s = 16;}

                        else if ( (LA13_0=='u') ) {s = 17;}

                        else if ( (LA13_0=='U') ) {s = 18;}

                        else if ( (LA13_0=='C') ) {s = 19;}

                        else if ( (LA13_0=='A') ) {s = 20;}

                        else if ( (LA13_0=='a') ) {s = 21;}

                        else if ( (LA13_0=='F') ) {s = 22;}

                        else if ( (LA13_0=='w') ) {s = 23;}

                        else if ( (LA13_0=='W') ) {s = 24;}

                        else if ( (LA13_0=='G') ) {s = 25;}

                        else if ( ((LA13_0 >= '\t' && LA13_0 <= '\n')||LA13_0==' ') ) {s = 26;}

                        else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '\b')||(LA13_0 >= '\u000B' && LA13_0 <= '\f')||(LA13_0 >= '\u000E' && LA13_0 <= '\u001F')||(LA13_0 >= '!' && LA13_0 <= '&')||(LA13_0 >= '(' && LA13_0 <= '+')||(LA13_0 >= '-' && LA13_0 <= ':')||LA13_0=='<'||(LA13_0 >= '>' && LA13_0 <= '@')||LA13_0=='B'||(LA13_0 >= 'D' && LA13_0 <= 'E')||(LA13_0 >= 'H' && LA13_0 <= 'R')||LA13_0=='T'||LA13_0=='V'||(LA13_0 >= 'X' && LA13_0 <= '`')||LA13_0=='b'||LA13_0=='h'||(LA13_0 >= 'j' && LA13_0 <= 'l')||(LA13_0 >= 'n' && LA13_0 <= 'r')||LA13_0=='v'||(LA13_0 >= 'x' && LA13_0 <= 'z')||LA13_0=='|'||(LA13_0 >= '~' && LA13_0 <= '\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA13_156 = input.LA(1);

                        s = -1;
                        if ( ((LA13_156 >= '\u0000' && LA13_156 <= '\b')||(LA13_156 >= '\u000B' && LA13_156 <= '\u001F')||(LA13_156 >= '!' && LA13_156 <= '&')||(LA13_156 >= '(' && LA13_156 <= '+')||(LA13_156 >= '-' && LA13_156 <= ':')||LA13_156=='<'||(LA13_156 >= '>' && LA13_156 <= 'z')||LA13_156=='|'||(LA13_156 >= '~' && LA13_156 <= '\uFFFF')) ) {s = 27;}

                        else s = 131;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA13_71 = input.LA(1);

                        s = -1;
                        if ( ((LA13_71 >= '\u0000' && LA13_71 <= '\b')||(LA13_71 >= '\u000B' && LA13_71 <= '\u001F')||(LA13_71 >= '!' && LA13_71 <= '&')||(LA13_71 >= '(' && LA13_71 <= '+')||(LA13_71 >= '-' && LA13_71 <= ':')||LA13_71=='<'||(LA13_71 >= '>' && LA13_71 <= 'z')||LA13_71=='|'||(LA13_71 >= '~' && LA13_71 <= '\uFFFF')) ) {s = 27;}

                        else s = 97;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA13_143 = input.LA(1);

                        s = -1;
                        if ( ((LA13_143 >= '\u0000' && LA13_143 <= '\b')||(LA13_143 >= '\u000B' && LA13_143 <= '\u001F')||(LA13_143 >= '!' && LA13_143 <= '&')||(LA13_143 >= '(' && LA13_143 <= '+')||(LA13_143 >= '-' && LA13_143 <= ':')||LA13_143=='<'||(LA13_143 >= '>' && LA13_143 <= 'z')||LA13_143=='|'||(LA13_143 >= '~' && LA13_143 <= '\uFFFF')) ) {s = 27;}

                        else s = 157;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA13_70 = input.LA(1);

                        s = -1;
                        if ( ((LA13_70 >= '\u0000' && LA13_70 <= '\b')||(LA13_70 >= '\u000B' && LA13_70 <= '\u001F')||(LA13_70 >= '!' && LA13_70 <= '&')||(LA13_70 >= '(' && LA13_70 <= '+')||(LA13_70 >= '-' && LA13_70 <= ':')||LA13_70=='<'||(LA13_70 >= '>' && LA13_70 <= 'z')||LA13_70=='|'||(LA13_70 >= '~' && LA13_70 <= '\uFFFF')) ) {s = 27;}

                        else s = 97;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA13_153 = input.LA(1);

                        s = -1;
                        if ( ((LA13_153 >= '\u0000' && LA13_153 <= '\b')||(LA13_153 >= '\u000B' && LA13_153 <= '\u001F')||(LA13_153 >= '!' && LA13_153 <= '&')||(LA13_153 >= '(' && LA13_153 <= '+')||(LA13_153 >= '-' && LA13_153 <= ':')||LA13_153=='<'||(LA13_153 >= '>' && LA13_153 <= 'z')||LA13_153=='|'||(LA13_153 >= '~' && LA13_153 <= '\uFFFF')) ) {s = 27;}

                        else s = 161;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA13_138 = input.LA(1);

                        s = -1;
                        if ( ((LA13_138 >= '\u0000' && LA13_138 <= '\b')||(LA13_138 >= '\u000B' && LA13_138 <= '\u001F')||(LA13_138 >= '!' && LA13_138 <= '&')||(LA13_138 >= '(' && LA13_138 <= '+')||(LA13_138 >= '-' && LA13_138 <= ':')||LA13_138=='<'||(LA13_138 >= '>' && LA13_138 <= 'z')||LA13_138=='|'||(LA13_138 >= '~' && LA13_138 <= '\uFFFF')) ) {s = 27;}

                        else s = 146;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}