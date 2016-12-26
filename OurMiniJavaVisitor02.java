import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OurMiniJavaVisitor02 extends OurMiniJavaBaseVisitor {
    // in normal cases, functions should return an integer or null

    @Override public Integer visitMethodInt(MiniJavaParser.MethodIntContext ctx) {
        int returntype = OurConstants.illegalType;
        String classname = "";
        String methodname = "";
        String methodSignature = "";
        //check "this" as first
        if (ctx.getChild(0).getText().equals("this")) {
            int depth = ctx.depth();
            ParserRuleContext parent = ctx.getParent();
            for (; depth > 2; depth--) {
                classname = parent.getChild(1).getText();
                parent = parent.getParent();
            }
            //System.out.println(ctx.getText());
            methodSignature = classname + "." + ctx.getChild(2).getText() + "(";
            int count = ctx.getChildCount();
            int linenum = ctx.identifier().getStart().getLine();
            int charnum = ctx.identifier().getStart().getCharPositionInLine();
            for (int i  = 4; i< count-1; i=i+2){
                ParseTree c = ctx.getChild(i);
                Integer result = c.accept(this);
                //System.out.println(ctx.getChild(i).getText()+" "+ctx.getChild(i).getClass());
                if(result == null){
                    MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + "未定义的方法形参");
                    MiniJava.publicErrorLine(linenum, charnum, charnum + classname.length());
                }
                methodSignature += result+",";

                //System.out.println("result: "+result);
                //System.out.println( ctx.getChild(i).getText());
            }
            if (MiniJava.returnTypeMap.get(methodSignature) == null) {
                MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + "未定义的方法");
                MiniJava.publicErrorLine(linenum, charnum, charnum + classname.length());
            }
            //System.out.println();
            return MiniJava.returnTypeMap.get(methodname);

        }
        else{
            //visit first child, it may be a child node instead of pure identifier, like new BBS()
            //visit the child node, and result stores the return type
            ParseTree c = ctx.getChild(0);
            Integer result = c.accept(this);
            classname = MiniJava.numberClassMap.get(result);
            Integer count = ctx.getChildCount();
            methodname = ctx.getChild(2).getText();
            methodSignature = classname+"."+methodname+"(";
            for (int i  = 4; i< count-1; i=i+2){
                c = ctx.getChild(i);
                result = c.accept(this);
                if(result == null){
                    //for debug output, normally here should not be anything
                    //System.out.println(ctx.getParent().getParent().getChild(2).getText()+"."+ctx.getParent().getChild(2).getText()+"."+ctx.getChild(i).getText());
                    //result = MiniJava.typeMap.get(ctx.getParent().getParent().getChild(2).getText()+","+ctx.getParent().getChild(2).getText()+"."+ctx.getChild(i).getText());
                    //System.out.println(ctx.getParent().getParent().getChild(2).getText()+","+ctx.getParent().getChild(2).getText()+"."+ctx.getChild(i).getText()+ " "+result);
                }
                methodSignature += result+",";
                //System.out.println("result: "+result);
                //System.out.println( ctx.getChild(i).getText());
            }

            //System.out.println(methodname+" "+methodSignature);
            //TODO：There seems no following problems
            if (MiniJava.returnTypeMap.get(methodSignature)==null) {
                int linenum = ctx.identifier().getStart().getLine();
                int charnum = ctx.identifier().getStart().getCharPositionInLine();
                MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + "未定义的方法");
                MiniJava.publicErrorLine(linenum, charnum, charnum + classname.length());
            }
            else {
                returntype = MiniJava.returnTypeMap.get(methodSignature);
            }
            //在函数调用中 记录现在所在的位置处理this，然后找到他的定义位置，找到返回值
            ParserRuleContext parent = ctx.getParent();
            //System.out.println("return type "+returntype + " " + ctx.getChild(0).getText() +" "+ctx.getChild(2).getText());
            return returntype;
        }
    }


    @Override public Integer visitIdentifierInt(MiniJavaParser.IdentifierIntContext ctx) {
        String varname = ctx.identifier().getText();
        //System.out.println("IDENTIFIER NAME: "+varname+" belongs to "+ctx.getParent().getText());
        String key = "";
        ParserRuleContext parent = ctx.getParent();
        int linenum = ctx.identifier().getStart().getLine();
        int charnum = ctx.identifier().getStart().getCharPositionInLine();
        //System.out.println(varname);
        //先检查是否函数中变量，再检查是否类中变量
        while(parent.depth() >=4) {
            parent = parent.getParent();
        }
        if(parent.depth() == 3) {
            //System.out.println("parent depth: "+parent.depth());
            String classname = parent.getParent().getChild(1).getText();
            String methodname = parent.getChild(2).getText();
            key = classname + "." + methodname + "." + varname;
            //System.out.println(key);
            if(MiniJava.getVarType(key)==null) {
                key = classname + "." + varname;
                if(MiniJava.getVarType(key)==null ) {
                    MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：未定义变量"+  varname);
                    MiniJava.publicErrorLine(linenum, charnum, charnum + varname.length());
                }
            }
        }

        return MiniJava.getVarType(key); }

    @Override
    public Integer visitNewIdentifierInt(MiniJavaParser.NewIdentifierIntContext ctx)
    {
        String returntype =ctx.getChild(1).getText();
        //System.out.println(ctx.getChild(1).getText()+" : "+MiniJava.classNumberMap.get(ctx.getChild(1).getText()));
        //System.out.println(MiniJava.classNumberMap.get(returntype));
        return MiniJava.classNumberMap.get(returntype);
    }
    @Override
    public Integer visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        String classname = ctx.getChild(1).getText();
        String parent = "";
        int linenum = ctx.identifier(0).getStart().getLine();
        int charnum = ctx.identifier(0).getStart().getCharPositionInLine();
        Set<String> ancesterSet = new HashSet<String>();
        //Check recurrent inheritance

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
        int linenum = ctx.identifier().getStart().getLine();
        int charnum = ctx.identifier().getStart().getCharPositionInLine();
        int type = OurMiniJavaVisitor01.Str2Int(ctx.type().getText(), linenum, charnum, "");
        return type;
    }
}
