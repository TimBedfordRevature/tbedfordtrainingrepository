package assignments;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("blue");
        hashSet.add("red");
        hashSet.add("yellow");
       // hashSet.add(null);

        System.out.println(hashSet);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("blue");
        linkedHashSet.add("red");
        linkedHashSet.add("yellow");

        System.out.println(linkedHashSet);

        //iterate through hashset
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //get number of elements in hashset
        System.out.println(hashSet.size());

        //empty hashset
        hashSet.removeAll(hashSet);
        System.out.println(hashSet);
        System.out.println(hashSet.size());
    }
}
