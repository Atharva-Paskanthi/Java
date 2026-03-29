package Operators;

public class UnaryOperators {

    public static void main(String[] args){

    int a = 10;
    int b = 10;

    //Unary operators increment or decrement value by 1
    System.out.println("Post increment : " +(a++));

    System.out.println("Value of a now : " +a);

    //System.out.println("Value of a now : " +(a = a++ + a));
    //System.out.println("Value of a now : " +(a = (a++ + ++a)));

    System.out.println("Pre increment : " +(++a));

    System.out.println("--------------------------------------------------");

    System.out.println("Post increment : " +(b--));

    System.out.println("Value of b now : " +b);

    //System.out.println("Value of a now : " +(b = b++ + b));
    //System.out.println("Value of a now : " +(b = (b-- - --a)));

    System.out.println("Pre increment : " +(--b));

    }

}
