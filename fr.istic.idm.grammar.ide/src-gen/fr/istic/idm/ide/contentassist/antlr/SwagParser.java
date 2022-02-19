/*
 * generated by Xtext 2.25.0
 */
package fr.istic.idm.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.istic.idm.ide.contentassist.antlr.internal.InternalSwagParser;
import fr.istic.idm.services.SwagGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class SwagParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SwagGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SwagGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getPathAccess().getAlternatives(), "rule__Path__Alternatives");
			builder.put(grammarAccess.getNodeAccess().getAlternatives(), "rule__Node__Alternatives");
			builder.put(grammarAccess.getBasicNodeAccess().getStrAlternatives_1_0(), "rule__BasicNode__StrAlternatives_1_0");
			builder.put(grammarAccess.getArrayNodeAccess().getStrAlternatives_1_0(), "rule__ArrayNode__StrAlternatives_1_0");
			builder.put(grammarAccess.getFilterAccess().getAlternatives(), "rule__Filter__Alternatives");
			builder.put(grammarAccess.getPathFilterAccess().getAlternatives(), "rule__PathFilter__Alternatives");
			builder.put(grammarAccess.getBoundFilterAccess().getAlternatives(), "rule__BoundFilter__Alternatives");
			builder.put(grammarAccess.getJsonValueAccess().getAlternatives(), "rule__JsonValue__Alternatives");
			builder.put(grammarAccess.getJsonBooleanAccess().getBoolAlternatives_1_0(), "rule__JsonBoolean__BoolAlternatives_1_0");
			builder.put(grammarAccess.getRootPathAccess().getGroup(), "rule__RootPath__Group__0");
			builder.put(grammarAccess.getComplexPathAccess().getGroup(), "rule__ComplexPath__Group__0");
			builder.put(grammarAccess.getComplexPathAccess().getGroup_1(), "rule__ComplexPath__Group_1__0");
			builder.put(grammarAccess.getComplexPathAccess().getGroup_1_1(), "rule__ComplexPath__Group_1_1__0");
			builder.put(grammarAccess.getBasicNodeAccess().getGroup(), "rule__BasicNode__Group__0");
			builder.put(grammarAccess.getArrayNodeAccess().getGroup(), "rule__ArrayNode__Group__0");
			builder.put(grammarAccess.getAllFilterAccess().getGroup(), "rule__AllFilter__Group__0");
			builder.put(grammarAccess.getEqualFilterAccess().getGroup(), "rule__EqualFilter__Group__0");
			builder.put(grammarAccess.getExistFilterAccess().getGroup(), "rule__ExistFilter__Group__0");
			builder.put(grammarAccess.getIndexFilterAccess().getGroup(), "rule__IndexFilter__Group__0");
			builder.put(grammarAccess.getBoundFilterAccess().getGroup_0(), "rule__BoundFilter__Group_0__0");
			builder.put(grammarAccess.getBoundFilterAccess().getGroup_0_1(), "rule__BoundFilter__Group_0_1__0");
			builder.put(grammarAccess.getBoundFilterAccess().getGroup_1(), "rule__BoundFilter__Group_1__0");
			builder.put(grammarAccess.getListFilterAccess().getGroup(), "rule__ListFilter__Group__0");
			builder.put(grammarAccess.getListFilterAccess().getGroup_2(), "rule__ListFilter__Group_2__0");
			builder.put(grammarAccess.getJsonNullAccess().getGroup(), "rule__JsonNull__Group__0");
			builder.put(grammarAccess.getJsonNumberAccess().getGroup(), "rule__JsonNumber__Group__0");
			builder.put(grammarAccess.getJsonNumberAccess().getGroup_2(), "rule__JsonNumber__Group_2__0");
			builder.put(grammarAccess.getJsonBooleanAccess().getGroup(), "rule__JsonBoolean__Group__0");
			builder.put(grammarAccess.getJsonStringAccess().getGroup(), "rule__JsonString__Group__0");
			builder.put(grammarAccess.getWrappedIntAccess().getGroup(), "rule__WrappedInt__Group__0");
			builder.put(grammarAccess.getComplexPathAccess().getNodesAssignment_1_0(), "rule__ComplexPath__NodesAssignment_1_0");
			builder.put(grammarAccess.getComplexPathAccess().getNodesAssignment_1_1_1(), "rule__ComplexPath__NodesAssignment_1_1_1");
			builder.put(grammarAccess.getBasicNodeAccess().getStrAssignment_1(), "rule__BasicNode__StrAssignment_1");
			builder.put(grammarAccess.getArrayNodeAccess().getStrAssignment_1(), "rule__ArrayNode__StrAssignment_1");
			builder.put(grammarAccess.getArrayNodeAccess().getFilterAssignment_3(), "rule__ArrayNode__FilterAssignment_3");
			builder.put(grammarAccess.getEqualFilterAccess().getPathAssignment_1(), "rule__EqualFilter__PathAssignment_1");
			builder.put(grammarAccess.getEqualFilterAccess().getValueAssignment_3(), "rule__EqualFilter__ValueAssignment_3");
			builder.put(grammarAccess.getExistFilterAccess().getPathAssignment_1(), "rule__ExistFilter__PathAssignment_1");
			builder.put(grammarAccess.getIndexFilterAccess().getIndexAssignment_1(), "rule__IndexFilter__IndexAssignment_1");
			builder.put(grammarAccess.getBoundFilterAccess().getMinAssignment_0_1_0(), "rule__BoundFilter__MinAssignment_0_1_0");
			builder.put(grammarAccess.getBoundFilterAccess().getMaxAssignment_0_1_2(), "rule__BoundFilter__MaxAssignment_0_1_2");
			builder.put(grammarAccess.getBoundFilterAccess().getMaxAssignment_1_1(), "rule__BoundFilter__MaxAssignment_1_1");
			builder.put(grammarAccess.getListFilterAccess().getFilterAssignment_1(), "rule__ListFilter__FilterAssignment_1");
			builder.put(grammarAccess.getListFilterAccess().getFilterAssignment_2_1(), "rule__ListFilter__FilterAssignment_2_1");
			builder.put(grammarAccess.getJsonNumberAccess().getNumberAssignment_1(), "rule__JsonNumber__NumberAssignment_1");
			builder.put(grammarAccess.getJsonBooleanAccess().getBoolAssignment_1(), "rule__JsonBoolean__BoolAssignment_1");
			builder.put(grammarAccess.getJsonStringAccess().getValueAssignment_1(), "rule__JsonString__ValueAssignment_1");
			builder.put(grammarAccess.getWrappedIntAccess().getNumberAssignment_1(), "rule__WrappedInt__NumberAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SwagGrammarAccess grammarAccess;

	@Override
	protected InternalSwagParser createParser() {
		InternalSwagParser result = new InternalSwagParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SwagGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SwagGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
