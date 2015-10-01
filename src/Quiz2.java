
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PUT_YOUR_NAME_HERE
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

        if (n == 1) {
            return n;
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
    public String reverseString(String word){
        char one = word.charAt(0);
        char two = word.charAt(word.length()-1);
        
        if (word.length() == 1) {
            return word;
        }else {
            //take the letter at the last position of the string and switch it with the first letter then substring the first and last letter and send back thru method so the same process is repeated.
            
            return(word.substring(1, word.length()-1));
        }
            
           
            
            
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        System.out.println(test.reverseString("word"));

        //use test.sumUpTo(__)  or test.reverseString(___) to test

    }
}
