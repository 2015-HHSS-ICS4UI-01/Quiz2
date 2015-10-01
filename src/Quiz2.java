
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
     * Takes in a number and calculates the sum from 1 to that number
     * Example: sumUpTo(5) would return 15
     * Because 1 + 2 + 3 + 4 + 5 = 15
     * 
     * @param n the number to sum up to
     * @return 
     */
    public int sumUpTo(int n){
        if(n == 1 || n == 0){
            return n ;
        }
            for(int i = 1; i <=n; i++){
                return n + sumUpTo(n-i);
            }
            return 0;
        
        
        
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
        if(word.length() == 1 || word.length() == 0){
            return word;
        }
        for(int i = word.length(); i>=0; i--){
            return word.charAt(word.length()-1) + reverseString(word.substring(0,word.length()-1));
        }
        return word;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Scanner input = new Scanner(System.in);
        Quiz2 test = new Quiz2();
        System.out.println(test.sumUpTo(0));
        
        //use test.sumUpTo(__)  or test.reverseString(___) to test
        System.out.println(test.reverseString(input.nextLine()));
    }
    
}
