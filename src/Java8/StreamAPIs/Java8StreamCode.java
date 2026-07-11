package Java8.StreamAPIs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8StreamCode {

    public static void main(String[] args) {

        //1) Printing Pyramid of No.s

        int levels = 5;
        List<String> pyramid = IntStream.rangeClosed(1,levels)
                                .mapToObj(i -> " ".repeat(levels - i) + IntStream.rangeClosed(1,i)
                                .mapToObj(String::valueOf)
                                .collect(Collectors.joining(" ")))
                                .toList();

        pyramid.forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------");

        int levels1 = 5;
        List<String> pyramid1 = IntStream.rangeClosed(0,levels)
                .mapToObj(i -> " ".repeat(levels1 - i) + IntStream.rangeClosed(1,i)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" ")))
                .toList();

        pyramid1.forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------");

        int levels2 = 5;
        List<String> pyramid2 = IntStream.rangeClosed(0,levels)
                .mapToObj(i -> " ".repeat(levels2 - i) + IntStream.rangeClosed(0,i)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" ")))
                .toList();

        pyramid2.forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------");

        //2) Get all Non repeating characters in a String

        String input1 = "swiss";
        List<Character> nonRepeating1 = input1.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> input1.chars().filter(ch -> ch == c).count()==1)
                .collect(Collectors.toList());

        System.out.println(nonRepeating1);

        String input2 = "swiss";
        Optional<Character> nonRepeating2 = input1.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> input1.chars().filter(ch -> ch == c).count()==1)
                .findFirst();

        System.out.println(nonRepeating2);

        System.out.println("--------------------------------------------------------------------");

        //3) Find Duplicate elements in the list

        List<Integer> numbers1 = Arrays.asList(1,2,3,4,2,5,3,6);

        Set<Integer> duplicates1 = numbers1.stream()
                .filter(n -> Collections.frequency(numbers1,n) > 1)
                .collect(Collectors.toSet());

        System.out.println(duplicates1);
    }
}
