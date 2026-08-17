package Constructors;

public class TypesOfVariables {

    int a;  //declaration   //instance variable
    String name = "Java";   //instance variable

    static String address = "Pune";     //static variable

    public static void main(String[] args) {

        TypesOfVariables obj1 = new TypesOfVariables();
        obj1.a = 1001;
        obj1.name = "Java_Program";

        TypesOfVariables obj2 = new TypesOfVariables();
        obj1.a = 2001;
        obj1.name = "OOPS";
    }

    void show(){

        int abc = 100; //local variable
        String local = "Javaaaaaa";
        System.out.println("local variable : "+abc);
        System.out.println("instance variable : "+a);
        a = 1000; //initialization
        System.out.println("instance variable : "+a);

    }

}
