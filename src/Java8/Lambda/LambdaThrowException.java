package Java8.Lambda;

import java.awt.*;

interface InterfaceException{
    void divide(int a, int b) throws ArithmeticException;
}

public class LambdaThrowException /*implements InterfaceException*/ {


    /*@Override
    public void divide(int a, int b) throws ArithmeticException {
        int result = a/b;
        System.out.println(result);
    }*/

    public static void main(String[] args) {
        LambdaThrowException obj = new LambdaThrowException();

        InterfaceException interfaceException = (int a, int b) -> {

            try{
                int result = a/b;
                System.out.println(result);
            } catch (ArithmeticException arithmeticException){
                System.out.println("Got Exception");
            }

        };
        interfaceException.divide(100,0);

        //obj.divide(100,0);
    }
}
