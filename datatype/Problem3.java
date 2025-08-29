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
public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input the number of minutes: ");
        
         long minutes = input.nextLong();
         
         // Calculate total days from minutes
        long totalDays = minutes / (60 * 24);

        // Calculate years
        long years = totalDays / 365;

        // Calculate remaining days after accounting for full years
        long remainingDays = totalDays % 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days");
        
        
    }
    
}
