/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 02-Dec-20
 *  Time: 12:51 PM
 */
package clonedemo;

import java.util.HashMap;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<Integer, Student> map = new HashMap<>();
        Student s1 = new Student();
        s1.setName("vaibhav");
        s1.setRollno(11);
        Student s2 = new Student();
        s2.setName("ramesh");
        s2.setRollno(12);
        System.out.println(map.put(1,s1));
        System.out.println(map.put(2, s2));
        System.out.println(map);
        HashMap<Integer,Student> cloneMap = (HashMap<Integer, Student>) map.clone();
        for(Integer key : cloneMap.keySet()){
            Student s = cloneMap.get(key);
            s.setRollno(24);
            break;
        }
        System.out.println(cloneMap);
        System.out.println(map);

    }
}
