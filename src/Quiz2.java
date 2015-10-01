/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMITRY_KOBETS
 */
public class Quiz2 {

    /**
     * Takes in a number and calculates the sum from 1 to that number
     * Example: sumUpTo(5) would return 15
     * Because 1 + 2 + 3 + 4 + 5 = 15
     * 
     * @param n the number to sum up to
     * @return 
     */
    public int sumUpTo(int n){
        if (n == 0)
        {
            return 0;
        }
        return n + sumUpTo(n-1);
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
        
        if (word.length() == 0)
        {
            return "";
        }
        int wordLength = word.length();
        char lastChar = word.charAt(wordLength-1);
        String newWord = word.substring(0, wordLength-1); // returns the string without the last character
        
        return lastChar + reverseString(newWord);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        int thing = test.sumUpTo(0);
        System.out.println(thing);
        
    }
    
}
