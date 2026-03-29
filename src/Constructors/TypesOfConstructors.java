package Constructors;

public class TypesOfConstructors {

    public TypesOfConstructors(){
        System.out.println("No arg Constructor");
    }

    public TypesOfConstructors(int a){
        System.out.println("1 arg Constructor");
    }

    public TypesOfConstructors(String name, int age){
        System.out.println("2 args Constructor");
    }

    public static void main(String[] args) {

        TypesOfConstructors obj = new TypesOfConstructors();

        TypesOfConstructors obj2 = new TypesOfConstructors(10);

        TypesOfConstructors obj3 = new TypesOfConstructors("Java" , 25);
    }
}
