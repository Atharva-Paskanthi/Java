package ExceptionHandling;

public class MethodStack {

    static void a(){
        System.out.println("Inside a() Method");
        b();
    }

    static void b(){
        System.out.println("Inside b() Method");
        c();

        System.out.println("Csll d() Method");
        d();
    }

    private static void d() {
        System.out.println("Inside d() Method");
    }

    public static void main(String[] args) {
        System.out.println("Inside Main Method");
        a();
    }

    static void c(){
        System.out.println("Inside c() Method");
    }
}
