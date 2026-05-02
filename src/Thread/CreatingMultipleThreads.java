package Thread;

public class CreatingMultipleThreads extends Thread{

    public static void main(String[] args) throws InterruptedException {

        CreatingMultipleThreads thread1 = new CreatingMultipleThreads();
        thread1.setName("Thread1");
        //thread1.setPriority(10); //Max Priority

        CreatingMultipleThreads thread2 = new CreatingMultipleThreads();
        thread2.setName("Thread2");
        //thread1.setPriority(1); //Min Priority

        //thread1.join();
        thread1.start();

        //thread1.join();

        thread2.start();
        //thread1.join();


        //result is not consistent
        //----------Solution-------------
        //Synchronization
        //Priority => setting Priority doesn't work
        //join() => Join works but the placement of join statement is important, also parallelism is not achieved as thread2 waits for thread1 to execute

    }

    @Override
    public void run() {

        synchronized (CreatingMultipleThreads.this){  //acquire lock on object
            for(int i=0;i< 3; i++){
                System.out.println("Count is "+i+" and Name is "+Thread.currentThread().getName());
            }


            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
