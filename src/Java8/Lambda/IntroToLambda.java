package Java8.Lambda;

interface Lamdaa{
    void a();
    //void b();
}

public class IntroToLambda{ //without implementing Lambdaa interface


/*    @Override
    public void a() {

    }*/

    public static void main(String[] args) {

        Lamdaa lamdaa = () -> {
            System.out.println("Implemented Anonymously");
        };

        /*Lamdaa lamdaa = new Lamdaa() {    //without implementing Lambdaa interface

            @Override
            public void a() {
                System.out.println("Implemented Anonymously");
            }
        };
        lamdaa.a();*/
    }
}
