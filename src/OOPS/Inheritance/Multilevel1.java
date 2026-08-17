package OOPS.Inheritance;

class GreatGrandFather{
    void Method1(){
        System.out.println("1st Method");
    }
}

class GrandFather extends GreatGrandFather{
    void Method2Addition(int a,int b){
        int c = a+b;
        System.out.println("Addtion is : "+c);
    }
}

class Parent extends GrandFather{
    void Method3Multiplication(int a,int b){
        int c = a * b;
        System.out.println("Multiplication is : "+c);
    }
}

public class Multilevel1 extends Parent {

    void Method4Display(){
        System.out.println("Method from Child class");
    }
    public static void main(String[] args) {
        Multilevel1 obj_m1 = new Multilevel1();
        obj_m1.Method1();
        obj_m1.Method2Addition(4,5);
        obj_m1.Method3Multiplication(12,9);
        obj_m1.Method4Display();
    }
}
