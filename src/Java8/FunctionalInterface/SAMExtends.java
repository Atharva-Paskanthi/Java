package Java8.FunctionalInterface;

@FunctionalInterface
interface S {
    void test();
}

@FunctionalInterface
interface Z extends S {
    //void show();

    @Override
    void test();
}

public class SAMExtends implements S,Z{

    @Override
    public void test() {

    }

/*    @Override
    public void show() {

    }*/
}
