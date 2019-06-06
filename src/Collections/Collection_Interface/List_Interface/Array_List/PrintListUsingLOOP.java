package Collections.Collection_Interface.List_Interface.Array_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintListUsingLOOP {
    public static void main(String[] args) {

        List<String> list_Strings = new ArrayList<String>();

// for each loop
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        for (String s : list_Strings){
            System.out.println( "for each loop" + s);
        }
// using iterator class
        Iterator<String> iterator = list_Strings.iterator();
        while (iterator.hasNext()){
            System.out.println("Using iterator " + iterator.next());
        }
        //simple for loop
        for ( int i = 0; i < list_Strings.size(); i ++){
            System.out.println(list_Strings.get(i));
        }
    }
}
