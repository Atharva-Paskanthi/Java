package OOPS.Inheritance;

class JavaParentClass{

    void ParentClassMethod(){
        System.out.println("This is Method of Parent Class");
    }
}

public class IntroToInheritance extends JavaParentClass{

    void ChildClassMethod(){
        System.out.println("This is Method of Child Class");
    }

    public static void main(String[] args) {
        IntroToInheritance obj = new IntroToInheritance(); //Object of Child Class
        obj.ParentClassMethod();
        obj.ChildClassMethod();

//        JavaParentClass parent = new JavaParentClass(); //Object of Parent Class
//        parent.ChildClassMethod();
    }
}

