package com.interview.questions;


import java.util.HashSet;
import java.util.Set;

public class test1 {




    public static void main(String[] args) {

        final Set<Employee> employeeSet = new HashSet<>();
        Employee e1 = new Employee(1,"abc");
        Employee e2 = new Employee(1,"abc");

        employeeSet.add(e1);
        employeeSet.add(e2);
        System.out.println("size of set "+employeeSet.size());

    }

}


class Employee{


    private int id;
    private String name;

    public Employee() {
    }

    public Employee(int id, String name) {
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
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
