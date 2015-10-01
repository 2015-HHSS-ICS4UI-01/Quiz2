/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caius Branda
 */
public class Quiz2 {

    /**
     * Takes in a number and calculates the sum from 1 to that number Example:
     * sumUpTo(5) would return 15 Because 1 + 2 + 3 + 4 + 5 = 15
     *
     * @param n the number to sum up to
     * @return
     */
    public int sumUpTo(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumUpTo(n - 1); // return the number plus the number before it, until it gets to 0
        }
    }

    /**
     * Takes in a String and returns the same String in reverse
     *
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word) {
        if (word.length() == 0) {
            return "";
        } else {
            //return the last letter plus the letter before it, recursively until length == 0
            return word.charAt(word.length() - 1) + reverseString(word.substring(0, word.length() - 1));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        int n = 0;
        String word = "";
        System.out.println(test.reverseString(word));
        System.out.println(test.sumUpTo(n));
    }
}
