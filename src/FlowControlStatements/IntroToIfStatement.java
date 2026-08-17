package FlowControlStatements;

public class IntroToIfStatement {

    public static void main(String[] args) {
        int age = 17;

        boolean result = age > 18;

       /* if (result){
            System.out.println("You are eligible for voting");
        }*/

        if (age > 18){
            System.out.println("You are eligible for voting");
        }
        else{
            System.out.println("You are Not eligible for voting");
        }

    }
}
