package Statement_Control.Do_While_Loop;

public class DoWhile_Loop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 3);

        int limit = 20;
        int sum = 0;
        int k = 1;

        do {
            sum += k;
            k++;
        } while (k <= limit);

        System.out.println("sum = " + sum);


    }
}
