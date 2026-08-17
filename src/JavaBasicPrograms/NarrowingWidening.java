package JavaBasicPrograms;

public class NarrowingWidening {

    public static void main(String[] args) {

        byte small = 10;

        double large = small;        //Widening

        System.out.println(large);

        double d1 = 9258346.45839;
        int i1 = (int) d1;           //Narrowing
        System.out.println(i1);

        double d2 = 99999999999999999999.3495889;
        int i2 = (int) d2;
        System.out.println(i2); //2147483647 --> Highest possible value of the 'int' type
        long l2 = (long) d2;
        System.out.println(l2);
    }
}
