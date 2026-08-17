package CollectionFramework;

import java.util.LinkedList;

public class IntroToLinkedList implements Cloneable {

    public static void main(String[] args) {

        LinkedList<Integer> Linkedlist = new LinkedList<>();
        Linkedlist.add(100);
        Linkedlist.add(200);
        Linkedlist.add(300);

        Linkedlist.remove(0); //calls unlink method internally

        IntroToLinkedList ori = new IntroToLinkedList();

        try {
            IntroToLinkedList clone = (IntroToLinkedList) ori.clone(); // will throw an exception as clone method doesn't support
        } catch (CloneNotSupportedException e) {                        //But if we implement the Cloneable interface with this class then it will work
            throw new RuntimeException(e);
        }
    }
}
