package OOPS.Inheritance;

class ParentOne{
    void ParentMethod1(){
        System.out.println("This is example of Hierarchical Inheritance");
    }
}

class Child1 extends ParentOne{
    void Child1Method1(){

    }

    void Child1Method2(){

    }
}

class Child2 extends ParentOne{
    void Child2Method1(){

    }
}

public class Hierarchical1 {
    public static void main(String[] args) {

        Child1 ch1 = new Child1();
        ch1.ParentMethod1();    //Same Parent Method
        ch1.Child1Method1();    //Own Method
        ch1.Child1Method2();    //Own Method

        Child2 ch2 = new Child2();
        ch2.ParentMethod1();    //Same Parent Method
        ch2.Child2Method1();    //Own Method

    }
}
