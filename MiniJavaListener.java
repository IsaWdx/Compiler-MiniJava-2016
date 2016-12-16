// Generated from MiniJava.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(MiniJavaParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(MiniJavaParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(MiniJavaParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(MiniJavaParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(MiniJavaParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(MiniJavaParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierType(MiniJavaParser.IdentifierTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierType(MiniJavaParser.IdentifierTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code braceStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBraceStatement(MiniJavaParser.BraceStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code braceStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBraceStatement(MiniJavaParser.BraceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MiniJavaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MiniJavaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MiniJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MiniJavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(MiniJavaParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(MiniJavaParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(MiniJavaParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(MiniJavaParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignArrayStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignArrayStatement(MiniJavaParser.AssignArrayStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignArrayStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignArrayStatement(MiniJavaParser.AssignArrayStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lengthInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 */
	void enterLengthInt(MiniJavaParser.LengthIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lengthInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 */
	void exitLengthInt(MiniJavaParser.LengthIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 */
	void enterMethodInt(MiniJavaParser.MethodIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 */
	void exitMethodInt(MiniJavaParser.MethodIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierInt(MiniJavaParser.IdentifierIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierInt(MiniJavaParser.IdentifierIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 */
	void enterThisInt(MiniJavaParser.ThisIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 */
	void exitThisInt(MiniJavaParser.ThisIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 */
	void enterMulInt(MiniJavaParser.MulIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 */
	void exitMulInt(MiniJavaParser.MulIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayInt(MiniJavaParser.ArrayIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayInt(MiniJavaParser.ArrayIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 */
	void enterAddInt(MiniJavaParser.AddIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 */
	void exitAddInt(MiniJavaParser.AddIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralInt(MiniJavaParser.LiteralIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralInt(MiniJavaParser.LiteralIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newIdentifierInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 */
	void enterNewIdentifierInt(MiniJavaParser.NewIdentifierIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newIdentifierInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 */
	void exitNewIdentifierInt(MiniJavaParser.NewIdentifierIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newArrayInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 */
	void enterNewArrayInt(MiniJavaParser.NewArrayIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newArrayInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 */
	void exitNewArrayInt(MiniJavaParser.NewArrayIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 */
	void enterParenInt(MiniJavaParser.ParenIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenInt}
	 * labeled alternative in {@link MiniJavaParser#intexpression}.
	 * @param ctx the parse tree
	 */
	void exitParenInt(MiniJavaParser.ParenIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orbiBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void enterOrbiBoolean(MiniJavaParser.OrbiBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orbiBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void exitOrbiBoolean(MiniJavaParser.OrbiBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void enterNotBoolean(MiniJavaParser.NotBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void exitNotBoolean(MiniJavaParser.NotBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andibBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void enterAndibBoolean(MiniJavaParser.AndibBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andibBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void exitAndibBoolean(MiniJavaParser.AndibBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andbiBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void enterAndbiBoolean(MiniJavaParser.AndbiBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andbiBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void exitAndbiBoolean(MiniJavaParser.AndbiBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andbbBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void enterAndbbBoolean(MiniJavaParser.AndbbBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andbbBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void exitAndbbBoolean(MiniJavaParser.AndbbBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalbbBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualbbBoolean(MiniJavaParser.EqualbbBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalbbBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualbbBoolean(MiniJavaParser.EqualbbBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orbbBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void enterOrbbBoolean(MiniJavaParser.OrbbBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orbbBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void exitOrbbBoolean(MiniJavaParser.OrbbBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andiiBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void enterAndiiBoolean(MiniJavaParser.AndiiBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andiiBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void exitAndiiBoolean(MiniJavaParser.AndiiBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void enterFalseBoolean(MiniJavaParser.FalseBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void exitFalseBoolean(MiniJavaParser.FalseBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void enterParenBoolean(MiniJavaParser.ParenBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void exitParenBoolean(MiniJavaParser.ParenBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code oribBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void enterOribBoolean(MiniJavaParser.OribBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code oribBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void exitOribBoolean(MiniJavaParser.OribBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code oriiBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void enterOriiBoolean(MiniJavaParser.OriiBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code oriiBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void exitOriiBoolean(MiniJavaParser.OriiBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void enterTrueBoolean(MiniJavaParser.TrueBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void exitTrueBoolean(MiniJavaParser.TrueBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equaliiBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualiiBoolean(MiniJavaParser.EqualiiBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equaliiBoolean}
	 * labeled alternative in {@link MiniJavaParser#booleanexpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualiiBoolean(MiniJavaParser.EqualiiBooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MiniJavaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MiniJavaParser.IdentifierContext ctx);
}