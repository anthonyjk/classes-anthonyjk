import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class VendingMachineTest.
 *
 * @author  anthonyjk
 * @version 21oct2020
 */
public class VendingMachineTest
{
    /**
     * Default constructor for test class VendingMachineTest
     */
    public VendingMachineTest()
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
    public void testInsertCoin()
    {
        VendingMachine vendM1 = new VendingMachine();
        VendingMachine vendM2 = new VendingMachine(6);
        vendM1.insertCoin(2);
        int amount = vendM1.getCoinCount();
        
        assertEquals(2, amount);
        
        vendM2.insertCoin(7);
        amount = vendM2.getCoinCount();
        
        assertEquals(7, amount);
    }
    
    @Test
    public void testRestock()
    {
        VendingMachine vendM1 = new VendingMachine();
        VendingMachine vendM2 = new VendingMachine(6);
        vendM1.restock(12);
        int amount = vendM1.getCanCount();
        
        assertEquals(22, amount);
        
        vendM2.restock(7);
        amount = vendM2.getCanCount();
        
        assertEquals(13, amount);
    }
}
