package com.interview.practice.packagetesting.package1;

public interface InterfaceTest {

    // private int cal1(int a,int b); // not allowed here
    // protected int cal3(int a,int b); // not allowed here

    // default method should have implementation
    default int cal2(int a,int b){
        return a+b+2;
    }

    public int cal4(int a,int b); // allowed here

    public static int cal5(int a, int b){
        return a-b-2;
    }



}
