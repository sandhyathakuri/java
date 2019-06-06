package Java_Feature.LambdaExpression;

public class CalculateMultipleImpl {
    public static void main(String[] args) {

        engine((x,y) -> x + y);
        engine((x,y) -> x * y);
        engine((x,y) -> x - y);
        engine((x,y) -> x % y);

        employee((x,y) -> x + y);
        employee((x,y) -> x - y);
        employee((x,y) -> x * y);
        employee((x,y) -> x % y);


    }
    private static void engine(Calculator calculator){
        int x = 2;
        int y = 4;

        int result = calculator.calculate(x,y);
        System.out.println(result);
    }

    private static void employee(LongCalculator longCalculator){
        long x = 5;
        long y = 10;
        long total = longCalculator.calculate(x,y);
        System.out.println(total);
    }

}
@FunctionalInterface
interface Calculator{
    int calculate (int x, int y);
}
interface  LongCalculator{
    long calculate(long x, long y);
}