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
import org.eclipse.ocl.utilities.ExpressionInOCL;
import org.eclipse.ocl.utilities.Visitable;
import org.eclipse.ocl.utilities.Visitor;

public class StringTraducirVisitor<C, O, P, EL, PM, S, COA, SSA, CT> implements Visitor<String, C, O, P, EL, PM, S, COA, SSA, CT> {

	private final class ListVisitor implements Consumer<Visitable> {
		@Override
		public void accept(Visitable t) {
			t.accept(StringTraducirVisitor.this);
		}
	}

	@Override
	public String visitVariableExp(VariableExp variableExp) {
		// TODO Auto-generated method stub
		System.out.println("Variable Exp");
		return null;
	}

	@Override
	public String visitLetExp(LetExp letExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visitIfExp(IfExp ifExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visitTypeExp(TypeExp typeExp) {
		System.out.println("Type Exp");
		return null;
	}

	@Override
	public String visitPropertyCallExp(PropertyCallExp callExp) {
		System.out.println("Property Call Exp");
		return null;
	}

	@Override
	public String visitOperationCallExp(OperationCallExp callExp) {
		String source = callExp.getSource().accept(this);		
		EOperation operation = (EOperation) callExp.getReferredOperation();

		EList list = callExp.getArgument();
		String arguments = listToString(list);
		return source + operation.getName() + arguments;
	}

	private String listToString(EList list) {
		String arguments = "";
		for (Object a : list) {
			String result = ((Visitable)a).accept(this);
			arguments += result + ", ";
		}
		return arguments;
	}

	@Override
	public String visitAssociationClassCallExp(AssociationClassCallExp callExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visitIteratorExp(IteratorExp callExp) {
		System.out.println("Iterator Exp");
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
		throw new UnsupportedOperationException();
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
		return variable.toString();
	}

	@Override
	public String visitExpressionInOCL(ExpressionInOCL expression) {
		String variable = expression.getContextVariable().accept(this);

		expression.getParameterVariable().forEach(new ListVisitor());
		expression.getGeneratedType().forEach(new ListVisitor());
		if (expression.getResultVariable() != null) {
			expression.getResultVariable().accept(this);
		}

		String body = expression.getBodyExpression().accept(this);
		return "En un " + variable + " se debe "+ body;
	}

	@Override
	public String visitConstraint(Object constraint) {
		System.out.println("Constraint");
		return null;
	}

}
