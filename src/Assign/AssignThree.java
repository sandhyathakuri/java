package Assign;

import java.util.Scanner;

/*
Take three numbers from the user and print the greatest number.
Test Data

Input the 1st number: 25

Input the 2nd number: 78

Input the 3rd number: 87

Expected Output :

The greatest: 87
 */
public class AssignThree{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("  1st Number :");
        int num1 = scan.nextInt();
        System.out.print("  2st Number :");
        int num2 = scan.nextInt();
        System.out.print("  3st Number :");
        int num3 = scan.nextInt();

        if (num1 > num2)
            if (num1 > num3)
                System.out.println(" The greatest number is:" + num1);

        if (num2 > num1)
            if (num2 > num3)
                System.out.println(" The greatest number is:" + num2);

        if (num3 > num2)
            if (num3 > num1)
                System.out.println(" The greatest number is:" + num3);




    }
}
