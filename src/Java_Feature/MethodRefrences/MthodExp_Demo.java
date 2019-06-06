package Java_Feature.MethodRefrences;

public class MthodExp_Demo {
    public static void main(String[] args) {
        MthodExp_Demo obj = new MthodExp_Demo();

        //Method ref using the object class
        Myinterface interFace = obj::myMethod;

        // calling method of interface
        interFace.display();
    }
    public void myMethod(){
        System.out.println("Instance Method..");
    }



}
@FunctionalInterface
interface Myinterface{
    void display();

}

