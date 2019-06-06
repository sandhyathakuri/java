package Collections.AboutArray;

import java.util.Arrays;

public class InttroToArray {
    public static void main(String[] args) {
        // how to declare an array with the size of 10 elements

       String[] strings = new String[10];
        // assign value to array
        strings[5] = "Test Index 5";

        for (int i = 0; i < strings.length; i++){
            System.out.println(strings[i]);
        }
        //how to declare an array with elements only

        int[] intArray = {23, 4,5,67,45,34,56};
        System.out.println(intArray.length);
        Arrays.fill(intArray, 99);
        System.out.println(Arrays.toString(intArray));

        //how to declare multi dimension array
        int [][] coredinates ={{1,2},{3,5},{56, 78},{56,78}};
        System.out.println(Arrays.deepToString(coredinates));
    }
}

