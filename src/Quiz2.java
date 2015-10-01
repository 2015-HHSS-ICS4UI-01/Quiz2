/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali Murra
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
        //if n is equal to 0, return 0
        if(n == 0)
        {
            return n;
        }else{
            //add n and the number before it
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
         //store the first and second letter 
        char one = word.charAt(0);
        char two = word.charAt(word.length()-1);
        //if the string is one letter long, return the string
        if(word.length() == 1)
        {
            return word;
        }else{ //switch the letters then go to the next set of letter to switch

            //switch the letters at position one and the last letter in the string
            //chop off the last two already switched letters
            //recall the method until one letter is left
            return reverseString(word.substring(1,word.length()-1));
        }
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        System.out.println(test.reverseString("cat"));
        //use test.sumUpTo(__)  or test.reverseString(___) to test
        
    }
    
}
