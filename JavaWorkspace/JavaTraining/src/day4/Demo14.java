package day4;

import java.util.Hashtable;
import java.util.Map;

public class Demo14 {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("Name1", "Tim");
        hashtable.put("Name2", "Nick");

        for(Map.Entry entry : hashtable.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
