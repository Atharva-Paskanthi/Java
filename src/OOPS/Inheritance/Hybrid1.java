package OOPS.Inheritance;

class One{
    void OneMethod1(){
        System.out.println("Level 1 Method");
    }
}

class OneOne extends One {
    void OneOneMethod1(){
        System.out.println("Level 2.1 Method");
    }
}

class OneTwo extends One{
    void OneTwoMethod1(){
        System.out.println("Level 2.2 Method");
    }
}

class OneOneOne extends OneOne{
    void OneOneOneMethod1(){
        System.out.println("Level 3.1 Method");
    }
}

class OneTwoOne extends OneTwo{
    void OneTwoOneMethod1(){
        System.out.println("Level 3.2 Method");
    }
}

class OneTwoTwo extends OneTwo{
    void OneTwoTwoMethod1(){
        System.out.println("Level 3.3 Method");
    }
}


public class Hybrid1 {
    public static void main(String[] args) {
        OneOneOne obj1 = new OneOneOne();
        obj1.OneMethod1();
        obj1.OneOneMethod1();
        obj1.OneOneOneMethod1();
        System.out.println("--------------------------------------------");

        OneTwoOne obj2 = new OneTwoOne();
        obj2.OneMethod1();
        obj2.OneTwoMethod1();
        obj2.OneTwoOneMethod1();
        System.out.println("--------------------------------------------");

        OneTwoTwo obj3 = new OneTwoTwo();
        obj3.OneMethod1();
        obj3.OneTwoMethod1();
        obj3.OneTwoTwoMethod1();

    }
}
