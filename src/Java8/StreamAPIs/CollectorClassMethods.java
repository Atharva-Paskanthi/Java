package Java8.StreamAPIs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorClassMethods {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("David");
        names.add("Johnson");
        names.add("Scarlett");
        names.add("ChristianoCR");
        names.add("Neymar");
        names.add("David");
        names.add("Beckham1234");
        names.add("Chhetri10");
        names.add("Scarlett");
        names.add("RonaldoCR7");

        //List of length of each element
        List<Integer> namesLength = names.stream().
                map(s -> s.length()).
                collect(Collectors.toList());
        System.out.println("List of length element is : "+namesLength);

        System.out.println("------------------------------------------------------------");

        //List of Uppercase elements
        List<String> uppercaseNames = names.stream().
                map(s -> s.toUpperCase()).
                collect(Collectors.toList());
        System.out.println("Uppercase List of element is : "+uppercaseNames);

        System.out.println("------------------------------------------------------------");

        //Set of Elements (doesn't take duplicate elements) by collection
        Set<String> set1 = new HashSet<>(names);
        System.out.println("Unique Elements - Set - (by Collection framework) :"+set1);

        System.out.println("------------------------------------------------------------");

        Set<String> set2 = names.stream().
                collect(Collectors.toSet());
        System.out.println("Unique Elements - Set - (by using Stream) :"+set2);

        System.out.println("------------------------------------------------------------");

        List<String> distinctNames = names.stream().
                distinct().
                collect(Collectors.toList());
        System.out.println("Unique Elements - List - (by Using distinct method in Stream) : "+distinctNames);

        System.out.println("------------------------------------------------------------");

        Map<Integer,String> map1 = new HashMap<>();

        for(String s : names){
            map1.put(s.length(), s);
        }
        System.out.println("Length & Unique names - Map - (by using Collecction Framework) : "+map1);

        System.out.println("------------------------------------------------------------");

        Map<Integer,String> mapUsingStream = names.stream().
                distinct().
                collect(Collectors.toMap(s -> s.length(), Function.identity()));
        System.out.println("Length & Unique names - Map - (by Using Stream) : "+mapUsingStream);

        Map<Integer,String> mapUsingStream1 = names.stream().
                distinct().
                collect(Collectors.toMap(s -> map1.containsKey(s) ? s.hashCode() : s.length(), Function.identity()));
        System.out.println("Length & Unique names - Map - (by Using Stream) : "+mapUsingStream1);

        Map<Integer,String> mapUsingStream2 = names.stream().
                distinct().
                collect(Collectors.toMap(s -> s.length(), s -> s));
        System.out.println("Length & Unique names - Map - (by Using Stream) : "+mapUsingStream2);


    }
}
