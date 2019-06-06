package Java_Feature.LambdaExpression;

import java.util.ArrayList;
import java.util.Iterator;

public class LambdaWithList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Rick");
        list.add("Mike");
        list.add("Carl");
        list.add("Daryl");

        // loop
        for (String s:list){
            System.out.println("Using for each loop "+ s );
        }

        //Iterator class
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("Using Iterator class" + iterator.next());
        }

        //lambda expression

        list.forEach((listOne) -> System.out.println("using Lambda " + listOne));

    }
}
