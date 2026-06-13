package Java8.FunctionalInterface;

public interface NormalInterface {

    void test();
    void show();
}

@FunctionalInterface
interface IntroToFunctionalInterface{
    void a();
    //void b();

    default void c(){
        System.out.println("Default Method in SAM Interface");
    }

    static void d(){
        System.out.println("Static method in interface"); //Static method can't be overridden
    }

}

class A1 implements IntroToFunctionalInterface{

    @Override
    public void a() {
        System.out.println("a - method overidden");
    }

    @Override
    public void c() {
        System.out.println("Default method can be overridden");
    }
}


