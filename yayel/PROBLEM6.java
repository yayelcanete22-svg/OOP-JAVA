/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yayel;

/**
 *
 * @author User
 */
public class PROBLEM6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Arithmetic Operations
   
        // Create a Scanner object for input

        // Prompt user for input
        System.out.print("Input first number: ");
        int num1 = 125;

        System.out.print("Input second number: ");
        int num2 = 24;

        // Perform arithmetic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        // Display results
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " x " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);
        System.out.println(num1 + " mod " + num2 + " = " + remainder);
    }
    
}
