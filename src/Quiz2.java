/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nathan von Hatten
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
        if(n==0){               //if the number is zero return 0 (base case)
            return 0;
        }
        if(n==1){
            return 1;
        }else{
            return n + sumUpTo(n-1); //return the number plus the number minus one
        }
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
        if(word.length()==0){                       //if the word is 1 character, return the word(base case)
            return word;
        }
        if(word.length()==1){
            return word;
        }else {
           int length = word.length()-1;
          char n = word.charAt(0);
          char x = word.charAt(word.length()-1);
            
          word = word.substring(1, length);         //remove the first and last letter
          
          
          return x +reverseString(word)+ n;         //flip first and last letter and then do the middle letters  
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
