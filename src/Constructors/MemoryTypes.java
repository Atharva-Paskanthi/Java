package Constructors;

public class MemoryTypes {

    int a;
    String name;
    float f;
    double d;
    boolean b;
    long l;
    //reference         =  actual object
    //(stored in stack)   (stored in heap)

    public static void main(String[] args) {
        MemoryTypes obj = new MemoryTypes();
        System.out.println("int default value : "+obj.a);
        System.out.println("String default value : "+obj.name);
        System.out.println("float default value : "+obj.f);
        System.out.println("double default value : "+obj.d);
        System.out.println("boolean default value : "+obj.b);
        System.out.println("long default value : "+obj.l);
    }

}
