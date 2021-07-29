package day4;
//LinkedList

import java.util.Iterator;
import java.util.LinkedList;

public class Demo6 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Tim");
        names.add("Chris");
        names.add("Nick");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
