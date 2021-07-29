package day4;
// Java Training Day 4 Practice

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Practice {
    public static void main(String[] args) {
        //Create new ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("pink");

        //print original ArrayList
        System.out.println(colors);

        //iterate through the ArrayLIst
        Iterator iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //add new element into first position of ArrayList
        colors.add(0, "purple");
        System.out.println(colors);

        //retrieve and print element from specified index
        System.out.println(colors.get(2));

        //replace element in specified index with new value
        colors.set(3, "green");
        System.out.println(colors);

        //remove third element
        colors.remove(2);
        System.out.println(colors);

        //Search for specified element
        System.out.println(colors.contains("purple"));

        //sort ArrayList
        Collections.sort(colors);
        System.out.println(colors);

        //copy/merge ArrayList to new ArrayList
        ArrayList<String> newColors = new ArrayList<>();
        newColors.addAll(colors);

        System.out.println(newColors);

        //alt method
        Collections.copy(newColors, colors);

        //Shuffle elements in ArrayList
        Collections.shuffle(colors);

        //reverse elements in ArrayList
        Collections.reverse(colors);
        System.out.println(colors);

        //Extract sublist/portion of ArrayList
        System.out.println(colors.subList(1,3));

        //Swap elements of ArrayList
        Collections.swap(colors, 1,2);
        System.out.println(colors);



    }
}
