/**
 * Write a description of class Letter here.
 *
 * @author anthonyjk
 * @version 23oct2020
 */
public class Letter
{
    private String from;
    private String to;
    private String body;
    private String letter;
    /**
     * Letter constructor
     * @param from String that states who the letter is from
     * @param to String that states who the letter is to
     */
    public Letter(String from, String to)
    {
        this.from = from;
        this.to = to;
        this.body = "";
        this.letter = "";
    }

    /**
     * Adds a line to the letter
     * @param line String of text that gets added to the letter
     */
    public void addLine(String line)
    {
        this.body += (line + "\n");
    }
    
    /**
     * Returns the text in the letter
     */
    public String getText()
    {
        return this.body;
    }
    
    /**
     * Completes the letter
     */
    public String printer()
    {
        this.letter += ("Dear ").concat(this.to).concat(",\n\n");
        this.letter += (this.body).concat("\n");
        this.letter += ("Sincerely,").concat("\n\n").concat(this.from);
        
        return this.letter;
    }
    
    static void Main(String[] args)
    {
        Letter let = new Letter("Mary", "John");
        let.addLine("I am sorry we must part.");
        let.addLine("I wish you all the best.");
       
        System.out.println(let.printer());
    }
}
