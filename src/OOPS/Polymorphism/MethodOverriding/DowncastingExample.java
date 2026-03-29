package OOPS.Polymorphism.MethodOverriding;

class X{
    void calculate(int a, int b){
        System.out.println("Class X");
    }
}

class Y extends X{
    @Override
    void calculate(int a, int b) {
        System.out.println("Class Y");
    }
}

class Z extends Y {
    @Override
    void calculate(int a, int b) {
        System.out.println("Class Z");
    }
}

public class DowncastingExample{
    public static void main(String[] args) {

        X x1 = new X();
        x1.calculate(20, 30);

        X x2 = new Y(); //Upcastiing
        x2.calculate(10,20);

        Y y =  (Y) x2;
        y.calculate(50,100);


        Z z1 = (Z) y;
        z1.calculate(100,201); //Will Throw Exception at Runtime

        X x3 = new Z();

        Z z = (Z) x3;
        z.calculate(100, 200);

    }
}
