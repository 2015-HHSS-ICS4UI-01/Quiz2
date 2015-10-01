
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mark
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
        if(n==0)
        {
            return 0;
        }else
        {
            int row = n;
            return sumUpTo(n-1) + row;
        }
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){

        if(word.length() == 0){
            return null;
        }else 
            {
                char letter = word.charAt(word.length());
                int len = word.length();
                word = word.substring(0,len - 1);
                //take the last letter and save it
                return reverseString(word.length,letter);
                //takes the last letter and removes it then calls letter and prints 
            }
        //return isPalindrome(s.substring(1,s.length() -1));
     }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();

        //System.out.println(test.sumUpTo(n));
        //use test.sumUpTo(__)  or test.reverseString(___) to test
        
    }
    
}
