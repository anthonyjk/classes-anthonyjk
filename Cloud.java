import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.util.Random;
/**
 * Write a description of class Cloud here.
 *
 * @author anthonyjk
 * @version 20nov2020
 */
public class Cloud
{
    // instance variables - replace the example below with your own
    private double x;
    private double y;
    private double size;
    private Color color;

    /**
     * Creates a building in the specified coordinates
     * @param initX The X coordinate
     * @param initY The Y coordinate
     * 
     */
    public Cloud(double initX, double initY, double initS, Color initC)
    {
        this.x = initX;
        this.y = initY;
        this.size = initS;
        this.color = initC;
    }
    
    public double getX()
    {
        return this.x;
    }
    
    public void setX(double newX)
    {
        this.x = newX;
    }
    
    public double getY()
    {
        return this.y;
    }
    
    public void sety(double newY)
    {
        this.y = newY;
    }
    
    public double getSize()
    {
        return this.size;
    }
    
    public void setSize(double newSize)
    {
        this.size = newSize;
    }
    
    public Color getColor()
    {
        return this.color;
    }
    
    public void setColor(Color newColor)
    {
        this.color = newColor;
    }
    
    /**
     * Draws the building.
     * @param g The graphics context
     */
    public void draw(Graphics2D g) 
    {
        Ellipse2D cloud1 = new Ellipse2D.Double(this.x, this.y, this.size, this.size);
        Ellipse2D cloud2 = new Ellipse2D.Double(this.x - (this.size/5), this.y + (this.size/5), this.size + 4, this.size + 7);
        Ellipse2D cloud3 = new Ellipse2D.Double(this.x + (this.size/5), this.y - (this.size/5), this.size - 14, this.size - 14);
        Ellipse2D cloud4 = new Ellipse2D.Double(this.x + (this.size/5), this.y + (this.size/5), this.size - 7, this.size - 7);
        Ellipse2D cloud5 = new Ellipse2D.Double(this.x + (this.size/5), this.y - (this.size/5), this.size + 23, this.size + 14);
        
        g.setPaint(this.color);
        g.draw(cloud1);
        g.fill(cloud1);
        g.draw(cloud2);
        g.fill(cloud2);
        g.draw(cloud3);
        g.fill(cloud3);
        g.draw(cloud4);
        g.fill(cloud4);
        g.draw(cloud5);
        g.fill(cloud5);
    }
}
