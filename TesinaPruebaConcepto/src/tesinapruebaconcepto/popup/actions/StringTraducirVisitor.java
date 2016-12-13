package tesinapruebaconcepto.popup.actions;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.ocl.expressions.AssociationClassCallExp;
import org.eclipse.ocl.expressions.BooleanLiteralExp;
import org.eclipse.ocl.expressions.CollectionItem;
import org.eclipse.ocl.expressions.CollectionLiteralExp;
import org.eclipse.ocl.expressions.CollectionRange;
import org.eclipse.ocl.expressions.EnumLiteralExp;
import org.eclipse.ocl.expressions.IfExp;
import org.eclipse.ocl.expressions.IntegerLiteralExp;
import org.eclipse.ocl.expressions.InvalidLiteralExp;
import org.eclipse.ocl.expressions.IterateExp;
import org.eclipse.ocl.expressions.IteratorExp;
import org.eclipse.ocl.expressions.LetExp;
import org.eclipse.ocl.expressions.MessageExp;
import org.eclipse.ocl.expressions.NullLiteralExp;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.PropertyCallExp;
import org.eclipse.ocl.expressions.RealLiteralExp;
import org.eclipse.ocl.expressions.StateExp;
import org.eclipse.ocl.expressions.StringLiteralExp;
import org.eclipse.ocl.expressions.TupleLiteralExp;
import org.eclipse.ocl.expressions.TupleLiteralPart;
import org.eclipse.ocl.expressions.TypeExp;
import org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.expressions.UnspecifiedValueExp;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.expressions.VariableExp;
import org.eclipse.ocl.types.PrimitiveType;
import org.eclipse.ocl.utilities.ExpressionInOCL;
import org.eclipse.ocl.utilities.PredefinedType;
import org.eclipse.ocl.utilities.TypedElement;
import org.eclipse.ocl.utilities.Visitable;
import org.eclipse.ocl.utilities.Visitor;


public class StringTraducirVisitor<C, O, P, EL, PM, S, COA, SSA, CT> implements Visitor<String, C, O, P, EL, PM, S, COA, SSA, CT> {

	private final class ListVisitor implements Consumer<Visitable> {
		@Override
		public void accept(Visitable t) {
			t.accept(StringTraducirVisitor.this);
		}
	}

/*** UTILS ***/	
	private String listToString(EList list) {
		String arguments = "";
		for (Object a : list) {
			String result = ((Visitable)a).accept(this);
			if (result != null) {
			   arguments += result + ", ";
			}
		}
		return arguments;
	}

	private String getName(String type){
		if (type.contains("EReference") || type.contains("EAttribute")){
			return type.substring(type.indexOf("(name: ", 0)+7, type.indexOf(") (ordered: ", type.indexOf("(name: ", 0)));
		}
		else {
			return type.substring(type.indexOf("(name: ", 0)+7, type.indexOf(") (instanceClassName: ", type.indexOf("(name: ", 0)));
		}
	}
	
	private boolean isInfix(OperationCallExp<C, O> oc) {
		switch (oc.getOperationCode()) {

		case PredefinedType.AND:
		case PredefinedType.OR:
		case PredefinedType.XOR:
		case PredefinedType.IMPLIES:

		case PredefinedType.GREATER_THAN:
		case PredefinedType.GREATER_THAN_EQUAL:
		case PredefinedType.LESS_THAN:
		case PredefinedType.LESS_THAN_EQUAL:

		case PredefinedType.EQUAL:
		case PredefinedType.NOT_EQUAL:

		case PredefinedType.DIVIDE:
		case PredefinedType.MINUS:
		case PredefinedType.PLUS:
		case PredefinedType.TIMES:

			return true;
		}

		return false;
	}

	private boolean isPrefix(OperationCallExp<C, O> oc) {
		if (isInfix(oc)) {
			return false;
		}
		return true;
	}
	/*	private void addTypeInfo(TypedElement<C> exp) {
		C ec = exp.getType();
		
		Sysout("type", tName); //$NON-NLS-1$
	}

	private void addSourceInfo(Element res, Element sourceResult) {
		if (sourceResult == null) {
			sourceResult = new Element("NULL");
		}
		Element sourceE = new Element("source");
		sourceE.addContent(sourceResult);
		res.addContent(sourceE);
		
		
	private String howManyArgs(O o) {
		int n = uml.getParameters(o).size();
		switch (n) {
		case 0:
			return "zero args"; //$NON-NLS-1$
		case 1:
			return "one arg"; //$NON-NLS-1$
		case 2:
			return "two args"; //$NON-NLS-1$
		default:
			return n + " args"; //$NON-NLS-1$
		}
	}
	}
*/
/*** VISIT METHODS ***/	
	@Override
	public String visitVariableExp(VariableExp<C, PM> variableExp) {
		System.out.println("Variable Exp");
		Variable<C, PM> vd = variableExp.getReferredVariable();
		System.out.println("    Name => "+ vd.getName());
//		String type = variableExp.getType().toString();
//		System.out.println("    Type => "+ this.getType(type));

		return null;
	}

	@Override
	public String visitLetExp(LetExp<C, PM> letExp) {
		throw new UnsupportedOperationException();
	/*Element variableResult, Element inResult) {
	Element res = new Element("LetExp"); //$NON-NLS-1$
	addTypeInfo(res, letExp);
	res.addContent(variableResult);
	Element eIn = new Element("in"); //$NON-NLS-1$
	if (inResult == null)
		inResult = new Element(XML_NULL_PLACEHOLDER);
	eIn.addContent(inResult);
	res.addContent(eIn);
	return res;*/
	}

	@Override
	public String visitIfExp(IfExp ifExp) {
		throw new UnsupportedOperationException();
		/*		Element conditionResult, Element thenResult, Element elseResult) {
		Element res = new Element("IfExp"); //$NON-NLS-1$
		Element eConditionPart = new Element("condition"); //$NON-NLS-1$
		eConditionPart.addContent(conditionResult);
		res.addContent(eConditionPart);

		Element eThenPart = new Element("then"); //$NON-NLS-1$
		eThenPart.addContent(thenResult);
		res.addContent(eThenPart);

		Element eElsePart = new Element("else"); //$NON-NLS-1$
		eElsePart.addContent(elseResult);
		res.addContent(eElsePart);
		return res;
		*/
	}

	@Override
	public String visitTypeExp(TypeExp typeExp) {
		System.out.println("    	Type Exp");
		String referredType = typeExp.getReferredType().toString();
		System.out.println("        	Type = > "+ this.getName(referredType));
		return null;
	}

	@Override
	public String visitPropertyCallExp(PropertyCallExp<C,P> callExp) {
		System.out.println("Property Call Exp");
		String name = this.getName(callExp.getReferredProperty().toString());
		if (callExp.isMarkedPre()) {
			name = name + "@pre"; 
		}
        System.out.println("    Name => "+callExp.getSource().getName()+'.'+name);
//		System.out.println("    Type => "+callExp.getType());
		//callExp.getSource().accept(this);   //Source repite lo que ya imprimi
      //  System.out.println(callExp.getSource().getName());
		return null;
	}

	@Override
	public String visitOperationCallExp(OperationCallExp<C, O> callExp) {
		System.out.println("Operation Call Exp");
				
		EOperation operation = (EOperation) callExp.getReferredOperation();
		String opName = operation.getName();
		
		if (callExp.isMarkedPre())
			opName = opName + "@pre"; 

		if (isInfix(callExp)) {
			System.out.println(" Infix or Binary operation");
			System.out.println("	Operation => " + operation.getName());
			System.out.println("	Source => ");
			callExp.getSource().accept(this);	
			System.out.println("Arguments =>" + listToString(callExp.getArgument())); 
		} else {
			System.out.println(" Prefix or Unary operation");
			System.out.println("	Operation => " + operation.getName());
			System.out.println("	Source => ");
			callExp.getSource().accept(this);	
		}
			   

		
		return null;
	}


	@Override
	public String visitAssociationClassCallExp(AssociationClassCallExp callExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visitIteratorExp(IteratorExp callExp) {
		System.out.println("Iterator Exp");
        System.out.println("	Name => "+ callExp.getName());
        String type = callExp.getBody().getType().toString();
        System.out.println("	Type => "+ this.getName(type));
        //source repite lo que ya se imprimio
 //       System.out.println("Iterators => ");
//Lo hace como parte del body??        System.out.println(listToString(callExp.getIterator()));
        callExp.getBody().accept(this);
		return null;
	}

	@Override
	public String visitIterateExp(IterateExp callExp) {
		System.out.println("Iterate Exp");
		return null;
	}

	@Override
	public String visitUnspecifiedValueExp(UnspecifiedValueExp unspecExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visitIntegerLiteralExp(IntegerLiteralExp literalExp) {
		return literalExp.getLongSymbol().toString();
	}

	@Override
	public String visitUnlimitedNaturalLiteralExp(UnlimitedNaturalLiteralExp literalExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visitRealLiteralExp(RealLiteralExp literalExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visitStringLiteralExp(StringLiteralExp literalExp) {
		return "'" +literalExp.getStringSymbol() + "'";
	}

	@Override
	public String visitBooleanLiteralExp(BooleanLiteralExp literalExp) {
		System.out.println("Boolean Literal Exp");
		System.out.println(literalExp.getBooleanSymbol());
		return null;
	}

	@Override
	public String visitEnumLiteralExp(EnumLiteralExp literalExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visitCollectionLiteralExp(CollectionLiteralExp literalExp) {		
		return listToString(literalExp.getPart());
	}

	@Override
	public String visitCollectionItem(CollectionItem item) {
		return item.getItem().accept(this);
	}

	@Override
	public String visitCollectionRange(CollectionRange range) {
		System.out.println("Collection Range");
		return null;
	}

	@Override
	public String visitTupleLiteralExp(TupleLiteralExp literalExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visitTupleLiteralPart(TupleLiteralPart part) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visitInvalidLiteralExp(InvalidLiteralExp literalExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visitNullLiteralExp(NullLiteralExp literalExp) {
		//throw new UnsupportedOperationException();
		System.out.println("NullLeteralExp");
		System.out.println(" Name => "+literalExp.getName());
		return null;
	}

	@Override
	public String visitStateExp(StateExp stateExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visitMessageExp(MessageExp messageExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visitVariable(Variable variable) {
		System.out.println("Variable");
		System.out.println("    Name => "+ variable.getName());
//		String type = variable.getType().toString();
//		System.out.println("    Type => " + this.getType(type));
//		if (variable.getInitExpression() != null) {
//			variable.getInitExpression().accept(this);
//		}else{ System.out.println("no init expression");}
//		
//		if (variable.getRepresentedParameter() != null)
//		 {
//			variable.getRepresentedParameter().toString();
//		 }else{System.out.println("no parameters");}
//	
		return null;
	}

	@Override
	public String visitExpressionInOCL(ExpressionInOCL expression) {
	    System.out.println("ExpressionInOCL");
	    System.out.println("  Contexto => " + this.getName(expression.getContextVariable().getType().toString()));
	    expression.getBodyExpression().accept(this);
		expression.getParameterVariable().forEach(new ListVisitor());
//		expression.getGeneratedType().forEach(new ListVisitor());
//		if (expression.getResultVariable() != null) {
//			expression.getResultVariable().accept(this);
//		}
//		return "En un " + variable + " se debe "+ body;
		 return null;
	}

	@Override
	public String visitConstraint(Object constraint) {
		System.out.println("Constraint");
		return null;
	}

}
