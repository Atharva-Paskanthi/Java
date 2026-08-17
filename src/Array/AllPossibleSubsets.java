package Array;

public class AllPossibleSubsets {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

//        1
//        1 2
//        1 2 3
//        1 2 3 4
//
//        2
//        2 3
//        2 3 4
//
//        3
//        3 4
//
//        4

        for(int i =0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){

                for(int k =i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }

                System.out.println();
            }
        }

        //For explanation
        for(int i =0;i< arr.length;i++){
            System.out.print("i = "+i); //For test
            for(int j =i;j<arr.length;j++){
                System.out.print("j = "+j); //For test
                for(int k =i;k<=j;k++){
                    System.out.print("k = "+k); //For test
                    System.out.print("|"+arr[k]+"|");
                }
                System.out.println();
            }
        }

    }
}
