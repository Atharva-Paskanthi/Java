package Thread;

public class ThreadUsingExtends extends Thread {

    public static void main(String[] args) {

        ThreadUsingExtends thread = new ThreadUsingExtends();
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Run method");
    }
}
