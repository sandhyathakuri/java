package Collections.Map_Interface;

import java.util.*;

public class MapAndListClass {
    public static void main(String[] args) {

        //This is how you define map...
        Map<Integer,String> hmap = new HashMap<>();
        hmap.put(1, "Java");
        hmap.put(2, "C");
        hmap.put(3, "Python");
        hmap.put(4,"Ruby");
        hmap.put(4, "terminal");

        System.out.println(hmap);
        System.out.println("Size of map " + hmap.size());

        Collection collection = hmap.values();
        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // using for loop we can print the key of map
        for (Iterator it = hmap.keySet().iterator(); it.hasNext();){
            System.out.println("Print the key of map " + it.next());
        }
        // how to make map object thread safe
        Map map = Collections.synchronizedMap(hmap);

        //if you want to check the key and values

        boolean keyExists = hmap.containsKey(3);
        System.out.println("Is key listed " + keyExists);

        boolean valueExists = hmap.containsValue("python");
        System.out.println("Is value listed " + valueExists);
    }
}
