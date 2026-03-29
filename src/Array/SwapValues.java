package Array;

import java.sql.SQLOutput;

public class SwapValues {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Value of a before : "+a);
        System.out.println("Value of b before : "+b);

        //Using 3rd variable
//        int temp;
//
//        temp = a;
//        a = b;
//        b = temp;

        //Without using 3rd variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Value of a after : "+a);
        System.out.println("Value of b after : "+b);

    }
}
