package Static;

public class StaticExample {

    static int var1; //static variable
    int var2;         //instance variable

    public static void main(String[] args) {

        StaticExample object1 = new StaticExample();
        object1.var1 = 20;
        object1.var2 = 20;

        /*System.out.println("object1.var1 ==> " + object1.var1);   //20
        System.out.println("object1.var2 ==> " + object1.var2);*/   //20

        //For Instance variable each object gets its own copy/value, while or objects share same copy in case of Static variable

        StaticExample object2 = new StaticExample();
        object2.var1 = 30;
        object2.var2 = 30;

        System.out.println("object1.var1 ==> " + object1.var1);    //30
        System.out.println("object1.var2 ==> " + object1.var2);    //20

        System.out.println("object2.var1 ==> " + object2.var1);   //30
        System.out.println("object2.var2 ==> " + object2.var2);   //30

        StaticExample object3 = new StaticExample();
        object3.var1 = 1001;
        object3.var2 = 40;

        System.out.println("--------------------------------------------------------");
        System.out.println("object1.var1 ==> " + object1.var1);    //1001
        System.out.println("object1.var2 ==> " + object1.var2);    //20

        System.out.println("object2.var1 ==> " + object2.var1);   //1001
        System.out.println("object2.var2 ==> " + object2.var2);   //30

        System.out.println("object3.var1 ==> " + object3.var1);   //1001
        System.out.println("object3.var2 ==> " + object3.var2);   //40

    }
}
