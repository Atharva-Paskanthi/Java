package Array;

public class ArrayOddEvenProgram {

    public static void main(String[] args) {

        int[] array = {2,4,7,3,9,11,1,5,8,6};
                    // 0 1 2 3 4  5 6 7 8 9

        int OddSum = 0;
        int EvenSum = 0;

        for(int i=0;i< array.length;i++){

            if(i%2==0){
                EvenSum = EvenSum + array[i];
            }
            else{
                OddSum = OddSum + array[i];
            }

        }

        System.out.println("The Sum of Even Index is : "+EvenSum);
        System.out.println("The Sum of Odd Index is : "+OddSum);
    }
}
