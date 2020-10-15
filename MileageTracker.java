
/**
 * This class models a mileage tracker for a car.
 *
 * @author anthonyjk
 * @version October 6th 2020
 */
public class MileageTracker
{
    /*
     * 2. Define the instance variables (store the object's attributes):
     *  Specify the visibility (e.g., private)
     *     public: accessible by any code in any class
     *     private: only accessible by methods in this class
     *  specify the type (e.g. double)
     *  specify the name (e.g. milesDriven)
     *  
     *  Instance variables differ from local variables in the follow ways:
     *  scoped to the class (accessible in all methods of the class:
     *      Lifetime is the same as the object)
     *  automatically initalized to a default value (0, false, null)
     *  best practice is not to immediately initialize instance variables
     */
    
    private double milesDriven; // miles
    private double fuelConsumed; // gallons
    private String vin; // Vehicle indefictation number
    
    /*
     * 3. Define the constructor(s):
     *    Responsible for initalizing newly created objects
     *    invoked automatically via the new operator
     *    name of the constructor must match the name of the class
     *    has no return type (not even void)
     *    multiple constructors maybe defined for a class
     *    one constructor may call another constructor (With restrictions)
     */ 
    
    /**
     * Default contstructor for the MileageTracker class.
     *    Initalizes this the miles driven and fuel consumed to 0
     *        and the VIN to null.
     */
    public MileageTracker()
    {
        /*
         * The 'this' reserved word references the current object (like self in python)
         * 
         * its usage is encourged but not always required
         * 
         */
        
        this.milesDriven = 0;
        this.fuelConsumed = 0;
        this.vin = null;
    }
    
    /**
     * Constructs a new MileageTracker object with the specificed miles driven and fuel consumed.
     * 
     * @param initalMilesDriven the number of miles already driven
     * @param initalFuelConsumed the number of gallons of fuel aalready consumed
     */
    public MileageTracker(double initalMilesDriven, double initalFuelConsumed)
    {
        this.milesDriven = initalMilesDriven;
        this.fuelConsumed = initalFuelConsumed;
        this.vin = null;
    }
    /*
     * 1. Define methods by specifying:
     *  The visibility (e.g., public)
     *  The return type (e.g., void)
     *  The method name (e.g., incrementMilesDriven)
     *  The parameters and their types (e.g., miles of type double)
     */
    
    /**
     * Increment the number of miles that car has driven.
     * 
     * @param miles the additiona distance, in miles, this car has driven
     */
    public void incrementMilesDriven(double miles)
    {
        this.milesDriven += miles;
    }
    
    /**
     * Returns the total number of miles driven
     * 
     * @return the total number of miles driven
     */
    public double getMilesDriven()
    {
        return this.milesDriven;
    }
    
    /**
     * Increment the number of gallons of fuel that this car has consumed
     * 
     * @param gallons    the additional fuel, in gallons, this car has consumed
     */
    public void incrementFuelConsumed(double gallons)
    {
        this.fuelConsumed += gallons;
    }
    
    /**
     * Returns the total number of gallons of fuel consumed
     * 
     * @return the total number of gallons of fuel consumed
     */
    public double getFuelConsumed()
    {
        return this.fuelConsumed;
    }
    
    /**
     * Returns the current mileage, in miles per gallon
     * 
     * @return the current mileage, in miles per gallon
     */
    public double getMileage()
    {
        return this.milesDriven / this.fuelConsumed;
    }
    
    /**
     * Returns the vehicle identification (VIN) of this car.
     * 
     * @return the vehicle identification (VIN) of this car
     */
    public String getVIN()
    {
        return this.vin;
    }
    
    /**
     * Sets the vehicle identification (VIN) of this car.
     * 
     * @param newVIN    the vehicle identification (VIN) of this car
     */
    public void setVIN(String newVin)
    {
        /*
         * If the parameter was named vin, it would "shadow" the instance variable vin.
         * 
         * Local and parameter variables "shadow" instance variables of the same name.
         *   In this code, vin would refer to the parameter and not the instance variable.
         *   
         *   To refer explicity to an instance variable, use "this".
         *   Advice: avoid this issue by giving local parameter, and instance variables unique names!
         */
        
        vin = newVin;
    }
}






