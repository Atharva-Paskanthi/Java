package AccessModifier;

public class OuterClass {
    private int OuterData = 10;

    private class PrivateInnerClass{
        public void display(){
            System.out.println("Accessing Outer Class Data : " + OuterData); //Can Access private outer data
        }
    }

    //Method in outer class to use Private Inner class
    public void demonstrateInnerClass(){
        PrivateInnerClass inner = new PrivateInnerClass();
        inner.display();

    }
}
