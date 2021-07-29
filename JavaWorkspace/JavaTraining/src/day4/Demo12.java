package day4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo12 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("FirstName", "Tim");
        map.put("LastName", "Bedford");
        map.put("ID", 123);

        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
