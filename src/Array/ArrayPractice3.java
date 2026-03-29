package Array;

public class ArrayPractice3 {
    public static void main(String[] args) {

        int[] ArrayThree = {1,4,5,6,8,12,4,7,9,11,13};

        int sum = 0;

        for(int i = 0; i<ArrayThree.length; i++){
            if (ArrayThree[i]%2==0){
                System.out.println("Even elements in Array are : "+ArrayThree[i]);

                sum = sum + ArrayThree[i];
            }
        }

        System.out.println("The Addition of all Even elements is : "+sum);

    }
}
