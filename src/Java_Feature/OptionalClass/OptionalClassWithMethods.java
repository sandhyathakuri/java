package Java_Feature.OptionalClass;

import java.util.Optional;

public class OptionalClassWithMethods {
    public static void main(String[] args) {

        //Creating Optional object for string

        Optional<String> GOT = Optional.of("Game of Thrones");

        //empty() will create variable as empty value
        Optional<String> noValue = Optional.empty();

        //isPresent() method will check if variable is empty or not;

        if (GOT.isPresent()){
            System.out.println("Watching game of thrones ");
        }
        else{
            System.out.println("Nothing is there!! ");
        }

        //if present() method will execute only if given optional object is not empty

        GOT.ifPresent(s -> System.out.println("Watching the GOT "));

        // it will not print this line since ifPresent() method
        //on check variable if its not empty

        noValue.ifPresent(s -> System.out.println("This is empty "));

        //Optional orElse() and orElseGet() methods

        // orElse() Method
        System.out.println(GOT.orElse("Print the default value"));
        System.out.println(noValue.orElse("Print the default value"));

        //orElseGet() method

        System.out.println(GOT.orElseGet(() ->"Default value " ));
        System.out.println(noValue.orElseGet(() ->"Default value " ));

        //Filter method

        System.out.println(GOT.filter(s -> s.equals("GAME")));
        System.out.println(GOT.filter(s -> s.equalsIgnoreCase("GAME of Thrones")));



    }
}
