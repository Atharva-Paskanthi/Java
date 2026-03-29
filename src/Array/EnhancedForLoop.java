package Array;

public class EnhancedForLoop {

    public static void main(String[] args) {

        int[] array = {2,4,7,3,9,11,1,5,8,6};

        //For Loop
        for(int i =0; i< array.length;i++){
            System.out.println("At index "+i+" Value of Array is : "+array[i]);
        }

        System.out.println("===============================================");

        //Enhanced For Loop or For Each Loop
        for(int j : array){
            System.out.println("Element in array are : "+j);
        }
    }
}
