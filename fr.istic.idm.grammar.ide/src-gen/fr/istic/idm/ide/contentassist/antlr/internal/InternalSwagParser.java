package fr.istic.idm.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.istic.idm.services.SwagGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSwagParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'.'", "'['", "']'", "'*'", "'='", "'?'", "'..'", "','", "'null'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSwagParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSwagParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSwagParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSwag.g"; }


    	private SwagGrammarAccess grammarAccess;

    	public void setGrammarAccess(SwagGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePath"
    // InternalSwag.g:54:1: entryRulePath : rulePath EOF ;
    public final void entryRulePath() throws RecognitionException {
        try {
            // InternalSwag.g:55:1: ( rulePath EOF )
            // InternalSwag.g:56:1: rulePath EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePath();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // InternalSwag.g:63:1: rulePath : ( ( rule__Path__Group__0 ) ) ;
    public final void rulePath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:67:2: ( ( ( rule__Path__Group__0 ) ) )
            // InternalSwag.g:68:2: ( ( rule__Path__Group__0 ) )
            {
            // InternalSwag.g:68:2: ( ( rule__Path__Group__0 ) )
            // InternalSwag.g:69:3: ( rule__Path__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathAccess().getGroup()); 
            }
            // InternalSwag.g:70:3: ( rule__Path__Group__0 )
            // InternalSwag.g:70:4: rule__Path__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Path__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleNode"
    // InternalSwag.g:79:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalSwag.g:80:1: ( ruleNode EOF )
            // InternalSwag.g:81:1: ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalSwag.g:88:1: ruleNode : ( ( rule__Node__Alternatives ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:92:2: ( ( ( rule__Node__Alternatives ) ) )
            // InternalSwag.g:93:2: ( ( rule__Node__Alternatives ) )
            {
            // InternalSwag.g:93:2: ( ( rule__Node__Alternatives ) )
            // InternalSwag.g:94:3: ( rule__Node__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAlternatives()); 
            }
            // InternalSwag.g:95:3: ( rule__Node__Alternatives )
            // InternalSwag.g:95:4: rule__Node__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Node__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleBasicNode"
    // InternalSwag.g:104:1: entryRuleBasicNode : ruleBasicNode EOF ;
    public final void entryRuleBasicNode() throws RecognitionException {
        try {
            // InternalSwag.g:105:1: ( ruleBasicNode EOF )
            // InternalSwag.g:106:1: ruleBasicNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBasicNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicNodeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicNode"


    // $ANTLR start "ruleBasicNode"
    // InternalSwag.g:113:1: ruleBasicNode : ( ( rule__BasicNode__Group__0 ) ) ;
    public final void ruleBasicNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:117:2: ( ( ( rule__BasicNode__Group__0 ) ) )
            // InternalSwag.g:118:2: ( ( rule__BasicNode__Group__0 ) )
            {
            // InternalSwag.g:118:2: ( ( rule__BasicNode__Group__0 ) )
            // InternalSwag.g:119:3: ( rule__BasicNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicNodeAccess().getGroup()); 
            }
            // InternalSwag.g:120:3: ( rule__BasicNode__Group__0 )
            // InternalSwag.g:120:4: rule__BasicNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BasicNode__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicNodeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicNode"


    // $ANTLR start "entryRuleArrayNode"
    // InternalSwag.g:129:1: entryRuleArrayNode : ruleArrayNode EOF ;
    public final void entryRuleArrayNode() throws RecognitionException {
        try {
            // InternalSwag.g:130:1: ( ruleArrayNode EOF )
            // InternalSwag.g:131:1: ruleArrayNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArrayNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayNodeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayNode"


    // $ANTLR start "ruleArrayNode"
    // InternalSwag.g:138:1: ruleArrayNode : ( ( rule__ArrayNode__Group__0 ) ) ;
    public final void ruleArrayNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:142:2: ( ( ( rule__ArrayNode__Group__0 ) ) )
            // InternalSwag.g:143:2: ( ( rule__ArrayNode__Group__0 ) )
            {
            // InternalSwag.g:143:2: ( ( rule__ArrayNode__Group__0 ) )
            // InternalSwag.g:144:3: ( rule__ArrayNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayNodeAccess().getGroup()); 
            }
            // InternalSwag.g:145:3: ( rule__ArrayNode__Group__0 )
            // InternalSwag.g:145:4: rule__ArrayNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayNode__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayNodeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayNode"


    // $ANTLR start "entryRuleFilter"
    // InternalSwag.g:154:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // InternalSwag.g:155:1: ( ruleFilter EOF )
            // InternalSwag.g:156:1: ruleFilter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFilterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalSwag.g:163:1: ruleFilter : ( ( rule__Filter__Alternatives ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:167:2: ( ( ( rule__Filter__Alternatives ) ) )
            // InternalSwag.g:168:2: ( ( rule__Filter__Alternatives ) )
            {
            // InternalSwag.g:168:2: ( ( rule__Filter__Alternatives ) )
            // InternalSwag.g:169:3: ( rule__Filter__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFilterAccess().getAlternatives()); 
            }
            // InternalSwag.g:170:3: ( rule__Filter__Alternatives )
            // InternalSwag.g:170:4: rule__Filter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFilterAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleAllFilter"
    // InternalSwag.g:179:1: entryRuleAllFilter : ruleAllFilter EOF ;
    public final void entryRuleAllFilter() throws RecognitionException {
        try {
            // InternalSwag.g:180:1: ( ruleAllFilter EOF )
            // InternalSwag.g:181:1: ruleAllFilter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAllFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAllFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAllFilterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAllFilter"


    // $ANTLR start "ruleAllFilter"
    // InternalSwag.g:188:1: ruleAllFilter : ( ( rule__AllFilter__Group__0 ) ) ;
    public final void ruleAllFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:192:2: ( ( ( rule__AllFilter__Group__0 ) ) )
            // InternalSwag.g:193:2: ( ( rule__AllFilter__Group__0 ) )
            {
            // InternalSwag.g:193:2: ( ( rule__AllFilter__Group__0 ) )
            // InternalSwag.g:194:3: ( rule__AllFilter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAllFilterAccess().getGroup()); 
            }
            // InternalSwag.g:195:3: ( rule__AllFilter__Group__0 )
            // InternalSwag.g:195:4: rule__AllFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllFilter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAllFilterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllFilter"


    // $ANTLR start "entryRulePathFilter"
    // InternalSwag.g:204:1: entryRulePathFilter : rulePathFilter EOF ;
    public final void entryRulePathFilter() throws RecognitionException {
        try {
            // InternalSwag.g:205:1: ( rulePathFilter EOF )
            // InternalSwag.g:206:1: rulePathFilter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePathFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathFilterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePathFilter"


    // $ANTLR start "rulePathFilter"
    // InternalSwag.g:213:1: rulePathFilter : ( ( rule__PathFilter__Alternatives ) ) ;
    public final void rulePathFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:217:2: ( ( ( rule__PathFilter__Alternatives ) ) )
            // InternalSwag.g:218:2: ( ( rule__PathFilter__Alternatives ) )
            {
            // InternalSwag.g:218:2: ( ( rule__PathFilter__Alternatives ) )
            // InternalSwag.g:219:3: ( rule__PathFilter__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathFilterAccess().getAlternatives()); 
            }
            // InternalSwag.g:220:3: ( rule__PathFilter__Alternatives )
            // InternalSwag.g:220:4: rule__PathFilter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PathFilter__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathFilterAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePathFilter"


    // $ANTLR start "entryRuleEqualFilter"
    // InternalSwag.g:229:1: entryRuleEqualFilter : ruleEqualFilter EOF ;
    public final void entryRuleEqualFilter() throws RecognitionException {
        try {
            // InternalSwag.g:230:1: ( ruleEqualFilter EOF )
            // InternalSwag.g:231:1: ruleEqualFilter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEqualFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualFilterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEqualFilter"


    // $ANTLR start "ruleEqualFilter"
    // InternalSwag.g:238:1: ruleEqualFilter : ( ( rule__EqualFilter__Group__0 ) ) ;
    public final void ruleEqualFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:242:2: ( ( ( rule__EqualFilter__Group__0 ) ) )
            // InternalSwag.g:243:2: ( ( rule__EqualFilter__Group__0 ) )
            {
            // InternalSwag.g:243:2: ( ( rule__EqualFilter__Group__0 ) )
            // InternalSwag.g:244:3: ( rule__EqualFilter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualFilterAccess().getGroup()); 
            }
            // InternalSwag.g:245:3: ( rule__EqualFilter__Group__0 )
            // InternalSwag.g:245:4: rule__EqualFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EqualFilter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualFilterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqualFilter"


    // $ANTLR start "entryRuleExistFilter"
    // InternalSwag.g:254:1: entryRuleExistFilter : ruleExistFilter EOF ;
    public final void entryRuleExistFilter() throws RecognitionException {
        try {
            // InternalSwag.g:255:1: ( ruleExistFilter EOF )
            // InternalSwag.g:256:1: ruleExistFilter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExistFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExistFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExistFilterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExistFilter"


    // $ANTLR start "ruleExistFilter"
    // InternalSwag.g:263:1: ruleExistFilter : ( ( rule__ExistFilter__Group__0 ) ) ;
    public final void ruleExistFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:267:2: ( ( ( rule__ExistFilter__Group__0 ) ) )
            // InternalSwag.g:268:2: ( ( rule__ExistFilter__Group__0 ) )
            {
            // InternalSwag.g:268:2: ( ( rule__ExistFilter__Group__0 ) )
            // InternalSwag.g:269:3: ( rule__ExistFilter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExistFilterAccess().getGroup()); 
            }
            // InternalSwag.g:270:3: ( rule__ExistFilter__Group__0 )
            // InternalSwag.g:270:4: rule__ExistFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExistFilter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExistFilterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExistFilter"


    // $ANTLR start "entryRuleIndexFilter"
    // InternalSwag.g:279:1: entryRuleIndexFilter : ruleIndexFilter EOF ;
    public final void entryRuleIndexFilter() throws RecognitionException {
        try {
            // InternalSwag.g:280:1: ( ruleIndexFilter EOF )
            // InternalSwag.g:281:1: ruleIndexFilter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndexFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIndexFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndexFilterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIndexFilter"


    // $ANTLR start "ruleIndexFilter"
    // InternalSwag.g:288:1: ruleIndexFilter : ( ( rule__IndexFilter__Group__0 ) ) ;
    public final void ruleIndexFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:292:2: ( ( ( rule__IndexFilter__Group__0 ) ) )
            // InternalSwag.g:293:2: ( ( rule__IndexFilter__Group__0 ) )
            {
            // InternalSwag.g:293:2: ( ( rule__IndexFilter__Group__0 ) )
            // InternalSwag.g:294:3: ( rule__IndexFilter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndexFilterAccess().getGroup()); 
            }
            // InternalSwag.g:295:3: ( rule__IndexFilter__Group__0 )
            // InternalSwag.g:295:4: rule__IndexFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IndexFilter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndexFilterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIndexFilter"


    // $ANTLR start "entryRuleBoundFilter"
    // InternalSwag.g:304:1: entryRuleBoundFilter : ruleBoundFilter EOF ;
    public final void entryRuleBoundFilter() throws RecognitionException {
        try {
            // InternalSwag.g:305:1: ( ruleBoundFilter EOF )
            // InternalSwag.g:306:1: ruleBoundFilter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBoundFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundFilterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoundFilter"


    // $ANTLR start "ruleBoundFilter"
    // InternalSwag.g:313:1: ruleBoundFilter : ( ( rule__BoundFilter__Alternatives ) ) ;
    public final void ruleBoundFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:317:2: ( ( ( rule__BoundFilter__Alternatives ) ) )
            // InternalSwag.g:318:2: ( ( rule__BoundFilter__Alternatives ) )
            {
            // InternalSwag.g:318:2: ( ( rule__BoundFilter__Alternatives ) )
            // InternalSwag.g:319:3: ( rule__BoundFilter__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundFilterAccess().getAlternatives()); 
            }
            // InternalSwag.g:320:3: ( rule__BoundFilter__Alternatives )
            // InternalSwag.g:320:4: rule__BoundFilter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BoundFilter__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundFilterAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoundFilter"


    // $ANTLR start "entryRuleListFilter"
    // InternalSwag.g:329:1: entryRuleListFilter : ruleListFilter EOF ;
    public final void entryRuleListFilter() throws RecognitionException {
        try {
            // InternalSwag.g:330:1: ( ruleListFilter EOF )
            // InternalSwag.g:331:1: ruleListFilter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleListFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListFilterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListFilter"


    // $ANTLR start "ruleListFilter"
    // InternalSwag.g:338:1: ruleListFilter : ( ( rule__ListFilter__Group__0 ) ) ;
    public final void ruleListFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:342:2: ( ( ( rule__ListFilter__Group__0 ) ) )
            // InternalSwag.g:343:2: ( ( rule__ListFilter__Group__0 ) )
            {
            // InternalSwag.g:343:2: ( ( rule__ListFilter__Group__0 ) )
            // InternalSwag.g:344:3: ( rule__ListFilter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListFilterAccess().getGroup()); 
            }
            // InternalSwag.g:345:3: ( rule__ListFilter__Group__0 )
            // InternalSwag.g:345:4: rule__ListFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListFilter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListFilterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListFilter"


    // $ANTLR start "entryRuleJsonValue"
    // InternalSwag.g:354:1: entryRuleJsonValue : ruleJsonValue EOF ;
    public final void entryRuleJsonValue() throws RecognitionException {
        try {
            // InternalSwag.g:355:1: ( ruleJsonValue EOF )
            // InternalSwag.g:356:1: ruleJsonValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJsonValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonValue"


    // $ANTLR start "ruleJsonValue"
    // InternalSwag.g:363:1: ruleJsonValue : ( ( rule__JsonValue__Alternatives ) ) ;
    public final void ruleJsonValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:367:2: ( ( ( rule__JsonValue__Alternatives ) ) )
            // InternalSwag.g:368:2: ( ( rule__JsonValue__Alternatives ) )
            {
            // InternalSwag.g:368:2: ( ( rule__JsonValue__Alternatives ) )
            // InternalSwag.g:369:3: ( rule__JsonValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonValueAccess().getAlternatives()); 
            }
            // InternalSwag.g:370:3: ( rule__JsonValue__Alternatives )
            // InternalSwag.g:370:4: rule__JsonValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JsonValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonValue"


    // $ANTLR start "entryRuleJsonNull"
    // InternalSwag.g:379:1: entryRuleJsonNull : ruleJsonNull EOF ;
    public final void entryRuleJsonNull() throws RecognitionException {
        try {
            // InternalSwag.g:380:1: ( ruleJsonNull EOF )
            // InternalSwag.g:381:1: ruleJsonNull EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonNullRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJsonNull();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonNullRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonNull"


    // $ANTLR start "ruleJsonNull"
    // InternalSwag.g:388:1: ruleJsonNull : ( ( rule__JsonNull__Group__0 ) ) ;
    public final void ruleJsonNull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:392:2: ( ( ( rule__JsonNull__Group__0 ) ) )
            // InternalSwag.g:393:2: ( ( rule__JsonNull__Group__0 ) )
            {
            // InternalSwag.g:393:2: ( ( rule__JsonNull__Group__0 ) )
            // InternalSwag.g:394:3: ( rule__JsonNull__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonNullAccess().getGroup()); 
            }
            // InternalSwag.g:395:3: ( rule__JsonNull__Group__0 )
            // InternalSwag.g:395:4: rule__JsonNull__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JsonNull__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonNullAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonNull"


    // $ANTLR start "entryRuleJsonNumber"
    // InternalSwag.g:404:1: entryRuleJsonNumber : ruleJsonNumber EOF ;
    public final void entryRuleJsonNumber() throws RecognitionException {
        try {
            // InternalSwag.g:405:1: ( ruleJsonNumber EOF )
            // InternalSwag.g:406:1: ruleJsonNumber EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJsonNumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonNumberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonNumber"


    // $ANTLR start "ruleJsonNumber"
    // InternalSwag.g:413:1: ruleJsonNumber : ( ( rule__JsonNumber__Group__0 ) ) ;
    public final void ruleJsonNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:417:2: ( ( ( rule__JsonNumber__Group__0 ) ) )
            // InternalSwag.g:418:2: ( ( rule__JsonNumber__Group__0 ) )
            {
            // InternalSwag.g:418:2: ( ( rule__JsonNumber__Group__0 ) )
            // InternalSwag.g:419:3: ( rule__JsonNumber__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonNumberAccess().getGroup()); 
            }
            // InternalSwag.g:420:3: ( rule__JsonNumber__Group__0 )
            // InternalSwag.g:420:4: rule__JsonNumber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JsonNumber__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonNumberAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonNumber"


    // $ANTLR start "entryRuleJsonBoolean"
    // InternalSwag.g:429:1: entryRuleJsonBoolean : ruleJsonBoolean EOF ;
    public final void entryRuleJsonBoolean() throws RecognitionException {
        try {
            // InternalSwag.g:430:1: ( ruleJsonBoolean EOF )
            // InternalSwag.g:431:1: ruleJsonBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJsonBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonBooleanRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonBoolean"


    // $ANTLR start "ruleJsonBoolean"
    // InternalSwag.g:438:1: ruleJsonBoolean : ( ( rule__JsonBoolean__Group__0 ) ) ;
    public final void ruleJsonBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:442:2: ( ( ( rule__JsonBoolean__Group__0 ) ) )
            // InternalSwag.g:443:2: ( ( rule__JsonBoolean__Group__0 ) )
            {
            // InternalSwag.g:443:2: ( ( rule__JsonBoolean__Group__0 ) )
            // InternalSwag.g:444:3: ( rule__JsonBoolean__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonBooleanAccess().getGroup()); 
            }
            // InternalSwag.g:445:3: ( rule__JsonBoolean__Group__0 )
            // InternalSwag.g:445:4: rule__JsonBoolean__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JsonBoolean__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonBooleanAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonBoolean"


    // $ANTLR start "entryRuleJsonString"
    // InternalSwag.g:454:1: entryRuleJsonString : ruleJsonString EOF ;
    public final void entryRuleJsonString() throws RecognitionException {
        try {
            // InternalSwag.g:455:1: ( ruleJsonString EOF )
            // InternalSwag.g:456:1: ruleJsonString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJsonString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonStringRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonString"


    // $ANTLR start "ruleJsonString"
    // InternalSwag.g:463:1: ruleJsonString : ( ( rule__JsonString__Group__0 ) ) ;
    public final void ruleJsonString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:467:2: ( ( ( rule__JsonString__Group__0 ) ) )
            // InternalSwag.g:468:2: ( ( rule__JsonString__Group__0 ) )
            {
            // InternalSwag.g:468:2: ( ( rule__JsonString__Group__0 ) )
            // InternalSwag.g:469:3: ( rule__JsonString__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonStringAccess().getGroup()); 
            }
            // InternalSwag.g:470:3: ( rule__JsonString__Group__0 )
            // InternalSwag.g:470:4: rule__JsonString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JsonString__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonStringAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonString"


    // $ANTLR start "rule__Node__Alternatives"
    // InternalSwag.g:478:1: rule__Node__Alternatives : ( ( ruleArrayNode ) | ( ruleBasicNode ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:482:1: ( ( ruleArrayNode ) | ( ruleBasicNode ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||LA1_1==13||(LA1_1>=17 && LA1_1<=18)) ) {
                    alt1=2;
                }
                else if ( (LA1_1==14) ) {
                    alt1=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==RULE_STRING) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==14) ) {
                    alt1=1;
                }
                else if ( (LA1_2==EOF||LA1_2==13||(LA1_2>=17 && LA1_2<=18)) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSwag.g:483:2: ( ruleArrayNode )
                    {
                    // InternalSwag.g:483:2: ( ruleArrayNode )
                    // InternalSwag.g:484:3: ruleArrayNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getArrayNodeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleArrayNode();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeAccess().getArrayNodeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSwag.g:489:2: ( ruleBasicNode )
                    {
                    // InternalSwag.g:489:2: ( ruleBasicNode )
                    // InternalSwag.g:490:3: ruleBasicNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getBasicNodeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBasicNode();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeAccess().getBasicNodeParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Alternatives"


    // $ANTLR start "rule__BasicNode__StrAlternatives_1_0"
    // InternalSwag.g:499:1: rule__BasicNode__StrAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__BasicNode__StrAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:503:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSwag.g:504:2: ( RULE_ID )
                    {
                    // InternalSwag.g:504:2: ( RULE_ID )
                    // InternalSwag.g:505:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicNodeAccess().getStrIDTerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicNodeAccess().getStrIDTerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSwag.g:510:2: ( RULE_STRING )
                    {
                    // InternalSwag.g:510:2: ( RULE_STRING )
                    // InternalSwag.g:511:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicNodeAccess().getStrSTRINGTerminalRuleCall_1_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicNodeAccess().getStrSTRINGTerminalRuleCall_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicNode__StrAlternatives_1_0"


    // $ANTLR start "rule__ArrayNode__StrAlternatives_1_0"
    // InternalSwag.g:520:1: rule__ArrayNode__StrAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__ArrayNode__StrAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:524:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSwag.g:525:2: ( RULE_ID )
                    {
                    // InternalSwag.g:525:2: ( RULE_ID )
                    // InternalSwag.g:526:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArrayNodeAccess().getStrIDTerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArrayNodeAccess().getStrIDTerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSwag.g:531:2: ( RULE_STRING )
                    {
                    // InternalSwag.g:531:2: ( RULE_STRING )
                    // InternalSwag.g:532:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArrayNodeAccess().getStrSTRINGTerminalRuleCall_1_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArrayNodeAccess().getStrSTRINGTerminalRuleCall_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayNode__StrAlternatives_1_0"


    // $ANTLR start "rule__Filter__Alternatives"
    // InternalSwag.g:541:1: rule__Filter__Alternatives : ( ( ruleBoundFilter ) | ( ruleIndexFilter ) | ( rulePathFilter ) | ( ruleAllFilter ) );
    public final void rule__Filter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:545:1: ( ( ruleBoundFilter ) | ( ruleIndexFilter ) | ( rulePathFilter ) | ( ruleAllFilter ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==15||LA4_1==20) ) {
                    alt4=2;
                }
                else if ( (LA4_1==19) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case 17:
            case 18:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSwag.g:546:2: ( ruleBoundFilter )
                    {
                    // InternalSwag.g:546:2: ( ruleBoundFilter )
                    // InternalSwag.g:547:3: ruleBoundFilter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFilterAccess().getBoundFilterParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBoundFilter();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFilterAccess().getBoundFilterParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSwag.g:552:2: ( ruleIndexFilter )
                    {
                    // InternalSwag.g:552:2: ( ruleIndexFilter )
                    // InternalSwag.g:553:3: ruleIndexFilter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFilterAccess().getIndexFilterParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIndexFilter();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFilterAccess().getIndexFilterParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSwag.g:558:2: ( rulePathFilter )
                    {
                    // InternalSwag.g:558:2: ( rulePathFilter )
                    // InternalSwag.g:559:3: rulePathFilter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFilterAccess().getPathFilterParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePathFilter();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFilterAccess().getPathFilterParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSwag.g:564:2: ( ruleAllFilter )
                    {
                    // InternalSwag.g:564:2: ( ruleAllFilter )
                    // InternalSwag.g:565:3: ruleAllFilter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFilterAccess().getAllFilterParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAllFilter();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFilterAccess().getAllFilterParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Alternatives"


    // $ANTLR start "rule__PathFilter__Alternatives"
    // InternalSwag.g:574:1: rule__PathFilter__Alternatives : ( ( ( ruleExistFilter ) ) | ( ruleEqualFilter ) );
    public final void rule__PathFilter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:578:1: ( ( ( ruleExistFilter ) ) | ( ruleEqualFilter ) )
            int alt5=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA5_1 = input.LA(2);

                if ( (synpred7_InternalSwag()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA5_2 = input.LA(2);

                if ( (synpred7_InternalSwag()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSwag.g:579:2: ( ( ruleExistFilter ) )
                    {
                    // InternalSwag.g:579:2: ( ( ruleExistFilter ) )
                    // InternalSwag.g:580:3: ( ruleExistFilter )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPathFilterAccess().getExistFilterParserRuleCall_0()); 
                    }
                    // InternalSwag.g:581:3: ( ruleExistFilter )
                    // InternalSwag.g:581:4: ruleExistFilter
                    {
                    pushFollow(FOLLOW_2);
                    ruleExistFilter();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPathFilterAccess().getExistFilterParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSwag.g:585:2: ( ruleEqualFilter )
                    {
                    // InternalSwag.g:585:2: ( ruleEqualFilter )
                    // InternalSwag.g:586:3: ruleEqualFilter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPathFilterAccess().getEqualFilterParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEqualFilter();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPathFilterAccess().getEqualFilterParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathFilter__Alternatives"


    // $ANTLR start "rule__BoundFilter__Alternatives"
    // InternalSwag.g:595:1: rule__BoundFilter__Alternatives : ( ( ( rule__BoundFilter__Group_0__0 ) ) | ( ( rule__BoundFilter__Group_1__0 ) ) );
    public final void rule__BoundFilter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:599:1: ( ( ( rule__BoundFilter__Group_0__0 ) ) | ( ( rule__BoundFilter__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSwag.g:600:2: ( ( rule__BoundFilter__Group_0__0 ) )
                    {
                    // InternalSwag.g:600:2: ( ( rule__BoundFilter__Group_0__0 ) )
                    // InternalSwag.g:601:3: ( rule__BoundFilter__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoundFilterAccess().getGroup_0()); 
                    }
                    // InternalSwag.g:602:3: ( rule__BoundFilter__Group_0__0 )
                    // InternalSwag.g:602:4: rule__BoundFilter__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoundFilter__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoundFilterAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSwag.g:606:2: ( ( rule__BoundFilter__Group_1__0 ) )
                    {
                    // InternalSwag.g:606:2: ( ( rule__BoundFilter__Group_1__0 ) )
                    // InternalSwag.g:607:3: ( rule__BoundFilter__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoundFilterAccess().getGroup_1()); 
                    }
                    // InternalSwag.g:608:3: ( rule__BoundFilter__Group_1__0 )
                    // InternalSwag.g:608:4: rule__BoundFilter__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoundFilter__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoundFilterAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundFilter__Alternatives"


    // $ANTLR start "rule__JsonValue__Alternatives"
    // InternalSwag.g:616:1: rule__JsonValue__Alternatives : ( ( ruleJsonBoolean ) | ( ruleJsonNumber ) | ( ruleJsonNull ) | ( ruleJsonString ) );
    public final void rule__JsonValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:620:1: ( ( ruleJsonBoolean ) | ( ruleJsonNumber ) | ( ruleJsonNull ) | ( ruleJsonString ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            case RULE_STRING:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSwag.g:621:2: ( ruleJsonBoolean )
                    {
                    // InternalSwag.g:621:2: ( ruleJsonBoolean )
                    // InternalSwag.g:622:3: ruleJsonBoolean
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJsonValueAccess().getJsonBooleanParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleJsonBoolean();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJsonValueAccess().getJsonBooleanParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSwag.g:627:2: ( ruleJsonNumber )
                    {
                    // InternalSwag.g:627:2: ( ruleJsonNumber )
                    // InternalSwag.g:628:3: ruleJsonNumber
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJsonValueAccess().getJsonNumberParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleJsonNumber();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJsonValueAccess().getJsonNumberParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSwag.g:633:2: ( ruleJsonNull )
                    {
                    // InternalSwag.g:633:2: ( ruleJsonNull )
                    // InternalSwag.g:634:3: ruleJsonNull
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJsonValueAccess().getJsonNullParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleJsonNull();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJsonValueAccess().getJsonNullParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSwag.g:639:2: ( ruleJsonString )
                    {
                    // InternalSwag.g:639:2: ( ruleJsonString )
                    // InternalSwag.g:640:3: ruleJsonString
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJsonValueAccess().getJsonStringParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleJsonString();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJsonValueAccess().getJsonStringParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonValue__Alternatives"


    // $ANTLR start "rule__JsonBoolean__BoolAlternatives_1_0"
    // InternalSwag.g:649:1: rule__JsonBoolean__BoolAlternatives_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__JsonBoolean__BoolAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:653:1: ( ( 'true' ) | ( 'false' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            else if ( (LA8_0==12) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSwag.g:654:2: ( 'true' )
                    {
                    // InternalSwag.g:654:2: ( 'true' )
                    // InternalSwag.g:655:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJsonBooleanAccess().getBoolTrueKeyword_1_0_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJsonBooleanAccess().getBoolTrueKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSwag.g:660:2: ( 'false' )
                    {
                    // InternalSwag.g:660:2: ( 'false' )
                    // InternalSwag.g:661:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJsonBooleanAccess().getBoolFalseKeyword_1_0_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJsonBooleanAccess().getBoolFalseKeyword_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonBoolean__BoolAlternatives_1_0"


    // $ANTLR start "rule__Path__Group__0"
    // InternalSwag.g:670:1: rule__Path__Group__0 : rule__Path__Group__0__Impl rule__Path__Group__1 ;
    public final void rule__Path__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:674:1: ( rule__Path__Group__0__Impl rule__Path__Group__1 )
            // InternalSwag.g:675:2: rule__Path__Group__0__Impl rule__Path__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Path__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Path__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__0"


    // $ANTLR start "rule__Path__Group__0__Impl"
    // InternalSwag.g:682:1: rule__Path__Group__0__Impl : ( () ) ;
    public final void rule__Path__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:686:1: ( ( () ) )
            // InternalSwag.g:687:1: ( () )
            {
            // InternalSwag.g:687:1: ( () )
            // InternalSwag.g:688:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathAccess().getPathAction_0()); 
            }
            // InternalSwag.g:689:2: ()
            // InternalSwag.g:689:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathAccess().getPathAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__0__Impl"


    // $ANTLR start "rule__Path__Group__1"
    // InternalSwag.g:697:1: rule__Path__Group__1 : rule__Path__Group__1__Impl ;
    public final void rule__Path__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:701:1: ( rule__Path__Group__1__Impl )
            // InternalSwag.g:702:2: rule__Path__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Path__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__1"


    // $ANTLR start "rule__Path__Group__1__Impl"
    // InternalSwag.g:708:1: rule__Path__Group__1__Impl : ( ( rule__Path__Group_1__0 )? ) ;
    public final void rule__Path__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:712:1: ( ( ( rule__Path__Group_1__0 )? ) )
            // InternalSwag.g:713:1: ( ( rule__Path__Group_1__0 )? )
            {
            // InternalSwag.g:713:1: ( ( rule__Path__Group_1__0 )? )
            // InternalSwag.g:714:2: ( rule__Path__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathAccess().getGroup_1()); 
            }
            // InternalSwag.g:715:2: ( rule__Path__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSwag.g:715:3: rule__Path__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Path__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__1__Impl"


    // $ANTLR start "rule__Path__Group_1__0"
    // InternalSwag.g:724:1: rule__Path__Group_1__0 : rule__Path__Group_1__0__Impl rule__Path__Group_1__1 ;
    public final void rule__Path__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:728:1: ( rule__Path__Group_1__0__Impl rule__Path__Group_1__1 )
            // InternalSwag.g:729:2: rule__Path__Group_1__0__Impl rule__Path__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Path__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Path__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_1__0"


    // $ANTLR start "rule__Path__Group_1__0__Impl"
    // InternalSwag.g:736:1: rule__Path__Group_1__0__Impl : ( ( rule__Path__NodesAssignment_1_0 ) ) ;
    public final void rule__Path__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:740:1: ( ( ( rule__Path__NodesAssignment_1_0 ) ) )
            // InternalSwag.g:741:1: ( ( rule__Path__NodesAssignment_1_0 ) )
            {
            // InternalSwag.g:741:1: ( ( rule__Path__NodesAssignment_1_0 ) )
            // InternalSwag.g:742:2: ( rule__Path__NodesAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathAccess().getNodesAssignment_1_0()); 
            }
            // InternalSwag.g:743:2: ( rule__Path__NodesAssignment_1_0 )
            // InternalSwag.g:743:3: rule__Path__NodesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Path__NodesAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathAccess().getNodesAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_1__0__Impl"


    // $ANTLR start "rule__Path__Group_1__1"
    // InternalSwag.g:751:1: rule__Path__Group_1__1 : rule__Path__Group_1__1__Impl ;
    public final void rule__Path__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:755:1: ( rule__Path__Group_1__1__Impl )
            // InternalSwag.g:756:2: rule__Path__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Path__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_1__1"


    // $ANTLR start "rule__Path__Group_1__1__Impl"
    // InternalSwag.g:762:1: rule__Path__Group_1__1__Impl : ( ( rule__Path__Group_1_1__0 )* ) ;
    public final void rule__Path__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:766:1: ( ( ( rule__Path__Group_1_1__0 )* ) )
            // InternalSwag.g:767:1: ( ( rule__Path__Group_1_1__0 )* )
            {
            // InternalSwag.g:767:1: ( ( rule__Path__Group_1_1__0 )* )
            // InternalSwag.g:768:2: ( rule__Path__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathAccess().getGroup_1_1()); 
            }
            // InternalSwag.g:769:2: ( rule__Path__Group_1_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==13) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSwag.g:769:3: rule__Path__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Path__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathAccess().getGroup_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_1__1__Impl"


    // $ANTLR start "rule__Path__Group_1_1__0"
    // InternalSwag.g:778:1: rule__Path__Group_1_1__0 : rule__Path__Group_1_1__0__Impl rule__Path__Group_1_1__1 ;
    public final void rule__Path__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:782:1: ( rule__Path__Group_1_1__0__Impl rule__Path__Group_1_1__1 )
            // InternalSwag.g:783:2: rule__Path__Group_1_1__0__Impl rule__Path__Group_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Path__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Path__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_1_1__0"


    // $ANTLR start "rule__Path__Group_1_1__0__Impl"
    // InternalSwag.g:790:1: rule__Path__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__Path__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:794:1: ( ( '.' ) )
            // InternalSwag.g:795:1: ( '.' )
            {
            // InternalSwag.g:795:1: ( '.' )
            // InternalSwag.g:796:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathAccess().getFullStopKeyword_1_1_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathAccess().getFullStopKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_1_1__0__Impl"


    // $ANTLR start "rule__Path__Group_1_1__1"
    // InternalSwag.g:805:1: rule__Path__Group_1_1__1 : rule__Path__Group_1_1__1__Impl ;
    public final void rule__Path__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:809:1: ( rule__Path__Group_1_1__1__Impl )
            // InternalSwag.g:810:2: rule__Path__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Path__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_1_1__1"


    // $ANTLR start "rule__Path__Group_1_1__1__Impl"
    // InternalSwag.g:816:1: rule__Path__Group_1_1__1__Impl : ( ( rule__Path__NodesAssignment_1_1_1 ) ) ;
    public final void rule__Path__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:820:1: ( ( ( rule__Path__NodesAssignment_1_1_1 ) ) )
            // InternalSwag.g:821:1: ( ( rule__Path__NodesAssignment_1_1_1 ) )
            {
            // InternalSwag.g:821:1: ( ( rule__Path__NodesAssignment_1_1_1 ) )
            // InternalSwag.g:822:2: ( rule__Path__NodesAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathAccess().getNodesAssignment_1_1_1()); 
            }
            // InternalSwag.g:823:2: ( rule__Path__NodesAssignment_1_1_1 )
            // InternalSwag.g:823:3: rule__Path__NodesAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Path__NodesAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathAccess().getNodesAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_1_1__1__Impl"


    // $ANTLR start "rule__BasicNode__Group__0"
    // InternalSwag.g:832:1: rule__BasicNode__Group__0 : rule__BasicNode__Group__0__Impl rule__BasicNode__Group__1 ;
    public final void rule__BasicNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:836:1: ( rule__BasicNode__Group__0__Impl rule__BasicNode__Group__1 )
            // InternalSwag.g:837:2: rule__BasicNode__Group__0__Impl rule__BasicNode__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BasicNode__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BasicNode__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicNode__Group__0"


    // $ANTLR start "rule__BasicNode__Group__0__Impl"
    // InternalSwag.g:844:1: rule__BasicNode__Group__0__Impl : ( () ) ;
    public final void rule__BasicNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:848:1: ( ( () ) )
            // InternalSwag.g:849:1: ( () )
            {
            // InternalSwag.g:849:1: ( () )
            // InternalSwag.g:850:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicNodeAccess().getBasicNodeAction_0()); 
            }
            // InternalSwag.g:851:2: ()
            // InternalSwag.g:851:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicNodeAccess().getBasicNodeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicNode__Group__0__Impl"


    // $ANTLR start "rule__BasicNode__Group__1"
    // InternalSwag.g:859:1: rule__BasicNode__Group__1 : rule__BasicNode__Group__1__Impl ;
    public final void rule__BasicNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:863:1: ( rule__BasicNode__Group__1__Impl )
            // InternalSwag.g:864:2: rule__BasicNode__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicNode__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicNode__Group__1"


    // $ANTLR start "rule__BasicNode__Group__1__Impl"
    // InternalSwag.g:870:1: rule__BasicNode__Group__1__Impl : ( ( rule__BasicNode__StrAssignment_1 ) ) ;
    public final void rule__BasicNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:874:1: ( ( ( rule__BasicNode__StrAssignment_1 ) ) )
            // InternalSwag.g:875:1: ( ( rule__BasicNode__StrAssignment_1 ) )
            {
            // InternalSwag.g:875:1: ( ( rule__BasicNode__StrAssignment_1 ) )
            // InternalSwag.g:876:2: ( rule__BasicNode__StrAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicNodeAccess().getStrAssignment_1()); 
            }
            // InternalSwag.g:877:2: ( rule__BasicNode__StrAssignment_1 )
            // InternalSwag.g:877:3: rule__BasicNode__StrAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BasicNode__StrAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicNodeAccess().getStrAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicNode__Group__1__Impl"


    // $ANTLR start "rule__ArrayNode__Group__0"
    // InternalSwag.g:886:1: rule__ArrayNode__Group__0 : rule__ArrayNode__Group__0__Impl rule__ArrayNode__Group__1 ;
    public final void rule__ArrayNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:890:1: ( rule__ArrayNode__Group__0__Impl rule__ArrayNode__Group__1 )
            // InternalSwag.g:891:2: rule__ArrayNode__Group__0__Impl rule__ArrayNode__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ArrayNode__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayNode__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayNode__Group__0"


    // $ANTLR start "rule__ArrayNode__Group__0__Impl"
    // InternalSwag.g:898:1: rule__ArrayNode__Group__0__Impl : ( () ) ;
    public final void rule__ArrayNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:902:1: ( ( () ) )
            // InternalSwag.g:903:1: ( () )
            {
            // InternalSwag.g:903:1: ( () )
            // InternalSwag.g:904:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayNodeAccess().getArrayNodeAction_0()); 
            }
            // InternalSwag.g:905:2: ()
            // InternalSwag.g:905:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayNodeAccess().getArrayNodeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayNode__Group__0__Impl"


    // $ANTLR start "rule__ArrayNode__Group__1"
    // InternalSwag.g:913:1: rule__ArrayNode__Group__1 : rule__ArrayNode__Group__1__Impl rule__ArrayNode__Group__2 ;
    public final void rule__ArrayNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:917:1: ( rule__ArrayNode__Group__1__Impl rule__ArrayNode__Group__2 )
            // InternalSwag.g:918:2: rule__ArrayNode__Group__1__Impl rule__ArrayNode__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ArrayNode__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayNode__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayNode__Group__1"


    // $ANTLR start "rule__ArrayNode__Group__1__Impl"
    // InternalSwag.g:925:1: rule__ArrayNode__Group__1__Impl : ( ( rule__ArrayNode__StrAssignment_1 ) ) ;
    public final void rule__ArrayNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:929:1: ( ( ( rule__ArrayNode__StrAssignment_1 ) ) )
            // InternalSwag.g:930:1: ( ( rule__ArrayNode__StrAssignment_1 ) )
            {
            // InternalSwag.g:930:1: ( ( rule__ArrayNode__StrAssignment_1 ) )
            // InternalSwag.g:931:2: ( rule__ArrayNode__StrAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayNodeAccess().getStrAssignment_1()); 
            }
            // InternalSwag.g:932:2: ( rule__ArrayNode__StrAssignment_1 )
            // InternalSwag.g:932:3: rule__ArrayNode__StrAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ArrayNode__StrAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayNodeAccess().getStrAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayNode__Group__1__Impl"


    // $ANTLR start "rule__ArrayNode__Group__2"
    // InternalSwag.g:940:1: rule__ArrayNode__Group__2 : rule__ArrayNode__Group__2__Impl rule__ArrayNode__Group__3 ;
    public final void rule__ArrayNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:944:1: ( rule__ArrayNode__Group__2__Impl rule__ArrayNode__Group__3 )
            // InternalSwag.g:945:2: rule__ArrayNode__Group__2__Impl rule__ArrayNode__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ArrayNode__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayNode__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayNode__Group__2"


    // $ANTLR start "rule__ArrayNode__Group__2__Impl"
    // InternalSwag.g:952:1: rule__ArrayNode__Group__2__Impl : ( '[' ) ;
    public final void rule__ArrayNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:956:1: ( ( '[' ) )
            // InternalSwag.g:957:1: ( '[' )
            {
            // InternalSwag.g:957:1: ( '[' )
            // InternalSwag.g:958:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayNodeAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayNodeAccess().getLeftSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayNode__Group__2__Impl"


    // $ANTLR start "rule__ArrayNode__Group__3"
    // InternalSwag.g:967:1: rule__ArrayNode__Group__3 : rule__ArrayNode__Group__3__Impl rule__ArrayNode__Group__4 ;
    public final void rule__ArrayNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:971:1: ( rule__ArrayNode__Group__3__Impl rule__ArrayNode__Group__4 )
            // InternalSwag.g:972:2: rule__ArrayNode__Group__3__Impl rule__ArrayNode__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ArrayNode__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayNode__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayNode__Group__3"


    // $ANTLR start "rule__ArrayNode__Group__3__Impl"
    // InternalSwag.g:979:1: rule__ArrayNode__Group__3__Impl : ( ( rule__ArrayNode__FilterAssignment_3 )? ) ;
    public final void rule__ArrayNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:983:1: ( ( ( rule__ArrayNode__FilterAssignment_3 )? ) )
            // InternalSwag.g:984:1: ( ( rule__ArrayNode__FilterAssignment_3 )? )
            {
            // InternalSwag.g:984:1: ( ( rule__ArrayNode__FilterAssignment_3 )? )
            // InternalSwag.g:985:2: ( rule__ArrayNode__FilterAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayNodeAccess().getFilterAssignment_3()); 
            }
            // InternalSwag.g:986:2: ( rule__ArrayNode__FilterAssignment_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==EOF||(LA11_0>=RULE_ID && LA11_0<=RULE_INT)||(LA11_0>=16 && LA11_0<=19)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSwag.g:986:3: rule__ArrayNode__FilterAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayNode__FilterAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayNodeAccess().getFilterAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayNode__Group__3__Impl"


    // $ANTLR start "rule__ArrayNode__Group__4"
    // InternalSwag.g:994:1: rule__ArrayNode__Group__4 : rule__ArrayNode__Group__4__Impl ;
    public final void rule__ArrayNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:998:1: ( rule__ArrayNode__Group__4__Impl )
            // InternalSwag.g:999:2: rule__ArrayNode__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayNode__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayNode__Group__4"


    // $ANTLR start "rule__ArrayNode__Group__4__Impl"
    // InternalSwag.g:1005:1: rule__ArrayNode__Group__4__Impl : ( ']' ) ;
    public final void rule__ArrayNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1009:1: ( ( ']' ) )
            // InternalSwag.g:1010:1: ( ']' )
            {
            // InternalSwag.g:1010:1: ( ']' )
            // InternalSwag.g:1011:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayNodeAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayNodeAccess().getRightSquareBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayNode__Group__4__Impl"


    // $ANTLR start "rule__AllFilter__Group__0"
    // InternalSwag.g:1021:1: rule__AllFilter__Group__0 : rule__AllFilter__Group__0__Impl rule__AllFilter__Group__1 ;
    public final void rule__AllFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1025:1: ( rule__AllFilter__Group__0__Impl rule__AllFilter__Group__1 )
            // InternalSwag.g:1026:2: rule__AllFilter__Group__0__Impl rule__AllFilter__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AllFilter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AllFilter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllFilter__Group__0"


    // $ANTLR start "rule__AllFilter__Group__0__Impl"
    // InternalSwag.g:1033:1: rule__AllFilter__Group__0__Impl : ( () ) ;
    public final void rule__AllFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1037:1: ( ( () ) )
            // InternalSwag.g:1038:1: ( () )
            {
            // InternalSwag.g:1038:1: ( () )
            // InternalSwag.g:1039:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAllFilterAccess().getAllFilterAction_0()); 
            }
            // InternalSwag.g:1040:2: ()
            // InternalSwag.g:1040:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAllFilterAccess().getAllFilterAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllFilter__Group__0__Impl"


    // $ANTLR start "rule__AllFilter__Group__1"
    // InternalSwag.g:1048:1: rule__AllFilter__Group__1 : rule__AllFilter__Group__1__Impl ;
    public final void rule__AllFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1052:1: ( rule__AllFilter__Group__1__Impl )
            // InternalSwag.g:1053:2: rule__AllFilter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllFilter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllFilter__Group__1"


    // $ANTLR start "rule__AllFilter__Group__1__Impl"
    // InternalSwag.g:1059:1: rule__AllFilter__Group__1__Impl : ( '*' ) ;
    public final void rule__AllFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1063:1: ( ( '*' ) )
            // InternalSwag.g:1064:1: ( '*' )
            {
            // InternalSwag.g:1064:1: ( '*' )
            // InternalSwag.g:1065:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAllFilterAccess().getAsteriskKeyword_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAllFilterAccess().getAsteriskKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllFilter__Group__1__Impl"


    // $ANTLR start "rule__EqualFilter__Group__0"
    // InternalSwag.g:1075:1: rule__EqualFilter__Group__0 : rule__EqualFilter__Group__0__Impl rule__EqualFilter__Group__1 ;
    public final void rule__EqualFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1079:1: ( rule__EqualFilter__Group__0__Impl rule__EqualFilter__Group__1 )
            // InternalSwag.g:1080:2: rule__EqualFilter__Group__0__Impl rule__EqualFilter__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EqualFilter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EqualFilter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualFilter__Group__0"


    // $ANTLR start "rule__EqualFilter__Group__0__Impl"
    // InternalSwag.g:1087:1: rule__EqualFilter__Group__0__Impl : ( () ) ;
    public final void rule__EqualFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1091:1: ( ( () ) )
            // InternalSwag.g:1092:1: ( () )
            {
            // InternalSwag.g:1092:1: ( () )
            // InternalSwag.g:1093:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualFilterAccess().getEqualFilterAction_0()); 
            }
            // InternalSwag.g:1094:2: ()
            // InternalSwag.g:1094:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualFilterAccess().getEqualFilterAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualFilter__Group__0__Impl"


    // $ANTLR start "rule__EqualFilter__Group__1"
    // InternalSwag.g:1102:1: rule__EqualFilter__Group__1 : rule__EqualFilter__Group__1__Impl rule__EqualFilter__Group__2 ;
    public final void rule__EqualFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1106:1: ( rule__EqualFilter__Group__1__Impl rule__EqualFilter__Group__2 )
            // InternalSwag.g:1107:2: rule__EqualFilter__Group__1__Impl rule__EqualFilter__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__EqualFilter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EqualFilter__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualFilter__Group__1"


    // $ANTLR start "rule__EqualFilter__Group__1__Impl"
    // InternalSwag.g:1114:1: rule__EqualFilter__Group__1__Impl : ( ( rule__EqualFilter__PathAssignment_1 ) ) ;
    public final void rule__EqualFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1118:1: ( ( ( rule__EqualFilter__PathAssignment_1 ) ) )
            // InternalSwag.g:1119:1: ( ( rule__EqualFilter__PathAssignment_1 ) )
            {
            // InternalSwag.g:1119:1: ( ( rule__EqualFilter__PathAssignment_1 ) )
            // InternalSwag.g:1120:2: ( rule__EqualFilter__PathAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualFilterAccess().getPathAssignment_1()); 
            }
            // InternalSwag.g:1121:2: ( rule__EqualFilter__PathAssignment_1 )
            // InternalSwag.g:1121:3: rule__EqualFilter__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EqualFilter__PathAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualFilterAccess().getPathAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualFilter__Group__1__Impl"


    // $ANTLR start "rule__EqualFilter__Group__2"
    // InternalSwag.g:1129:1: rule__EqualFilter__Group__2 : rule__EqualFilter__Group__2__Impl rule__EqualFilter__Group__3 ;
    public final void rule__EqualFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1133:1: ( rule__EqualFilter__Group__2__Impl rule__EqualFilter__Group__3 )
            // InternalSwag.g:1134:2: rule__EqualFilter__Group__2__Impl rule__EqualFilter__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__EqualFilter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EqualFilter__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualFilter__Group__2"


    // $ANTLR start "rule__EqualFilter__Group__2__Impl"
    // InternalSwag.g:1141:1: rule__EqualFilter__Group__2__Impl : ( '=' ) ;
    public final void rule__EqualFilter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1145:1: ( ( '=' ) )
            // InternalSwag.g:1146:1: ( '=' )
            {
            // InternalSwag.g:1146:1: ( '=' )
            // InternalSwag.g:1147:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualFilterAccess().getEqualsSignKeyword_2()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualFilterAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualFilter__Group__2__Impl"


    // $ANTLR start "rule__EqualFilter__Group__3"
    // InternalSwag.g:1156:1: rule__EqualFilter__Group__3 : rule__EqualFilter__Group__3__Impl ;
    public final void rule__EqualFilter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1160:1: ( rule__EqualFilter__Group__3__Impl )
            // InternalSwag.g:1161:2: rule__EqualFilter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualFilter__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualFilter__Group__3"


    // $ANTLR start "rule__EqualFilter__Group__3__Impl"
    // InternalSwag.g:1167:1: rule__EqualFilter__Group__3__Impl : ( ( rule__EqualFilter__ValueAssignment_3 ) ) ;
    public final void rule__EqualFilter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1171:1: ( ( ( rule__EqualFilter__ValueAssignment_3 ) ) )
            // InternalSwag.g:1172:1: ( ( rule__EqualFilter__ValueAssignment_3 ) )
            {
            // InternalSwag.g:1172:1: ( ( rule__EqualFilter__ValueAssignment_3 ) )
            // InternalSwag.g:1173:2: ( rule__EqualFilter__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualFilterAccess().getValueAssignment_3()); 
            }
            // InternalSwag.g:1174:2: ( rule__EqualFilter__ValueAssignment_3 )
            // InternalSwag.g:1174:3: rule__EqualFilter__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EqualFilter__ValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualFilterAccess().getValueAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualFilter__Group__3__Impl"


    // $ANTLR start "rule__ExistFilter__Group__0"
    // InternalSwag.g:1183:1: rule__ExistFilter__Group__0 : rule__ExistFilter__Group__0__Impl rule__ExistFilter__Group__1 ;
    public final void rule__ExistFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1187:1: ( rule__ExistFilter__Group__0__Impl rule__ExistFilter__Group__1 )
            // InternalSwag.g:1188:2: rule__ExistFilter__Group__0__Impl rule__ExistFilter__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ExistFilter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExistFilter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistFilter__Group__0"


    // $ANTLR start "rule__ExistFilter__Group__0__Impl"
    // InternalSwag.g:1195:1: rule__ExistFilter__Group__0__Impl : ( () ) ;
    public final void rule__ExistFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1199:1: ( ( () ) )
            // InternalSwag.g:1200:1: ( () )
            {
            // InternalSwag.g:1200:1: ( () )
            // InternalSwag.g:1201:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExistFilterAccess().getExistFilterAction_0()); 
            }
            // InternalSwag.g:1202:2: ()
            // InternalSwag.g:1202:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExistFilterAccess().getExistFilterAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistFilter__Group__0__Impl"


    // $ANTLR start "rule__ExistFilter__Group__1"
    // InternalSwag.g:1210:1: rule__ExistFilter__Group__1 : rule__ExistFilter__Group__1__Impl rule__ExistFilter__Group__2 ;
    public final void rule__ExistFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1214:1: ( rule__ExistFilter__Group__1__Impl rule__ExistFilter__Group__2 )
            // InternalSwag.g:1215:2: rule__ExistFilter__Group__1__Impl rule__ExistFilter__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ExistFilter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExistFilter__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistFilter__Group__1"


    // $ANTLR start "rule__ExistFilter__Group__1__Impl"
    // InternalSwag.g:1222:1: rule__ExistFilter__Group__1__Impl : ( ( rule__ExistFilter__PathAssignment_1 ) ) ;
    public final void rule__ExistFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1226:1: ( ( ( rule__ExistFilter__PathAssignment_1 ) ) )
            // InternalSwag.g:1227:1: ( ( rule__ExistFilter__PathAssignment_1 ) )
            {
            // InternalSwag.g:1227:1: ( ( rule__ExistFilter__PathAssignment_1 ) )
            // InternalSwag.g:1228:2: ( rule__ExistFilter__PathAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExistFilterAccess().getPathAssignment_1()); 
            }
            // InternalSwag.g:1229:2: ( rule__ExistFilter__PathAssignment_1 )
            // InternalSwag.g:1229:3: rule__ExistFilter__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExistFilter__PathAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExistFilterAccess().getPathAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistFilter__Group__1__Impl"


    // $ANTLR start "rule__ExistFilter__Group__2"
    // InternalSwag.g:1237:1: rule__ExistFilter__Group__2 : rule__ExistFilter__Group__2__Impl ;
    public final void rule__ExistFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1241:1: ( rule__ExistFilter__Group__2__Impl )
            // InternalSwag.g:1242:2: rule__ExistFilter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExistFilter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistFilter__Group__2"


    // $ANTLR start "rule__ExistFilter__Group__2__Impl"
    // InternalSwag.g:1248:1: rule__ExistFilter__Group__2__Impl : ( '?' ) ;
    public final void rule__ExistFilter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1252:1: ( ( '?' ) )
            // InternalSwag.g:1253:1: ( '?' )
            {
            // InternalSwag.g:1253:1: ( '?' )
            // InternalSwag.g:1254:2: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExistFilterAccess().getQuestionMarkKeyword_2()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExistFilterAccess().getQuestionMarkKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistFilter__Group__2__Impl"


    // $ANTLR start "rule__IndexFilter__Group__0"
    // InternalSwag.g:1264:1: rule__IndexFilter__Group__0 : rule__IndexFilter__Group__0__Impl rule__IndexFilter__Group__1 ;
    public final void rule__IndexFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1268:1: ( rule__IndexFilter__Group__0__Impl rule__IndexFilter__Group__1 )
            // InternalSwag.g:1269:2: rule__IndexFilter__Group__0__Impl rule__IndexFilter__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__IndexFilter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IndexFilter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexFilter__Group__0"


    // $ANTLR start "rule__IndexFilter__Group__0__Impl"
    // InternalSwag.g:1276:1: rule__IndexFilter__Group__0__Impl : ( () ) ;
    public final void rule__IndexFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1280:1: ( ( () ) )
            // InternalSwag.g:1281:1: ( () )
            {
            // InternalSwag.g:1281:1: ( () )
            // InternalSwag.g:1282:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndexFilterAccess().getIndexFilterAction_0()); 
            }
            // InternalSwag.g:1283:2: ()
            // InternalSwag.g:1283:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndexFilterAccess().getIndexFilterAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexFilter__Group__0__Impl"


    // $ANTLR start "rule__IndexFilter__Group__1"
    // InternalSwag.g:1291:1: rule__IndexFilter__Group__1 : rule__IndexFilter__Group__1__Impl ;
    public final void rule__IndexFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1295:1: ( rule__IndexFilter__Group__1__Impl )
            // InternalSwag.g:1296:2: rule__IndexFilter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IndexFilter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexFilter__Group__1"


    // $ANTLR start "rule__IndexFilter__Group__1__Impl"
    // InternalSwag.g:1302:1: rule__IndexFilter__Group__1__Impl : ( ( rule__IndexFilter__IndexAssignment_1 ) ) ;
    public final void rule__IndexFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1306:1: ( ( ( rule__IndexFilter__IndexAssignment_1 ) ) )
            // InternalSwag.g:1307:1: ( ( rule__IndexFilter__IndexAssignment_1 ) )
            {
            // InternalSwag.g:1307:1: ( ( rule__IndexFilter__IndexAssignment_1 ) )
            // InternalSwag.g:1308:2: ( rule__IndexFilter__IndexAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndexFilterAccess().getIndexAssignment_1()); 
            }
            // InternalSwag.g:1309:2: ( rule__IndexFilter__IndexAssignment_1 )
            // InternalSwag.g:1309:3: rule__IndexFilter__IndexAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IndexFilter__IndexAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndexFilterAccess().getIndexAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexFilter__Group__1__Impl"


    // $ANTLR start "rule__BoundFilter__Group_0__0"
    // InternalSwag.g:1318:1: rule__BoundFilter__Group_0__0 : rule__BoundFilter__Group_0__0__Impl rule__BoundFilter__Group_0__1 ;
    public final void rule__BoundFilter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1322:1: ( rule__BoundFilter__Group_0__0__Impl rule__BoundFilter__Group_0__1 )
            // InternalSwag.g:1323:2: rule__BoundFilter__Group_0__0__Impl rule__BoundFilter__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__BoundFilter__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BoundFilter__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundFilter__Group_0__0"


    // $ANTLR start "rule__BoundFilter__Group_0__0__Impl"
    // InternalSwag.g:1330:1: rule__BoundFilter__Group_0__0__Impl : ( () ) ;
    public final void rule__BoundFilter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1334:1: ( ( () ) )
            // InternalSwag.g:1335:1: ( () )
            {
            // InternalSwag.g:1335:1: ( () )
            // InternalSwag.g:1336:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundFilterAccess().getBoundFilterAction_0_0()); 
            }
            // InternalSwag.g:1337:2: ()
            // InternalSwag.g:1337:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundFilterAccess().getBoundFilterAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundFilter__Group_0__0__Impl"


    // $ANTLR start "rule__BoundFilter__Group_0__1"
    // InternalSwag.g:1345:1: rule__BoundFilter__Group_0__1 : rule__BoundFilter__Group_0__1__Impl ;
    public final void rule__BoundFilter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1349:1: ( rule__BoundFilter__Group_0__1__Impl )
            // InternalSwag.g:1350:2: rule__BoundFilter__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundFilter__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundFilter__Group_0__1"


    // $ANTLR start "rule__BoundFilter__Group_0__1__Impl"
    // InternalSwag.g:1356:1: rule__BoundFilter__Group_0__1__Impl : ( ( rule__BoundFilter__Group_0_1__0 ) ) ;
    public final void rule__BoundFilter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1360:1: ( ( ( rule__BoundFilter__Group_0_1__0 ) ) )
            // InternalSwag.g:1361:1: ( ( rule__BoundFilter__Group_0_1__0 ) )
            {
            // InternalSwag.g:1361:1: ( ( rule__BoundFilter__Group_0_1__0 ) )
            // InternalSwag.g:1362:2: ( rule__BoundFilter__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundFilterAccess().getGroup_0_1()); 
            }
            // InternalSwag.g:1363:2: ( rule__BoundFilter__Group_0_1__0 )
            // InternalSwag.g:1363:3: rule__BoundFilter__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__BoundFilter__Group_0_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundFilterAccess().getGroup_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundFilter__Group_0__1__Impl"


    // $ANTLR start "rule__BoundFilter__Group_0_1__0"
    // InternalSwag.g:1372:1: rule__BoundFilter__Group_0_1__0 : rule__BoundFilter__Group_0_1__0__Impl rule__BoundFilter__Group_0_1__1 ;
    public final void rule__BoundFilter__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1376:1: ( rule__BoundFilter__Group_0_1__0__Impl rule__BoundFilter__Group_0_1__1 )
            // InternalSwag.g:1377:2: rule__BoundFilter__Group_0_1__0__Impl rule__BoundFilter__Group_0_1__1
            {
            pushFollow(FOLLOW_13);
            rule__BoundFilter__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BoundFilter__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundFilter__Group_0_1__0"


    // $ANTLR start "rule__BoundFilter__Group_0_1__0__Impl"
    // InternalSwag.g:1384:1: rule__BoundFilter__Group_0_1__0__Impl : ( ( rule__BoundFilter__MinAssignment_0_1_0 ) ) ;
    public final void rule__BoundFilter__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1388:1: ( ( ( rule__BoundFilter__MinAssignment_0_1_0 ) ) )
            // InternalSwag.g:1389:1: ( ( rule__BoundFilter__MinAssignment_0_1_0 ) )
            {
            // InternalSwag.g:1389:1: ( ( rule__BoundFilter__MinAssignment_0_1_0 ) )
            // InternalSwag.g:1390:2: ( rule__BoundFilter__MinAssignment_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundFilterAccess().getMinAssignment_0_1_0()); 
            }
            // InternalSwag.g:1391:2: ( rule__BoundFilter__MinAssignment_0_1_0 )
            // InternalSwag.g:1391:3: rule__BoundFilter__MinAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__BoundFilter__MinAssignment_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundFilterAccess().getMinAssignment_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundFilter__Group_0_1__0__Impl"


    // $ANTLR start "rule__BoundFilter__Group_0_1__1"
    // InternalSwag.g:1399:1: rule__BoundFilter__Group_0_1__1 : rule__BoundFilter__Group_0_1__1__Impl rule__BoundFilter__Group_0_1__2 ;
    public final void rule__BoundFilter__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1403:1: ( rule__BoundFilter__Group_0_1__1__Impl rule__BoundFilter__Group_0_1__2 )
            // InternalSwag.g:1404:2: rule__BoundFilter__Group_0_1__1__Impl rule__BoundFilter__Group_0_1__2
            {
            pushFollow(FOLLOW_12);
            rule__BoundFilter__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BoundFilter__Group_0_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundFilter__Group_0_1__1"


    // $ANTLR start "rule__BoundFilter__Group_0_1__1__Impl"
    // InternalSwag.g:1411:1: rule__BoundFilter__Group_0_1__1__Impl : ( '..' ) ;
    public final void rule__BoundFilter__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1415:1: ( ( '..' ) )
            // InternalSwag.g:1416:1: ( '..' )
            {
            // InternalSwag.g:1416:1: ( '..' )
            // InternalSwag.g:1417:2: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundFilterAccess().getFullStopFullStopKeyword_0_1_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundFilterAccess().getFullStopFullStopKeyword_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundFilter__Group_0_1__1__Impl"


    // $ANTLR start "rule__BoundFilter__Group_0_1__2"
    // InternalSwag.g:1426:1: rule__BoundFilter__Group_0_1__2 : rule__BoundFilter__Group_0_1__2__Impl ;
    public final void rule__BoundFilter__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1430:1: ( rule__BoundFilter__Group_0_1__2__Impl )
            // InternalSwag.g:1431:2: rule__BoundFilter__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundFilter__Group_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundFilter__Group_0_1__2"


    // $ANTLR start "rule__BoundFilter__Group_0_1__2__Impl"
    // InternalSwag.g:1437:1: rule__BoundFilter__Group_0_1__2__Impl : ( ( rule__BoundFilter__MaxAssignment_0_1_2 )? ) ;
    public final void rule__BoundFilter__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1441:1: ( ( ( rule__BoundFilter__MaxAssignment_0_1_2 )? ) )
            // InternalSwag.g:1442:1: ( ( rule__BoundFilter__MaxAssignment_0_1_2 )? )
            {
            // InternalSwag.g:1442:1: ( ( rule__BoundFilter__MaxAssignment_0_1_2 )? )
            // InternalSwag.g:1443:2: ( rule__BoundFilter__MaxAssignment_0_1_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundFilterAccess().getMaxAssignment_0_1_2()); 
            }
            // InternalSwag.g:1444:2: ( rule__BoundFilter__MaxAssignment_0_1_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSwag.g:1444:3: rule__BoundFilter__MaxAssignment_0_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoundFilter__MaxAssignment_0_1_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundFilterAccess().getMaxAssignment_0_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundFilter__Group_0_1__2__Impl"


    // $ANTLR start "rule__BoundFilter__Group_1__0"
    // InternalSwag.g:1453:1: rule__BoundFilter__Group_1__0 : rule__BoundFilter__Group_1__0__Impl rule__BoundFilter__Group_1__1 ;
    public final void rule__BoundFilter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1457:1: ( rule__BoundFilter__Group_1__0__Impl rule__BoundFilter__Group_1__1 )
            // InternalSwag.g:1458:2: rule__BoundFilter__Group_1__0__Impl rule__BoundFilter__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__BoundFilter__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BoundFilter__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundFilter__Group_1__0"


    // $ANTLR start "rule__BoundFilter__Group_1__0__Impl"
    // InternalSwag.g:1465:1: rule__BoundFilter__Group_1__0__Impl : ( '..' ) ;
    public final void rule__BoundFilter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1469:1: ( ( '..' ) )
            // InternalSwag.g:1470:1: ( '..' )
            {
            // InternalSwag.g:1470:1: ( '..' )
            // InternalSwag.g:1471:2: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundFilterAccess().getFullStopFullStopKeyword_1_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundFilterAccess().getFullStopFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundFilter__Group_1__0__Impl"


    // $ANTLR start "rule__BoundFilter__Group_1__1"
    // InternalSwag.g:1480:1: rule__BoundFilter__Group_1__1 : rule__BoundFilter__Group_1__1__Impl ;
    public final void rule__BoundFilter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1484:1: ( rule__BoundFilter__Group_1__1__Impl )
            // InternalSwag.g:1485:2: rule__BoundFilter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoundFilter__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundFilter__Group_1__1"


    // $ANTLR start "rule__BoundFilter__Group_1__1__Impl"
    // InternalSwag.g:1491:1: rule__BoundFilter__Group_1__1__Impl : ( ( rule__BoundFilter__MaxAssignment_1_1 ) ) ;
    public final void rule__BoundFilter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1495:1: ( ( ( rule__BoundFilter__MaxAssignment_1_1 ) ) )
            // InternalSwag.g:1496:1: ( ( rule__BoundFilter__MaxAssignment_1_1 ) )
            {
            // InternalSwag.g:1496:1: ( ( rule__BoundFilter__MaxAssignment_1_1 ) )
            // InternalSwag.g:1497:2: ( rule__BoundFilter__MaxAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundFilterAccess().getMaxAssignment_1_1()); 
            }
            // InternalSwag.g:1498:2: ( rule__BoundFilter__MaxAssignment_1_1 )
            // InternalSwag.g:1498:3: rule__BoundFilter__MaxAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BoundFilter__MaxAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundFilterAccess().getMaxAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundFilter__Group_1__1__Impl"


    // $ANTLR start "rule__ListFilter__Group__0"
    // InternalSwag.g:1507:1: rule__ListFilter__Group__0 : rule__ListFilter__Group__0__Impl rule__ListFilter__Group__1 ;
    public final void rule__ListFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1511:1: ( rule__ListFilter__Group__0__Impl rule__ListFilter__Group__1 )
            // InternalSwag.g:1512:2: rule__ListFilter__Group__0__Impl rule__ListFilter__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ListFilter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListFilter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFilter__Group__0"


    // $ANTLR start "rule__ListFilter__Group__0__Impl"
    // InternalSwag.g:1519:1: rule__ListFilter__Group__0__Impl : ( () ) ;
    public final void rule__ListFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1523:1: ( ( () ) )
            // InternalSwag.g:1524:1: ( () )
            {
            // InternalSwag.g:1524:1: ( () )
            // InternalSwag.g:1525:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListFilterAccess().getListFilterAction_0()); 
            }
            // InternalSwag.g:1526:2: ()
            // InternalSwag.g:1526:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListFilterAccess().getListFilterAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFilter__Group__0__Impl"


    // $ANTLR start "rule__ListFilter__Group__1"
    // InternalSwag.g:1534:1: rule__ListFilter__Group__1 : rule__ListFilter__Group__1__Impl rule__ListFilter__Group__2 ;
    public final void rule__ListFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1538:1: ( rule__ListFilter__Group__1__Impl rule__ListFilter__Group__2 )
            // InternalSwag.g:1539:2: rule__ListFilter__Group__1__Impl rule__ListFilter__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ListFilter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListFilter__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFilter__Group__1"


    // $ANTLR start "rule__ListFilter__Group__1__Impl"
    // InternalSwag.g:1546:1: rule__ListFilter__Group__1__Impl : ( ( rule__ListFilter__FilterAssignment_1 ) ) ;
    public final void rule__ListFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1550:1: ( ( ( rule__ListFilter__FilterAssignment_1 ) ) )
            // InternalSwag.g:1551:1: ( ( rule__ListFilter__FilterAssignment_1 ) )
            {
            // InternalSwag.g:1551:1: ( ( rule__ListFilter__FilterAssignment_1 ) )
            // InternalSwag.g:1552:2: ( rule__ListFilter__FilterAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListFilterAccess().getFilterAssignment_1()); 
            }
            // InternalSwag.g:1553:2: ( rule__ListFilter__FilterAssignment_1 )
            // InternalSwag.g:1553:3: rule__ListFilter__FilterAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListFilter__FilterAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListFilterAccess().getFilterAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFilter__Group__1__Impl"


    // $ANTLR start "rule__ListFilter__Group__2"
    // InternalSwag.g:1561:1: rule__ListFilter__Group__2 : rule__ListFilter__Group__2__Impl ;
    public final void rule__ListFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1565:1: ( rule__ListFilter__Group__2__Impl )
            // InternalSwag.g:1566:2: rule__ListFilter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListFilter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFilter__Group__2"


    // $ANTLR start "rule__ListFilter__Group__2__Impl"
    // InternalSwag.g:1572:1: rule__ListFilter__Group__2__Impl : ( ( rule__ListFilter__Group_2__0 )* ) ;
    public final void rule__ListFilter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1576:1: ( ( ( rule__ListFilter__Group_2__0 )* ) )
            // InternalSwag.g:1577:1: ( ( rule__ListFilter__Group_2__0 )* )
            {
            // InternalSwag.g:1577:1: ( ( rule__ListFilter__Group_2__0 )* )
            // InternalSwag.g:1578:2: ( rule__ListFilter__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListFilterAccess().getGroup_2()); 
            }
            // InternalSwag.g:1579:2: ( rule__ListFilter__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSwag.g:1579:3: rule__ListFilter__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ListFilter__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListFilterAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFilter__Group__2__Impl"


    // $ANTLR start "rule__ListFilter__Group_2__0"
    // InternalSwag.g:1588:1: rule__ListFilter__Group_2__0 : rule__ListFilter__Group_2__0__Impl rule__ListFilter__Group_2__1 ;
    public final void rule__ListFilter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1592:1: ( rule__ListFilter__Group_2__0__Impl rule__ListFilter__Group_2__1 )
            // InternalSwag.g:1593:2: rule__ListFilter__Group_2__0__Impl rule__ListFilter__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__ListFilter__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ListFilter__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFilter__Group_2__0"


    // $ANTLR start "rule__ListFilter__Group_2__0__Impl"
    // InternalSwag.g:1600:1: rule__ListFilter__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ListFilter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1604:1: ( ( ',' ) )
            // InternalSwag.g:1605:1: ( ',' )
            {
            // InternalSwag.g:1605:1: ( ',' )
            // InternalSwag.g:1606:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListFilterAccess().getCommaKeyword_2_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListFilterAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFilter__Group_2__0__Impl"


    // $ANTLR start "rule__ListFilter__Group_2__1"
    // InternalSwag.g:1615:1: rule__ListFilter__Group_2__1 : rule__ListFilter__Group_2__1__Impl ;
    public final void rule__ListFilter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1619:1: ( rule__ListFilter__Group_2__1__Impl )
            // InternalSwag.g:1620:2: rule__ListFilter__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListFilter__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFilter__Group_2__1"


    // $ANTLR start "rule__ListFilter__Group_2__1__Impl"
    // InternalSwag.g:1626:1: rule__ListFilter__Group_2__1__Impl : ( ( rule__ListFilter__FilterAssignment_2_1 ) ) ;
    public final void rule__ListFilter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1630:1: ( ( ( rule__ListFilter__FilterAssignment_2_1 ) ) )
            // InternalSwag.g:1631:1: ( ( rule__ListFilter__FilterAssignment_2_1 ) )
            {
            // InternalSwag.g:1631:1: ( ( rule__ListFilter__FilterAssignment_2_1 ) )
            // InternalSwag.g:1632:2: ( rule__ListFilter__FilterAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListFilterAccess().getFilterAssignment_2_1()); 
            }
            // InternalSwag.g:1633:2: ( rule__ListFilter__FilterAssignment_2_1 )
            // InternalSwag.g:1633:3: rule__ListFilter__FilterAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ListFilter__FilterAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListFilterAccess().getFilterAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFilter__Group_2__1__Impl"


    // $ANTLR start "rule__JsonNull__Group__0"
    // InternalSwag.g:1642:1: rule__JsonNull__Group__0 : rule__JsonNull__Group__0__Impl rule__JsonNull__Group__1 ;
    public final void rule__JsonNull__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1646:1: ( rule__JsonNull__Group__0__Impl rule__JsonNull__Group__1 )
            // InternalSwag.g:1647:2: rule__JsonNull__Group__0__Impl rule__JsonNull__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__JsonNull__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JsonNull__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonNull__Group__0"


    // $ANTLR start "rule__JsonNull__Group__0__Impl"
    // InternalSwag.g:1654:1: rule__JsonNull__Group__0__Impl : ( () ) ;
    public final void rule__JsonNull__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1658:1: ( ( () ) )
            // InternalSwag.g:1659:1: ( () )
            {
            // InternalSwag.g:1659:1: ( () )
            // InternalSwag.g:1660:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonNullAccess().getJsonNullAction_0()); 
            }
            // InternalSwag.g:1661:2: ()
            // InternalSwag.g:1661:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonNullAccess().getJsonNullAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonNull__Group__0__Impl"


    // $ANTLR start "rule__JsonNull__Group__1"
    // InternalSwag.g:1669:1: rule__JsonNull__Group__1 : rule__JsonNull__Group__1__Impl ;
    public final void rule__JsonNull__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1673:1: ( rule__JsonNull__Group__1__Impl )
            // InternalSwag.g:1674:2: rule__JsonNull__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonNull__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonNull__Group__1"


    // $ANTLR start "rule__JsonNull__Group__1__Impl"
    // InternalSwag.g:1680:1: rule__JsonNull__Group__1__Impl : ( 'null' ) ;
    public final void rule__JsonNull__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1684:1: ( ( 'null' ) )
            // InternalSwag.g:1685:1: ( 'null' )
            {
            // InternalSwag.g:1685:1: ( 'null' )
            // InternalSwag.g:1686:2: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonNullAccess().getNullKeyword_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonNullAccess().getNullKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonNull__Group__1__Impl"


    // $ANTLR start "rule__JsonNumber__Group__0"
    // InternalSwag.g:1696:1: rule__JsonNumber__Group__0 : rule__JsonNumber__Group__0__Impl rule__JsonNumber__Group__1 ;
    public final void rule__JsonNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1700:1: ( rule__JsonNumber__Group__0__Impl rule__JsonNumber__Group__1 )
            // InternalSwag.g:1701:2: rule__JsonNumber__Group__0__Impl rule__JsonNumber__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__JsonNumber__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JsonNumber__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonNumber__Group__0"


    // $ANTLR start "rule__JsonNumber__Group__0__Impl"
    // InternalSwag.g:1708:1: rule__JsonNumber__Group__0__Impl : ( () ) ;
    public final void rule__JsonNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1712:1: ( ( () ) )
            // InternalSwag.g:1713:1: ( () )
            {
            // InternalSwag.g:1713:1: ( () )
            // InternalSwag.g:1714:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonNumberAccess().getJsonNumberAction_0()); 
            }
            // InternalSwag.g:1715:2: ()
            // InternalSwag.g:1715:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonNumberAccess().getJsonNumberAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonNumber__Group__0__Impl"


    // $ANTLR start "rule__JsonNumber__Group__1"
    // InternalSwag.g:1723:1: rule__JsonNumber__Group__1 : rule__JsonNumber__Group__1__Impl rule__JsonNumber__Group__2 ;
    public final void rule__JsonNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1727:1: ( rule__JsonNumber__Group__1__Impl rule__JsonNumber__Group__2 )
            // InternalSwag.g:1728:2: rule__JsonNumber__Group__1__Impl rule__JsonNumber__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__JsonNumber__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JsonNumber__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonNumber__Group__1"


    // $ANTLR start "rule__JsonNumber__Group__1__Impl"
    // InternalSwag.g:1735:1: rule__JsonNumber__Group__1__Impl : ( ( rule__JsonNumber__NumberAssignment_1 ) ) ;
    public final void rule__JsonNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1739:1: ( ( ( rule__JsonNumber__NumberAssignment_1 ) ) )
            // InternalSwag.g:1740:1: ( ( rule__JsonNumber__NumberAssignment_1 ) )
            {
            // InternalSwag.g:1740:1: ( ( rule__JsonNumber__NumberAssignment_1 ) )
            // InternalSwag.g:1741:2: ( rule__JsonNumber__NumberAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonNumberAccess().getNumberAssignment_1()); 
            }
            // InternalSwag.g:1742:2: ( rule__JsonNumber__NumberAssignment_1 )
            // InternalSwag.g:1742:3: rule__JsonNumber__NumberAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JsonNumber__NumberAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonNumberAccess().getNumberAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonNumber__Group__1__Impl"


    // $ANTLR start "rule__JsonNumber__Group__2"
    // InternalSwag.g:1750:1: rule__JsonNumber__Group__2 : rule__JsonNumber__Group__2__Impl ;
    public final void rule__JsonNumber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1754:1: ( rule__JsonNumber__Group__2__Impl )
            // InternalSwag.g:1755:2: rule__JsonNumber__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonNumber__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonNumber__Group__2"


    // $ANTLR start "rule__JsonNumber__Group__2__Impl"
    // InternalSwag.g:1761:1: rule__JsonNumber__Group__2__Impl : ( ( rule__JsonNumber__Group_2__0 )? ) ;
    public final void rule__JsonNumber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1765:1: ( ( ( rule__JsonNumber__Group_2__0 )? ) )
            // InternalSwag.g:1766:1: ( ( rule__JsonNumber__Group_2__0 )? )
            {
            // InternalSwag.g:1766:1: ( ( rule__JsonNumber__Group_2__0 )? )
            // InternalSwag.g:1767:2: ( rule__JsonNumber__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonNumberAccess().getGroup_2()); 
            }
            // InternalSwag.g:1768:2: ( rule__JsonNumber__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSwag.g:1768:3: rule__JsonNumber__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JsonNumber__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonNumberAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonNumber__Group__2__Impl"


    // $ANTLR start "rule__JsonNumber__Group_2__0"
    // InternalSwag.g:1777:1: rule__JsonNumber__Group_2__0 : rule__JsonNumber__Group_2__0__Impl rule__JsonNumber__Group_2__1 ;
    public final void rule__JsonNumber__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1781:1: ( rule__JsonNumber__Group_2__0__Impl rule__JsonNumber__Group_2__1 )
            // InternalSwag.g:1782:2: rule__JsonNumber__Group_2__0__Impl rule__JsonNumber__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__JsonNumber__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JsonNumber__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonNumber__Group_2__0"


    // $ANTLR start "rule__JsonNumber__Group_2__0__Impl"
    // InternalSwag.g:1789:1: rule__JsonNumber__Group_2__0__Impl : ( '.' ) ;
    public final void rule__JsonNumber__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1793:1: ( ( '.' ) )
            // InternalSwag.g:1794:1: ( '.' )
            {
            // InternalSwag.g:1794:1: ( '.' )
            // InternalSwag.g:1795:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonNumberAccess().getFullStopKeyword_2_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonNumberAccess().getFullStopKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonNumber__Group_2__0__Impl"


    // $ANTLR start "rule__JsonNumber__Group_2__1"
    // InternalSwag.g:1804:1: rule__JsonNumber__Group_2__1 : rule__JsonNumber__Group_2__1__Impl ;
    public final void rule__JsonNumber__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1808:1: ( rule__JsonNumber__Group_2__1__Impl )
            // InternalSwag.g:1809:2: rule__JsonNumber__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonNumber__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonNumber__Group_2__1"


    // $ANTLR start "rule__JsonNumber__Group_2__1__Impl"
    // InternalSwag.g:1815:1: rule__JsonNumber__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__JsonNumber__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1819:1: ( ( RULE_INT ) )
            // InternalSwag.g:1820:1: ( RULE_INT )
            {
            // InternalSwag.g:1820:1: ( RULE_INT )
            // InternalSwag.g:1821:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonNumberAccess().getINTTerminalRuleCall_2_1()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonNumberAccess().getINTTerminalRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonNumber__Group_2__1__Impl"


    // $ANTLR start "rule__JsonBoolean__Group__0"
    // InternalSwag.g:1831:1: rule__JsonBoolean__Group__0 : rule__JsonBoolean__Group__0__Impl rule__JsonBoolean__Group__1 ;
    public final void rule__JsonBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1835:1: ( rule__JsonBoolean__Group__0__Impl rule__JsonBoolean__Group__1 )
            // InternalSwag.g:1836:2: rule__JsonBoolean__Group__0__Impl rule__JsonBoolean__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__JsonBoolean__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JsonBoolean__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonBoolean__Group__0"


    // $ANTLR start "rule__JsonBoolean__Group__0__Impl"
    // InternalSwag.g:1843:1: rule__JsonBoolean__Group__0__Impl : ( () ) ;
    public final void rule__JsonBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1847:1: ( ( () ) )
            // InternalSwag.g:1848:1: ( () )
            {
            // InternalSwag.g:1848:1: ( () )
            // InternalSwag.g:1849:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonBooleanAccess().getJsonBooleanAction_0()); 
            }
            // InternalSwag.g:1850:2: ()
            // InternalSwag.g:1850:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonBooleanAccess().getJsonBooleanAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonBoolean__Group__0__Impl"


    // $ANTLR start "rule__JsonBoolean__Group__1"
    // InternalSwag.g:1858:1: rule__JsonBoolean__Group__1 : rule__JsonBoolean__Group__1__Impl ;
    public final void rule__JsonBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1862:1: ( rule__JsonBoolean__Group__1__Impl )
            // InternalSwag.g:1863:2: rule__JsonBoolean__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonBoolean__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonBoolean__Group__1"


    // $ANTLR start "rule__JsonBoolean__Group__1__Impl"
    // InternalSwag.g:1869:1: rule__JsonBoolean__Group__1__Impl : ( ( rule__JsonBoolean__BoolAssignment_1 ) ) ;
    public final void rule__JsonBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1873:1: ( ( ( rule__JsonBoolean__BoolAssignment_1 ) ) )
            // InternalSwag.g:1874:1: ( ( rule__JsonBoolean__BoolAssignment_1 ) )
            {
            // InternalSwag.g:1874:1: ( ( rule__JsonBoolean__BoolAssignment_1 ) )
            // InternalSwag.g:1875:2: ( rule__JsonBoolean__BoolAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonBooleanAccess().getBoolAssignment_1()); 
            }
            // InternalSwag.g:1876:2: ( rule__JsonBoolean__BoolAssignment_1 )
            // InternalSwag.g:1876:3: rule__JsonBoolean__BoolAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JsonBoolean__BoolAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonBooleanAccess().getBoolAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonBoolean__Group__1__Impl"


    // $ANTLR start "rule__JsonString__Group__0"
    // InternalSwag.g:1885:1: rule__JsonString__Group__0 : rule__JsonString__Group__0__Impl rule__JsonString__Group__1 ;
    public final void rule__JsonString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1889:1: ( rule__JsonString__Group__0__Impl rule__JsonString__Group__1 )
            // InternalSwag.g:1890:2: rule__JsonString__Group__0__Impl rule__JsonString__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__JsonString__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JsonString__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonString__Group__0"


    // $ANTLR start "rule__JsonString__Group__0__Impl"
    // InternalSwag.g:1897:1: rule__JsonString__Group__0__Impl : ( () ) ;
    public final void rule__JsonString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1901:1: ( ( () ) )
            // InternalSwag.g:1902:1: ( () )
            {
            // InternalSwag.g:1902:1: ( () )
            // InternalSwag.g:1903:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonStringAccess().getJsonStringAction_0()); 
            }
            // InternalSwag.g:1904:2: ()
            // InternalSwag.g:1904:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonStringAccess().getJsonStringAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonString__Group__0__Impl"


    // $ANTLR start "rule__JsonString__Group__1"
    // InternalSwag.g:1912:1: rule__JsonString__Group__1 : rule__JsonString__Group__1__Impl ;
    public final void rule__JsonString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1916:1: ( rule__JsonString__Group__1__Impl )
            // InternalSwag.g:1917:2: rule__JsonString__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonString__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonString__Group__1"


    // $ANTLR start "rule__JsonString__Group__1__Impl"
    // InternalSwag.g:1923:1: rule__JsonString__Group__1__Impl : ( ( rule__JsonString__ValueAssignment_1 ) ) ;
    public final void rule__JsonString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1927:1: ( ( ( rule__JsonString__ValueAssignment_1 ) ) )
            // InternalSwag.g:1928:1: ( ( rule__JsonString__ValueAssignment_1 ) )
            {
            // InternalSwag.g:1928:1: ( ( rule__JsonString__ValueAssignment_1 ) )
            // InternalSwag.g:1929:2: ( rule__JsonString__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonStringAccess().getValueAssignment_1()); 
            }
            // InternalSwag.g:1930:2: ( rule__JsonString__ValueAssignment_1 )
            // InternalSwag.g:1930:3: rule__JsonString__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JsonString__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonStringAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonString__Group__1__Impl"


    // $ANTLR start "rule__Path__NodesAssignment_1_0"
    // InternalSwag.g:1939:1: rule__Path__NodesAssignment_1_0 : ( ruleNode ) ;
    public final void rule__Path__NodesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1943:1: ( ( ruleNode ) )
            // InternalSwag.g:1944:2: ( ruleNode )
            {
            // InternalSwag.g:1944:2: ( ruleNode )
            // InternalSwag.g:1945:3: ruleNode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathAccess().getNodesNodeParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathAccess().getNodesNodeParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__NodesAssignment_1_0"


    // $ANTLR start "rule__Path__NodesAssignment_1_1_1"
    // InternalSwag.g:1954:1: rule__Path__NodesAssignment_1_1_1 : ( ruleNode ) ;
    public final void rule__Path__NodesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1958:1: ( ( ruleNode ) )
            // InternalSwag.g:1959:2: ( ruleNode )
            {
            // InternalSwag.g:1959:2: ( ruleNode )
            // InternalSwag.g:1960:3: ruleNode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathAccess().getNodesNodeParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathAccess().getNodesNodeParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__NodesAssignment_1_1_1"


    // $ANTLR start "rule__BasicNode__StrAssignment_1"
    // InternalSwag.g:1969:1: rule__BasicNode__StrAssignment_1 : ( ( rule__BasicNode__StrAlternatives_1_0 ) ) ;
    public final void rule__BasicNode__StrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1973:1: ( ( ( rule__BasicNode__StrAlternatives_1_0 ) ) )
            // InternalSwag.g:1974:2: ( ( rule__BasicNode__StrAlternatives_1_0 ) )
            {
            // InternalSwag.g:1974:2: ( ( rule__BasicNode__StrAlternatives_1_0 ) )
            // InternalSwag.g:1975:3: ( rule__BasicNode__StrAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicNodeAccess().getStrAlternatives_1_0()); 
            }
            // InternalSwag.g:1976:3: ( rule__BasicNode__StrAlternatives_1_0 )
            // InternalSwag.g:1976:4: rule__BasicNode__StrAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__BasicNode__StrAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicNodeAccess().getStrAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicNode__StrAssignment_1"


    // $ANTLR start "rule__ArrayNode__StrAssignment_1"
    // InternalSwag.g:1984:1: rule__ArrayNode__StrAssignment_1 : ( ( rule__ArrayNode__StrAlternatives_1_0 ) ) ;
    public final void rule__ArrayNode__StrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:1988:1: ( ( ( rule__ArrayNode__StrAlternatives_1_0 ) ) )
            // InternalSwag.g:1989:2: ( ( rule__ArrayNode__StrAlternatives_1_0 ) )
            {
            // InternalSwag.g:1989:2: ( ( rule__ArrayNode__StrAlternatives_1_0 ) )
            // InternalSwag.g:1990:3: ( rule__ArrayNode__StrAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayNodeAccess().getStrAlternatives_1_0()); 
            }
            // InternalSwag.g:1991:3: ( rule__ArrayNode__StrAlternatives_1_0 )
            // InternalSwag.g:1991:4: rule__ArrayNode__StrAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayNode__StrAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayNodeAccess().getStrAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayNode__StrAssignment_1"


    // $ANTLR start "rule__ArrayNode__FilterAssignment_3"
    // InternalSwag.g:1999:1: rule__ArrayNode__FilterAssignment_3 : ( ruleListFilter ) ;
    public final void rule__ArrayNode__FilterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:2003:1: ( ( ruleListFilter ) )
            // InternalSwag.g:2004:2: ( ruleListFilter )
            {
            // InternalSwag.g:2004:2: ( ruleListFilter )
            // InternalSwag.g:2005:3: ruleListFilter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayNodeAccess().getFilterListFilterParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayNodeAccess().getFilterListFilterParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayNode__FilterAssignment_3"


    // $ANTLR start "rule__EqualFilter__PathAssignment_1"
    // InternalSwag.g:2014:1: rule__EqualFilter__PathAssignment_1 : ( rulePath ) ;
    public final void rule__EqualFilter__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:2018:1: ( ( rulePath ) )
            // InternalSwag.g:2019:2: ( rulePath )
            {
            // InternalSwag.g:2019:2: ( rulePath )
            // InternalSwag.g:2020:3: rulePath
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualFilterAccess().getPathPathParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualFilterAccess().getPathPathParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualFilter__PathAssignment_1"


    // $ANTLR start "rule__EqualFilter__ValueAssignment_3"
    // InternalSwag.g:2029:1: rule__EqualFilter__ValueAssignment_3 : ( ruleJsonValue ) ;
    public final void rule__EqualFilter__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:2033:1: ( ( ruleJsonValue ) )
            // InternalSwag.g:2034:2: ( ruleJsonValue )
            {
            // InternalSwag.g:2034:2: ( ruleJsonValue )
            // InternalSwag.g:2035:3: ruleJsonValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualFilterAccess().getValueJsonValueParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJsonValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualFilterAccess().getValueJsonValueParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualFilter__ValueAssignment_3"


    // $ANTLR start "rule__ExistFilter__PathAssignment_1"
    // InternalSwag.g:2044:1: rule__ExistFilter__PathAssignment_1 : ( rulePath ) ;
    public final void rule__ExistFilter__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:2048:1: ( ( rulePath ) )
            // InternalSwag.g:2049:2: ( rulePath )
            {
            // InternalSwag.g:2049:2: ( rulePath )
            // InternalSwag.g:2050:3: rulePath
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExistFilterAccess().getPathPathParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExistFilterAccess().getPathPathParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistFilter__PathAssignment_1"


    // $ANTLR start "rule__IndexFilter__IndexAssignment_1"
    // InternalSwag.g:2059:1: rule__IndexFilter__IndexAssignment_1 : ( RULE_INT ) ;
    public final void rule__IndexFilter__IndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:2063:1: ( ( RULE_INT ) )
            // InternalSwag.g:2064:2: ( RULE_INT )
            {
            // InternalSwag.g:2064:2: ( RULE_INT )
            // InternalSwag.g:2065:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndexFilterAccess().getIndexINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndexFilterAccess().getIndexINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IndexFilter__IndexAssignment_1"


    // $ANTLR start "rule__BoundFilter__MinAssignment_0_1_0"
    // InternalSwag.g:2074:1: rule__BoundFilter__MinAssignment_0_1_0 : ( RULE_INT ) ;
    public final void rule__BoundFilter__MinAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:2078:1: ( ( RULE_INT ) )
            // InternalSwag.g:2079:2: ( RULE_INT )
            {
            // InternalSwag.g:2079:2: ( RULE_INT )
            // InternalSwag.g:2080:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundFilterAccess().getMinINTTerminalRuleCall_0_1_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundFilterAccess().getMinINTTerminalRuleCall_0_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundFilter__MinAssignment_0_1_0"


    // $ANTLR start "rule__BoundFilter__MaxAssignment_0_1_2"
    // InternalSwag.g:2089:1: rule__BoundFilter__MaxAssignment_0_1_2 : ( RULE_INT ) ;
    public final void rule__BoundFilter__MaxAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:2093:1: ( ( RULE_INT ) )
            // InternalSwag.g:2094:2: ( RULE_INT )
            {
            // InternalSwag.g:2094:2: ( RULE_INT )
            // InternalSwag.g:2095:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundFilterAccess().getMaxINTTerminalRuleCall_0_1_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundFilterAccess().getMaxINTTerminalRuleCall_0_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundFilter__MaxAssignment_0_1_2"


    // $ANTLR start "rule__BoundFilter__MaxAssignment_1_1"
    // InternalSwag.g:2104:1: rule__BoundFilter__MaxAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__BoundFilter__MaxAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:2108:1: ( ( RULE_INT ) )
            // InternalSwag.g:2109:2: ( RULE_INT )
            {
            // InternalSwag.g:2109:2: ( RULE_INT )
            // InternalSwag.g:2110:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundFilterAccess().getMaxINTTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundFilterAccess().getMaxINTTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundFilter__MaxAssignment_1_1"


    // $ANTLR start "rule__ListFilter__FilterAssignment_1"
    // InternalSwag.g:2119:1: rule__ListFilter__FilterAssignment_1 : ( ruleFilter ) ;
    public final void rule__ListFilter__FilterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:2123:1: ( ( ruleFilter ) )
            // InternalSwag.g:2124:2: ( ruleFilter )
            {
            // InternalSwag.g:2124:2: ( ruleFilter )
            // InternalSwag.g:2125:3: ruleFilter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListFilterAccess().getFilterFilterParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListFilterAccess().getFilterFilterParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFilter__FilterAssignment_1"


    // $ANTLR start "rule__ListFilter__FilterAssignment_2_1"
    // InternalSwag.g:2134:1: rule__ListFilter__FilterAssignment_2_1 : ( ruleFilter ) ;
    public final void rule__ListFilter__FilterAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:2138:1: ( ( ruleFilter ) )
            // InternalSwag.g:2139:2: ( ruleFilter )
            {
            // InternalSwag.g:2139:2: ( ruleFilter )
            // InternalSwag.g:2140:3: ruleFilter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListFilterAccess().getFilterFilterParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListFilterAccess().getFilterFilterParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListFilter__FilterAssignment_2_1"


    // $ANTLR start "rule__JsonNumber__NumberAssignment_1"
    // InternalSwag.g:2149:1: rule__JsonNumber__NumberAssignment_1 : ( RULE_INT ) ;
    public final void rule__JsonNumber__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:2153:1: ( ( RULE_INT ) )
            // InternalSwag.g:2154:2: ( RULE_INT )
            {
            // InternalSwag.g:2154:2: ( RULE_INT )
            // InternalSwag.g:2155:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonNumberAccess().getNumberINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonNumberAccess().getNumberINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonNumber__NumberAssignment_1"


    // $ANTLR start "rule__JsonBoolean__BoolAssignment_1"
    // InternalSwag.g:2164:1: rule__JsonBoolean__BoolAssignment_1 : ( ( rule__JsonBoolean__BoolAlternatives_1_0 ) ) ;
    public final void rule__JsonBoolean__BoolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:2168:1: ( ( ( rule__JsonBoolean__BoolAlternatives_1_0 ) ) )
            // InternalSwag.g:2169:2: ( ( rule__JsonBoolean__BoolAlternatives_1_0 ) )
            {
            // InternalSwag.g:2169:2: ( ( rule__JsonBoolean__BoolAlternatives_1_0 ) )
            // InternalSwag.g:2170:3: ( rule__JsonBoolean__BoolAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonBooleanAccess().getBoolAlternatives_1_0()); 
            }
            // InternalSwag.g:2171:3: ( rule__JsonBoolean__BoolAlternatives_1_0 )
            // InternalSwag.g:2171:4: rule__JsonBoolean__BoolAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__JsonBoolean__BoolAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonBooleanAccess().getBoolAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonBoolean__BoolAssignment_1"


    // $ANTLR start "rule__JsonString__ValueAssignment_1"
    // InternalSwag.g:2179:1: rule__JsonString__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__JsonString__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwag.g:2183:1: ( ( RULE_STRING ) )
            // InternalSwag.g:2184:2: ( RULE_STRING )
            {
            // InternalSwag.g:2184:2: ( RULE_STRING )
            // InternalSwag.g:2185:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonStringAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonStringAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonString__ValueAssignment_1"

    // $ANTLR start synpred7_InternalSwag
    public final void synpred7_InternalSwag_fragment() throws RecognitionException {   
        // InternalSwag.g:579:2: ( ( ( ruleExistFilter ) ) )
        // InternalSwag.g:579:2: ( ( ruleExistFilter ) )
        {
        // InternalSwag.g:579:2: ( ( ruleExistFilter ) )
        // InternalSwag.g:580:3: ( ruleExistFilter )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getPathFilterAccess().getExistFilterParserRuleCall_0()); 
        }
        // InternalSwag.g:581:3: ( ruleExistFilter )
        // InternalSwag.g:581:4: ruleExistFilter
        {
        pushFollow(FOLLOW_2);
        ruleExistFilter();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred7_InternalSwag

    // Delegated rules

    public final boolean synpred7_InternalSwag() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalSwag_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000098070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000090070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000201860L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001800L});

}