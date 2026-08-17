package ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class IntroToCompileTimeException {

    void test(){
        System.out.println("Test Method");
    }

    public static void main(String[] args) {
        //Ways of creating the Object :
        //new
        //Class.forName("ClassName") -- Factory Method
        //clone
        //Constructor
        //Serialization Deserialization

        try {
            Class cls1 = Class.forName("ExceptionHandling.IntroToCompileTimeException");

            IntroToCompileTimeException obj = (IntroToCompileTimeException) cls1.newInstance();
            obj.test();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


        int[] arr = {1,2,3,4,5};
        try{
            System.out.println("Get value from Array : "+arr[6]);
        }catch(IndexOutOfBoundsException ie){
            System.out.println("Got Exception");
        }



        File myObj = new File("filename.txt");

        try {
            if(myObj.createNewFile()){
                System.out.println("File Created : "+myObj.getName());
            }
            else{
                System.out.println("File already exists");
            }
        } catch (IOException e) {

        }

    }
}
