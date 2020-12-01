/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 01-Dec-20
 *  Time: 3:17 PM
 */

/**
 * Creating a HaspMap to store a key-value pair, where key is of Integer type and
 * value is of String type.
 */
package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        //creating ahashmap
        HashMap<Integer, String> map = new HashMap<>();
        //adding some values in map
        map.put(100, "Vaibhav");
        map.put(119, "Ramesh");
        map.put(118, "Akash");
        //printing the map
        System.out.println(map);
        //add a duplicate key
        map.put(119, "Ravi");
        System.out.println(map);
        //adding a duplicate values against a new key
        map.put(120, "Ravi");
        System.out.println(map);
        //remove
        System.out.println(map.remove(120));
        System.out.println(map);
        System.out.println(map.remove(119, "Ramesh"));
        System.out.println(map);
        //print all the keys of the given map
        //by using keyset()
        Set<Integer> keySet = map.keySet();
        System.out.println("keys = " + keySet);
        System.out.println("values against keys");
        for (Integer integer : keySet) {
            System.out.println(map.get(integer));
        }
        //print all the keys of the given map
        //by using entrySet()
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {

            System.out.println(entry.getKey() + " -> " + entry.getValue() );
        }
        //print all the values that are stored against odd keys
        System.out.println("values against odd keys");
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            if(entry.getKey() % 2 != 0){
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
        //search for key
        System.out.println(map.containsKey(100));
        System.out.println(map.containsValue("Vaibhav"));
    }
}
