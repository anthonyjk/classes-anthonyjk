
/**
 * Write a description of class MilkJarCalculator here.
 *
 * @author anthonyjk
 * @version 30oct2020
 */
public class MilkJarCalculator
{
   public static void main(String[] args)
   {
      double milk = 5.5; // gallons
      double jarCapacity = 0.75; // gallons
      int completelyFilledJars = (int)(milk / jarCapacity);
      
      System.out.println(completelyFilledJars);
   }
}
