import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author anthonyjk
 * @version 6nov2020
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    private Environment sky = new Environment(0, 0, 1920, 1080, Color.BLUE);
    private Building build1 = new Building(200, 100, 300, 80, Color.GRAY);
    private Building build2 = new Building(280, 200, 200, 80, Color.GRAY);
    private Building build3 = new Building(360, 125, 275, 80, Color.GRAY);
    private Building build4 = new Building(440, 225, 175, 80, Color.GRAY);
    private Building build5 = new Building(520, 75, 325, 80, Color.GRAY);
    private Environment env1 = new Environment(0, 370, 200, 1080, Color.GREEN);
    private Environment road = new Environment(0, 390, 80, 1080, Color.LIGHT_GRAY);
    private Cloud cld1 = new Cloud(100, 60, 46, Color.WHITE);
    private Cloud cld2 = new Cloud(450, 40, 72, Color.WHITE);
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    public CityscapeComponent()
    {
        this.sky = sky;
        this.build1 = build1;
        this.build2 = build2;
        this.build3 = build3;
        this.build4 = build4;
        this.build5 = build5;
        this.env1 = env1;
        this.road = road;
        this.cld1 = cld1;
        this.cld2 = cld2;
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     * 
     * @param g a reference to the Graphics object used for all drawing operations
     *
     */
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        this.sky.draw(g2);
        this.cld1.draw(g2);
        this.cld2.draw(g2);
        this.build1.draw(g2);
        this.build2.draw(g2);
        this.build3.draw(g2);
        this.build4.draw(g2);
        this.build5.draw(g2);
        this.env1.draw(g2);
        this.road.draw(g2);
    }
    
    public void movingClouds()
    {
        double incrementX1 = this.cld1.getX();
        double incrementX2 = this.cld2.getX();
        incrementX1 += 5;
        incrementX2 += 5;
        this.cld1.setX(incrementX1);
        this.cld2.setX(incrementX2);
    }
    
    public void repaint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        this.sky.draw(g2);
        this.cld1.draw(g2);
        this.cld2.draw(g2);
        this.build1.draw(g2);
        this.build2.draw(g2);
        this.build3.draw(g2);
        this.build4.draw(g2);
        this.build5.draw(g2);
        this.env1.draw(g2);
        this.road.draw(g2);
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when
     *      they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        movingClouds();
        repaint();
    }

}
