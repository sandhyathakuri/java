package OOP.Inheritance_Intro;

public class Inheritance_Intro  extends SuperClass{
    public static void main(String[] args) {
        //private method in super class are not allowed to access in child case..
        Inheritance_Intro intro = new Inheritance_Intro();
        intro.publicMethod();
        intro.protectedMethod();
        intro.defaultMethod();

    }
    /*
    What is method overriding?
    1. when you extends a class , you can change the behaviour of a method in the parent class
    This is called method overriding.
    2. This happens when you write in a subclass a method that has the same signature as a method
    3.If only name is the same but the list of arguments is not, then it is method overriding
     */

    protected void protectedMethod(){
        super.protectedMethod();
    }
}
class SuperClass {
    public void publicMethod() {
        System.out.println("This is public method");
    }

    protected void protectedMethod() {
        System.out.println("This is protected method");
    }
    void defaultMethod(){
        System.out.println("This is default method");

    }
private void privateMethod(){
        System.out.println("This is private method");
}
}