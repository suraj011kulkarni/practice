package com.interview.practice.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortMapByValues {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("Math",90);
        map.put("Eng",91);
        map.put("SCI",92);
        map.put("MAR",93);
        map.put("HIS",94);
        map.put("SAN",95);

        System.out.println("before sort");
        for(Map.Entry<String,Integer> en1 : map.entrySet()){
            System.out.println(en1.getKey()+" : "+en1.getValue());
        }

        Map<String,Integer> map1 = sortMap(map);

        System.out.println("/n/n/n/n after sort");
        for (Map.Entry<String, Integer> en1: map1.entrySet()){

            System.out.println(en1.getKey()+" : "+en1.getValue());

        }

    }


    public static Map<String,Integer> sortMap(Map<String,Integer> map){

        List<Map.Entry<String,Integer>> list = new LinkedList<>(map.entrySet());
        System.out.println("before list sort");
        for(Map.Entry<String,Integer> l1 : list){
            System.out.println(l1.getKey()+" : "+l1.getValue());
        }


        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        System.out.println("after list sort");
        for(Map.Entry<String,Integer> l1 : list){
            System.out.println(l1.getKey()+" : "+l1.getValue());
        }



        Map<String,Integer> tempMap = new LinkedHashMap<>();

        for(Map.Entry<String,Integer> en1 : list){
            tempMap.put(en1.getKey(),en1.getValue());
        }


        return tempMap;
    }

}
