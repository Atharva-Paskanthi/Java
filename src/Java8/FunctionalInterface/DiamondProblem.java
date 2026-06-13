package Java8.FunctionalInterface;

interface AA1{

    default void A1(){
        System.out.println("Default A1 Method of interface AA1");
    }

/*    default void A2(){
        System.out.println("Default A2 Method of interface AA1");
    }*/
}

interface BB1{

    default void A1(){
        System.out.println("Default A1 Method of interface BB1");
    }

    default void A2(){
        System.out.println("Default A2 Method of interface BB1");
    }
}

public class DiamondProblem implements AA1,BB1 {

    @Override
    public void A1() {
        //AA1.super.A1();
        BB1.super.A1();
    }

/*    @Override
    public void A2() {      //It is not Mandatory to override default method if its present only in one of the 2 implemented interface
        AA1.super.A2();
    }*/

    public static void main(String[] args) {

        DiamondProblem obj = new DiamondProblem();
        obj.A1();
        obj.A2();

    }
}
