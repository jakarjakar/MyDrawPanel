package one;

 //@date Sep 23, 2016
 //@author Artsiom_Berazavik

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Implement394PageExample extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);    
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Graphics Program");
        frame.getContentPane().add(new Implement394PageExample(), BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}