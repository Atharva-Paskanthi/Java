package Constructors;

public class MethodVsConstructor {

    public MethodVsConstructor(){
        System.out.println("This is Constructor");
    }

    public void Method_1(){
        System.out.println("This is Method");
    }

    public static void main(String[] args) {
        MethodVsConstructor obj = new MethodVsConstructor(); //Constructor is called here, while creating object
        //obj.Method_1();
    }

}
