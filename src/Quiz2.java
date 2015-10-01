
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giebj5373
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
        if(n == 0 || n == 1)
        {
            return n;
        }else
        {
            return n + sumUpTo(n-1);
        }
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
        if(word.length() < 2)
        {
            return word;
        }else
        {
            //repeat this until while keeping the word minus this letter
            return reverseString(word.substring(word.length()-1));
        }
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Scanner input = new Scanner(System.in);
        Quiz2 test = new Quiz2();
        System.out.println(test.sumUpTo(3));  //or test.reverseString(___) to test
        System.out.println(test.reverseString("dog"));
        String word = input.nextLine();
        for(int i = 1; i <= word.length(); i++)
        {
            System.out.print(word.substring(word.length()-i));
        }
    }
    
}
