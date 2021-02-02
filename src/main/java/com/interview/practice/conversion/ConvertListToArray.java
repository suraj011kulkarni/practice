package com.interview.practice.conversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertListToArray {


    public static void main(String[] args) {

        ConvertListToArray convertListToArray = new ConvertListToArray();
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};



        convertListToArray.convertArrayToList1(numbers);
        convertListToArray.convertArrayToList2(numbers);
        convertListToArray.convertArrayToList3(numbers);

        List<Integer> numberList = new ArrayList<>(Arrays.asList(11,12,14,13,15));

        convertListToArray.convertListToArray1(numberList);
        convertListToArray.convertListToArray2(numberList);


    }


    public List<Integer> convertArrayToList1(int[] numbers){

        List<Integer> numberList = new ArrayList<Integer>();
        for(int i=0;i<numbers.length;i++){
            numberList.add(numbers[i]);
        }

        return numberList;
    }

    /*
    java 8 and above
    */
    public List<Integer> convertArrayToList2(int[] numbers){

        List<Integer> numberList = Arrays.stream(numbers).boxed().collect(Collectors.toCollection(ArrayList::new));

        return numberList;
    }

    /*
    java 8 and above
    */
    public List<Integer> convertArrayToList3(int[] numbers){

        List<Integer> numberList = IntStream.of(numbers).boxed().collect(Collectors.toCollection(ArrayList::new));

        SortedSet<Integer> numberss =  IntStream.of(numbers).boxed().collect(Collectors.toCollection(TreeSet::new));


        return numberList;
    }

    // java 6 & 7
    public int[] convertListToArray1(List<Integer> numberList){

        int[] numbers = new int[numberList.size()];

        for(int i=0; i< numberList.size();i++){
            numbers[i]= numberList.get(i);
        }
        return numbers;
    }

    public int[] convertListToArray2(List<Integer> numberList){

        int[] numbers = numberList.stream().mapToInt(i->i).toArray();
        System.out.println(numbers);

        return numbers;
    }





}
