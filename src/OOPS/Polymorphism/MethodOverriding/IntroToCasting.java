package OOPS.Polymorphism.MethodOverriding;

class Parent{

}

public class IntroToCasting extends Parent{

    public static void main(String[] args) {

         IntroToCasting referenceType = new IntroToCasting();   //No Casting

//         ClassName    referenceName = new ClassName();
//              Reference Type        =   Actual Object Type

//              SameClass   =   SameClass   =>  No Casting
//              ChildClass  =   ParentClass =>  DownCasting or Explicit
//              ParentClass =   ChildClass  =>  UpcCasting ore Implicit or Natural

        IntroToCasting child = (IntroToCasting) new Parent();   //DownCasting

        Parent parent = new IntroToCasting();   //UpCasting

        Parent obj1 = new Parent(); //No Casting

    }
}
