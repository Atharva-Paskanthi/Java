package OOPS.Abstraction;

public class NonAbstractParent {
    void show(){
        System.out.println("Non Abstract Class method");
    };
}

abstract class AbstractChild extends NonAbstractParent{

    //But as we cannot create object of abstract class(i.e AbstractChild) we cannot call 'show' method
    //If we still want to call show methods we need to create object of NonAbstractParent class

    public static void main(String[] args) {
        NonAbstractParent obj = new NonAbstractParent();
        obj.show();
    }

    abstract void add();

}

class NonAbstractTest extends AbstractChild{
    void add(){
        System.out.println("Implemented abstract method in NonAbstract class");
    }
}
