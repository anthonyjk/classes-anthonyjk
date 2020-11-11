import java.util.Scanner;
/**
 * Write a description of class StringParsing here.
 *
 * @author anthonyjk
 * @version 6nov2020
 */
public class StringParsing
{
    public StringParsing()
    {
        // initialise instance variables
    }
    
    public static void Main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer between 1,000 and 999,999: ");
        String userIn = sc.nextLine();
        System.out.println(userIn.substring(userIn.length() - 3, userIn.indexOf(",") + userIn.length() - 1));
    }
}
