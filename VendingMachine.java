/**
 * Write a description of class VendingMachine here.
 *
 * @author anthonyjk
 * @version 21oct2020
 */
public class VendingMachine
{
    private int canAmt;
    private int coins;
    
    /**
     * Default Constructor for objects of class VendingMachine
     */
    public VendingMachine()
    {
        this.canAmt = 10;
        this.coins = 0;
    }
    
    /**
     * Constructor for objects of class VendingMachine
     * @param canAmount takes in int for set amount of cans already in the machine
     */
    public VendingMachine(int canAmount)
    {
        this.canAmt = canAmount;
        this.coins = 0;
    }
    
    /**
     * Restocks vending machine with cans
     * @param newCans takes in int for amount of cans being added to vending machine
     */
    public void restock(int newCans)
    {
        this.canAmt += newCans;
    }
    
    /**
     * Gets current amount of cans in vending machine
     */
    public int getCanCount()
    {
        return this.canAmt;
    }
    
    /**
     * Inserts a coin to buy a can from the vending machine
     * @param coinInsert takes in int for amount of coins inserted
     */
    public void insertCoin(int coinInsert)
    {
        this.coins += coinInsert;
        this.canAmt -= coinInsert;
    }
    
    /**
     * Returns amount of coins
     */
    public int getCoinCount()
    {
        return this.coins;
    }
}
