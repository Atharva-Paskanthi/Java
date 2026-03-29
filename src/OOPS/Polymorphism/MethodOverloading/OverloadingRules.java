package OOPS.Polymorphism.MethodOverloading;

public class OverloadingRules {

    void show(int a){
        System.out.println("Message 1");
    }

    void show(int a, int b){    //Different Number/quantity of Parameters
        System.out.println("Message 2");
    }

    void show(String a, int b){     //Different Datatype of parameters
        System.out.println("Message 3");
    }

    public void show(int a, String b){     //Different Sequence/Order of Parameters
        System.out.println("Message 4");
    }

    int show(int a, String b, int c){     //Different return type
        System.out.println("Message 5");
        return 100;
    }

    private void show(int a, String b, String c){     //Different Access modifier
        System.out.println("Message 6");
    }

    public static void main(String[] args) {
        OverloadingRules obj = new OverloadingRules();
        obj.show(3);
        obj.show("AP", 5);
        obj.show(1, "IND","NZ");
    }
}
