// Generated from MiniJava.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(MiniJavaParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(MiniJavaParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(MiniJavaParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierType(MiniJavaParser.IdentifierTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code braceStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraceStatement(MiniJavaParser.BraceStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MiniJavaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MiniJavaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(MiniJavaParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(MiniJavaParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignArrayStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignArrayStatement(MiniJavaParser.AssignArrayStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lengthInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthInt(MiniJavaParser.LengthIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInt(MiniJavaParser.MethodIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierInt(MiniJavaParser.IdentifierIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisInt(MiniJavaParser.ThisIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulInt(MiniJavaParser.MulIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInt(MiniJavaParser.ArrayIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddInt(MiniJavaParser.AddIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralInt(MiniJavaParser.LiteralIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newIdentifierInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewIdentifierInt(MiniJavaParser.NewIdentifierIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newArrayInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewArrayInt(MiniJavaParser.NewArrayIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenInt(MiniJavaParser.ParenIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orbiBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrbiBoolean(MiniJavaParser.OrbiBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotBoolean(MiniJavaParser.NotBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andibBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndibBoolean(MiniJavaParser.AndibBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andbiBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndbiBoolean(MiniJavaParser.AndbiBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andbbBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndbbBoolean(MiniJavaParser.AndbbBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalbbBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualbbBoolean(MiniJavaParser.EqualbbBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orbbBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrbbBoolean(MiniJavaParser.OrbbBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andiiBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndiiBoolean(MiniJavaParser.AndiiBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseBoolean(MiniJavaParser.FalseBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenBoolean(MiniJavaParser.ParenBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oribBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOribBoolean(MiniJavaParser.OribBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oriiBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOriiBoolean(MiniJavaParser.OriiBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueBoolean(MiniJavaParser.TrueBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equaliiBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualiiBoolean(MiniJavaParser.EqualiiBooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MiniJavaParser.IdentifierContext ctx);
}