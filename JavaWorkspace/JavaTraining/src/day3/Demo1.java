package day3;
/*
String class methods that are provided:
charAt()
length()
subString()
contains()
join()
equals()
isEmpty()
concat()
 */

public class Demo1 {
    public static void main(String[] args) {

        String s1 = "Hello"; // string literal -> stored in string pool
        char ch[] = {'h','e','l','l','o'};

        String s2 = new String(ch); // converting char array to string object
        String s3 = new String("World"); // creating string object

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
