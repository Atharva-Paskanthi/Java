package Java8.StreamAPIs;

import java.util.ArrayList;
import java.util.List;

public class WhyStream {

    public static void main(String[] args) {

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

    }
}
