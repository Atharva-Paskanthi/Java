package ExceptionHandling;

public class IntroToException{

    void divide(int a , int b){
        int result = a/b;
        System.out.println("result is "+result);
    }

    public static void main(String[] args) {
        System.out.println("Inside Main Method");

        IntroToException obj = new IntroToException();
        obj.divide(100, 0);

        obj.test();

        System.out.println("End of Main Method");
    }

    void test(){
        System.out.println("This is a Test method");
    }
}
