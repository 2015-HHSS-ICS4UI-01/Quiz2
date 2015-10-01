/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JONAH JANAKOVIC
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
        //setting a blank int for the answer
        int ans = 0;
        
        //keep adding numbers that are bigger than 0
        if (n > 0) {
            int sum = sumUpTo(n - 1);
            //adding the numbers less than the number given to the number given
            ans = sum + n;
        }
        //answer
        return ans;
    }

    /**
     * Takes in a String and returns the same String in reverse
     *
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word) {
        //if the string is done
        if (word.length()==0){
            return word;
        }
        //getting the rest of the string
        String leftover = word.substring(1);
        return reverseString(leftover) + word.charAt(0);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
//        test.sumUpTo(3);
//        System.out.println(test.sumUpTo(3));
        test.reverseString("doggie");
        System.out.println(test.reverseString("doggie"));

        //use test.sumUpTo(__)  or test.reverseString(___) to test

    }
}
