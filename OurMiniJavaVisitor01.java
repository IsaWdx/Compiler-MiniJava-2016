import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class OurMiniJavaVisitor01 extends MiniJavaBaseVisitor<Integer> {
    // in normal cases, functions should return an integer or null

    @Override
    public Integer visitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        // 第一轮记录return type，第二轮验证 & more
        String returntype = ctx.type(0).getText();
        String methodname = ctx.identifier(0).getStart().getText();
        String classname = ctx.getParent().getChild(1).getText();
        String methodSignature = classname + "." + methodname + "(";
        List<ParseTree> children = ctx.children;
        int beginfrom = 0, endbefore = 0;
        for(int i = 0; i < children.size(); i++) {
            if(children.get(i).getText().equals("(")) {
                beginfrom = i + 1;
                break;
            }
        }
        for(int i = 0; i < children.size(); i++) {
            if(children.get(i).getText().equals(")")) {
                endbefore = i;
                break;
            }
        }
        for(int i = beginfrom; i < endbefore; i = i + 2) {
            methodSignature = methodSignature + children.get(i).getText() + ",";
        }
        //methodSignature = methodSignature.substring(0, methodSignature.length()-1) + ")";
        //System.out.println(methodSignature);
        if(DrawTree.storeReturnType(methodSignature, returntype) == false) {
            int lnumber = ctx.identifier(0).getStart().getLine();
            int cnumber = ctx.identifier(0).getStart().getCharPositionInLine();
            DrawTree.publishErrorMessage("line " + Integer.toString(lnumber) + ":" + Integer.toString(cnumber) + " 错误：类中出现相同签名的方法");
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
            String typename = ctx.type().getText();
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
