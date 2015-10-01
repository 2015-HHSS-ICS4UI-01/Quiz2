
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
     * Takes in a number and calculates the sum from 1 to that number Example:
     * sumUpTo(5) would return 15 Because 1 + 2 + 3 + 4 + 5 = 15
     *
     * @param n the number to sum up to
     * @return
     */
    int sum = 0;

    public int sumUpTo(int n) {
        //adds n to sum
        sum += n;
        //returns n-1 back to the method
        if (n != 0) {
            return sumUpTo(n - 1);
        } else {
            //ends loop if n = 0
            return sum;
        }

    }

    /**
     * Takes in a String and returns the same String in reverse
     *
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word) {
        if (word.length() == 1 || word.length() == 0) {
            return word;
        } else {
            
            char replace = word.charAt(word.length() - 1);
        //adds the last char to front
        return replace + reverseString(word.substring(0, word.length()-1));
        }
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to add: ");
        int n = input.nextInt();

        Quiz2 test = new Quiz2();
        
        System.out.println(test.sumUpTo(n));
        
        input.nextLine();
        System.out.print("Enter a word to reverse: ");
        
        String word = input.nextLine();
        System.out.println(test.reverseString(word));
        //use test.sumUpTo(__)  or test.reverseString(___) to test

    }
}
