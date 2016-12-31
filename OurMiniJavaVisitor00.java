import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class OurMiniJavaVisitor00 extends OurMiniJavaBaseVisitor {

    @Override
    public Integer visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        String classname = ctx.getChild(1).getText();
        String parent = "";

        if(ctx.getChildCount()>=6 && ctx.getChild(2).getText().equals("extends")) {
            parent = ctx.getChild(3).getChild(0).getText();
        }
        int linenum = ctx.identifier(0).getStart().getLine();
        int charnum = ctx.identifier(0).getStart().getCharPositionInLine();
        if(MiniJava.addClassDeclaration(classname, parent) == false) {
            MiniJava.publishErrorMessage("line " + Integer.toString(linenum) + ":" + Integer.toString(charnum) + " 重名的类");
            MiniJava.publicErrorLine(linenum, charnum, charnum + classname.length());
        }
        return visitChildren(ctx);
    }
}
