package Java_Feature.MethodRefrences;

public class MethodRef_Constructor {

    public static void main(String[] args) {

        MyInterfaceForConstructor forConstructor = Hello::new;
        forConstructor.display("SomeText");


    }



}

class Hello{
    //This is constructor
    public Hello(String hey){
        System.out.println(hey);
    }

}
interface  MyInterfaceForConstructor{
   Hello display(String str);
}