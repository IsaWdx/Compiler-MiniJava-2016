import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OurMiniJavaVisitor02 extends OurMiniJavaBaseVisitor {
    // in normal cases, functions should return an integer or null

    @Override public Integer visitMethodInt(MiniJavaParser.MethodIntContext ctx) {
        int returntype = -1;
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
            for (int i  = 4; i< count-1; i=i+2){
                ParseTree c = ctx.getChild(i);
                Integer result = c.accept(this);
                if(result == null){//TODO: 这里还没有考虑 yy.xx的情况
                   //这里需要在variable里面去找。根据depth
                }
                methodSignature += result+",";

                //System.out.println("result: "+result);
                //System.out.println( ctx.getChild(i).getText());
            }
            if (MiniJava.returnTypeMap.get(methodSignature) == null) {
                int linenum = ctx.identifier().getStart().getLine();
                int charnum = ctx.identifier().getStart().getCharPositionInLine();
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
                if(result == null){//TODO: 这里还没有考虑 yy.xx的情况
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
        // TODO: Check if there exists a child class instance as a member in a parent class, or vice versa
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
                if(!MiniJava.addVarDeclaration(classname + "." + methodname + "." + varname, type)) {
                    MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：重复定义变量");
                    MiniJava.publicErrorLine(linenum, charnum, charnum + varname.length());
                }
            } else {
                String classname = ctx.getParent().getChild(1).getText();
                if(!MiniJava.addVarDeclaration(classname + "." + varname, type)) {
                    MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：重复定义变量");
                    MiniJava.publicErrorLine(linenum, charnum, charnum + varname.length());
                }
            }
        }
        return OurConstants.identifierType;
    }
}
