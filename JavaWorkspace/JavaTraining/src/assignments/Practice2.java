package assignments;

import java.util.HashMap;
import java.util.Map;

public class Practice2 {
    public static void main(String[] args) {
        //create and populate HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one",1);
        hashMap.put("two",2);
        hashMap.put("three",3);

        //Print out keys and values of HashMap
        for(Map.Entry entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //print size of HashMap
        System.out.println(hashMap.size());

        //copy entries of HashMap to new HashMap
        HashMap<String, Integer> hm = new HashMap<>();
        hm.putAll(hashMap);

        for(Map.Entry entry : hm.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
