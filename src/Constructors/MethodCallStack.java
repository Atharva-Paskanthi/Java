package Constructors;

public class MethodCallStack {

    void m1(){
        System.out.println("m1 method");
    }

    void m2(){
        m1();
        System.out.println("m2 method");
    }

    void m3(){
        System.out.println("m3 method");
        m2();
    }

    public static void main(String[] args) {

        new MethodCallStack().m3();
    }
}
