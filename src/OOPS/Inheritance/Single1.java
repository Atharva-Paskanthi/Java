package OOPS.Inheritance;

class Parent1{
    void DisplayMessage(){
        System.out.println("This Method is from Parent Class");
    }
}

public class Single1 extends Parent1 {

    void DisplayMessage2(){
        System.out.println("This Method is from Child Class");
    }

    public static void main(String[] args) {

        Single1 s1 = new Single1();
        s1.DisplayMessage2();
        s1.DisplayMessage();
    }
}