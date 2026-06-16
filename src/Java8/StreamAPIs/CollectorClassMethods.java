package Java8.StreamAPIs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorClassMethods {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("David");
        names.add("Johnson");
        names.add("Scarlett");
        names.add("Ronaldo");
        names.add("Neymar");
        names.add("David");
        names.add("Beckham");
        names.add("Chhetri");
        names.add("Scarlett");
        names.add("Ronaldo");

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

    }
}
