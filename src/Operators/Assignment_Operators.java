package Operators;

public class Assignment_Operators {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;


        a += 5;
        b *=4;
        c += a * b;
        c %= 6;


        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);


        //variable that allow you to hold more than one values at time..

        int numArray[] = {2,3,4,5,6,7,8};

        for (int i = 0; i < numArray.length; i++){

            // print all elements in an array
            System.out.println(numArray[i]);

            //Only want to print even numbers from an array..
            if(numArray[i] % 2 == 0 ){
                System.out.println("These are the even number from array" + numArray[i]);

            }

            //only want to print odd numbers from array..
            if(numArray[i] % 2 == 1 ){
                System.out.println("These are the Odd number from array" + numArray[i]);

            }

        }

        //print the length of an array

        System.out.println("Length of an array is:" + numArray.length);

    }
}
