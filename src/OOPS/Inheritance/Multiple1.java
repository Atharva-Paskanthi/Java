package OOPS.Inheritance;

//Not supported in Java for class, but supported for interface

class ParentOne1{
    void methodP1(){
        System.out.println("Method from 1st Parent");
    }
}

class ParentTwo2 {
    void methodP2(){
        System.out.println("Method from 1st Parent");
    }
}

public class Multiple1 extends ParentOne1 /*, ParentTwo2*/ {

    public static void main(String[] args) {

        ParentOne1 objp1 = new ParentOne1();
        objp1.methodP1();
      /*  ParentTwo2 objp2 = new ParentTwo2();
        objp2.methodP2();*/

    }
}
