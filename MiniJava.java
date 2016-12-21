import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.swing.*;
import java.io.FileInputStream;
import java.util.*;

public class MiniJava {
    //TODO: ��麯��main�ǲ��Ǳ������ط������ˣ��ǲ������������Ӵ�ĺ����ҽ�main
    private static boolean hasError = false;
    private static Map<String, Integer> typeMap = new HashMap<String, Integer>();
    private static Map<String, String> varTypeMap = new HashMap<String, String>();//���ܳ���class��ʱ�򶼵ô�
    public static Map<String, String> returnTypeMap = new HashMap<String, String>();//��Ӧ�������洢name�����õ�ʱ���Ҳ�������ֵ�� ��˸�������
    public static Map<String, String> methodPureNameMap = new HashMap<String, String>();//methodPurename ���� MethodSignature, ��������������Ӱ�
    // TODO: �������������صĻ� ������
    public static Map<String, Integer> returnTypeIntMap = new HashMap<String, Integer>();
    public static Map<String, String> classMap = new HashMap<String, String>();
    public static Map<Integer,String> numberClassMap = new HashMap<Integer, String>();//��class��identifier��Ŵ�����
    public static Map<String, Integer> classNumberMap = new HashMap<String, Integer>();
    //��identifier�ұ�ţ������ɱ����identifier���ؼ�����Ϊ֮ǰ��������integer�� >=4�Ķ���class��identifier
    public static Integer totalClassNumber = 0;
    //TODO: How to check duplicate in different scope
    private static List<String> rawCodes = new ArrayList<String>();
    public static boolean storeVarType(String name, String type) {
        if(varTypeMap.containsKey(name)) {
            return false;
        }
        varTypeMap.put(name, type);
        return true;
    }

    public static boolean storeReturnType(String name, String type, String purename) {
        if(returnTypeMap.containsKey(name)) {
            return false;
        }
        //System.out.println(name+" type "+type);
        returnTypeMap.put(name, type);
        Integer typeint = -1;
        switch (type){
            case "int": typeint = OurConstants.intType;break;
            case "int[]": typeint = OurConstants.arrayType;break;
            case "boolean": typeint = OurConstants.booleanType;break;
            //no OurConstants.identifierType here
        }
        methodPureNameMap.put(purename, name);
        //System.out.println("name: "+name);
        returnTypeIntMap.put(name, typeint);
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
        //String inputfilename = "/Users/xuan/Documents/Compiler-MiniJava-2016/binarysearch.txt";
        String inputfilename = "D:\\Study\\Coursera\\scala\\compiler\\src\\bubblesort.txt";
        //String inputfilename = "/Users/xuan/Documents/Compiler-MiniJava-2016/bubblesort.txt";
        // read the whole file line by line in advance
        Scanner _s = new Scanner( new FileInputStream(inputfilename) );
        while(_s.hasNextLine()) {
            rawCodes.add(_s.nextLine());
        }
        //
        //FileInputStream text = new FileInputStream("D:\\Study\\compiler\\src\\Factorial.txt");
        FileInputStream text = new FileInputStream(inputfilename);
        ANTLRInputStream input = new ANTLRInputStream(text);
        MiniJavaLexer lexer = new MiniJavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniJavaParser parser = new MiniJavaParser(tokens);
        ParseTree tree = parser.goal();
        //
        OurMiniJavaVisitor01 v1 = new OurMiniJavaVisitor01();
        v1.visit(tree);
        //
        if(hasError) {
            System.err.println("Please solve the above problems first");
            return;
        }
        //
        OurMiniJavaVisitor02 v2 = new OurMiniJavaVisitor02();
        v2.visit(tree);

        if(hasError) {
            System.err.println("Please solve the above problems first");
            return;
        }
       // DrawTree.drawPanel(parser, tree);
        //if (args.length > 0 && args[0].equals("-gui"))
        org.antlr.v4.gui.Trees.inspect(tree, parser);
    }

}