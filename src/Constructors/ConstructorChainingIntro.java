package Constructors;

class ConstructParent{

    public ConstructParent(){
        System.out.println("No arg Constructor of Parent Class");
    }

    public ConstructParent(int a, String b){
        System.out.println("Arg Constructor of Parent Class");
    }
}

public class ConstructorChainingIntro extends ConstructParent{

    public ConstructorChainingIntro(){
        //super(); //Call to Parent Class No arg Constructor ... Java does it automatically
        //super(100,"xyz");
        System.out.println("No arg Constructor of Child Class");
    }

    public ConstructorChainingIntro(int a, String b){
        //super(); //Call to Parent Class No arg Constructor ... Java does it automatically
        super(100,"xyz");
        System.out.println("Arg Constructor of Child Class");
    }

    public static void main(String[] args) {

        ConstructorChainingIntro obj = new ConstructorChainingIntro();

        System.out.println("-----------------------------------------------");

        ConstructorChainingIntro obj2 = new ConstructorChainingIntro(11, "AP");

        System.out.println("-----------------------------------------------");

        ConstructParent obj3 = new ConstructParent(10, "AY");
        ConstructParent obj4 = new ConstructParent();
    }
}
