package Thread;

public class Deadlock {

    final static String R1 = "Hello Welcome to Scalar";
    final static String R2 = "Visit Scalar";

    //Anonymous class implementation => Lamda expression
    //Heap Dump => Out of memory

    //How to identify we have Deadlock in code => We need to analyse Thread Dump
    //How to resolve Deadlock condition =>

    //wait notify
    //follow the lock acquiring and release order

    public static void main(String[] args) {

        //creating Thread T1
        Thread T1 = new Thread() {
            //implementing run method

            @Override
            public void run() {
                //Thread T1 locking the R1 resource
                synchronized (R1) {
                    System.out.println("Thread T1 locked -> Resource R1");
                    //Thread T1 locking the R2 resource
                    synchronized (R2) {
                        System.out.println("Thread T1 locked -> Resource R2");
                    } //Release Resource R2
                }//Release Resource R1
            }
        };

        //creating Thread T2
        Thread T2 = new Thread() {
            //implementing run method

            @Override
            public void run() {
                //Thread T2 locking the R2 resource
                synchronized (R2) {
                    System.out.println("Thread T2 locked -> Resource R2");
                    //Thread T2 locking the R1 resource
                    synchronized (R1) {
                        System.out.println("Thread T2 locked -> Resource R1");
                    }//Release Resource R1
                }//Release Resource R2
            }



        };

        //Starting both Threads
        T1.start();
        T2.start();
    }
}
