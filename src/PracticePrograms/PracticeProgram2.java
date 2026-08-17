package PracticePrograms;

public class PracticeProgram2 {

    public static void main(String[] args) {

    ClassA objA = new ClassA();
    ClassB objB = new ClassB();

    objA.DisplayMessage();
    objB.DisplayMessage();

    }

}

class ClassA {
    void DisplayMessage(){
        System.out.println("This is message from Class A");
    }
}

class ClassB {
    void DisplayMessage(){
        System.out.println("This is message from Class B");
    }
}
