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

    }
}
