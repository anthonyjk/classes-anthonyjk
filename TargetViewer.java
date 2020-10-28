import javax.swing.JFrame;
/**
 * Write a description of class TargetViewer here.
 *
 * @author anthonyjk
 * @version 28october2020
 */
public class TargetViewer
{
    public static void Main(String[] args)
    {
        JFrame frame = new JFrame(); //frame object
        
        frame.setSize(300, 400); //frame size
        frame.setTitle("Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponent comp = new TargetComponent();
        
        frame.add(comp);
        
        frame.setVisible(true);
    }
}
