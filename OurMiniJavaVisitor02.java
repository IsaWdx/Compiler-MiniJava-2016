import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OurMiniJavaVisitor02 extends OurMiniJavaBaseVisitor {
    // in normal cases, functions should return an integer or null

    @Override
    public Integer visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        String classname = ctx.getChild(1).getText();
        String parent = "";
        int linenum = ctx.identifier(0).getStart().getLine();
        int charnum = ctx.identifier(0).getStart().getCharPositionInLine();
        Set<String> ancesterSet = new HashSet<String>();
        //要查看是否循环继承，或者子类里有（祖）父类变量，或者父类里有子类变量
        if(ctx.getChildCount()>=6 && ctx.getChild(2).getText().equals("extends")) {
            parent = ctx.getChild(3).getChild(0).getText();
            if (MiniJava.classMap.containsKey(parent)) {
                while(MiniJava.classMap.containsKey(parent)) {
                    if (ancesterSet.contains(parent)) {
                        MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：循环继承");
                        MiniJava.publicErrorLine(linenum, charnum, charnum + classname.length());
                        break;
                    }
                    ancesterSet.add(parent);
                    parent = MiniJava.classMap.get(parent);
                }
            }
            else {
                MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：未定义的父类");
                MiniJava.publicErrorLine(linenum, charnum, charnum + classname.length());
            }
        }
        return visitChildren(ctx);
    }



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
            if(!MiniJava.classExist(typename)) {
                int deflinenum = ctx.type().getStart().getLine();
                int defcharnum = ctx.type().getStart().getCharPositionInLine();
                MiniJava.publishErrorMessage("line " + Integer.toString(deflinenum) + ":" + Integer.toString(defcharnum) + " 错误：未定义的类型");
                MiniJava.publicErrorLine(deflinenum, defcharnum, defcharnum + typename.length());
                return OurConstants.identifierType;
            }
            if(ctx.getParent().depth() == 3) {
                String classname = ctx.getParent().getParent().getChild(1).getText();
                String methodname = ctx.getParent().getChild(2).getText();
                if(MiniJava.addVarDeclaration(classname + "." + methodname + "." + varname, type) && MiniJava.storeVarType(classname + "." + methodname + "." + varname, typename) == false) {
                    MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：重复定义变量");
                    MiniJava.publicErrorLine(linenum, charnum, charnum + varname.length());
                }
            } else {
                String classname = ctx.getParent().getChild(1).getText();
                if(MiniJava.addVarDeclaration(classname + "." + varname, type) && MiniJava.storeVarType(classname + "." + varname, typename) == false) {
                    MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：重复定义变量");
                    MiniJava.publicErrorLine(linenum, charnum, charnum + varname.length());
                }
            }
        }
        return OurConstants.identifierType;
    }
}
