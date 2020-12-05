/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 05-Dec-20
 *  Time: 2:44 PM
 */
package doubt;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// for creating a map which contains key(String) and value (Integer) pair
public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three",3);
        hashMap.put("four" , 4);
        //print
        System.out.println(hashMap);
        //process each key
        //to get keyset or entryset
        //var set = hashMap.keySet();
        Set<String> keySet = hashMap.keySet();
        System.out.println(keySet);

        //entry set
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        Map.Entry<String, Integer> e = Map.entry("four", 4);
        //looking for entry e in entryset
        for (Map.Entry<String, Integer> e1 : entrySet) {
             if(e.equals(e1)){
                 System.out.println("match found");
             }
        }

    }
}
