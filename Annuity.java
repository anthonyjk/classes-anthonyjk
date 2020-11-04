
/**
 * Write a description of class Annuity here.
 *
 * @author anthonyjk
 * @version 4nov2020
 */
public class Annuity
{
    private static double pmt;
    private static double i;
    private static int n;
    
    public static double calcPresentValue(double pmt, double i, int n)
    {
        double pvann = pmt * ((Math.pow(1+i, n-1)-1)/i/(Math.pow(1+i, n-1))+1);
        
        return pvann;
    }
}
