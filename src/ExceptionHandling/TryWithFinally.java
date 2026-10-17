package JavaPractice.src.ExceptionHandling;

public class TryWithFinally {

    void test(){
        System.out.println("test method");
    }

    public static void main(String[] args) {

        //TryWithFinally obj = new TryWithFinally();

        TryWithFinally obj = null;

        try{
            obj.test();
        } catch (Exception e){
            System.out.println("Got a Exception");

            try{

            } finally {
                System.out.println("Nested finally - This will only Execute if there is exception as it is in 'catch' block");
            }

        } finally {
            System.out.println("This finally block will execute no matter there is Exception or not");
        }

    }
}
