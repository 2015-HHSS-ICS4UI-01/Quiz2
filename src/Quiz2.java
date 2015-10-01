
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tituo4996
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
        //if the intiger n is equal to zero OR one then:
        //return the intiger n
        if(n==0||n==1)
            return n;
        //otherwise return the intiger n plus the outcome of sumUpTO:
        //when the intiger n minus one is entered
        else
            return n+sumUpTo(n-1);
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
        //if the length of the string word is equal to zero or one then:
        //return a string plus the string word
        if(word.length()==0||word.length()==1)
            return ""+word;
        //otherwise return a string plus the last letter of the string word and the outcome of reverseString:
        //when the string word is entered, starting at the begining of the string word with it being one less in length 
        else
            return ""+word.charAt(word.length()-1)+reverseString(word.substring(0,word.length()-1));        
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
