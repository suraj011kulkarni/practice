package com.interview.practice.conversion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapToList {

    public static void main(String[] args) {
        MapToList mapToList = new MapToList();
    }

    // java 6 & 7
    public List<String> getKeyList1(Map<String,String> map){
        return new ArrayList<String>(map.keySet());
    }
    // java 6 & 7
    public List<String> getValList1(Map<String,String> map){
        return new ArrayList<String>(map.values());
    }


    // java 8
    public List<String> getKeyList2(Map<String,String> map){

        return map.keySet().stream().collect(Collectors.toList());

    }
    // java 8
    public List<String> getValList2(Map<String,String> map){
        return map.values().stream().collect(Collectors.toList());
    }


    public int[] setToArray(Set<Integer> set){

        return set.stream().mapToInt(i->i).toArray();

    }


    public Map<String,String> sortMapByValues(LinkedHashMap<String,String> map){

        List<Map.Entry<String,String>> entries = new ArrayList<>(map.entrySet());

        Collections.sort(entries,(o1,o2) -> o1.getValue().compareTo(o2.getValue()));

        Map<String,String> resultMap = new LinkedHashMap<>();
        for(Map.Entry<String,String> entry : entries){
            resultMap.put(entry.getKey(),entry.getValue());
        }

        return resultMap;
    }


}
