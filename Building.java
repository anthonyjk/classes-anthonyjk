import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
/**
 * Write a description of class Building here.
 *
 * @author anthonyjk
 * @version 11nov2020
 */
public class Building
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private double height;
    private double width;
    private Color color;

    /**
     * Creates a building in the specified coordinates
     * @param initX The X coordinate
     * @param initY The Y coordinate
     * @param initH The height of the building
     * @param initW The width of the building
     */
    public Building(int initX, int initY, double initH, double initW, Color initC)
    {
        this.x = initX;
        this.y = initY;
        this.height = initH;
        this.width = initW;
        this.color = initC;
    }
    
    /**
     * Gets X Coordinate Value
     */
    public int getX()
    {
        return this.x;
    }
    
    /**
     * Sets a new X Coordinate Value
     * @param newX New X Value
     */
    public void setX(int newX)
    {
        this.x = newX;
    }
    
    /**
     * Gets Y Coordinate Value
     */
    public int getY()
    {
        return this.y;
    }
    
    /**
     * Sets a new Y Coordinate Value
     * @param newY New Y Value
     */
    public void setY(int newY)
    {
        this.y = newY;
    }
    
    /**
     * Gets the height value
     */
    public double getHeight()
    {
        return this.height;
    }
    
    /**
     * Sets a new height value
     * @param newHeight new Height value
     */
    public void setHeight(double newHeight)
    {
        this.height = newHeight;
    }
    
    /**
     * Gets the width value
     */
    public double getWidth()
    {
        return this.width;
    }
    
    /**
     * Sets a new width value
     * @param newWidth new Width value
     */
    public void setWidth(double newWidth)
    {
        this.width = newWidth;
    }
    
    /**
     * Gets the Color value
     */
    public Color getColor()
    {
        return this.color;
    }
    
    /**
     * Sets a new Color value
     * @param newColor New color value
     */
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
        Rectangle2D.Double build = new Rectangle2D.Double(this.x, this.y, this.width, this.height);
        
        g.setPaint(this.color);
        g.draw(build);
        g.fill(build);
    }
}
