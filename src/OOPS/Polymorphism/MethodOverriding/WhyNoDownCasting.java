package OOPS.Polymorphism.MethodOverriding;

class DownParent{

    void test(){
        System.out.println("Parent Class");
    }
}

public class WhyNoDownCasting extends DownParent{

    @Override
    void test() {
        System.out.println("Child Class");
    }

    void show(){
        System.out.println("Method from Child Class");
    }

    public static void main(String[] args) {

        DownParent pp = new DownParent(); //No Casting
        pp.test();

        WhyNoDownCasting cc = new WhyNoDownCasting(); //No Casting
        cc.test();

        DownParent parent = new WhyNoDownCasting(); //UpCasting
        parent.test();

        WhyNoDownCasting downCasting = (WhyNoDownCasting) new DownParent(); //DownCasting
        downCasting.test();
    }
}
