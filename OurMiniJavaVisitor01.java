import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class OurMiniJavaVisitor01 extends MiniJavaBaseVisitor<Integer> {
    // in normal cases, functions should return an integer or null

    @Override
    public Integer visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) {
        int type = visit(ctx.type());
        String varname = ctx.identifier().getText();
        if(type != OurConstants.identifierType) {
            // identifierType 的情形只能放到第二轮去解决
            // ctx.getParent().depth()
            // 根据我们的语法，depth为2为class中的成员变量，为3则为func中的变量
            if(ctx.getParent().depth() == 3) {
                String classname = ctx.getParent().getParent().getChild(1).getText();
                String methodname = ctx.getParent().getChild(2).getText();
                if(DrawTree.addVarDeclaration(classname + "." + methodname + "." + varname, type) == false) {
                    DrawTree.publishErrorMessage("错误：重复定义变量。");
                }
            } else {
                String classname = ctx.getParent().getChild(1).getText();
                if(DrawTree.addVarDeclaration(classname + "." + varname, type) == false) {
                    DrawTree.publishErrorMessage("错误：重复定义变量。");
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
