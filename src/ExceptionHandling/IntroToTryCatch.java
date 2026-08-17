package ExceptionHandling;

public class IntroToTryCatch {

    void test(){
        System.out.println("test method is called");
    }

    static IntroToTryCatch getObj(){

        //return new IntroToTryCatch();
        return null;
    }

    public static void main(String[] args) {

        IntroToTryCatch obj = getObj();

        try{

            if (obj != null){
                obj.test(); //Null pointer Exception
            }

            System.out.println("dummy");

            try{
                int a = 100/0;   //Arithmetic Exception
                System.out.println("result is "+a);
            } catch (ArithmeticException ae) {
                System.out.println(ae);
            }

        } catch (Exception e){
            System.out.println("Exception block");
        }

    }
}
