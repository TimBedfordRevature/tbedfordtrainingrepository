package day4;

import java.util.ArrayList;

//adding elements to a specific location
public class Demo5 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Mark");
        names.add("Tim");
        names.add("Nick");
        names.add("Alex");
        System.out.println(names);

        //getting element on a specified index
       // System.out.println(names.get(0));

        //adding the element on a specific index
        names.add(0, "Chris");
        System.out.println(names); //pushes all other elements forward 1 index

        //merge two lists
        ArrayList<String> newNames = new ArrayList<String>();
        newNames.add("John");
        newNames.add("Paul");
        names.addAll(0,newNames);
        System.out.println("\n"+names);

        //remove
        names.removeAll(newNames);
        System.out.println("\n"+names);

        //contains
        boolean x = names.contains("Nick");
        System.out.println(x);

        // removing an element based on condition
        names.removeIf(name -> name.contains("Nick"));
        System.out.println(names);
        x = names.contains("Nick");
        System.out.println(x);

    }
}
