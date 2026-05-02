package Thread;

class ParentAnonymous{

    void show(){
        System.out.println("Parent Class Method");
    }
}

public class TestAnonymousClass {

    ParentAnonymous anonymous = new ParentAnonymous(){
        void show(){
            System.out.println("Anonymous Class Implemented");
        }
    };



    public static void main(String[] args) {
 /*       TestAnonymousClass obj = new TestAnonymousClass();
        obj.test();*/

        TestAnonymousClass obj = new TestAnonymousClass();
        obj.anonymous.show();

        ParentAnonymous obj2 = new ParentAnonymous();
        obj2.show();
    }

}
