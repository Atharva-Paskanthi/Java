package JavaBasicPrograms;

public class HowtoCreateMethods {

    //Syntax for creating Methods
    //1)  return_type methodName(){
    //        code
    //   }


    //2)  return_type methodName(parameters){
    //        code
    //   }


    //3) return_type methodName(parameters){
    //        return;
    //   }

    void function1(){
        return; //Empty return, it is okay even if we don't write it
    }

    int function2(){
        return 1;
    }

    char function3(){
        return 'x';
    }

    double function4(int a, long b){
        double result = a*b;
        return result;
    }


    //void --> returns nothing
    //empty vs null
    public static void main(String[] args){

        //How many ways we can create object of class
        //1) Using new keyword

        //Syntax for creating object of class
        // ClassName reference/objectName = new ClassName();

        HowtoCreateMethods obj = new HowtoCreateMethods();

        HowtoCreateMethods abcd = new HowtoCreateMethods();


        String s1 = "";
        String s2 = null;

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}
