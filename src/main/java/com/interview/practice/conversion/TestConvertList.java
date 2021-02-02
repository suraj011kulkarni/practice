package com.interview.practice.conversion;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
public class TestConvertList {


    public List convertArrayToList(List<Integer> numbers){

        numbers.stream().mapToInt(i->i).toArray();


        Object[] oarr = new Object[]{};
        Integer[] k = Arrays.asList(oarr).toArray(new Integer[0]);
        Arrays.sort(k,Collections.reverseOrder());
        Collections.sort(numbers,Collections.reverseOrder());

        numbers.stream().filter(a->a %2 ==0).collect(Collectors.toList());

        Arrays.stream(new int[]{1,2}).boxed().collect(Collectors.toCollection(ArrayList::new));
        List<Integer> ints = new ArrayList<>(Arrays.asList(1,2));





        return null;
    }




}
