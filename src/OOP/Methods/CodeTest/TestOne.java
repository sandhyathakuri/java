package OOP.Methods.CodeTest;

import java.util.Scanner;

public class TestOne {

    public static int  getsmallNum( int a , int b, int c){
        if (c < b  && c < a){
            return c;
        }else if (b > c && b < a){
            return b;
        }else {
            return a;
        }
    }
    public  static double findAvg(int a, int b, int c){

        double avg = a + b + c / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three number");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("The smallest number is" + getsmallNum(a,b,c));
        System.out.println("The average number is" + findAvg(a, b, c));

    }
}
