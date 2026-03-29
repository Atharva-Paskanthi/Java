package PracticePrograms;

public class PracticeProgram1 {

    static void DisplayMethod(int result){
        System.out.println(result);
    }

    void AdditionMethod(int a,int b){
        int c = a + b;
        DisplayMethod(c);
    }

    public static void main(String[] args) {

    PracticeProgram1 p1 = new PracticeProgram1();
    p1.AdditionMethod(10,15);

    }
}
