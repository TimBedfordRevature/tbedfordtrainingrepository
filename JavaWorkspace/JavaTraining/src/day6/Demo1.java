package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(7);
        numbers.add(3);
        numbers.add(1);
        numbers.add(6);
        numbers.add(5);

        System.out.println("Before sorting:");
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println("After sorting");
        System.out.println(numbers);
//        Iterator iterator = numbers.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

    }
}
