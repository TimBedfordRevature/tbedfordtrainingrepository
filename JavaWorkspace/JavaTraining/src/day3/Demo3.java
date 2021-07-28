package day3;

//Comparing Strings
public class Demo3 {
    public static void main(String[] args) {

        String s1 = "Tim";
        String s2 = "Tim";
        String s3 = new String("Tim");
        String s4 = "Roy";
        String s5 = "TIM";

        System.out.println(".equals() Method:");
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1.equals(s4)); //false
        System.out.println(s1.equals(s5)); //false -- Case sensitive

        System.out.println("\nusing == operator");
        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3); //false
        System.out.println(s1 == s4); //false
        System.out.println(s1 == s5); //false

        System.out.println("\nUsing CompareTo method");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.compareTo(s5));
    }
}
