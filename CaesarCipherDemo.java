import java.util.Scanner;

/**
 * Demonstrates the CaesarCipher class
 *
 * @author gcschmit
 * @version 21 September 2018
 */
public class CaesarCipherDemo
{
    public static void main(String[] args)
    {
        /*
         * A scanner object parses primitive types and Strings from a stream.
         * 
         * A stream is a sequence of characters from a file, String, terminal,
         *    network connection, etc.
         *    
         * Parsing is separating a sequence of characters into tokens based on
         *    delimiters.
         *    A token is a meaningfly sequence of characters (e.g., word).
         *    Delimiters are characters that separate tokens
         *        (by default, white space is the delimiter).
         * 
         * When we create a scanner object, we have to specify the input stream
         *    (e.g., System.in which is the keyboard via the terminal).
         */
        Scanner s = new Scanner(System.in);
        
        /*
         * Best practices
         *    1. prompt the user for what you want them to input
         *    2. use print instead println
         *      such that the cursor is at the end of the prompt and not on a new line
         *    3. leave a space after the prompt.
         */
        System.out.print("Enter the text to encrypt: ");
        
        /*
         * The nextLine method returns all characters up to the end of the larget
         *   (i.e., where the user typed enter).
         */
        String text = s.nextLine();
        text = text.toUpperCase();
        
        System.out.print("Enter the keyphrase (no spaces): ");
        
        /*
         * The next method returns the next token in the stream as a string
         */
        String keyphrase = s.next();
        keyphrase = keyphrase.toUpperCase();
        
        //CaesarCipher cipher = new CaesarCipher(keyphrase);
        
        System.out.print("Enter the number of seconds to test a guessed keyphrase: ");
        
        /*
         * The next int method attempts to convert the next token in the stream to an int
         *    and returns the value. If the next token cannot be converted an
         *    exception is granted
         */
        int secondsPerGuess = s.nextInt();
        //String complexityDesc = cipher.getComplexityDescription(secondsPerGuess);
        //System.out.println("Complexity: " + complexityDesc);
        
        //String encryptedText = cipher.encrypt(text);
        //System.out.println("Encrypted: " + encryptedText);
    }
}