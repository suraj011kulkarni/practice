package com.interview.practice;

import java.util.HashSet;
import java.util.Set;

public class SetWorking {


    public static void main(String[] args) {
        Student student1 = new Student(1,"suraj");
        Student student2 = new Student(1,"suraj");

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);

        System.out.println(students.size());
    }

}

class Student{
    private int id;
    private String name;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }
}
