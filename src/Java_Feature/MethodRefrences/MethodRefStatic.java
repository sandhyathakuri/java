package Java_Feature.MethodRefrences;

import java.util.function.BiFunction;

public class MethodRefStatic {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> result = Multipication ::multiply;
        int numbers = result.apply(10, 5);
        System.out.println("Result is " +  numbers);
    }

/* :: means symbol of method reference

 */

}
class Multipication{
    public static int multiply(int numOne, int numTwo){
        return numOne + numTwo;
    }
}
