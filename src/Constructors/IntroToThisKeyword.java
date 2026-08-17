package Constructors;

public class IntroToThisKeyword {

    public IntroToThisKeyword(){
        this(100,true);
        System.out.println("No-arg");
    }

    public IntroToThisKeyword(int a , boolean b){
        this("Java" , 99,false);
        System.out.println("2-arg");
    }

    public IntroToThisKeyword(String s, int c , boolean d){
        System.out.println("3-arg");
    }

    public static void main(String[] args) {

        IntroToThisKeyword obj = new IntroToThisKeyword();

    }
}
