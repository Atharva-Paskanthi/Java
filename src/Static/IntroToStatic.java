package Static;

public class IntroToStatic {

    int instance = 1000;
    static int staticVar = 20001;

    void intstanceMethod(){
        System.out.println("This is Instance Method");
        instance = 400;
        staticVar = 5000;
    }

    static void staticMethod(){
        System.out.println("This is Static Method");
        IntroToStatic obj = new IntroToStatic(); //Need an object to access the instance variables
        obj.instance = 5000;
        staticVar = 30002;
    }

    public static void main(String[] args) {
        staticMethod();    //static method can be accessed directly
        new IntroToStatic().intstanceMethod(); //for instance we need object of the class to access it
    }
}
 