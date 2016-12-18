import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.swing.*;
import java.io.FileInputStream;
import java.util.*;

public class DrawTree {
    private static boolean hasError = false;
    private static Map<String, Integer> typeMap = new HashMap<String, Integer>();
    private static Set<String> classSet = new HashSet<String>();
    private static List<String> rawCodes = new ArrayList<String>();

    public static boolean addClassDeclaration(String name) {
        if(classSet.contains(name)) {
            return false;
        }
        classSet.add(name);
        return true;
    }

    public static boolean classExist(String name) {
        return classSet.contains(name);
    }

    public static boolean addVarDeclaration(String name, Integer type) {
        if(typeMap.containsKey(name)) {
            return false;
        }
        typeMap.put(name, type);
        return true;
    }

    public static void publicErrorLine(int linenum, int begincharnum, int endcharnum) {
        System.out.println(rawCodes.get(linenum-1));
        int tabcount = 0;
        for(int i = 0; i < rawCodes.get(linenum-1).length(); i++) {
            if(rawCodes.get(linenum-1).charAt(i) == '\t')
                tabcount++;
            else
                break;
        }
        int i = 0;
        for(i = 0; i < tabcount; i++)
            System.out.print('\t');
        for(; i < begincharnum; i++)
            System.out.print(' ');
        for(; i < endcharnum; i++)
            System.out.print('^');
        System.out.println();
    }

    public static void publishErrorMessage(String message) {
        hasError = true;
        System.err.println(message);
    }

    public static void main(String[] args) throws Exception {
        //String inputfilename = "/Users/xuan/Documents/Compiler-MiniJava-2016/binarysearch.txt";
        String inputfilename = "/Users/xuan/Documents/Compiler-MiniJava-2016/bubblesort.txt";
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
        
        if(hasError) {
            System.err.println("在执行后续步骤前，请先解决以上错误。");
            return;
        }
        //
        OurMiniJavaVisitor02 v2 = new OurMiniJavaVisitor02();
        v2.visit(tree);
        
        if(hasError) {
            System.err.println("在执行后续步骤前，请先解决以上错误。");
            return;
        }
        //
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.setScale(1);
        panel.add(viewer);
        JScrollPane scrPane = new JScrollPane(panel);
        frame.add(scrPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500,500);
        frame.setVisible(true);
    }
}
