package mydrawpanel;
 //@date Sep 23, 2016
 //@author Artsiom_Berazavi
import javax.swing.JFrame;

public class MyFrame {
        public void CreateFrame () {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}
