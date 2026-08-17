package Array;

public class ArraySwapElements {
    public static void main(String[] args) {

        int[] intArray = {10,20};

        for(int i = 0;i<intArray.length;i++){
            System.out.println("Value of index "+i+" before : "+intArray[i]);
        }

        System.out.println("===============================");

        int temp = intArray[0];
        intArray[0] = intArray[1];
        intArray[1] = temp;

        for(int i = 0;i<intArray.length;i++){
            System.out.println("Value of index "+i+" before : "+intArray[i]);
        }

    }
}
