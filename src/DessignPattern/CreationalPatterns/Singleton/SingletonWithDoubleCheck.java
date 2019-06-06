package DessignPattern.CreationalPatterns.Singleton;

public class SingletonWithDoubleCheck {

    /*
    1.create singleton class
    2. synchronized
    3. Check null value before creating an instance of singleton class
     */
    //private variable

    private static volatile SingletonWithDoubleCheck Instance = null;
    // private Constructor

    private SingletonWithDoubleCheck(){

    }

    // create public get instance method
    public static SingletonWithDoubleCheck getInstance(){

        if (Instance == null){
            synchronized (SingletonWithDoubleCheck.class){
                if(Instance ==null){
                    Instance = new SingletonWithDoubleCheck();
                }
            }

        }
        return Instance;
    }
    public int getSum(int numOne, int numTwo){
        return numOne + numTwo;
    }
}

class number {
    public static void main(String[] args) {
        SingletonWithDoubleCheck DoubleCheck =  SingletonWithDoubleCheck.getInstance();
        System.out.println(DoubleCheck.hashCode());
         int num = DoubleCheck.getSum(20,20);
         System.out.println(num);
    }
}