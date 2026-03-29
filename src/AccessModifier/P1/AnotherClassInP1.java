package AccessModifier.P1;

public class AnotherClassInP1 {

    public static void main(String[] args) {

        PackageP1PublicClass obj3 = new PackageP1PublicClass();
        obj3.protectedMethodP1();     //Private methods and variables not accessible
        obj3.defaultVariableP1 = 99;

    }
}
