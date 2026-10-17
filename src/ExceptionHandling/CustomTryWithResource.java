package JavaPractice.src.ExceptionHandling;

import java.io.Closeable;
import java.io.IOException;

public class CustomTryWithResource implements Closeable {

    void test(){
        System.out.println("test method");
    }

    static void main() throws IOException {

        CustomTryWithResource obj = null;

/*        try{
            obj = new CustomTryWithResource();
        } catch (Exception e){
            System.out.println("Got Exception");
        } finally {
            obj.close();
        }*/

         try {
            CustomTryWithResource obj1 = new CustomTryWithResource();
            obj1.test();
        } catch (Exception e){
            System.out.println("Got Exception");
        }

    }

    @Override
    public void close() throws IOException {
        System.out.println("Closing Resource");
    }
}
