package CollectionFramework;


import java.util.Arrays;

public class CustomArrayList<E> {

    private static final int InitialCapacity = 10;
    private int size = 0;

    private Object elementData [] = {};


    public CustomArrayList(){    //Constructor of CustomArrayList class
        elementData = new Object[InitialCapacity];   //custom array list is created
    }


    private void add(E e){
        if (size == elementData.length) {
            ensureCapacity();   // ensureCapacity method is called if the size of array is reached the initial capacity (then the capacity doubles)
        }
        elementData[size++] = e;
    }

    private void ensureCapacity(){ //to increase the capacity
        int newIncreasedCapacity = elementData.length * 2;  //Increased the array capacity to 2X
        elementData = Arrays.copyOf(elementData, newIncreasedCapacity);  //Copies the array in elementData but with increased capacity
    }

    private void display(){
        System.out.print("Displaying the Custom Array List : ");
        for(int i =0; i<size; i++){
            System.out.print(elementData[i] +" ");
        }
    }

    public static void main(String[] args) {

        CustomArrayList cal = new CustomArrayList();
        cal.display();
    }

}
