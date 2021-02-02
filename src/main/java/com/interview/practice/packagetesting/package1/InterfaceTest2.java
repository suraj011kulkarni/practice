package com.interview.practice.packagetesting.package1;

public interface InterfaceTest2 {

    default int cal2(int a,int b){
        return a+b+2;
    }

    public static int cal5(int a, int b){
        return a-b-2;
    }
}
