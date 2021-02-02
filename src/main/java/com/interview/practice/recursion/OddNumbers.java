package com.interview.practice.recursion;

import java.util.Iterator;
import java.util.List;

public class OddNumbers {

    public static void main(String[] args) {

        printEvenAndOdd(10,25);


    }


    public static void printEvenAndOdd(int L,int R){

        if(R<L){
            return ;
        }

        if(L==1){
            System.out.println(L+" is even");
        }else if (L%2==0){
            System.out.println(L+" is even");
        }else{
            System.out.println(L+" is odd");
        }
        printEvenAndOdd(L+1,R);

    }


}
