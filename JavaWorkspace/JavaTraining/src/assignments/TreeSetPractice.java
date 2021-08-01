package assignments;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("red");
        treeSet.add("blue");
        treeSet.add("yellow");

        System.out.println("Original TreeSet:\n"+treeSet);

        //iterate through treeset
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //add all elements from one treeset to another
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.addAll(treeSet);
        System.out.println("new TreeSet:\n" + treeSet1);

        //reverse order TreeSet iterator
        Iterator iterator1 = treeSet.descendingIterator();
        System.out.println("Reverse order TreeSet");
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());
    }
}
