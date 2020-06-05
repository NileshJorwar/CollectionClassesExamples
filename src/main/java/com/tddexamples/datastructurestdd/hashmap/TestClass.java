package com.tddexamples.datastructurestdd.hashmap;

import java.util.*;

public class TestClass {
    public void getAnagrams(HashMap<Integer, String> inputMap) {

        Map<Integer, String> sorted = new TreeMap<>(inputMap);
        //Sort using Key
        System.out.println("Sort using Key");
        for (Map.Entry<Integer, String> entry : sorted.entrySet()) {
            System.out.println("Key:" + entry.getKey() + ", Value:" + entry.getValue());
        }
        //Sort using Value
        List<Map.Entry<Integer, String>> listOfEntry = new LinkedList<>(inputMap.entrySet());
        Collections.sort(listOfEntry,
                new Comparator<Map.Entry<Integer, String>>() {
                    @Override
                    public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                        return (o1.getValue()).compareTo(o2.getValue());
                    }
                }
        );

        Map<Integer, String> temp = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : listOfEntry) {
            temp.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Sort using Value");
        for (Map.Entry<Integer, String> entry : temp.entrySet()) {
            System.out.println("Key:" + entry.getKey() + ", Value:" + entry.getValue());
        }

    }

    public List<List<String>> anagrams(List<String> strings) {

        if (strings.size() == 0) {
            return null;
        }

        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            char arr[] = s.toLowerCase().toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            if (map.containsKey(str)) {
                map.get(str).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(str, list);
            }
        }
        for (String key : map.keySet()) {
            List<String> l = map.get(key);
            result.add(l);
        }
        for (List<String> ll : result) {
            System.out.println(ll);
        }
        return result;

    }
}
