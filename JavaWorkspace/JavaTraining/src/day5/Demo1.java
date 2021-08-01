package day5;

class MultiThreadDemo extends Thread{
    @Override
    public void run(){ // The .start() method will call this method
        System.out.println("Thread is running...");
    }
}

public class Demo1 {
    public static void main(String[] args) {

        MultiThreadDemo threadDemo = new MultiThreadDemo();
        threadDemo.start(); //use .start() not .run()
    }
}
