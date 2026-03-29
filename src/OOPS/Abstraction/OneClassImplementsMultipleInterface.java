package OOPS.Abstraction;

interface A1{
    void a();
}

interface A2{
    void b();
    void c();
}

interface A3 extends A1, A2{
    int d();
}

public class OneClassImplementsMultipleInterface implements A1, A3, A2 {

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public int d() {
        return 0;
    }
}
