package com.interview.practice.recursion;

public class Factorial {

    public static void main(String[] args) {

        // 5! = 5 * 4 * 3 * 2 * 1 = 120

        System.out.println(fidFactorial(5));

    }


    public static int fidFactorial(int n){

        if(n==1){
            return 1;
        }else {
            return n * fidFactorial(n-1);
        }

    }




}
