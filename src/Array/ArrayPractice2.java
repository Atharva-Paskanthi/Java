package Array;

public class ArrayPractice2 {
    public static void main(String[] args) {

        int[] ArrayTwo = {1,4,5,6,8,12,4,7,9,11,13};

        int sum = 0;

        for(int i = 0; i<ArrayTwo.length; i++){
            if (ArrayTwo[i]%2!=0){
                System.out.println("Odd elements in Array are : "+ArrayTwo[i]);

                sum = sum + ArrayTwo[i];
            }
        }

        System.out.println("The Addition of all Odd elements is : "+sum);

    }
}
