package FlowControlStatements;

public class NestedIfElseProgram {

    public static void main(String[] args){

        boolean isPassed = true;
        int marks = 91;

        if(isPassed){
            if(marks>=35 && marks<60){
                System.out.println("You have passed the Exam");
            }
            else if(marks>=60 && marks<75){
                System.out.println("You have passed the Exam in First Class");
            }
            else if(marks>=75 && marks<90){
                System.out.println("You have passed the Exam with Distinction");
            }
            else if(marks>=90){
                System.out.println("You have passed in Merit");
            }
        }
        else{
            System.out.println("You have failed the Exam, try next Year");
        }
    }
}
