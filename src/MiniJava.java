import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.swing.*;
import java.io.FileInputStream;
import java.util.*;

public class MiniJava {
    private static boolean hasError = false;
    //Assign each identifier with a number. when>=4, these are class identifier. 0,1,2,3, arew consistant with Ourconstants
    public static Map<String, Integer> typeMap = new HashMap<String, Integer>();//variable
    public static Map<String, Integer> returnTypeMap = new HashMap<String, Integer>();//method
    public static Map<String, String> classMap = new HashMap<String, String>();//class -> parent class
    public static Map<Integer,String> numberClassMap = new HashMap<Integer, String>();//find classname through number
    public static Map<String, Integer> classNumberMap = new HashMap<String, Integer>();//vice versa
    public static Integer totalClassNumber = 0;
    private static List<String> rawCodes = new ArrayList<String>();

    public static boolean isChildClass(String parent, String child) {
        if(parent.equals(child))
            return true;
        String currClassName = classMap.get(child);
        while(currClassName != null && !currClassName.equals("")) {
            if(currClassName.equals(parent))
                return true;
            currClassName = classMap.get(currClassName);
        }
        return false;
    }

    public static boolean isChildClass(int parent, int child) {
        String p, c;
        p = numberClassMap.get(parent);
        c = numberClassMap.get(child);
        return isChildClass(p, c);
    }

    public static boolean storeReturnType(String name, Integer type) {
        if(returnTypeMap.containsKey(name)) {
            return false;
        }
        returnTypeMap.put(name, type);
        return true;
    }

    public static boolean addClassDeclaration(String name, String parent) {
        if(classMap.containsKey(name)) {
            return false;
        }
        totalClassNumber = totalClassNumber + 1;
        classMap.put(name, parent);
        classNumberMap.put(name,totalClassNumber+3);
        numberClassMap.put(totalClassNumber+3, name);
        return true;
    }

    public static boolean classExist(String name) {
        return classMap.containsKey(name);
    }

    public static boolean addVarDeclaration(String name, Integer type) {
        if(typeMap.containsKey(name)) {
            return false;
        }
        typeMap.put(name, type);
        return true;
    }
    public static Integer getVarType(String name) {
        return typeMap.get(name);
    }
    public static void publicErrorLine(int linenum, int begincharnum, int endcharnum) {
        System.err.println(rawCodes.get(linenum - 1));
        int tabcount = 0;
        for(int i = 0; i < rawCodes.get(linenum-1).length(); i++) {
            if(rawCodes.get(linenum-1).charAt(i) == '\t')
                tabcount++;
            else
                break;
        }
        int i = 0;
        for(i = 0; i < tabcount; i++)
            System.err.print('\t');
        for(; i < begincharnum; i++)
            System.err.print(' ');
        for(; i < endcharnum; i++)
            System.err.print('^');
        System.err.println();
    }
    public static void publishErrorMessage(String message) {
        hasError = true;
        System.err.println(message);
    }
    public static void main(String[] args) throws Exception {
        if(args.length < 1) {
            System.out.println("Usage: java MiniJava path/to/your/file (-c)");
            System.out.println("Have a good day :)");
            System.out.println();
            return;
        }
        String inputfilename = args[0];
        boolean cont = false;
        if(args.length > 1)
            if(args[1].equals("-c"))
                cont = true;
        // read the whole file line by line in advance
        Scanner _s = new Scanner( new FileInputStream(inputfilename) );
        while(_s.hasNextLine()) {
            rawCodes.add(_s.nextLine());
        }
        //
        FileInputStream text = new FileInputStream(inputfilename);
        ANTLRInputStream input = new ANTLRInputStream(text);
        MiniJavaLexer lexer = new MiniJavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniJavaParser parser = new MiniJavaParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new UnderlineListener());
        ParseTree tree = parser.goal();
        //
        OurMiniJavaVisitor00 v0 = new OurMiniJavaVisitor00();
        v0.visit(tree);
        if(hasError && !cont) {
            System.err.println("请解决以上问题");
            return;
        }
        //
        OurMiniJavaVisitor01 v1 = new OurMiniJavaVisitor01();
        v1.visit(tree);
        //
        if(hasError && !cont) {
            System.err.println("请解决以上问题");
            return;
        }
        //
        OurMiniJavaVisitor02 v2 = new OurMiniJavaVisitor02();
        v2.visit(tree);

        if(hasError) {
            System.err.println("请解决以上问题");
            return;
        }
        org.antlr.v4.gui.Trees.inspect(tree, parser);
    }

}
