package OOPS.Polymorphism.MethodOverriding;

class Parent11{
    void show(int a, String b){
        String bt = b.toLowerCase();
        int d = a + 100;
        System.out.println("Parent Class Method --> "+d+" "+bt);
    }
}

class AnotherChild extends Parent11{

}

public class IntroToOverriding extends Parent11 {

    //@Override
    void show(int aa, String bb) {
        String bt = bb.toUpperCase();
        int d = aa + 300;
        System.out.println("Child Class Method --> "+d+" "+bt);
    }

    public static void main(String[] args) {
        AnotherChild child1 =  new AnotherChild();
        child1.show(1000, "Java");

        IntroToOverriding child2 = new IntroToOverriding();
        child2.show(1000, "Java");
    }
}


