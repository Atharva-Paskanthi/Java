package OOPS.Inheritance;

class ParentPrivate{

    private void parentPrivate(){

    }
    public void parentPublic(){

    }
}

public class InheritanceWithPrivate extends ParentPrivate{

    public static void main(String[] args) {
        InheritanceWithPrivate child = new InheritanceWithPrivate();
        child.parentPublic();
    }
}
