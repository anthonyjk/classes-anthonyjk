/**
 * Write a description of class Door here.
 *
 * @author anthony & max
 * @version oct162020
 */
public class Door
{
   private boolean isOpen;
   private String name;
   
   /**
    * Creates a door object
    */
   public Door(boolean ooc, String doorName)
   {
       this.isOpen = ooc;
       this.name = doorName;
   }
   
   /**
    * Sets door state to closed
    */
   public void close()
   {
       this.isOpen = false;
   }
   
   /**
    * Sets door state to open
    */
   public void open()
   {
       this.isOpen = true;
   }
   
    /**
    * Sets door name
    */
   public void setName(String newName)
   {
       this.name = newName;
   }
   
    /**
    * Returns name
    */
   public String getName()
   {
       return this.name;
   }
   
   /**
    * Returns open state
    */
   public boolean getIsOpen()
   {
       return this.isOpen;
   }
}
