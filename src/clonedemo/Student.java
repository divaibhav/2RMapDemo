/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 02-Dec-20
 *  Time: 12:50 PM
 */
package clonedemo;

public class Student {
    private int rollno;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
