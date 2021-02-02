package com.interview.preparation;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrivateConstructor  extends Parent implements interFaceParent1,interFaceParent2{

    public static void main(String[] args) {
     //   new PrivateConstructor().m1();

        Queue q = new ArrayDeque();
        Queue q1 = new PriorityQueue();


    }



}


 abstract class Parent{


     public void m1(){

     }

}

interface interFaceParent1{


    default void m1(){

    }

}
interface interFaceParent2{

    void m1();
}