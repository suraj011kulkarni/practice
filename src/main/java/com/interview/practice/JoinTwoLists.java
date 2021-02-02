package com.interview.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoinTwoLists {


    public static void main(String[] args) {

        List<String> l1 = new ArrayList<String>(Arrays.asList("A","b","c"));
        List<String> l2 = new ArrayList<String>(Arrays.asList("D","E","F"));


        JoinTwoLists joinTwoLists = new JoinTwoLists();
        joinTwoLists.join1(l1,l2);
        joinTwoLists.join2(l1,l2);

    }


    public List join1(List<String> l1,List<String> l2){
        List<String> mergeList = new ArrayList();
        mergeList.addAll(l1);
        mergeList.addAll(l2);

        return mergeList;
    }


    public List join2(List<String> l1,List<String> l2){


        Stream<String> stream = Stream.concat(l1.stream(),l2.stream());
        List<String> mergeList = stream.collect(Collectors.toList());


        return mergeList;
    }




}
