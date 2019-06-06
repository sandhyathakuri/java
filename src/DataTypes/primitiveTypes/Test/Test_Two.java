package DataTypes.primitiveTypes.Test;

import java.util.Scanner;

public class Test_Two {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int a = num / 100;
        int b = (num - 100 * a) / 10;
        int c = num - (100 * a) - (10 * b);


        System.out.println(a + b + c);

    }
}