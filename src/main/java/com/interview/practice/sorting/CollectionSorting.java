package com.interview.practice.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSorting implements Comparable<CollectionSorting>{


    private int id;
    private String name;

    public CollectionSorting() {
    }

    public CollectionSorting(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "CollectionSorting{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        CollectionSorting collectionSortingObj= new CollectionSorting();

        CollectionSorting collectionSorting1 = new CollectionSorting(1,"K");
        CollectionSorting collectionSorting2 = new CollectionSorting(5,"AB");
        CollectionSorting collectionSorting3= new CollectionSorting(1,"A");
        CollectionSorting collectionSorting4 = new CollectionSorting(2,"B");
        CollectionSorting collectionSorting5 = new CollectionSorting(3,"BA");

        List<CollectionSorting> list = new ArrayList<CollectionSorting>();
        list.add(collectionSorting1);list.add(collectionSorting2);list.add(collectionSorting3);
        list.add(collectionSorting4);list.add(collectionSorting5);

        List<CollectionSorting> list1 = new ArrayList<CollectionSorting>(list);
        List<CollectionSorting> list2 = new ArrayList<CollectionSorting>(list);

        System.out.println("Pass 1");


        for(CollectionSorting collectionSorting : list){
            System.out.println(collectionSorting.toString());
        }
        System.out.println("After sorting");
        collectionSortingObj.getSortedList1(list);
        for(CollectionSorting collectionSorting : list){
            System.out.println(collectionSorting.toString());
        }

        System.out.println("Pass 2");

        for(CollectionSorting collectionSorting : list1){
            System.out.println(collectionSorting.toString());
        }

        System.out.println("After sorting");
        collectionSortingObj.getSortedList2(list1);
        for(CollectionSorting collectionSorting : list1){
            System.out.println(collectionSorting.toString());
        }

        System.out.println("Pass 3");

        for(CollectionSorting collectionSorting : list2){
            System.out.println(collectionSorting.toString());
        }

        System.out.println("After sorting");
        collectionSortingObj.getSortedList3(list2);
        for(CollectionSorting collectionSorting : list2){
            System.out.println(collectionSorting.toString());
        }



    }


    @Override
    public int compareTo(CollectionSorting o) {
        if(o==null){
            return 1;
        }else{
            if(o.id == this.id){
                return 0;
            }else if(this.id>o.id) {
                return 1;
            }else{
                return -1;
            }
        }
    }

    // java 6 & 7
    public List<CollectionSorting> getSortedList1(List<CollectionSorting> list){

        
        Collections.sort(list);

        return list;
    }

    // java 6 & 7
    public List<CollectionSorting> getSortedList2(List<CollectionSorting> list){

        Collections.sort(list,new CollectionSorter());

        return list;
    }


    // java 8

    public List<CollectionSorting> getSortedList3(List<CollectionSorting> list){

        Collections.sort(list,(a,b)-> a.compareTo(b));
        list.sort(new CollectionSorter());
        list.sort((a,b)->a.getName().compareTo(b.getName()));

        return list;
    }


    class CollectionSorter implements Comparator<CollectionSorting> {

        @Override
        public int compare(CollectionSorting o1, CollectionSorting o2) {

            if(o2 == null){
                return 1;
            }else if(o1 == null){
                return -1;
            }else{
                if(o1.getId() > o2.getId()){
                    return 1;
                }else if(o1.getId()< o2.getId()){
                    return -1;
                }else{
                    return  o1.getName().compareTo(o2.getName());
                }

            }

        }
    }


}



















