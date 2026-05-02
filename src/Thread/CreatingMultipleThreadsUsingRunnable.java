package Thread;

public class CreatingMultipleThreadsUsingRunnable implements Runnable{

    public static void main(String[] args) {

        CreatingMultipleThreadsUsingRunnable runnable = new CreatingMultipleThreadsUsingRunnable();

        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread thread2 = new Thread(runnable);
        thread2.start();

    }

    @Override
    public void run() {

        //synchronized (this){
            //OR
        synchronized (CreatingMultipleThreadsUsingRunnable.this){  //acquire lock on object (object-level lock)
            for(int i=0;i< 3; i++){
                System.out.println("Count is "+i+" and Name is "+Thread.currentThread().getName());
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
