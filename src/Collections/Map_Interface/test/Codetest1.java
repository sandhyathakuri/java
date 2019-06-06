package Collections.Map_Interface.test;


import java.util.Map;
import java.util.TreeMap;

public class Codetest1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1, "Red");
        treeMap.put(2, "Green");
        treeMap.put(3, "Block");
        treeMap.put(4, "White");
        treeMap.put(5, "Blue");

        System.out.println(treeMap);

        //for each loop
        for (Map.Entry x : treeMap.entrySet()){
            System.out.println(x.getKey()+ " " + x.getValue());
        }

        // size of map
        System.out.println("Size of map "+ treeMap.size());



    }
}
