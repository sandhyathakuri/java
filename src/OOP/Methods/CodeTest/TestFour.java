package OOP.Methods.CodeTest;

import java.util.Scanner;

public class TestFour {
    /*
    Write a Java method to count all vowels in a string. Go to the editor
Test Data:
Input the string: w3resource
Expected Output:

Number of  Vowels in the string: 4
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the string: ");
        String str = in.nextLine();
        System.out.println("Number of Vowels in the string" + count_Vowels(str) + "\n");
    }

    public static int count_Vowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u') {
                count++;
            }
        }
            return count;

    }
}
