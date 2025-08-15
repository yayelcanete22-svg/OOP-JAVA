/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yayel;

/**
 *
 * @author User
 */
public class PROBLEM7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // multiplication table
       

        // Prompt user for input
        System.out.print("Input a number:");
        int number = 8;

        // Print multiplication table up to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
    
}
