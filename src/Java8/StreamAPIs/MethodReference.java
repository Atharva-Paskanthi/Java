package Java8.StreamAPIs;

import java.util.function.Function;
import java.util.function.Supplier;

interface TwoParamFunction{

    int add(int a, int b);
}

public class MethodReference {

    public static void main(String[] args) {

        TwoParamFunction interfaceRef = (int a, int b) ->{
            return a + b + 100;
        };

        System.out.println("--------------------------------------------------------------");

        Function<String, Integer> lamdaFunction1 = (String s) -> Integer.parseInt(s);
        System.out.println(lamdaFunction1.apply("12"));

        Function<String, Integer> referenceFunction1 = Integer::parseInt; //Using Method Reference
        System.out.println(referenceFunction1.apply("12"));

        Function<String, String> lambdaFunction2 = (String s) -> s.toLowerCase();
        System.out.println(lambdaFunction2.apply("JAVA"));

        Function<String, String> referenceFunction2 = String::toLowerCase;
        System.out.println(lambdaFunction2.apply("JAVA"));

        System.out.println("--------------------------------------------------------------");

        Company c = new Company("My_Company");

        Supplier<String> lambdaSupplier1 = () -> c.getName();  //Calling getName of c using lambda
        System.out.println(lambdaSupplier1.get());

        Supplier<String> referenceSupplier = c::getName;  //Calling getName of c using Method Reference
        System.out.println(referenceSupplier.get());
    }
}

class Company{

    String name;

    public Company(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}