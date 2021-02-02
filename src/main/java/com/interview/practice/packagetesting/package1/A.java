package com.interview.practice.packagetesting.package1;

public class A {




    //this is private method and is allowed to be call from same class only.
    // if this class is inherited then only it is not allowed to be called from other class
    private int sub(int a,int b){
         return a-b;
    }

    // this methods access specifier is default
    // this is allowed to be called from same package class only.
    // if this class is inherited in another package though this method is allowed to be called from other package
    int addition(int a,int b){
        return a+b;
    }

    // this is protected method it is allwoed to be called from same package
    // not allowed to be called from other package until and unless this class is A is inherited in that class
    protected int multiply(int a, int b){
        return a*b;
    }


}
