package JavaPractice.src.ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class SingleTryMultipleCatch {

    void test(){

    }

    static void main() {

        try {

            SingleTryMultipleCatch obj = null;
            obj.test();  //NullPointerException

            int a = 100 / 0; //ArithmeticException

            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[8]);

            File file = new File("abcd.txt");
            boolean res = file.createNewFile();

/*
//        } catch (ArithmeticException arithmeticException) {
            System.out.println("Inside Arithmetic Exception");
        } catch (NullPointerException npe) {
            System.out.println("Inside NullPointer Exception");
        } catch (Exception exception) {
            System.out.println("Inside Exception");
        }
*/

/*      } catch (ArithmeticException | NullPointerException | IOException exception ){

        }*/

        } catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException | IOException exception1 ){ //There shouldn't be parent-child relationship among the exceptions mentioned with a '|'
            System.out.println("Inside Arithmetic Exception");
        } catch (Exception exception2) { //To not have parent above 'Exception' is written below in separate catch block

        }

    }
}
