package com.collections;

import java.util.LinkedList;
import java.util.List;

public class ArrayExample {
    public static List<Student> getStudentList() {
        List<Student> studentList = new LinkedList<>();
        Student s1 = new Student();
        s1.setId(1001);
        s1.setName("Nagesh");
        s1.setGroup("MPC");
        Student s2 = new Student();
        s2.setId(2002);
        s2.setName("Ravi");
        s2.setGroup("BIPC");
        studentList.add(s1);
        studentList.add(s2);
        return studentList;
    }

    public static void main(String[] args) {
        List<Student> studentList = getStudentList();
        for (Student s : studentList) {
            System.out.println(s.getId());
            System.out.println(s.getName());
            System.out.println(s.getGroup());
        }
    }


}
