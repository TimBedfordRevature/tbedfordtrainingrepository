package day3;

public class Demo4 {
    public static void main(String[] args) {
        /*
        There are two ways to concat Strings in java
        1. using '+' operator
        2. using concat() method
         */

        String str = (new StringBuffer()).append("Hello").append("World").toString();

        String str1 = 10 + 20 + 30 + "sum" + 40 + 50; //60sum4050
        System.out.println(str1);

        String s1 = "Hello";
        String s2 = " World";
        s1.concat(s2);
        System.out.println(s1);

    }
}
