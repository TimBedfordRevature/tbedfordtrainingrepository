package day4;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo7 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Tim");
        names.add("Nick");
        names.add("Chris");
        System.out.println(names);

        //adding element in specified location
        names.add(0,"Lai");
        System.out.println(names);

        //new linkedlist
        LinkedList<String> names2 = new LinkedList<>();
        names2.add("Kyle");
        names2.add("Brad");

        //adding all elements from names2 to names
        names.addAll(names2);
        System.out.println(names);

        // addFirst()
        names.addFirst("John");
        System.out.println(names);

        // addLast()
        names.addLast("Matt");
        System.out.println(names);

        /*
        remove()
        removeFirst()
        removeLast()
        removeFirstOccurrence()
        removeLastOccurrence()
         */

        names.add("John");
        System.out.println(names);

        //removeFirstOccurrence
        names.removeFirstOccurrence("John");
        System.out.println(names);

        //reverse elements
        Iterator iterator = names.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
