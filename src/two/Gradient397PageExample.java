package two;
 //@date Sep 23, 2016
 //@author Artsiom_Berazavi
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Gradient397PageExample extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150,150, Color.orange);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    }
}
