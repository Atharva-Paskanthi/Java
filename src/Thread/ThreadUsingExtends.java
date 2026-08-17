package Thread;

public class ThreadUsingExtends extends Thread {

    public static void main(String[] args) {

        ThreadUsingExtends thread = new ThreadUsingExtends(); //Creating Thread -> New State
        thread.start(); //Runnable State
        thread.show();

        if(thread instanceof Runnable){
            System.out.println("thread is instance of Runnable Interface"); //This is true because Thread Class implements Runnable
        }

        if(thread instanceof Thread){
            System.out.println("thread is instance of Thread");
        }

        ThreadUsingExtends thread1 = new ThreadUsingExtends();
        thread1.start();
        thread1.show();
    }

    @Override
    public void run() {
        //Running State
        System.out.println("Run method");
        show();

        try {
            Thread.sleep(1000); //Blocked State
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    void show(){
        System.out.println("Show method");
    }

}
