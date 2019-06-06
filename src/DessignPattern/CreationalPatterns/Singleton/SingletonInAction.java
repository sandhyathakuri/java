package DessignPattern.CreationalPatterns.Singleton;

public class SingletonInAction {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
        System.out.println("This is singleton hashcode " + singleton.hashCode());


        Singleton singletonOne = singleton.getInstance();
        System.out.println("This is singletonOne hashcode " + singletonOne.hashCode());

    }

}
class Singleton{

    // create the variable with singleton data type.
    private static Singleton instance= new Singleton();


    //make the constructor of the class private

    private Singleton(){

    }
    //create the get method
    public static Singleton getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("This is from Singleton class");
    }

}