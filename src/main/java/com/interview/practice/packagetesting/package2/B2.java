package com.interview.practice.packagetesting.package2;

import com.interview.practice.packagetesting.package1.A;
import com.interview.practice.packagetesting.package1.InterfaceTest;
import com.interview.practice.packagetesting.package1.InterfaceTest2;

import java.util.ArrayList;

public class B2 implements InterfaceTest,InterfaceTest2 {

    int doMultiplication(int num1,int num2){
        A a = new A();
        B2 b = new B2();
        b.cal2(1,2);
        //return a.multiply(num1,num2);
        throw new RuntimeException("protected method is not allowed to be called from other package if it is not inheritaed");
    }

    @Override
    public int cal2(int a, int b) {
        return InterfaceTest2.super.cal2(a,b);
    }

    @Override
    public int cal4(int a, int b) {
        return 0;
    }
}
