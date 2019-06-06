package Collections.Map_Interface.test;

import java.util.LinkedHashMap;

public class codetest2 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> firstMap =  new LinkedHashMap<>();
        LinkedHashMap<Integer, String>  secondMap =  new LinkedHashMap<>();

        firstMap.put(1, " Red");
        firstMap.put(2, " green");
        firstMap.put(3, " Black");

        System.out.println("\n Values in first map" + firstMap);

        secondMap.put(4, " white");
        secondMap.put(5, "Blue");
        secondMap.put(6, "Orange");
        System.out.println("\n Values in second map" + secondMap);


        System.out.println(firstMap.containsKey(2));





    }





}
