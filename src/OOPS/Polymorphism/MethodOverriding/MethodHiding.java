package OOPS.Polymorphism.MethodOverriding;

class StaticParent{

    public static void display(){
        System.out.println("Static method in Parent");
    }
}

public class MethodHiding extends StaticParent{

    public static void display(){       //Hides Parent's display() method
        System.out.println("Static method in Child");
    }

    public static void main(String[] args) {
        MethodHiding child = new MethodHiding();
        child.display();
    }
}
