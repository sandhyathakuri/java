package Statement_Control.While_Loop;

public class While_Loop_Intro {
    public static void main(String[] args) {
        int i = 0;
        while (i < 3){
            System.out.println(i);
            i++;
        }
        // Beet after 500 millisecond
        int j = 0;
        while (j < 3){
            java.awt.Toolkit.getDefaultToolkit().beep();
            try {
                Thread.currentThread().sleep(500);
            }catch (Exception e){
            }
            j++;
        }
        // while loop with break statement
        int k = 0;
        while (true){
            System.out.println(k);
            k++;
            if(k > 2){
               break;
            }
        }
        // Calculate sum of given numbers
        int limit = 20;
        int sum = 0;
        int l = 1;

        while ( l <= limit) {
            sum += l++;
        }
        System.out.println("Sum = " + sum);
        }
    }

