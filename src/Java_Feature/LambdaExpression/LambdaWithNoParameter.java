package Java_Feature.LambdaExpression;

public class LambdaWithNoParameter {

    public static void main(String[] args) {

        // lambda expression
        // 1. call the interface
        //2. have args if any
        // 3. body of method

        MyInterfaceOne msg = ()-> {
            return "Hello";
        };
        System.out.println(msg.sayHello());

        MyInterfaceTwo two = (num) ->{
            return num + 5;
        };
        System.out.println(two.incrementByFive(5));

        MyInterfaceThree three = (str1, str2) -> {
            return  str1+ str2;
        };
        System.out.println(three.stringConcat("hey ", "hello") );

    }

}
@FunctionalInterface
interface MyInterfaceOne{
    // you can only have one method in your interface...
    public String sayHello();
}
@FunctionalInterface
interface MyInterfaceTwo{
    public  int incrementByFive( int a);
}

interface MyInterfaceThree{
    public String stringConcat(String str1, String str2);
}

