/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim Valeriote
 */
public class Quiz2 {

    /**
     * Takes in a number and calculates the sum from 1 to that number Example:
     * sumUpTo(5) would return 15 Because 1 + 2 + 3 + 4 + 5 = 15
     *
     * @param n the number to sum up to
     * @return
     */
    //if the number is 0 we return 0
    // else we add 1 to b and then add that to n 
    public int sumUpTo(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumUpTo(n - 1);
        }

    }

    /**
     * Takes in a String and returns the same String in reverse
     *
     * @param word the word to be reversed
     * @return the input word reversed
     */
    //if the word is 1 letter long, we return the word
    // create a new character and  with the first letter of the word 
    //do the same with the last letter
    //then make the orginal word a new substring at 1 and the 2nd last word
    // then return the frist letter and the method  and the last letter
    public String reverseString(String word) {
        int length = word.length();

        if (length == 0) {
            return word;
        }
        if (length == 1) {
            return word;
        }

        char x = word.charAt(length - 1);
        char y = word.charAt(0);

        word = word.substring(1, length - 1);

        return y + reverseString(word) + x;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();

        //use test.sumUpTo(__)  or test.reverseString(___) to test
    }
}
