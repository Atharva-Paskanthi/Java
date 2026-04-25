package Thread;

public class CreatingTreadUsingRunnable implements Runnable{

    public static void main(String[] args) {

        CreatingTreadUsingRunnable runnable = new CreatingTreadUsingRunnable(); //runnable is reference/object of Runnable interface and not a thread
        //runnable.start();   //Therefore this statement will throw an error

        Thread thread = new Thread(runnable); //here we are creating object of Thread class and passing reference Runnable
        thread.start(); //This statement will work as thread is object of Thread class

/*        if(runnable instanceof Runnable){
            System.out.println("runnable is instance of Runnable Interface and not Thread");
        }*/

/*
        if(runnable instanceof Thread){
            System.out.println("runnable is instance of Thread Interface and not Runnable");
        }
*/

    }

    @Override
    public void run() {

    }
}
