/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class RemoveZeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number with leading zeros: ");
        String num = input.nextLine();
        String result = removeLeadingZeros(num);

        System.out.println("Original Number: " + num);
        System.out.println("Number after removing leading zeros: " + result);

        input.close();
    }

    public static String removeLeadingZeros(String str) 
    {
        int len = str.length();
        int i = 0;
        while (i < len && str.charAt(i) == '0')
        {
            i++;
        }

        return str.substring(i);
    }
}
