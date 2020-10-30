import java.util.Scanner;
/**
 * Write a description of class DistanceConverter here.
 *
 * @author anthonyjk
 * @version 30oct2020
 */

public class DistanceConverter
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter the number of yards to be converted to feet and inches: ");
      
      final int YARDS_TO_FEET = 3;
      final int FEET_TO_INCHES = 12;
      
      double yards = s.nextDouble();
      double feet = yards * YARDS_TO_FEET;
      double inches = feet * FEET_TO_INCHES;

      System.out.println(yards + " yards are " + feet + " feet");
      System.out.println(yards + " yards are " + inches + " inches");
   }
}