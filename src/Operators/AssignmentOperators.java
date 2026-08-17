package Operators;

public class AssignmentOperators {

    public static void main(String[] args) {

        double n = 10;

        n += 20;
        System.out.println("After += : " +n);

        n -= 5;
        System.out.println("After -= : " +n);

        n *= 2;
        System.out.println("After *= : " +n);

        n /= 5;
        System.out.println("After /= : " +n);

        n %= 3;
        System.out.println("After %= : " +n);
    }
}
