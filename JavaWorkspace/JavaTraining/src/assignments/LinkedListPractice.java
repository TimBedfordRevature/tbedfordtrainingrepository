package assignments;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("red");
        linkedList.add("blue");
        linkedList.add("yellow");

        System.out.println(linkedList);

        //append element to the end of the linkedlist
        linkedList.addLast("green");

        System.out.println(linkedList);

        //iterate through all elements
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //iterate through list from specific element
        Iterator iterator1 = linkedList.listIterator(1);
        System.out.println("\niterator starting at index 1:");
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        //revers iterate through list
        Iterator iterator2 = linkedList.descendingIterator();
        System.out.println("\nreverse order iteration:");
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        //insert an element in a specified index
        linkedList.add(2,"pink");
        System.out.println(linkedList);
    }
}
