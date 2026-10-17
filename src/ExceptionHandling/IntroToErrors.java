package JavaPractice.src.ExceptionHandling;

public class IntroToErrors {

    void test(){
        System.out.println("test method");
        show();
    }

    void show(){
        System.out.println("show method");
        test();
    }

    public static void main(String[] args) {

        IntroToErrors obj = new IntroToErrors();
        obj.test();
    }

}
