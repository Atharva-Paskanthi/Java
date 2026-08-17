package Java8.StreamAPIs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MoreMethodsOfCollectorClass {

    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Mumbai","Delhi","Bangalore","Chennai");

        //Joining elements into single String
        String joinedCities = cities.stream().
                collect(Collectors.joining("**"));
        System.out.println("Joined String : "+joinedCities);

        String joinedCities1 = cities.stream().
                collect(Collectors.joining()); //Without Delimiter
        System.out.println("Joined String : "+joinedCities1);

        System.out.println("---------------------------------------------------");

        List<Integer> intList  = Arrays.asList(10,20,30,40,50);
        String joinedInt = intList.stream().
                map(String::valueOf).
                collect(Collectors.joining("->"));
        System.out.println(joinedInt);

        System.out.println("---------------------------------------------------");

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,10);

        //Summing all integers in the list
        int sum = numbers.stream().collect(Collectors.summingInt(s -> s));
        System.out.println("Sum of all integers : "+sum);

        System.out.println("---------------------------------------------------");

        List<String> names = Arrays.asList("Amit","Deepa","Rahul","Nikhil","Rishi","Rohit","Java");

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
