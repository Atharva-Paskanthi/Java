package OOPS.Polymorphism.MethodOverriding;

public class ObjectReturningMethod {

    private int age;
    private String name;

    public ObjectReturningMethod(){};

    public ObjectReturningMethod(int age, String name) {
        this.age = age;
        this.name = name;
    }

    ObjectReturningMethod returnObject(){
        ObjectReturningMethod obj = new ObjectReturningMethod(100, "Java");
        return obj;
    }

    public static void main(String[] args) {

    }
}
