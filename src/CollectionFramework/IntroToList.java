package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class IntroToList {

    public static void main(String[] args) {

        List list1 = new ArrayList<>();
        list1.add("Java");
        list1.add(123);
        list1.add(true);
        list1.add(925892834589.9346);

        String getStringValue = list1.get(0).toString(); //toString converts the value into string
        System.out.println("Print Value : "+getStringValue);

        Integer getIntValue = (Integer) list1.get(1); //(Integer) convert the value into integer while retrieving
        System.out.println("Print Value : "+getIntValue);


        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(84357);

    }
}
