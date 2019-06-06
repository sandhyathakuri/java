package DessignPattern.CreationalPatterns.Singleton;

public class IntroOfSingleton {

    public static void main(String[] args) {


        //hashcode of instances are different
        IntroOfSingleton intro = new IntroOfSingleton();
        System.out.println(intro.hashCode());

        IntroOfSingleton introOne = new IntroOfSingleton();
        System.out.println(introOne.hashCode());
    }
}
