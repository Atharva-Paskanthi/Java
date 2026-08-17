package Thread;

interface ABCD{

    void test();
    void show();
}

class AnonymousImp {

    public static void main(String[] args) {

        ABCD abcd = new ABCD() { //implemented interface anonymously

            @Override
            public void test() {
                System.out.println("Test Method is implemented Anonymously");
            }

            @Override
            public void show() {
                System.out.println("Show Method is implemented Anonymously");
            }

        };

        abcd.test();
        abcd.show();
    }

}

public class AnonymousClass implements ABCD {

    @Override
    public void test() {
        System.out.println("Test Method");
    }

    @Override
    public void show() {
        System.out.println("Show Method");
    }

    public static void main(String[] args) {

        AnonymousClass obj = new AnonymousClass();
        obj.test();
        obj.show();
    }
}
