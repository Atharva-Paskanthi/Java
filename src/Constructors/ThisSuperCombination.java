package Constructors;

class Parent11{

    public Parent11(){
        this(4,"xy");
        System.out.println("No-arg of Parent");
    }

    public Parent11(int a, String b){
        System.out.println("2-arg of Parent");
    }
}

public class ThisSuperCombination extends Parent11 {
    public ThisSuperCombination(){
        //super();
        System.out.println("No-arg of Child");
    }

    public ThisSuperCombination(String a, String b, int c){
        this();
        System.out.println("3-arg of Child");
    }

    public static void main(String[] args) {
        ThisSuperCombination pp = new ThisSuperCombination("a" , "p" , 3);
    }
}
