import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class OurMiniJavaVisitor01 extends OurMiniJavaBaseVisitor {
    // In normal cases, functions should return an integer or null
    public static Integer Str2Int(String type, Integer lnumber, Integer cnumber, String methodname) {
        switch (type){
            case "int": return OurConstants.intType;
            case "int[]": return OurConstants.arrayType;
            case "boolean": return OurConstants.booleanType;
            default:
                if(MiniJava.classNumberMap.get(type) == null) {
                    MiniJava.publishErrorMessage("line " + Integer.toString(lnumber) + ":" + Integer.toString(cnumber) + " 错误：出现未定义的参数类型" + type);
                    MiniJava.publicErrorLine(lnumber, cnumber, cnumber + methodname.length());
                    return OurConstants.illegalType;
                }
                return MiniJava.classNumberMap.get(type);
        }
    }
    
    @Override
    public Integer visitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        // 第一轮记录return type，第二轮验证 & more
        int lnumber = ctx.identifier(0).getStart().getLine();
        int cnumber = ctx.identifier(0).getStart().getCharPositionInLine();
        String methodname = ctx.identifier(0).getStart().getText();
        Integer returntype = Str2Int(ctx.type(0).getText(),lnumber,cnumber, methodname);
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
        for(int i = beginfrom; i < endbefore; i = i + 3) {
            methodSignature = methodSignature + Str2Int(children.get(i).getText(),lnumber,cnumber,methodname) + ",";
            MiniJava.addVarDeclaration(classname + "." + methodname + "." + children.get(i + 1).getText(), Str2Int(children.get(i).getText(), lnumber, cnumber, methodname));
        }
        if(MiniJava.storeReturnType(methodSignature, returntype) == false) {
            MiniJava.publishErrorMessage("line " + Integer.toString(lnumber) + ":" + Integer.toString(cnumber) + " 错误：类中出现相同签名的方法");
            MiniJava.publicErrorLine(lnumber, cnumber, cnumber + methodname.length());
        }
        return visitChildren(ctx);
    }
    @Override
    public Integer visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) {
        int linenum = ctx.identifier().getStart().getLine();
        int charnum = ctx.identifier().getStart().getCharPositionInLine();
        int type = Str2Int(ctx.type().getText(), linenum, charnum, "");
        String varname = ctx.identifier().getText();
        // 根据我们的语法，depth为2为class中的成员变量，为3则为func中的变量
       // TODO: Check if there exists a child class instance as a member in a parent class, or vice versa
        String typename = ctx.type().getText();
        if (ctx.getParent().depth() == 3) {
            String classname = ctx.getParent().getParent().getChild(1).getText();
            String methodname = ctx.getParent().getChild(2).getText();
            if (MiniJava.addVarDeclaration(classname + "." + methodname + "." + varname, type) == false) {
                MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：重复定义变量");
                MiniJava.publicErrorLine(linenum, charnum, charnum + varname.length());
            }
        } else {
            String classname = ctx.getParent().getChild(1).getText();
            if (MiniJava.addVarDeclaration(classname + "." + varname, type) == false) {
                MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：重复定义变量");
                MiniJava.publicErrorLine(linenum, charnum, charnum + varname.length());
            }
        }

        return type;
    }
}
