
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kampn2687
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
        if(n == 1)
        {
            return 1;
        }
        return (n + sumUpTo(n -1));
        
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
        // get the word the user wants spelled backwards
        // if there is only one letter, then return the letter
        int [] lett = new int[i];
        //figure out the length of the word
        word.length(x);
        // identify what strings are each
        lett[1] = word.substring(0);
        
        k++;
        if(k = x ){
          return reverseString(lett[x-k]); 
        }
        System.out.println( );
                
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        System.out.println(test.sumUpTo(5));
        
        //use test.sumUpTo(__)  or test.reverseString(___) to test
        
    }
    
}
