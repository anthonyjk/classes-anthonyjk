import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
 * Write a description of class TargetComponent here.
 *
 * @author anthonyjk
 * @version 28oct2020
 */
public class TargetComponent extends JComponent
{
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Target tar = new Target(0, 0);
        
        int x = this.getWidth();
        int y = this.getHeight();
        
        tar.draw(g2);
    }
}
