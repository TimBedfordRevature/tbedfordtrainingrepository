package day4;

import java.util.ArrayList;
import java.util.Collections;

public class Demo3 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Yellow");
        colors.add("red");
        colors.add("orange");
        colors.add("blue");
        colors.add("pink");

        //before sorting
        System.out.println("Before sorting:");
        for(String color : colors){
            System.out.println(color);
        }

        //after sorting
        System.out.println("After sorting:");
        Collections.sort(colors);
        for(String color : colors){
            System.out.println(color);
        }

        //List of numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(3);
        numbers.add(6);
        numbers.add(8);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);

        //before sort
        System.out.println("Before sorting:");
        for(Integer number : numbers){
            System.out.println(number);
        }

        //after sort
        System.out.println("After sorting:");
        Collections.sort(numbers);
        for(Integer number : numbers){
            System.out.println(number);
        }
    }
}
