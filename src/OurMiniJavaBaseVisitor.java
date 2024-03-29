import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

public class OurMiniJavaBaseVisitor extends MiniJavaBaseVisitor<Integer> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitGoal(MiniJavaParser.GoalContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitMainClass(MiniJavaParser.MainClassContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {

		return visitChildren(ctx); }
	// ...
	@Override public Integer visitBraceStatement(MiniJavaParser.BraceStatementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitIfStatement(MiniJavaParser.IfStatementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitWhileStatement(MiniJavaParser.WhileStatementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitPrintStatement(MiniJavaParser.PrintStatementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitAssignStatement(MiniJavaParser.AssignStatementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitAssignArrayStatement(MiniJavaParser.AssignArrayStatementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitLengthInt(MiniJavaParser.LengthIntContext ctx) {
		visitChildren(ctx);
		return OurConstants.intType;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitMethodInt(MiniJavaParser.MethodIntContext ctx) {
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//Overrided in visit02
	@Override public Integer visitIdentifierInt(MiniJavaParser.IdentifierIntContext ctx) {
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	//override in visit02
	@Override public Integer visitThisInt(MiniJavaParser.ThisIntContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitMulInt(MiniJavaParser.MulIntContext ctx) {
		visitChildren(ctx);
		return OurConstants.intType;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitArrayInt(MiniJavaParser.ArrayIntContext ctx) {
		visitChildren(ctx);
		return OurConstants.intType;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitAddInt(MiniJavaParser.AddIntContext ctx) {
		visitChildren(ctx);
		return OurConstants.intType;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitLiteralInt(MiniJavaParser.LiteralIntContext ctx) {
		visitChildren(ctx);
		return OurConstants.intType;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitNewIdentifierInt(MiniJavaParser.NewIdentifierIntContext ctx)
	{
		//Overriden in visit02
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitNewArrayInt(MiniJavaParser.NewArrayIntContext ctx) {
		visitChildren(ctx);
		return OurConstants.arrayType;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitParenInt(MiniJavaParser.ParenIntContext ctx)
	{
		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitOrbiBoolean(MiniJavaParser.OrbiBooleanContext ctx) {
		visitChildren(ctx);
		return OurConstants.booleanType;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitNotBoolean(MiniJavaParser.NotBooleanContext ctx) {
		visitChildren(ctx);
		return OurConstants.booleanType;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitAndibBoolean(MiniJavaParser.AndibBooleanContext ctx) {
		visitChildren(ctx);
		return OurConstants.booleanType;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitAndbiBoolean(MiniJavaParser.AndbiBooleanContext ctx) {
		visitChildren(ctx);
		return OurConstants.booleanType;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitAndbbBoolean(MiniJavaParser.AndbbBooleanContext ctx) {
		visitChildren(ctx);
		return OurConstants.booleanType;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitEqualbbBoolean(MiniJavaParser.EqualbbBooleanContext ctx) {
		visitChildren(ctx);
		return OurConstants.booleanType;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitOrbbBoolean(MiniJavaParser.OrbbBooleanContext ctx) {
		visitChildren(ctx);
		return OurConstants.booleanType;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitFalseBoolean(MiniJavaParser.FalseBooleanContext ctx) {
		visitChildren(ctx);
		return OurConstants.booleanType;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitParenBoolean(MiniJavaParser.ParenBooleanContext ctx) {
		visitChildren(ctx);
		return OurConstants.booleanType;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitOribBoolean(MiniJavaParser.OribBooleanContext ctx) {
		visitChildren(ctx);
		return OurConstants.booleanType;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitOriiBoolean(MiniJavaParser.OriiBooleanContext ctx) {
		visitChildren(ctx);
		return OurConstants.booleanType;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitTrueBoolean(MiniJavaParser.TrueBooleanContext ctx) {
		visitChildren(ctx);
		return OurConstants.booleanType;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitEqualiiBoolean(MiniJavaParser.EqualiiBooleanContext ctx) {
		visitChildren(ctx);
		return OurConstants.booleanType;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public Integer visitIdentifier(MiniJavaParser.IdentifierContext ctx) {
		//System.out.println(ctx);
		return visitChildren(ctx); }
	//Notice: The followings are merely symbols, like "int" or "int[]"
    @Override
    public Integer visitArrayType(MiniJavaParser.ArrayTypeContext ctx) {
		return visitChildren(ctx);    }
    @Override
    public Integer visitBooleanType(MiniJavaParser.BooleanTypeContext ctx) {
        return visitChildren(ctx);
    }
    @Override
    public Integer visitIntType(MiniJavaParser.IntTypeContext ctx) {        return visitChildren(ctx);    }
    @Override
    public Integer visitIdentifierType(MiniJavaParser.IdentifierTypeContext ctx) {        return visitChildren(ctx); }

}

