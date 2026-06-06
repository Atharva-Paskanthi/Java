package CollectionFramework;


import java.util.Arrays;

public class CustomArrayList<E> {

    private static final int InitialCapacity = 3;
    private int size = 0;

    private Object elementData [] = {};


    public CustomArrayList(){    //Constructor of CustomArrayList class
        elementData = new Object[InitialCapacity];   //custom array list is created
    }

    //Method to add the element in array list
    public void add(E e){
        if (size == elementData.length) {
            ensureCapacity();   // ensureCapacity method is called if the size of array is reached the initial capacity (then the capacity doubles)
        }
        elementData[size++] = e;
    }

    //Method to get the element from array list
    public E get(int index){
        //Exception (if index provided is less than zero or greater than the size of array)
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index : "+index+ " Size : "+size);

        System.out.println("Element in Custom Array list at index "+index+" : "+elementData[index]);
        return (E) elementData[index];
    }

    public Object remove(int index) {
        //Exception (if index provided is less than zero or greater than the size of array)
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index : "+index+ " Size : "+size);

        Object removedElement = elementData[index];
        for(int i=index; i<size-1; i++){
            elementData[i] = elementData[i+1]; //Move the other elements in the list by one index after it is removed
        }
        size--;

        System.out.println("Removed Element in Custom Array list at index "+index+" : "+removedElement);
        return removedElement;
    }

    private void ensureCapacity(){ //to increase the capacity
        int newIncreasedCapacity = elementData.length * 2;  //Increased the array capacity to 2X
        elementData = Arrays.copyOf(elementData, newIncreasedCapacity);  //Copies the array in elementData but with increased capacity
    }

    public void display(){
        System.out.print("Displaying the Custom Array List : ");
        for(int i =0; i<size; i++){
            System.out.print(elementData[i] +" | ");
        }
        System.out.println();

        System.out.println("Custom Array List capacity : " + elementData.length);
    }



    public static void main(String[] args) {

        CustomArrayList cal = new CustomArrayList();
        cal.display();
        cal.add("Java");
        cal.add(2);
        cal.add(true);
        cal.add(235);
        cal.add(032.923);
        cal.display();
        cal.add(14);
        cal.add("FMZ");
        cal.add("Accenture");
        cal.remove(1);
        cal.display();
        cal.get(1);
        cal.get(5);
    }

}
