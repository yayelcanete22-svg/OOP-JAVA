/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datatype;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem1 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Input a degree in Fahrenheit: ");
        
        double fahrenheit = input.nextDouble();
        
        //convert Fahrenheit to celsuis
        double celsius =((fahrenheit-32) *5/9);
        
        System.out.println(fahrenheit + "degree Fahrenheit is equal to " + celsius + "in Celsuis");
    }
    
}

       
