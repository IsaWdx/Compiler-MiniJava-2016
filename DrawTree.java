import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.swing.*;
import java.io.FileInputStream;
import java.util.*;

public class DrawTree {
    private static boolean hasError = false;
    private static Map<String, Integer> typeMap = new HashMap<String, Integer>();

    public static boolean addVarDeclaration(String name, Integer type) {
        if(typeMap.containsKey(name)) {
            return false;
        }
        typeMap.put(name, type);
        return true;
    }

    public static void publishErrorMessage(String message) {
        hasError = true;
        System.err.println(message);
    }

    public static void main(String[] args) throws Exception {
        //FileInputStream text = new FileInputStream("D:\\Study\\compiler\\src\\Factorial.txt");
        FileInputStream text = new FileInputStream("/Users/xuan/Documents/Compiler-MiniJava-2016/binarysearch.txt");
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
