package JavaBasicPrograms;

public class MethodsPractice1 {

    int addition(int a, int b){
        System.out.println("--------addition method---------");
        System.out.println(a+b);
        return a+b;
    }

    double multiplication(int x, double y){
        System.out.println("--------multiplication method---------");
        System.out.println(x*y);
        return x*y;
    }

    void character(char z){
        System.out.println("--------character method---------");
        System.out.println(z);
    }

    void boolean1(boolean b1){
        System.out.println("--------boolean method---------");
        System.out.println(b1);
    }

    void NoReturnMethod(){
        System.out.println("--------No return type method---------");
    }

    public static void main(String[] args){

        MethodsPractice1 obj1 = new MethodsPractice1(); //First object created
        obj1.addition(5,7);
        obj1.multiplication(6,8.0);

        MethodsPractice1 obj2 = new MethodsPractice1(); //Second object created
        obj2.character('S');
        obj2.boolean1(true);
        obj2.NoReturnMethod();

    }
}
