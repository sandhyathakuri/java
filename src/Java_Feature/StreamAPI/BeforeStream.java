package Java_Feature.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;

public class BeforeStream {
    //Create ArrayList with number 1 to 10;
    //Only print odd numbers
    //Square of all odd numbers


    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(integers);


        int sum = 0;
        for(int n : integers){
            if (n % 2 ==1){
                int sq = n * n;
                sum = sum + sq;
            }

        }
        System.out.println(sum);
    }
}
