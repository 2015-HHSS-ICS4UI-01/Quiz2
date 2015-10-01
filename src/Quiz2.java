/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nima Fathi
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
        
     if(n==1){
         return 0;
     }
     
         
         return n + sumUpTo(n - 1);
     
     
    }
    
    
    public String reverseString(String word){
        
        word.charAt(word.length());
        
        word = word.replace(word, word);
        
        return word;
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        
        //use test.sumUpTo(__)  or test.reverseString(___) to test
        
        //sumUpTo
        int n = 5;
        n = test.sumUpTo(n);
        System.out.println(n);
        
        //word
        String j = test.reverseString("hello");
        System.out.println(j);
        
        
        
    } 
    
}
