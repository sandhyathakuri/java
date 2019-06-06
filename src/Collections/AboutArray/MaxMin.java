package Collections.AboutArray;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        Arrays.sort(my_array);
        System.out.println("Min of value   " + my_array[0]);
        System.out.println("Max of value   " + my_array[my_array.length]);
    }

}
