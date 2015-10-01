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
        
       
        if(n == 0)                          //if the number inputed is 0
        {
            return 0;                       //return 0    
        }else if(n==1)                      //if the number inputed is 1              
        {
            return 1;                       //return 1
        }else{                              //if the number inputed is greater than 1
            return n + sumUpTo(n-1);        //add the number, subtract 1 from the number and add it again 
        }                                   //until the number equals 0
        
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
        
        int n = word.length() -1;                  //n equals the last letter
        
        
     char first = word.charAt(0);                  //first equals the first letter of the word 
     char last = word.charAt(n);                   //last equals the last letter of the word
        if(n <=1){                                 //if the word length is 1 letter or no letters 
            return word;                           //return the word as it is
        
        }else if(n>1){                             //if the word as 2 or more letters
           
            first = word.charAt(0);                //first still equals the first letter
            last = word.charAt(n);                 //last still equals the last letter
          word = word.substring(1,n);              //the new word equals the first and the last letters flipped
            
        }return last+ reverseString(word)+first;   //return the last letter
                                                   //than the rest of the original word
                                                   //then the first letter after
                                                   //and keep repeating the process until n equals 1
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        
        System.out.println(test.sumUpTo(5));                    //test the first method
        System.out.println(test.reverseString("doggie"));       //test the second method
        //use test.sumUpTo(__)  or test.reverseString(___) to test
        
    }
    
}
