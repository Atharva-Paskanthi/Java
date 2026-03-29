package AccessModifier.P2;

import AccessModifier.P1.PackageP1PublicClass;

public class PackageP2PublicClass extends PackageP1PublicClass {

    private int privateVariableP2;
    public int publicVariableP2;
    protected int protectedVariableP2;
    int defaultVariableP2;


    private void privateMethodP2(){
        System.out.println("private method of PackageP2PublicClass");
    }
    void defaultMethodP2(){
        System.out.println("default method of PackageP2PublicClass");
    }
    public void publicMethodP2(){
        System.out.println("public method of PackageP2PublicClass");
    }
    protected void protectedMethodP2(){
        System.out.println("protected method of PackageP2PublicClass");
    }

    public static void main(String[] args) {
        PackageP2PublicClass child = new PackageP2PublicClass();
        child.defaultMethodP2();
        child.protectedMethodP1(); //Child class can access protected method of another class if it is inheritad

        System.out.println("-----------------------------------------------------------------");
        PackageP1PublicClass obj4 = new PackageP1PublicClass();
        obj4.publicMethodP1();
        obj4.publicVariableP1 = 100;
        //obj4.protectedMethodP1(); //But object of parent class cannot access it, in another package

    }

}
