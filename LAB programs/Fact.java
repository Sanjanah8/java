
package com.mycompany.mavenproject1;
import java.util.Scanner;
public class Fact {
     public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int fact = 1;
        for (int i = 1; i <= num; i++)
        {
            fact*= i;
        }

        System.out.println("The Factorial of " + num + " is " + fact);

        input.close();
    }
}
