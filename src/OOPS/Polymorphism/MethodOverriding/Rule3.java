package OOPS.Polymorphism.MethodOverriding;

//Return type must be same for both Child and Parent methods in case of Primitive Data type
class Rule3Parent{

    int add(int a,int b){
        return a + b;
    }
}

public class Rule3 extends Rule3Parent {

    @Override
    int add(int a, int b) {
        return a + b + 100;
    }
}
