package OOPS.Abstraction;

abstract class Rule4Parent{
    abstract void test();
}

abstract class Rule4Child extends Rule4Parent{
    /*void test(){
        System.out.println("1 abstract class extended to another abstract class & provided implementation details to abstract method");
    }*/

    abstract void display();
}

public class AbstractionRule4 extends Rule4Child{

    void test(){
        System.out.println("implemented abstract method from Rule4Parent class");
    }

    void display(){
        System.out.println("implemented abstract method from Rule4Child class");
    }
}
