package Collections.Map_Interface;

import java.util.LinkedHashMap;

public class LinkedHshMap_intro {
    public static void main(String[] args) {

        LinkedHashMap<String, String>names =  new LinkedHashMap<>();
        names.put("One", "TestUserOne");
        names.put("Two", "TestUserTwo");
        names.put("Three", "TestUserThree");

        System.out.println(names);

        //how to check the size
        System.out.println(names.size());

        // How to check if map is empty
        System.out.println(names.isEmpty());

        //how to check if key and value is contain with map
        System.out.println(names.containsKey("Two"));
        System.out.println(names.containsValue("TestUserTwo"));

        //how to remove entry in map
        System.out.println(names.get("one"));

        //how to remove entry in map
        System.out.println(names.remove("Three"));

    }
}
