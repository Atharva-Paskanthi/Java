package OOPS.Polymorphism.MethodOverriding;

//The access level in Child Class cannot be more restrictive than the access level of Parent class Method.
//For eg. if Parent class method is Public, Overridden child class method cannot be Private or Protected or Default

class Rule4Parent{

    protected void show(){

    }
}

public class Rule4 extends Rule4Parent{

    @Override
    public void show() {

    }
}
