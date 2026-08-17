package Array;

public class IntroToForLoop {

    public static void main(String[] args) {

        //For Loop Syntax
        //for(initialization;condition;increment/decrement){
        //}

        int[] intArr = {1,2,3,4,5};

        for(int i = 0; i < intArr.length; i++){
            System.out.println("Value present in Array at index " + i + " and Value is " +intArr[i]);
        }

    }
}
