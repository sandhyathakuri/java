package Operators.CommaOperators;

public class Comma_Intro {
    public static void main(String[] args) {
        for (int i = 1, j = i; i <5;
        i++, j = i * 2) {
            System.out.println(" i= " +" j="  + j);
        }
    }
}
