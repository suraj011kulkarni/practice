package com.interview.preparation.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TaskTestRunner {

    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(TaskTester.class);

        for(Failure failure : result.getFailures()){
            System.out.println(failure.getMessage());
        }
        System.out.println("result "+result.wasSuccessful());

    }

}
