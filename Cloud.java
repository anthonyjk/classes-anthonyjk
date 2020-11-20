import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
/**
 * Write a description of class Cloud here.
 *
 * @author anthonyjk
 * @version 20nov2020
 */
public class Cloud
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private double size;
    private Color color;

    /**
     * Creates a building in the specified coordinates
     * @param initX The X coordinate
     * @param initY The Y coordinate
     * 
     */
    public Cloud(int initX, int initY, double initS, Color initC)
    {
        this.x = initX;
        this.y = initY;
        this.size = initS;
        this.color = initC;
    }
    
    /**
     * Draws the building.
     * @param g The graphics context
     */
    public void draw(Graphics2D g) 
    {
        //Ellipse2D
        
        g.setPaint(this.color);
        g.draw(cloud);
        g.fill(cloud);
    }
}
