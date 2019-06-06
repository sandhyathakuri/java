package Statement_Control.Switch_Statement;

import java.util.Random;

public class SwitchStatement {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(5);
        System.out.println(i);
        switch (i){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("You did not enter a valid value");
        }
        // more Demo
        int choice = random.nextInt(3);
        System.out.println(choice);
        switch (choice){
            case 1:
                System.out.println("Choice 1 is selected");
                break;
            case 2:
                System.out.println("Choice 2 is selected");
                break;
            case 3:
                System.out.println("Choice 3 is selected");
                break;
            default:
                System.out.println("Default");
        }
        // when we do not use break statements
        int v =  random.nextInt(2);
        System.out.println("value if v is: ");
        switch (v){
            case 0:
            System.out.println("v is 0");
            break;
            case 1:
                System.out.println("v is 1");
                break;
            case 2:
                System.out.println( "v is 2");
                break;
            default:
                System.out.println("Free flowing switch example");
        }
    }

}
