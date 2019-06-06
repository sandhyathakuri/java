package Java_Feature.MethodRefrences;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodRefWithArray {
    public static void main(String[] args) {

        String[] stringArray = {"Meagan", " Lucy", "Sansa", "John"};

        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));


        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for (String s : stringArray){
            System.out.println(s);
        }
    }
}
