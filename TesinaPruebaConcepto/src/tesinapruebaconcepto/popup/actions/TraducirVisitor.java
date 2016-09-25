package tesinapruebaconcepto.popup.actions;

import java.util.function.Consumer;

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

public class TraducirVisitor implements Visitor {

	private final class ListVisitor implements Consumer<Visitable> {
		@Override
		public void accept(Visitable t) {
			t.accept(TraducirVisitor.this);
		}
	}

	@Override
	public Object visitVariableExp(VariableExp variableExp) {
		// TODO Auto-generated method stub
		System.out.println("Variable Exp");
		return null;
	}

	@Override
	public Object visitLetExp(LetExp letExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object visitIfExp(IfExp ifExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object visitTypeExp(TypeExp typeExp) {
		System.out.println("Type Exp");
		return null;
	}

	@Override
	public Object visitPropertyCallExp(PropertyCallExp callExp) {
		System.out.println("Property Call Exp");
		return null;
	}

	@Override
	public Object visitOperationCallExp(OperationCallExp callExp) {
		System.out.println("Operation Call Exp");
		callExp.getSource().accept(this);		
		System.out.println("Operacion " +callExp.getReferredOperation());
		System.out.println("Argumentos");

		callExp.getArgument().forEach(new ListVisitor());		
		return null;
	}

	@Override
	public Object visitAssociationClassCallExp(AssociationClassCallExp callExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object visitIteratorExp(IteratorExp callExp) {
		System.out.println("Iterator Exp");
		return null;
	}

	@Override
	public Object visitIterateExp(IterateExp callExp) {
		System.out.println("Iterate Exp");
		return null;
	}

	@Override
	public Object visitUnspecifiedValueExp(UnspecifiedValueExp unspecExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object visitIntegerLiteralExp(IntegerLiteralExp literalExp) {
		System.out.println("Integer Literal Exp: "+ literalExp.getLongSymbol());
		return null;
	}

	@Override
	public Object visitUnlimitedNaturalLiteralExp(UnlimitedNaturalLiteralExp literalExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object visitRealLiteralExp(RealLiteralExp literalExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object visitStringLiteralExp(StringLiteralExp literalExp) {
		System.out.println("String Literal Exp: " + literalExp.getStringSymbol());
		
		return null;
	}

	@Override
	public Object visitBooleanLiteralExp(BooleanLiteralExp literalExp) {
		System.out.println("Boolean Literal Exp");
		return null;
	}

	@Override
	public Object visitEnumLiteralExp(EnumLiteralExp literalExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object visitCollectionLiteralExp(CollectionLiteralExp literalExp) {
		System.out.println("Collection Literal Exp: "+literalExp.getKind());
		
		literalExp.getPart().forEach(new ListVisitor());
		return null;
	}

	@Override
	public Object visitCollectionItem(CollectionItem item) {
		System.out.println("Collection Item");
		item.getItem().accept(this);
		return null;
	}

	@Override
	public Object visitCollectionRange(CollectionRange range) {
		System.out.println("Collection Range");
		return null;
	}

	@Override
	public Object visitTupleLiteralExp(TupleLiteralExp literalExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object visitTupleLiteralPart(TupleLiteralPart part) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object visitInvalidLiteralExp(InvalidLiteralExp literalExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object visitNullLiteralExp(NullLiteralExp literalExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object visitStateExp(StateExp stateExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object visitMessageExp(MessageExp messageExp) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object visitVariable(Variable variable) {
		System.out.println("Variable" + variable);
		return null;
	}

	@Override
	public Object visitExpressionInOCL(ExpressionInOCL expression) {
		System.out.println("Expression In OCL: Variable");
		expression.getContextVariable().accept(this);

		expression.getParameterVariable().forEach(new ListVisitor());
		expression.getGeneratedType().forEach(new ListVisitor());
		if (expression.getResultVariable() != null) {
			expression.getResultVariable().accept(this);
		}

		System.out.println("Expression In OCL: Body");
		expression.getBodyExpression().accept(this);
		return null;
	}

	@Override
	public Object visitConstraint(Object constraint) {
		System.out.println("Constraint");
		return null;
	}

}
