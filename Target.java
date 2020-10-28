import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
/**
 * Write a description of class Target here.
 *
 * @author anthonyjk
 * @version 28oct2020
 */
public class Target
{
    private int xLeft;
    private int yTop;

    /**
     * Creates a target in the top left corner.
     * @param initX The X coordinate from the top left corner
     * @param initY The Y coordinate from the top left corner
     */
    public Target(int initX, int initY)
    {
        this.xLeft = initX;
        this.yTop = initY;
    }
    
    /**
     * Draws the target.
     * @param g2 The graphics context
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double firstLayer = new Ellipse2D.Double(this.xLeft + 50, this.yTop + 50, 10, 10);
        Ellipse2D.Double secondLayer = new Ellipse2D.Double(this.xLeft + 45, this.yTop + 45, 20, 20);
        Ellipse2D.Double thirdLayer = new Ellipse2D.Double(this.xLeft + 40, this.yTop + 40, 30, 30);
        Ellipse2D.Double fourthLayer = new Ellipse2D.Double(this.xLeft + 35, this.yTop + 35, 40, 40);
        Ellipse2D.Double fifthLayer = new Ellipse2D.Double(this.xLeft + 30, this.yTop + 50, 50, 20);
        
        g2.setPaint(Color.WHITE);
        g2.draw(fifthLayer);
        g2.fill(fifthLayer);
        g2.setPaint(Color.BLACK);
        g2.draw(fourthLayer);
        g2.fill(fourthLayer);
        g2.setPaint(Color.WHITE);
        g2.draw(thirdLayer);
        g2.fill(thirdLayer);
        g2.setPaint(Color.BLACK);
        g2.draw(secondLayer);
        g2.fill(secondLayer);
        g2.setPaint(Color.WHITE);
        g2.draw(firstLayer);
        g2.fill(firstLayer);
    }
}
