package day5;

class MultiThreadDemo2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        MultiThreadDemo2 threadDemo2 = new MultiThreadDemo2();
        // the Runnable interface does not have the start() method
        Thread thread = new Thread(threadDemo2);
        thread.start();
    }
}
