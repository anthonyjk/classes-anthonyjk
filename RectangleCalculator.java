import java.lang.Math; 
import java.util.Scanner; 
/**
 * Write a description of class RectangleCalculator here.
 *
 * @author anthonyjk
 * @version 6nov2020
 */
public class RectangleCalculator
{
    private double height;
    private double width;
    /**
     * Constructor for objects of class RectangleCalculator
     */
    public RectangleCalculator(double h, double w)
    {
        this.height = h;
        this.width = w;
    }
    
    public double getArea()
    {
        double area = this.height * this.width;
        return area;
    }
    
    public double getPerimeter()
    {
        double perimeter = this.height*2 + this.width*2;
        return perimeter;
    }
    
    public double getDiagonalLength()
    {
        double diagonalLength = Math.pow(this.height, 2) + Math.pow(this.width, 2);
        diagonalLength = Math.sqrt(diagonalLength);
        return diagonalLength;
    }
    
    public String toString()
    {
        return "Height: " + this.height + ", Width: " + this.width + ", Area: " + getArea() + ", Perimeter: " + getPerimeter() + ", Diagonal Length: " + getDiagonalLength();
    }
    
    public static void Main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Insert Rectangle Height: ");
       int hei = sc.nextInt();
       System.out.print("\nInsert Rectangle Width: ");
       int wid = sc.nextInt();
       
       RectangleCalculator recCalc = new RectangleCalculator(hei, wid);
       System.out.println("\n"+recCalc);
    }
}
