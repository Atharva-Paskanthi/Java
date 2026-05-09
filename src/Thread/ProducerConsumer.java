package Thread;

import java.util.LinkedList;

public class ProducerConsumer {

    public static void main(String[] args)
        throws InterruptedException {

        //Creating Object of class which has both produce() and consume() methods
        final PC pc = new PC();

        //Creating Producer Thread
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {

                try{
                    pc.produce();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

        );

        //Creating Consumer Thread
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {

                try{
                    pc.consume();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

        );

        //Start both Threads
        t1.start();
        t2.start();

        //t1 finishes before t2
        t1.join();
        t2.join();

    }

    // This class has a list, producer (adds items to list) and consumer (removes items).
    public static class PC{
        //Create a List shared by Producer and Consumer
        //Size of List is 5
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 5;

        //Function called by Producer thread
        public void produce() throws InterruptedException{

            int value = 0 ;

            while(true){
                synchronized (this){
                    //producer thread waits while the list is full
                    if(list.size() == capacity) {
                        System.out.println("Showroom is full, producer is waiting...");

                        //Signal any waiting Consumer before waiting
                        notify();
                        wait();

                    }

                        //to insert the jobs in the list
                        list.add(value); //Added new Car in Showroom
                        System.out.println("Producer produced : "+value);
                        value++;

                        //notify the Consumer thread that now it can start consuming
                        notify();

                        //makes the working of the program easier to understand
                        Thread.sleep(1000);
                }
            }

        }

        //Function called by Consumer thread
        public void consume() throws InterruptedException{

            while(true){
                synchronized (this){
                    //Consumer Thread waits while list is empty
                    if(list.size()==0){
                        System.out.println("Showroom is empty, Consumer is waiting...");

                        //Signal any waiting Producer before waiting
                        notify();
                        wait();
                    }

                    //To retrive the First job in the list
                    int val = list.removeFirst(); //Customer took a Car from Showroom
                    System.out.println("Consumer consumed : "+val);

                    //Wake up Producer Thread
                    notify();

                    //and sleep
                    Thread.sleep(1000);
                }

            }
        }

    }

}
