package Static;

public class IntroToStaticBlock {

    static {
        System.out.println("This is a static block");

        System.out.println("Use static block when we need to execute some code as soon as class gets loaded into memory" +
                "it means before main method starts execution");

        System.out.println("We don't need to call static blocks, they will get callled in order they are declared" +
                "as soon as class is loaded into memory");
    }
    //Block does not have any name and we cannot call it explicitly

    static void staticMethod(){
        System.out.println("This is a static method");
    }

    public static void main(String[] args) {
        System.out.println("-------------------------------------------- ");
        System.out.println("Inside main method");
        staticMethod();
    }

    static {
        System.out.println("-------------------------------------------- ");
        System.out.println("another static block");
    }
}
