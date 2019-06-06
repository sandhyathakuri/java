package Java_Feature.StreamAPI;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamWithCollection {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("python");
        hashSet.add("C");

        Stream<String> stream = hashSet.stream();
        stream.forEach(System.out::println);

        LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
        hashMap.put("One", "Java");
        hashMap.put("Two", "Python");


        System.out.println(hashMap.entrySet().stream().filter(x -> x.getKey() == "One").
                collect(Collectors.toMap(x -> x.getKey(), x-> x.getValue())));

    }
}
