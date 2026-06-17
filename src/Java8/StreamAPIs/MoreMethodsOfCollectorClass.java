package Java8.StreamAPIs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MoreMethodsOfCollectorClass {

    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Mumbai","Delhi","Bangalore","Chennai");

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        List<String> names = Arrays.asList("Amit","Deepa","Rahul","Nikhil","Rishi","Rohit","Java");

        System.out.println("---------------------------------------------------");
        //Grouping names by First letter of name
        Map<Character, List<String>> groupedByLetter = names.stream().
                        collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println("Grouped names by first letter : "+groupedByLetter);

        System.out.println("---------------------------------------------------");
        //Grouping names by length of name
        Map<Integer, List<String>> groupedByLength = names.stream().
                collect(Collectors.groupingBy(name -> name.length()));
        System.out.println("Grouped names by length of names : "+groupedByLength);

    }

}
