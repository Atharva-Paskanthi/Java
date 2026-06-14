package Java8.StreamAPIs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WhyStream {

    public static void main(String[] args) {

        System.out.println("-------------------Example 1-------------------------");

        List<String> list = new ArrayList<>();
        list.add("ABCD");
        list.add("XYZ");
        list.add("JAVA");
        list.add("ASKNSA");
        list.add("IOPSDKS");

        for(String s:list){
            if(s.length() ==4){
                System.out.println("(Using Collection) Element with length 4 is : "+s);
            }
        }

        list.stream().
                filter(s -> s.length() == 4).   //Lamda expression
                forEach(a -> System.out.println("(Using Stream) Element with length 4 is : "+a));

        System.out.println("Original Collection : "+list);

        System.out.println("-------------------Example 2-------------------------");

        List<Integer> intList = new ArrayList<>();
        intList.add(100);
        intList.add(300);
        intList.add(400);
        intList.add(300);
        intList.add(600);
        intList.add(100);
        intList.add(900);

        intList.stream().
                distinct().   //Lamda expression
                forEach(a -> System.out.println("(Using Stream) Unique elements in the List are : "+a));

        //Data source
        intList.stream().
                filter(e -> e > 100). //Intermediate Operation
                distinct().   //Intermediate Operation
                sorted().     //Intermediate Operation
                forEach(a -> System.out.println("(Using Stream) Unique elements greater than 100 in the List are : "+a));
                //Terminal Operation

        long count =  intList.stream().
                        filter(e -> e > 100). //Intermediate Operation
                        distinct().   //Intermediate Operation
                        sorted().     //Intermediate Operation
                        count();   //Terminal Operation

        System.out.println(count);


        System.out.println("-------------------Example 3-------------------------");

        List<String> nameList = Arrays.asList("Tony","Stark","Robert","Downney","Junior");

        Stream<String> stream = nameList.stream();
        stream.forEach(System.out::println);

        //stream.forEach(System.out::println); //Will throw exception as 'stream' is already comsumed

        Stream<String> stream1 = nameList.stream(); //create new stream1 with same Data source
        stream1.forEach(System.out::println);
    }
}
