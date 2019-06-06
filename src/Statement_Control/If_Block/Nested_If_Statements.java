package Statement_Control.If_Block;

import java.util.Random;

public class Nested_If_Statements {
    public static void main(String[] args) {

        Random random = new Random();
        //this code block is an example of multiple nested if statements
        int a = random.nextInt(10);
        if (a == 0){
            System.out.println("in the block");
            if (a ==2){
                System.out.println(" a is 0");
            } else {
                System.out.println(" a is not 2");
            }
        }else{
            System.out.println( " a is not 0");
        }

        // example of when if uses &&
        int value = random.nextInt(50);
        int count = random.nextInt(50);
        int limit = random.nextInt(50);

        if (++value % 2 == 0 && ++count < limit){
            System.out.println("here");
            System.out.println(value);
            System.out.println(count);
        }
        System.out.println("there");
        System.out.println(value);
        System.out.println(count);

        //Example of if when using OR (||)
        if (++value % 2 != 0 || ++count < limit){
            System.out.println("here");
            System.out.println(value);
            System.out.println(count);
        }
        System.out.println("there");
        System.out.println(value);
        System.out.println(count);

    }
}
