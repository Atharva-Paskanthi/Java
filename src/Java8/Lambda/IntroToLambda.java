package Java8.Lambda;

interface Lamdaa{
    void a();
    //void b();
}

interface Add{
    void add(int a, int b);
}


public class IntroToLambda{ //without implementing Lambdaa interface


/*    @Override
    public void a() {

    }*/

    public static void main(String[] args) {

        Add add = (a,b) -> {
            System.out.println("Addition of two numbers is "+ (a+b));
        };
        add.add(100,200);

        Lamdaa lamdaa = () -> {
            System.out.println("Implemented using lamda");
        };
        lamdaa.a();

        /*Lamdaa lamdaa = new Lamdaa() {    //without implementing Lambdaa interface

            @Override
            public void a() {
                System.out.println("Implemented Anonymously");
            }
        };
        lamdaa.a();*/
    }
}


interface Addition{
    void add(int a, int b);
}

class AdditionClass implements Addition{


    @Override
    public void add(int a, int b) {
        System.out.println("Addition of two numbers is "+ (a+b));
    }

    public static void main(String[] args) {
        AdditionClass obj = new AdditionClass();
        obj.add(100,300);
    }

}