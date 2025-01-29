/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s05;

/**
 * S05 - Count the number of the appearance of letters in a string.
 *
 * This program allows the user to input a string, count the occurrences of 
 * letters in the string, and display the results.
 *
 * @author Tran Hieu Nghia - CE191122
 */
public class S05 {

    /**
     * The main method serves as the entry point for the program.
     *
     * @param args the command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create an instance of the MyString class
        MyString mystring = new MyString();
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        
        // Read the input string
        mystring.inputString();
        
        // Count the occurrences of letters in the string
        mystring.countLetters();
        
        // Display the results
        System.out.println(mystring.toString());
    }
}
