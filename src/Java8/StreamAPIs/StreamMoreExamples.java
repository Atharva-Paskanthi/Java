package Java8.StreamAPIs;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class StreamMoreExamples {

    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>();
        namesList.add("John");
        namesList.add("Eddard");
        namesList.add("Sansa");
        namesList.add("Arya");
        namesList.add("Cersei");
        namesList.add("Danerys");
        namesList.add("Robert");

        System.out.println("First 4 Elements in the list are : ");
        namesList.stream().limit(4).forEach(System.out::println); //Returns first 4 elements
        System.out.println("Elements excluding first 4 in the list are : ");
        namesList.stream().skip(4).forEach(System.out::println); //Skips first 4 elements
        System.out.println("Lengths of the Strings are : ");
        namesList.stream().map(String::length).forEach(System.out::println); //Skips first 4 elements
    }
}
