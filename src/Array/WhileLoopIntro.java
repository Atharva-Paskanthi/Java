package Array;

public class WhileLoopIntro {

    public static void main(String[] args) {

        int[] array = {2,4,7,3,9,11,1,5,8,6};

        int i = 0;
        while(i<array.length){
            System.out.println("At index "+i+" Value of Array is : "+array[i]);
            i++;
        }

    }
}
