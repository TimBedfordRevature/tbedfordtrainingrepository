package day5;

class TestCallRun extends Thread {
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}

public class Demo4 {
    public static void main(String[] args) {
        TestCallRun test1 = new TestCallRun();
        TestCallRun test2 = new TestCallRun();
//        test1.start();
//        test2.start();
        /*
        output:
        0
        0
        1
        1
        ...
         */

        /*
        if you directly call the .run() method instead of start
        the run() method goes into the current call stack
        rather then beginning of a new stack...
        if run method is called directly there will be no
        context switching and test1 and test2 threads will
        be treated as normal objects
         */
        test1.run();
        test2.run();

        /*
        output:
        0
        1
        2
        ...
        0
        1
        2
         */

    }
}
