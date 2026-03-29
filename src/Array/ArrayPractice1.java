package Array;

public class ArrayPractice1 {
    public static void main(String[] args) {

        int[] ArrayOne = {1,4,5,6,8,12,4,7,9,11,13};

        int sum = 0;

        for(int i = 0; i<ArrayOne.length; i++){
            sum = sum + ArrayOne[i];
        }

        System.out.println("The Addition of all elements is : "+sum);
    }
}
