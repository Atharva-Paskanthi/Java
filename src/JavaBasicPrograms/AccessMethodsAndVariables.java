package JavaBasicPrograms;

public class AccessMethodsAndVariables {

    int age = 25;
    double salary = 1500000;
    boolean isItGoingToRain = false;

    void method1(){
        System.out.println("Void return type and No parameters");
    }

    void method2(String name, int age){
        System.out.println("Void return type and 2 parameters");
    }

    int method3(){
        System.out.println("int return type and No parameters");
        return 100;
    }

    long  method4(int a, long b){
        System.out.println("long return type and 2 parameters");
        return a + b;

    }

    long  method5(int a, String b){
        System.out.println("long return type and 2 parameters");
        return a + a;

    }

    public static void main(String[] args){

        AccessMethodsAndVariables obj = new AccessMethodsAndVariables();

        //Syntax for accessing variables
        //objectReferenceName.variableName;

        System.out.println("Access age variable : " +obj.age);
        System.out.println("Access salary variable : " +obj.salary);

        //Syntax for accessing methods
        //objectReferenceName.methodName();

        obj.method1();
        obj.method5(35, "Java");

    }
}
