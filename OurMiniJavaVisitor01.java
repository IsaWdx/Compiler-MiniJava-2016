import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class OurMiniJavaVisitor01 extends OurMiniJavaBaseVisitor {
    // in normal cases, functions should return an integer or null

    @Override
    public Integer visitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        // 第一轮记录return type，第二轮验证 & more
        String returntype = ctx.type(0).getText();
        //System.out.println(returntype);
        String methodname = ctx.identifier(0).getStart().getText();
        String classname = ctx.getParent().getChild(1).getText();
        String methodSignature = classname + "." + methodname + "(";
        String purename = classname + "." + methodname;
        List<ParseTree> children = ctx.children;
        int beginfrom = 0, endbefore = 0;
        for(int i = 0; i < children.size(); i++) {
            if(children.get(i).getText().equals("(")) {
                beginfrom = i + 1;
                break;
            }
        }
        for(int i = 0; i < children.size(); i++) {

            //System .out.println(children.get(i).getText());
            if(children.get(i).getText().equals(")")) {
                endbefore = i;
                break;
            }
        }
        for(int i = beginfrom; i < endbefore; i = i + 2) {
            if (!children.get(i).getText().equals(","))
            methodSignature = methodSignature + children.get(i).getText() + ",";
        }


        //System.out.println(methodSignature);
        if(MiniJava.storeReturnType(methodSignature, returntype, purename) == false) {
            int lnumber = ctx.identifier(0).getStart().getLine();
            int cnumber = ctx.identifier(0).getStart().getCharPositionInLine();
            MiniJava.publishErrorMessage("line " + Integer.toString(lnumber) + ":" + Integer.toString(cnumber) + " 错误：类中出现相同签名的方法");
            MiniJava.publicErrorLine(lnumber, cnumber, cnumber + methodname.length());
        }
        return visitChildren(ctx);
    }

    @Override
    public Integer visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        String classname = ctx.getChild(1).getText();
        String parent = "";
        //要查看是否循环继承，或者子类里有（祖）父类变量，或者父类里有子类变量
        if(ctx.getChildCount()>=6 && ctx.getChild(2).getText().equals("extends")) {
            parent = ctx.getChild(3).getChild(0).getText();
        }
        int linenum = ctx.identifier(0).getStart().getLine();
        int charnum = ctx.identifier(0).getStart().getCharPositionInLine();
        if(MiniJava.addClassDeclaration(classname,parent) == false) {
            MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：重名的类");
            MiniJava.publicErrorLine(linenum, charnum, charnum + classname.length());
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
                if(MiniJava.addVarDeclaration(classname + "." + methodname + "." + varname, type)==false || MiniJava.storeVarType(classname + "." + methodname + "." + varname, typename) == false) {

                    MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：重复定义变量");
                    MiniJava.publicErrorLine(linenum, charnum, charnum + varname.length());
                }
            } else {
                String classname = ctx.getParent().getChild(1).getText();
                if(MiniJava.addVarDeclaration(classname + "." + varname, type)==false  || MiniJava.storeVarType(classname + "." + varname, typename) == false) {
                    MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：重复定义变量");
                    MiniJava.publicErrorLine(linenum, charnum, charnum + varname.length());
                }
            }
        }
        return type;
    }
}
