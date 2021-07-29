package day4;
//ArrayList and iterator
import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Mark");
        names.add("Tim");
        names.add("Nick");
        names.add("Alex");

        for(int i = 0; i< names.size(); i++){
            System.out.println(names.get(i));
        }

//        System.out.println(mList);

//        Iterator iterator = names.iterator();
//        // hasNext will check if iterator has the element
//        while ((iterator.hasNext())){
//            System.out.println(iterator.next()); //print the element and move the cursor to the next
//        }
//
//        // foreach
//        for(String name: names){
//            System.out.println(name);
//        }
    }
}
