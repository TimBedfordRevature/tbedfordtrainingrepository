package day3;

public class Demo2 {
    public static void main(String[] args) {

        String str = "Hello";
        str.concat("World"); // we are trying to use concat() method to append the string at the end
        System.out.println(str); // This will just print out the word "Hello" because strings are immutable objects

        /*
        we cannot modify Strings (because they are immutable)
        however we can re-assign their values
         */
        String str1 = "Hello";
        str1 = str1.concat(" World");
        System.out.println(str1);

        String str2 = "Hello" + "World";
        System.out.println(str2);



    }
}
