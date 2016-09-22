//@Date Sep 21, 2016
//@author Artsiom_Berazavik
import java.awt.*;
import javax.swing.*;


public class MyDrawPanel extends JPanel {
    JPanel newPanel = new JPanel();
    
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillRect(20, 50, 100, 100);
    }
    
    public static void main(String[] args) {
        
    }
}
