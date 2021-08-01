package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{

    private String message;
    public WorkerThread(String msg){
        this.message = msg;
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + "Start message -> " + message);
        proccessMessage(); // the tread will sleep for 2 seconds
        System.out.println(Thread.currentThread().getName() + "End message -> " + message);
    }

    private void proccessMessage(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

public class Demo8 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5); //creating a pool of 5 threads

        for (int i = 0; i < 10; i++){
            Runnable worker = new WorkerThread(" " + i);
            executorService.execute(worker); //calls the execute method of the executor service
        }
        executorService.shutdown();
        while (!executorService.isTerminated()){

        }
        System.out.println("Finished all thread");

    }
}
