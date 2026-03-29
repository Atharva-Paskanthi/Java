package Array;

import java.sql.SQLOutput;

public class ArraySorting {
    public static void main(String[] args) {

        int[] array = {2,5,8,9,3,4,6,1,7};

        //Bubble Sort
/*
        for(int i=0; i<array.length-1;i++){

            for(int j=i+1; j<array.length;j++){

                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
*/

        for(int i=0; i<array.length;i++){
            System.out.println("Inside outer Loop");
            for(int j=0; j<array.length-1;j++){
                System.out.println("Inside inner Loop");
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    System.out.println("{"+array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+array[6]+array[7]+array[8]+"}");
                }
            }
        }

        //Print in Ascending Order
        for(int i = 0; i<array.length; i++){
            System.out.println("At index "+i+" Value of Array is : "+array[i]);
        }

        //Print in Descending Order
//        for(int i = array.length-1;i>=0;i--){
//            System.out.println("At index "+i+" Value of Array is : "+array[i]);
//        }

    }
}
