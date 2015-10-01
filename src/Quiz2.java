/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jafer Haider
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
            return n; //return 0 if we've reached the last number (base case)
        }
        return sumUpTo(n - 1) + n; //call recursivly with number - 1
    }

    /**
     * Takes in a String and returns the same String in reverse
     *
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word) {
        if (word.length() == 0) {
            return ""; //if the length of the word is 0, return an empty string
        }
        return reverseString(word.substring(1)) + word.charAt(0); //recursively call the method with the first letter added to the end of the string
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
