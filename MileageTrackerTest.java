

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MileageTrackerTest.
 *
 * @author  anthonyjk
 * @version 13oct2020
 */
public class MileageTrackerTest
{
    /**
     * Default constructor for test class MileageTrackerTest
     */
    public MileageTrackerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testIncrementMilesDriven()
    {
        MileageTracker testTracker = new MileageTracker();
        testTracker.incrementMilesDriven(10);
        double amount = testTracker.getMilesDriven();
        
        /*
         * The assertEquals method verifies that the expected value is equal to the actual (returned)
         *   value. If not, the test fails.
         * Specify the expected value first and the actual value second.
         * For values of type double (only for doubles), specify a third value which is the epsilon
         *   (i.e., how close is close enough to be equal).
         */
        
        assertEquals(10, amount, 1e-6); // 1 * 10^-6
        
        testTracker.incrementMilesDriven(5);
        amount = testTracker.getMilesDriven();
        assertEquals(15, amount, 1e-6);
    }
    
    @Test
    public void testIncrementFuelConsumed()
    {
        MileageTracker testTracker = new MileageTracker();
        testTracker.incrementFuelConsumed(2.5);
        double amount = testTracker.getFuelConsumed();
        assertEquals(2.5, amount, 1e-6);
        
        testTracker.incrementFuelConsumed(0.5);
        amount = testTracker.getFuelConsumed();
        assertEquals(3.0, amount, 1e-6);
    }
    
    @Test
    public void testGetMileage()
    {
        MileageTracker testTracker = new MileageTracker();
        testTracker.incrementMilesDriven(100);
        testTracker.incrementFuelConsumed(4);
        
        double mileage = testTracker.getMileage();
        assertEquals(25.0, mileage, 1e-6);
    }
    
    @Test
    public void testSetVIN()
    {
        MileageTracker testTracker = new MileageTracker();
        String vin = new String("GEKOGJ9GEJIG353");
        testTracker.setVIN(vin);
        String returnedVIN = testTracker.getVIN();
        assertEquals(vin, returnedVIN);
    }
}
