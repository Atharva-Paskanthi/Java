package OOPS.Abstraction;

interface BB1{
    void display();
}

interface BB2{
    void display();
    void show();
}

public class DiamondProblemUsingInterface implements BB1, BB2 {

    //@Override
    public void display() {                                 //No diamond problem
        System.out.println("Implemented display method");
    }

    @Override
    public void show() {
        System.out.println("Implemented show method");
    }
}
