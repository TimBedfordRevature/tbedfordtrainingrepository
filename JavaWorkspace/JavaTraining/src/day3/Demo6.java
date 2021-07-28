package day3;

import java.util.Arrays;

public class Demo6 {
    public static void main(String[] args) {
        String message = "Hello, welcome to java";
        String [] result = message.split(" ");
        for(String words : result){
            System.out.println(words);
        }
        //System.out.println(Arrays.toString(result));
    }
}
