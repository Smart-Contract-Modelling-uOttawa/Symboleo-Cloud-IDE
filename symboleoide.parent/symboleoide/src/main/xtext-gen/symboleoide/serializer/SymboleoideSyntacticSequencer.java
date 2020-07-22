/*
 * generated by Xtext 2.22.0
 */
package symboleoide.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import symboleoide.services.SymboleoideGrammarAccess;

@SuppressWarnings("all")
public class SymboleoideSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SymboleoideGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Atom_FALSEKeyword_8_1_or_TRUEKeyword_7_1;
	protected AbstractElementAlias match_CType_BasicTypeParserRuleCall_2_1_or_OntoCTypeParserRuleCall_1_1;
	protected AbstractElementAlias match_Contract_ConstraintsKeyword_13_0_q;
	protected AbstractElementAlias match_Contract_DeclarationsKeyword_6_0_q;
	protected AbstractElementAlias match_Contract_PostconditionsKeyword_8_0_q;
	protected AbstractElementAlias match_Contract_PowersKeyword_12_0_q;
	protected AbstractElementAlias match_Contract_PreconditionsKeyword_7_0_q;
	protected AbstractElementAlias match_Contract_SurvivingOblsKeyword_11_0_q;
	protected AbstractElementAlias match_DConcept_WithKeyword_0_2_q;
	protected AbstractElementAlias match_Neg_NOTKeyword_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SymboleoideGrammarAccess) access;
		match_Atom_FALSEKeyword_8_1_or_TRUEKeyword_7_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAtomAccess().getFALSEKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getAtomAccess().getTRUEKeyword_7_1()));
		match_CType_BasicTypeParserRuleCall_2_1_or_OntoCTypeParserRuleCall_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCTypeAccess().getBasicTypeParserRuleCall_2_1()), new TokenAlias(false, false, grammarAccess.getCTypeAccess().getOntoCTypeParserRuleCall_1_1()));
		match_Contract_ConstraintsKeyword_13_0_q = new TokenAlias(false, true, grammarAccess.getContractAccess().getConstraintsKeyword_13_0());
		match_Contract_DeclarationsKeyword_6_0_q = new TokenAlias(false, true, grammarAccess.getContractAccess().getDeclarationsKeyword_6_0());
		match_Contract_PostconditionsKeyword_8_0_q = new TokenAlias(false, true, grammarAccess.getContractAccess().getPostconditionsKeyword_8_0());
		match_Contract_PowersKeyword_12_0_q = new TokenAlias(false, true, grammarAccess.getContractAccess().getPowersKeyword_12_0());
		match_Contract_PreconditionsKeyword_7_0_q = new TokenAlias(false, true, grammarAccess.getContractAccess().getPreconditionsKeyword_7_0());
		match_Contract_SurvivingOblsKeyword_11_0_q = new TokenAlias(false, true, grammarAccess.getContractAccess().getSurvivingOblsKeyword_11_0());
		match_DConcept_WithKeyword_0_2_q = new TokenAlias(false, true, grammarAccess.getDConceptAccess().getWithKeyword_0_2());
		match_Neg_NOTKeyword_0_q = new TokenAlias(false, true, grammarAccess.getNegAccess().getNOTKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBasicTypeRule())
			return getBasicTypeToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOntoCTypeRule())
			return getOntoCTypeToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * BasicType:
	 * 	'NUMBER' | 'STRING' | 'DATE'
	 * ;
	 */
	protected String getBasicTypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "NUMBER";
	}
	
	/**
	 * OntoCType:
	 * 	('ASSET' | 'EVENT' | 'ROLE' | 'SITUATION' | 'CONTRACT')
	 * ;
	 */
	protected String getOntoCTypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "ASSET";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Atom_FALSEKeyword_8_1_or_TRUEKeyword_7_1.equals(syntax))
				emit_Atom_FALSEKeyword_8_1_or_TRUEKeyword_7_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CType_BasicTypeParserRuleCall_2_1_or_OntoCTypeParserRuleCall_1_1.equals(syntax))
				emit_CType_BasicTypeParserRuleCall_2_1_or_OntoCTypeParserRuleCall_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Contract_ConstraintsKeyword_13_0_q.equals(syntax))
				emit_Contract_ConstraintsKeyword_13_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Contract_DeclarationsKeyword_6_0_q.equals(syntax))
				emit_Contract_DeclarationsKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Contract_PostconditionsKeyword_8_0_q.equals(syntax))
				emit_Contract_PostconditionsKeyword_8_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Contract_PowersKeyword_12_0_q.equals(syntax))
				emit_Contract_PowersKeyword_12_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Contract_PreconditionsKeyword_7_0_q.equals(syntax))
				emit_Contract_PreconditionsKeyword_7_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Contract_SurvivingOblsKeyword_11_0_q.equals(syntax))
				emit_Contract_SurvivingOblsKeyword_11_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DConcept_WithKeyword_0_2_q.equals(syntax))
				emit_DConcept_WithKeyword_0_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Neg_NOTKeyword_0_q.equals(syntax))
				emit_Neg_NOTKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'TRUE' | 'FALSE'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Atom_FALSEKeyword_8_1_or_TRUEKeyword_7_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     OntoCType | BasicType
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_CType_BasicTypeParserRuleCall_2_1_or_OntoCTypeParserRuleCall_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Constraints'?
	 *
	 * This ambiguous syntax occurs at:
	 *     obligations+=Obl ';' 'Powers'? (ambiguity) 'endContract' (rule end)
	 *     obligations+=Obl ';' 'SurvivingObls'? 'Powers'? (ambiguity) 'endContract' (rule end)
	 *     powers+=Pow ';' (ambiguity) 'endContract' (rule end)
	 */
	protected void emit_Contract_ConstraintsKeyword_13_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Declarations'?
	 *
	 * This ambiguous syntax occurs at:
	 *     parameters+=Param ')' (ambiguity) 'Preconditions' propositions+=Prop
	 *     parameters+=Param ')' (ambiguity) 'Preconditions'? 'Postconditions' propositions+=Prop
	 *     parameters+=Param ')' (ambiguity) 'Preconditions'? 'Postconditions'? 'Obligations' obligations+=Obl
	 */
	protected void emit_Contract_DeclarationsKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Postconditions'?
	 *
	 * This ambiguous syntax occurs at:
	 *     declarations+=Declar ';' 'Preconditions'? (ambiguity) 'Obligations' obligations+=Obl
	 *     parameters+=Param ')' 'Declarations'? 'Preconditions'? (ambiguity) 'Obligations' obligations+=Obl
	 *     propositions+=Prop ';' (ambiguity) 'Obligations' obligations+=Obl
	 */
	protected void emit_Contract_PostconditionsKeyword_8_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Powers'?
	 *
	 * This ambiguous syntax occurs at:
	 *     obligations+=Obl ';' 'SurvivingObls'? (ambiguity) 'Constraints' propositions+=Prop
	 *     obligations+=Obl ';' 'SurvivingObls'? (ambiguity) 'Constraints'? 'endContract' (rule end)
	 *     obligations+=Obl ';' (ambiguity) 'Constraints' propositions+=Prop
	 *     obligations+=Obl ';' (ambiguity) 'Constraints'? 'endContract' (rule end)
	 */
	protected void emit_Contract_PowersKeyword_12_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Preconditions'?
	 *
	 * This ambiguous syntax occurs at:
	 *     declarations+=Declar ';' (ambiguity) 'Postconditions' propositions+=Prop
	 *     declarations+=Declar ';' (ambiguity) 'Postconditions'? 'Obligations' obligations+=Obl
	 *     parameters+=Param ')' 'Declarations'? (ambiguity) 'Postconditions' propositions+=Prop
	 *     parameters+=Param ')' 'Declarations'? (ambiguity) 'Postconditions'? 'Obligations' obligations+=Obl
	 */
	protected void emit_Contract_PreconditionsKeyword_7_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'SurvivingObls'?
	 *
	 * This ambiguous syntax occurs at:
	 *     obligations+=Obl ';' (ambiguity) 'Powers' powers+=Pow
	 *     obligations+=Obl ';' (ambiguity) 'Powers'? 'Constraints' propositions+=Prop
	 *     obligations+=Obl ';' (ambiguity) 'Powers'? 'Constraints'? 'endContract' (rule end)
	 */
	protected void emit_Contract_SurvivingOblsKeyword_11_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'with'?
	 *
	 * This ambiguous syntax occurs at:
	 *     conceptTypes+=CType (ambiguity) (rule end)
	 *     conceptTypes+=CType (ambiguity) attributes+=Att
	 */
	protected void emit_DConcept_WithKeyword_0_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'NOT'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) atomicExpressions+=Atom
	 */
	protected void emit_Neg_NOTKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}