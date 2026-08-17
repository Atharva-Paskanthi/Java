package Array;

public class WhyWeNeedArrays {

    public static void main(String[] args) {

        //Array Declaration Syntax
        // datatype[] referenceName = new datatype[size];

        int[] intArray = new int[10];
        //size = 10
        //lowest index = 0
        //highest index = 9    i.e lenght-1

        double[] doubleArray = new double[15];

        intArray[0] = 3;
        intArray[3] = 14;

        System.out.println("Get element of Array : " + intArray[3]);

        //Array Initialization Syntax
        // dataype[] referenceName = {}
        int[] arrr = {1,2,4,4,5,6,7,8,8,9,10};

        System.out.println("Get Array size : " + arrr.length);
        System.out.println("Get element of Array : " + arrr[6]);

    }
}
