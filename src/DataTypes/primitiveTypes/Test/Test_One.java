package DataTypes.primitiveTypes.Test;


import java.util.Scanner;

public class Test_One {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input a value for inch");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch " + meters + "meters");

    }
}
