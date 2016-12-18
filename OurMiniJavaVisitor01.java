import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class OurMiniJavaVisitor01 extends MiniJavaBaseVisitor<Integer> {
    // in normal cases, functions should return an integer or null

    @Override
    public Integer visitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        // 第一轮记录return type，第二轮验证 & more
        String returntype = ctx.type(0).getStart().getText();
        String methodname = ctx.identifier(0).getStart().getText();
        String classname = ctx.getParent().getChild(1).getText();
        //System.out.println(classname + "." + methodname + "#" + returntype);
        if(DrawTree.storeReturnType(classname + "." + methodname, returntype) == false) {
            int lnumber = ctx.identifier(0).getStart().getLine();
            int cnumber = ctx.identifier(0).getStart().getCharPositionInLine();
            DrawTree.publishErrorMessage("line " + Integer.toString(lnumber) + ":" + Integer.toString(cnumber) + " 错误：一个类中出现同名方法");
            DrawTree.publicErrorLine(lnumber, cnumber, cnumber + methodname.length());
        }
        return visitChildren(ctx);
    }

    @Override
    public Integer visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        String classname = ctx.getChild(1).getText();
        int linenum = ctx.identifier(0).getStart().getLine();
        int charnum = ctx.identifier(0).getStart().getCharPositionInLine();
        if(DrawTree.addClassDeclaration(classname) == false) {
            DrawTree.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：重名的类");
            DrawTree.publicErrorLine(linenum, charnum, charnum + classname.length());
        }
        return visitChildren(ctx);
    }

    @Override
    public Integer visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) {
        int type = visit(ctx.type());
        String varname = ctx.identifier().getText();
        int linenum = ctx.identifier().getStart().getLine();
        int charnum = ctx.identifier().getStart().getCharPositionInLine();
        if(type != OurConstants.identifierType) {
            // identifierType 的情形只能放到第二轮去解决
            // ctx.getParent().depth()
            // 根据我们的语法，depth为2为class中的成员变量，为3则为func中的变量
            if(ctx.getParent().depth() == 3) {
                String classname = ctx.getParent().getParent().getChild(1).getText();
                String methodname = ctx.getParent().getChild(2).getText();
                if(DrawTree.addVarDeclaration(classname + "." + methodname + "." + varname, type) == false) {
                    DrawTree.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：重复定义变量");
                    DrawTree.publicErrorLine(linenum, charnum, charnum + varname.length());
                }
            } else {
                String classname = ctx.getParent().getChild(1).getText();
                if(DrawTree.addVarDeclaration(classname + "." + varname, type) == false) {
                    DrawTree.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：重复定义变量");
                    DrawTree.publicErrorLine(linenum, charnum, charnum + varname.length());
                }
            }
        }
        return null;
    }

    @Override
    public Integer visitArrayType(MiniJavaParser.ArrayTypeContext ctx) {
        return OurConstants.arrayType;
    }
    @Override
    public Integer visitBooleanType(MiniJavaParser.BooleanTypeContext ctx) {
        return OurConstants.booleanType;
    }
    @Override
    public Integer visitIntType(MiniJavaParser.IntTypeContext ctx) {
        return OurConstants.intType;
    }
    @Override
    public Integer visitIdentifierType(MiniJavaParser.IdentifierTypeContext ctx) {
        return OurConstants.identifierType;
    }
}
