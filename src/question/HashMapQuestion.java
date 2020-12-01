/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 01-Dec-20
 *  Time: 3:42 PM
 */
package question;
import question.databean.Employee;
import question.exception.NoEntryFoundExceptio;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a Function which accept HaspMap and a key-value pair, this function will check,
 * if that pair is present in the HashMap, if present return that entry else throw an
 * user defined exception NoEntryFoundException, this exception will print a message No Record found for given pair.
 *
 * HaspMap contain Object of Employee class, and the key is empId of employee.
 *
 * Employee class contains some fields int empId, String name, double salary, String emailId. You are free to inherit
 * all the required interface and class(if any needed). You are free to override any methods from object class
 * (if any required).
 */

public class HashMapQuestion {
    public static void main(String[] args) {
        //hasp map

        //map entry employee objects 2 or 3

        // call search function
    }
    public Map.Entry<Integer, Employee> search(HashMap<Integer, Employee> map, Integer key, Employee value) throws NoEntryFoundExceptio {
        Map.Entry<Integer, Employee> searchEntry = Map.entry(key, value);
        for(Map.Entry<Integer,Employee> entry : map.entrySet()){
            if(entry.equals(searchEntry)){
                return entry;
            }
        }
        throw new NoEntryFoundExceptio("No Record found for given pair");
    }
}
