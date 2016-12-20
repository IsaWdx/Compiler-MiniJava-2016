import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.tree.*;
import javax.swing.*;
import java.util.*;

public class DrawTree {
    public static void drawPanel(MiniJavaParser parser,ParseTree tree) {
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
