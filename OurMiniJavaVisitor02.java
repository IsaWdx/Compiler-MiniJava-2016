import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OurMiniJavaVisitor02 extends OurMiniJavaBaseVisitor {
    // in normal cases, functions should return an integer or null
    @Override
    public Integer visitAddInt(MiniJavaParser.AddIntContext ctx) {
		int type1 = visit(ctx.intexpression(0));
        int type2 = visit(ctx.intexpression(1));
        if(type1 != OurConstants.intType) {
            int linenum = ctx.intexpression(0).getStart().getLine();
            int charnum = ctx.intexpression(0).getStart().getCharPositionInLine();
            MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：进行运算的变量必须是整型");
            MiniJava.publicErrorLine(linenum, charnum, charnum + ctx.intexpression(0).getText().length());
        }
        if(type2 != OurConstants.intType) {
            int linenum = ctx.intexpression(1).getStart().getLine();
            int charnum = ctx.intexpression(1).getStart().getCharPositionInLine();
            MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：进行运算的变量必须是整型");
            MiniJava.publicErrorLine(linenum, charnum, charnum + ctx.intexpression(1).getText().length());
        }
        return OurConstants.intType;
	}

    @Override
    public Integer visitMulInt(MiniJavaParser.MulIntContext ctx) {
        int type1 = visit(ctx.intexpression(0));
        int type2 = visit(ctx.intexpression(1));
        if(type1 != OurConstants.intType) {
            int linenum = ctx.intexpression(0).getStart().getLine();
            int charnum = ctx.intexpression(0).getStart().getCharPositionInLine();
            MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：进行运算的变量必须是整型");
            MiniJava.publicErrorLine(linenum, charnum, charnum + ctx.intexpression(0).getText().length());
        }
        if(type2 != OurConstants.intType) {
            int linenum = ctx.intexpression(1).getStart().getLine();
            int charnum = ctx.intexpression(1).getStart().getCharPositionInLine();
            MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：进行运算的变量必须是整型");
            MiniJava.publicErrorLine(linenum, charnum, charnum + ctx.intexpression(1).getText().length());
        }
        return OurConstants.intType;
    }

    @Override public Integer visitParenInt(MiniJavaParser.ParenIntContext ctx) {
        ParseTree c = ctx.getChild(1);
        Integer result = c.accept(this);
        return result;
    }

    @Override public Integer visitMethodInt(MiniJavaParser.MethodIntContext ctx) {
        int returntype = OurConstants.illegalType;
        String classname = "";
        String methodname = "";
        String methodSignature = "";
        int linenum = ctx.identifier().getStart().getLine();
        int charnum = ctx.identifier().getStart().getCharPositionInLine();
        //visit first child, it may be a child node instead of pure identifier, like new BBS()
        //result stores the return type
        ParseTree c = ctx.getChild(0);
        Integer result = c.accept(this);
        classname = MiniJava.numberClassMap.get(result);
        if(result == null || classname == null) {
            MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + "未定义的类名");
            MiniJava.publicErrorLine(linenum, charnum-ctx.getChild(0).getText().length()-1,charnum-1 );
            return OurConstants.illegalType;
        }
        Integer count = ctx.getChildCount();
        methodname = ctx.getChild(2).getText();
        methodSignature = classname + "." + methodname + "(";
        for (int i = 4; i < count - 1; i = i + 2) {
            c = ctx.getChild(i);
            result = c.accept(this);
            if (result == null) {
                MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + "未定义的方法形参");
                MiniJava.publicErrorLine(linenum, charnum, charnum + classname.length());
                return OurConstants.illegalType;
            }
            methodSignature += result + ",";
        }
        if (MiniJava.returnTypeMap.get(methodSignature) == null) {
            MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + "未定义的方法" + classname);
            MiniJava.publicErrorLine(linenum, charnum, charnum + classname.length());
            return OurConstants.illegalType;
        } else {
            returntype = MiniJava.returnTypeMap.get(methodSignature);
        }
        return returntype;
    }

    @Override public Integer visitThisInt(MiniJavaParser.ThisIntContext ctx) {
        Integer classnumber ;
        String classname = "";
        int depth = ctx.depth();
        ParserRuleContext parent = ctx.getParent();
        for (; depth > 2; depth--) {
            classname = parent.getChild(1).getText();
            parent = parent.getParent();
        }
        return  MiniJava.classNumberMap.get(classname);
    }

    @Override public Integer visitIdentifierInt(MiniJavaParser.IdentifierIntContext ctx) {
        String varname = ctx.identifier().getText();
        String key = "";
        ParserRuleContext parent = ctx.getParent();
        int linenum = ctx.identifier().getStart().getLine();
        int charnum = ctx.identifier().getStart().getCharPositionInLine();
        //先检查是否函数中变量，再检查是否类中变量
        while(parent.depth() >=4) {
            parent = parent.getParent();
        }
        if(parent.depth() == 3) {
            String classname = parent.getParent().getChild(1).getText();
            String methodname = parent.getChild(2).getText();
            key = classname + "." + methodname + "." + varname;
            if(MiniJava.getVarType(key)==null) {
                key = classname + "." + varname;
                if(MiniJava.getVarType(key)==null) {
                    MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：未定义变量"+  varname);
                    MiniJava.publicErrorLine(linenum, charnum, charnum + varname.length());
                    // 临时补救措施，避免返回一个null的情形出现
                    // 返回-1会导致不能和任何现有类型匹配，报错，这是合理反应
                    return -1;
                }
            }
        }
        return MiniJava.getVarType(key);
    }

    @Override
    public Integer visitNewIdentifierInt(MiniJavaParser.NewIdentifierIntContext ctx) {
        String returntype =ctx.getChild(1).getText();
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
        String varname = ctx.identifier().getText();
        String typename = ctx.type().getText();
        // depth为2为class中的成员变量，为3则为func中的变量
        if (ctx.getParent().depth() == 3) {
            String classname = ctx.getParent().getParent().getChild(1).getText();
            if(MiniJava.isChildClass(classname, typename)) {
                MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：在父类中出现子类的实例");
                MiniJava.publicErrorLine(linenum, charnum, charnum + varname.length());
            }
        } else {
            String classname = ctx.getParent().getChild(1).getText();
            if(MiniJava.isChildClass(classname, typename)) {
                MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：在父类中出现子类的实例");
                MiniJava.publicErrorLine(linenum, charnum, charnum + varname.length());
            }
        }
        return OurMiniJavaVisitor01.Str2Int(ctx.type().getText(), linenum, charnum, "");
    }

    @Override
    public Integer visitArrayInt(MiniJavaParser.ArrayIntContext ctx) {
        List<ParserRuleContext> res = ctx.getRuleContexts(new MiniJavaParser.IntexpressionContext().getClass());
        if(res.size() == 2) {   // 如果不是有两个Intexpression的情形（比如其中的任意个被替换成了Booleanexpression），ANTLR会处理这种不匹配
            int type1 = visit(ctx.intexpression(0));
            int type2 = visit(ctx.intexpression(1));
            if(type1 != OurConstants.arrayType) {
                int linenum = ctx.intexpression(0).getStart().getLine();
                int charnum = ctx.intexpression(0).getStart().getCharPositionInLine();
                MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：MiniJava中不可能出现int类型以外的数组");
                MiniJava.publicErrorLine(linenum, charnum, charnum + ctx.intexpression(0).getText().length());
            }
            if(type2 != OurConstants.intType) {
                int linenum = ctx.intexpression(1).getStart().getLine();
                int charnum = ctx.intexpression(1).getStart().getCharPositionInLine();
                MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：数组下标只能是整数类型");
                MiniJava.publicErrorLine(linenum, charnum, charnum + ctx.intexpression(1).getText().length());
            }
        } else {
            visitChildren(ctx);
        }
        return  OurConstants.intType;
    }

    @Override
    public Integer visitNewArrayInt(MiniJavaParser.NewArrayIntContext ctx) {
		try {
            int type = visit(ctx.intexpression());
            if(type != OurConstants.intType) {
                int linenum = ctx.intexpression().getStart().getLine();
                int charnum = ctx.intexpression().getStart().getCharPositionInLine();
                MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：数组大小只能是整数类型");
                MiniJava.publicErrorLine(linenum, charnum, charnum + ctx.intexpression().getText().length());
            }
        } catch(NullPointerException e) {
            // 交由ANTLR的默认机制来试图解决问题
            visitChildren(ctx);
        }
        return OurConstants.arrayType;
	}

    @Override
    public Integer visitAssignArrayStatement(MiniJavaParser.AssignArrayStatementContext ctx) {
        //return visitChildren(ctx);
        try {
            int indexType = visit(ctx.intexpression(0));
            if(indexType != OurConstants.intType) {
                int linenum = ctx.intexpression(0).getStart().getLine();
                int charnum = ctx.intexpression(0).getStart().getCharPositionInLine();
                MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：数组下标只能是整数类型");
                MiniJava.publicErrorLine(linenum, charnum, charnum + ctx.intexpression(0).getText().length());
            }
            // 以下两部分虽然（暂时）不检查，但是不应该不visit
            visit(ctx.identifier());
            visit(ctx.intexpression(1));
        } catch (NullPointerException e) {  // 如果不是有两个Intexpression的情形（比如其中的任意个被替换成了Booleanexpression），ANTLR会处理这种不匹配
            // nothing ...
        }
        return 0;
    }

    @Override
    public Integer visitAssignStatement(MiniJavaParser.AssignStatementContext ctx) {
        int rightType = -1;
        try {
            rightType = visit(ctx.intexpression());
        } catch (NullPointerException expname) {
            try {
                rightType = visit(ctx.booleanexpression());
            } catch (Exception e) {
                System.out.println(ctx.getText());
            }
        }
        ParserRuleContext currCtx = ctx;
        int extraDepth = ctx.getParent().depth() - 3;
        for(int i = 0; i < extraDepth; i++)
            currCtx = currCtx.getParent();
        String classname = currCtx.getParent().getParent().getChild(1).getText();
        String methodname = currCtx.getParent().getChild(2).getText();
        int leftType;
        if(MiniJava.getVarType(classname + "." + methodname + "." + ctx.identifier().getText()) == null) {
            leftType = MiniJava.getVarType(classname + "." + ctx.identifier().getText());
        } else {
            leftType = MiniJava.getVarType(classname + "." + methodname + "." + ctx.identifier().getText());
        }
        if(leftType != rightType) {
            int linenum = ctx.identifier().getStart().getLine();
            int charnum = ctx.identifier().getStart().getCharPositionInLine();
            MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 错误：赋值类型不匹配");
            MiniJava.publicErrorLine(linenum, charnum, charnum + ctx.identifier().getText().length());
            //System.out.println(leftType);
            //System.out.println(rightType);
        }
        return 0;
    }
}
