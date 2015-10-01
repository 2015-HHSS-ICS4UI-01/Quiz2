/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thomt9963
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
        if (n == 0) {
            return 0;
        } else {
            return sumUpTo(n - 1) + n;
        }
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
        int length = word.length();
        if(length > 0){
            char ch = word.charAt(length);
            // get first char
            length = length - 1;
            // prepare to get second char
            return reverseString(ch);
            // output characters individually in reverse order
        }   
        return null;
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        System.out.println(test.sumUpTo(10));
               
        //use test.sumUpTo(__)  or test.reverseString(___) to test
        
    }
    
}
