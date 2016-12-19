import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class OurMiniJavaVisitor02 extends OurMiniJavaBaseVisitor {
    // in normal cases, functions should return an integer or null

    @Override
    public Integer visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) {
        int type = visit(ctx.type());
        String varname = ctx.identifier().getText();
        int linenum = ctx.identifier().getStart().getLine();
        int charnum = ctx.identifier().getStart().getCharPositionInLine();
        if(type == OurConstants.identifierType) {
            // 非 identifierType 的情形已经在第一轮解决
            // 根据我们的语法，depth为2为class中的成员变量，为3则为func中的变量
            String typename = ctx.type().getText();
            if(!DrawTree.classExist(typename)) {
                int deflinenum = ctx.type().getStart().getLine();
                int defcharnum = ctx.type().getStart().getCharPositionInLine();
                DrawTree.publishErrorMessage("line " + Integer.toString(deflinenum) + ":" + Integer.toString(defcharnum) + " 错误：未定义的类型");
                DrawTree.publicErrorLine(deflinenum, defcharnum, defcharnum + typename.length());
                return OurConstants.identifierType;
            }
            if(ctx.getParent().depth() == 3) {
                String classname = ctx.getParent().getParent().getChild(1).getText();
                String methodname = ctx.getParent().getChild(2).getText();
                if(DrawTree.addVarDeclaration(classname + "." + methodname + "." + varname, type) && DrawTree.storeVarType(classname + "." + methodname + "." + varname, typename) == false) {
                    DrawTree.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：重复定义变量");
                    DrawTree.publicErrorLine(linenum, charnum, charnum + varname.length());
                }
            } else {
                String classname = ctx.getParent().getChild(1).getText();
                if(DrawTree.addVarDeclaration(classname + "." + varname, type) && DrawTree.storeVarType(classname + "." + varname, typename) == false) {
                    DrawTree.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：重复定义变量");
                    DrawTree.publicErrorLine(linenum, charnum, charnum + varname.length());
                }
            }
        }
        return OurConstants.identifierType;
    }
}
