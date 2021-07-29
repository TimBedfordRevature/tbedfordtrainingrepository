package day4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo10 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Tim");
        queue.add("John");
        queue.add("Nick");

        Iterator iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
