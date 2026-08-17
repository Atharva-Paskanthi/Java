package AccessModifier;

import java.sql.SQLOutput;

class Engine{
    void startEngine(){
        System.out.println("Engine Started");
    }
}

class Car{

    void Chassis () {
        System.out.println("Car has Chassis");
    }
    void Tyres () {
        System.out.println("Car has Tyres");
    }

    public static void main(String[] args) {
        Engine e1 = new Engine(); // HAS-A Relationship (Creating s object of Different class & using its method)
        e1.startEngine();
    }
}

class Tata extends Car{     //IS-A Relationsip (Inheritance / Parent-Child Relation)

}


public class IS_A_HAS_A {
    public static void main(String[] args) {

        Tata t1 =  new Tata();
        t1.Chassis();
        t1.Tyres();
    }
}
