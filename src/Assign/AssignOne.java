package Assign;
/* Write a Java program to get a number from the user and print whether it is positive or negative.
Test Data

Input number: 35

Expected Output :

Number is positive
 */

import java.util.Scanner;

public class AssignOne {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);

        System.out.print("Input number: ");
        int input = scan.nextInt();

        if (input > 0)
        {
            System.out.println("Number is positive");
        }
        else if (input < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }

    }
}
