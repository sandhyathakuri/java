package Assign;

import java.util.Scanner;

/*
Write a Java program that reads in two floating-point numbers and tests whether
they are the same up to three decimal places.
Test Data

Input floating-point number: 1256

Input floating-point another number: 3254

Expected Output :

They are different
 */
public class AssignSix {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        double x = scan.nextDouble();
        System.out.print("Input floating-point another number: ");
        double y = scan.nextDouble();

        x = Math.round(x * 1000);
        x = x / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;

        if (x == y)
        {
            System.out.println("They are the same up to three decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}