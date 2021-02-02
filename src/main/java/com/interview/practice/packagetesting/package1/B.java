package com.interview.practice.packagetesting.package1;

public class B{

    int doAddition(int num1,int num2){
        A a = new A();
        return  a.addition(num1,num2);
    }

    int doSub(int num1,int num2){
        A a = new A();
        // a.sub(num1,num2);
        throw new RuntimeException("private method not accessible");
    }

    int doMultiply(int num1, int num2){
        A a = new A();
        return a.multiply(num1,num2);

    }

}
