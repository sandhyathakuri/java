package Collections.Collection_Interface.List_Interface.Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intro_ArrayList {
    public static void main(String[] args) {

        List<Integer> numlist = new ArrayList<Integer>();

        // Name of Interface
        // diamond shape type of data
        // name if object

        System.out.println(numlist);
        System.out.println(numlist.size());

        numlist.add(24);
        numlist.add(1, 50);
        numlist.add(2,55);
        numlist.add(3,60);
        numlist.add(0,60);
        numlist.add(1, 50);
        numlist.add(2,55);
        numlist.add(3,60);
        numlist.add(0,60);


        System.out.println(numlist);

        ArrayList<String> stringArrayList= new ArrayList<>();
        System.out.println(stringArrayList);

        int arr[] = new int [5];

        System.out.println(Arrays.toString(arr));

        arr[3] = 45;
        arr [2] = 55;
        System.out.println(Arrays.toString(arr));

    }
}
