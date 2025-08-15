/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yayel;

/**
 *
 * @author User
 */
public class PROBLEM10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //digit sum
        

        // Prompt user for input
        System.out.print("Input an integer: ");
        int number = 291;

        int sum = 0;
        int temp = Math.abs(number);  // Handle negative numbers if needed

        // Compute sum of digits
        while (temp > 0) {
            sum += temp % 10;  // Get the last digit
            temp /= 10;        // Remove the last digit
        }

        // Output result
        System.out.println("The sum of the digits is: " + sum);


    }
    
}
