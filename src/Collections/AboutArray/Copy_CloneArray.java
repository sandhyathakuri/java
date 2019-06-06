package Collections.AboutArray;

import java.util.Arrays;

public class Copy_CloneArray {
    public static void main(String[] args) {

        //how to copy an array with
        String[] names ={"Alex", "Brian", "Charles", " David"};
        System.out.println(Arrays.toString(names));

        String[] cloneNames = names.clone();
        System.out.println("After clone:" + Arrays.toString(cloneNames));

        cloneNames[0] = " Some other values";
        System.out.println("After changing index 0: " + Arrays.toString(cloneNames));

        //copy an array using copyOf method
        String[] copyNames = Arrays.copyOf(names, names.length);

        //Only want to some length
        String[] copyNamesTwo = new String[names.length];
        System.arraycopy(names, 0, copyNames, 0,copyNamesTwo.length);
        System.out.println(Arrays.toString(copyNamesTwo));
    }
}
