package Static;

public class IntroToInstanceBlock {

    int i = 0;
    static int p = 10;

    public IntroToInstanceBlock(){
        System.out.println("-------------------------------------------- ");
        System.out.println("This is a Constructor");
    }

    {
        System.out.println("-------------------------------------------- ");
        System.out.println("This is an Instance Block");
        System.out.println("Use instance block when you want to execute some code after object creation, " +
                "but before Constructor gets called");
    }

    static {
        System.out.println("Thid is a Static Block");
    }

    public static void main(String[] args) {
        System.out.println("This is main method");
        new IntroToInstanceBlock();

    }

    {
        System.out.println("-------------------------------------------- ");
        System.out.println("Another Instance block");
    }
}
