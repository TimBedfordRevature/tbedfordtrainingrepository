package day4;

import java.util.HashSet;
import java.util.Iterator;

//HashSet
public class Demo8 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Tim");
        hashSet.add("Nick");
        hashSet.add("Tim"); //will not add twice
        hashSet.add("Mark");
        hashSet.add(null);

        Iterator<String> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //remove()
        hashSet.remove("Tim");
        System.out.println(hashSet);

    }
}
