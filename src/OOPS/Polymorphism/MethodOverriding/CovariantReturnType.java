package OOPS.Polymorphism.MethodOverriding;

//Method Overriding Rule 3

class CovariantParent{

    Number returnNumber(){
        return 100;
    }

    CovariantParent returnObj(){
        return new CovariantParent(); //returns Parent class object
    }
}

public class CovariantReturnType extends CovariantParent {

    @Override
    Integer returnNumber() { //Integer is child class of Number
        return 1000;
    }

    @Override
    CovariantParent returnObj() {
        return new CovariantReturnType(); //returns Child class object
    }
}
