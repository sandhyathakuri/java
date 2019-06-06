package OOP.DefineClass;

public class NestedClass {
    // Nested or Inner class in java
    class A {
        private int i = 11;
        public int value(){
            return i;
        }
    }
    class B {
        //Variable
        private String lablel;

        //Constructor

        B(String str){
            lablel = str;

        }
        // method vs function
        String readlabel(){
            return lablel;
        }
    }

    public static void main(String[] args) {
        NestedClass ns = new  NestedClass();
        // Must create instance of class in order to access inner class

        NestedClass.A objOne = ns.new A();
        NestedClass.B objTwo = ns.new B("String");
        System.out.println(objOne);
        System.out.println(objTwo);
Outside outside = new Outside();
Outside.Inside inside= outside.new Inside();
inside.printName("John smith");
    }
}
class Outside{
    public class Inside{
        public void printName(String name){
            System.out.println(name);
        }
    }
}