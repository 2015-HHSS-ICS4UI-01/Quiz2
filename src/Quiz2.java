/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tristan Donelle
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
        if(n == 0)
        {   //when the number reaches 0, all numbers have been added
            return 0;
        }else
        {   //returns the number and calls the method with a number 1 value less than the number
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
        //int length = word.length();
        if(word.length() == 1)
        {   //when the word is a single letter, return that letter
            return word;
        }else
        {   
            String sub = word.substring(0, word.length() - 1); //variable for all letters but the last letter
            String letter = word.substring(word.length() - 1); //variable for the last letter
            return letter + reverseString(sub); //returns the last letter and calls with the remaining letters
        }
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
