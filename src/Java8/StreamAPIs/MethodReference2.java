package Java8.StreamAPIs;

interface TwoParameterInterface{

    int add (int a, int b);
}

public class MethodReference2 {

    static int addTest(int aa, int bb){
        return aa + bb;
    }

    public static void main(String[] args) {

        TwoParamFunction paramInterface = MethodReference2 :: addTest;

        int result = paramInterface.add(100,200);
        System.out.println("Result using Method Referemce : "+result);


    }
}
