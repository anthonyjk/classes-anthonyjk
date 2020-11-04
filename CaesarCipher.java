
import java.util.Scanner;

/**
 * This class encrypts strings with a keyphrase version of the classic
 *      Caesar Cipher.
 *      (as described in The Code Book by Simon Singh)
 *
 * @author gcschmit
 * @version 21 September 2018
 */
public class CaesarCipher
{
    /*
     * static: one value of the variable for all objects of the class
     *   Like class attributes in Python.
     *   Static class variables can be accessed directly through the class
     *       (e.g., CaesarCipher.ALPHABET, Math.PI, Color.RED).
     *       
     * String literal: 
     *   An instances of the String class (not a primitives) delinated by double quotes and
     *      must be defined on a single line
     * "ABCDEFGHIJKLMNOPQRSTUVWXYZ" is a string literal equivalent to:
     *      new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
     */
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    private String keyphrase;
    
    public CaesarCipher(String initialKeyphrase)
    {
        //prepare the keyphrase by removing duplicate letters
        this.compressKeyphrase(initialKeyphrase);
        
    }
    /**
     * Returns a string that describes the average time to crack the cipher,
     *    in several formats, based on the specificed number of seconds per guess.
     *    
     * @param secPerGuess the number of seconds to evaluate each attempt
     * @return a string that describes the average time to crack the cipher
     */
    public String getComplexityDescription(int secPerGuess)
    {
        /*
         * Instead of using a "magic number" use constants defined by us
         *   or the Java Standard Library. For example, in the Math class is defined:
         *   
         *   public static final double PI = 3.141592654;
         *   
         * Declare a constant with the final keyword.
         *   By convention, constants are in all caps with underscores.
         */
        
        final int SECONDS_FOR_EVERY_MINUTE = 60;
        final int MINUTES_FOR_EVERY_HOUR = 60;
        final int HOURS_FOR_EVERY_DAY = 24;
        final int DAYS_FOR_EVERY_YEAR = 365;
        
        //if we try to change the value a compiler error will be generated
        //SECONDS_FOR_EVERY_MINUTE = 30; <-- gives an error
        
        String desc = "";
        
        long totalSeconds = this.calculateAverageTimeToCrack(secPerGuess);
        
        
        return "";
    }
    
    /**
     * Compresses the specified keyphrase by removing all duplicate letters.
     * 
     * @param keyphrase the keyphrase to compress
     */
    public void compressKeyphrase(String keyphrase){
        this.keyphrase = "";
        
        /*
         * length
         *    returns the number of characters in a string
         */
        int keyphraseLength = keyphrase.length();
        
        for(int i = 0; i < keyphraseLength; i++)
        {
            /*
             * charAt
             *      returns the character (of type char) at the specified index (0-based)
             *      
             * keyphrase
             * C A E S A R
             * 0 1 2 3 4 5      <= indicies
             * 
             * length = 6
             */
            char letter = keyphrase.charAt(i);
            
            /*
             * substring
             *      returns part of the string starting at the first specified index
             *          up to, but no including, the second specified index
             *      if only one index is specified, returns part of the string starting
             *          at the specified index through the end of the string
             *      substring does not support negative indicies
             *          for example, instead of -2 we would specify
             *              keyphrase.length() - 2.
             */
            String restOfKeyphrase = keyphrase.substring(i+1);
            // same as: keyphrase.substring(i + 1, keyphrase.length());
            
            /*
             * indexOf
             *      returns the index of the start of the first occurrence of the
             *          specified string
             *      if not found, returns -1
             * 
             * restOfKeyphrase;
             * A E S A R
             * 0 1 2 3 4   <= indicies
             * 
             * length = 5
             */
            int index = restOfKeyphrase.indexOf(letter);
            
            /*
             * String concatenation
             *      + is the string concatenation operator
             *      concatenates the second String operand to the end of the first
             *          String operand
             *      if one or both operands are a String type, + is the string
             *          concatenation operator (operands are converted to String
             *          objects); otherwise, + is the addition operator
             *          
             * int x = 7;
             * String xAsString = "" + x; // xAsString => "7"
             */
            if(index == -1) // if the letter is not a duplicate
            {
                this.keyphrase = this.keyphrase + letter;
                // same as: this.keyphrase += letter;
            }
        }
    }
    
    /**
     * Encrypts the specified text using the specified keyphrase using a
     *      keyphrase-enhanced Caesar Cipher.
     *      
     *  @param  text        the text to encrypt
     *  @param  keyphrase   the keyphrase with which to encrypt the specified text
     *  @return             the encrypted text
     */
    public String encrypt(String text)
    {
        String encryptedText = "";

        /*
         * The keyphrase, after removing any repeated letters is used as the beginning of the
         *      jumbled cipher alphabet. The remainder of the cipher alphabet is merely the
         *      remaining letters of the alphabet, in their correct order, starting where the
         *      keyphrase ends.
         */
        String cipherAlphabet = this.keyphrase;
        for(int i = 0; i < CaesarCipher.ALPHABET.length(); i++)
        {
            char letter = CaesarCipher.ALPHABET.charAt(i);
            if(this.keyphrase.indexOf(letter) == -1)
            {
                cipherAlphabet += letter;
            }
        }

        /*
         * For each letter in the text that is a letter, find the corresponding letter
         *      at the same position in the cipher alphabet as its replacement.
         */
        for(int i = 0; i < text.length(); i++)
        {
            char letter = text.charAt(i);

            // if the letter is between A and Z
            if(letter >= 'A' && letter <= 'Z')
            {
                // 65 is the ASCII value of 'A'
                int cipherIndex = letter - 65;
                encryptedText += cipherAlphabet.charAt(cipherIndex);
            }
            else    // don't substitute the letter; just use it as is
            {
                encryptedText += letter;
            }
        }

        return encryptedText;
    }

    /**
     * Calcualtes the average time to crack the cipher, based on the
     *      specified length of the keyphrase and seconds to evaluate
     *      each attempt, using a brute force approach. This calculation
     *      assumes that the cracker knows the length of the keyphrase.
     *      If the length is not know, it will take substantially longer
     *      to crack the cipher. Regardless, this calculation is only
     *      for a brute force approach; other techniques (e.g., frequency
     *      analysis) can crack the cipher extremely quickly.
     *      
     *  @param  keyphraseLength the number of characters in the keyphrase
     *  @param  secPerGuess     the number of seconds to evaluate each attempt
     *  @return                 the average number of seconds to crack the cipher
     */
    public long calculateAverageTimeToCrack(int secPerGuess)
    {
        final int NUMBER_OF_LETTERS_IN_ALPHABET = 26;
        int lettersRemaining = NUMBER_OF_LETTERS_IN_ALPHABET;
        int keyphraseLength = this.keyphrase.length();
        long combinations = 1;
        
        /*
         * Calculate the number of combintations for the specified keyphrase length.
         *  For example, if the keyphrase is six characters long:
         *      26 * 25 * 24 * 23 * 22 * 21
         *      would be the number of combinations of cipher alphabets for keyphrases
         *      that are six characters long.
         */
        for(int i = 0; i < keyphraseLength; i++)
        {
            combinations *= lettersRemaining;
            lettersRemaining -= 1;
        }

        long worstCaseTimeToCrack = combinations * secPerGuess;

        // average time is half the worst time since the best time is cracking the
        //  cipher on the first attempt
        return worstCaseTimeToCrack/2;
    }
    
    /*
     * The method is static and is indepedent of the state of a
     *    CasearCipher object
     * As a result, this method can be invoked on the class instead of a variable
     *    references an object (e.g., CaesarCipher.generateKeyphrase(7);
     * In addition, this method cannot access any instances variables.
     */
    /**
     * Generates a pseudorandom keyphrase of the specified length in characters.
     * 
     * @param length the number of characters in the keyphrase
     * @return a pseudorandom keyphrase of the specified length
     */
    public static String generateKeyphrase(int length)
    {
        String keyphrase = ""; 
        
        for(int i = 0; i < length; i++)
        {
            /*
             * The Math.random static method returns a double [0.0 ... 1.0)
             * 
             * Often we use the following algrothim to generate random ints from [min .. max]:
             * 
             * int n = (int((Math.random() * (max - min + 1)) + min);
             * 
             * For example: generate a random int [0 ... 25]
             * 
             * ABCDEFGHIJKLMNOPQRSTUVWXYZ
             * 0          ....          25
             */
            int letterIndex = (int)(Math.random() * 26);
            keyphrase += CaesarCipher.ALPHABET.substring(letterIndex, letterIndex + 1);
        }
        
        return keyphrase;
    }
}
