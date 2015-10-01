
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * George
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
        // if they enter 1 or 0 the number will remain 1 or 0
        if(n == 0 || n == 1){
            return n;
            
        }else
            return n + sumUpTo(n-1);
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
        // returns the letter if there is only one
        if (word.length() <= 1){
            return word;
        }else{
            // it returns the last letter, but i want it to keep going.
            return reverseString(word.substring(word.length()-1));
            
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        
        //use test.sumUpTo(__)  or test.reverseString(___) to test
        Scanner input = new Scanner(System.in) ;
        
        System.out.println("please enter a number");
        int n = input.nextInt();
        System.out.println(test.sumUpTo(n));
        
        input.nextLine();
        
        System.out.println("please enter a word");
        String word = input.nextLine();
        System.out.println(test.reverseString(word));
    }
    
}
