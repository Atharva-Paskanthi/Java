package Java8.FunctionalInterface;

interface SAMI{

    default void test(){
        System.out.println("Test Method");
    }
}

public class DefaultMethod implements SAMI{     //It is not mandatory to Override default method

}
