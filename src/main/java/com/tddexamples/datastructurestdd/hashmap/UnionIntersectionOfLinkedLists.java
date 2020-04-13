package com.tddexamples.datastructurestdd.hashmap;

import java.util.*;

public class UnionIntersectionOfLinkedLists {

    public void getUnion(List<Integer> l1, List<Integer> l2) {
        Set<Integer> set = new HashSet<>();

        l1.forEach(
                i -> System.out.println(i)
        );

        l1.forEach(item ->
                set.add(item)
        );

        l2.forEach(item -> set.add(item));
        set.forEach(System.out::println);
    }

    public void getIntersection(List<Integer> l1, List<Integer> l2) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < l2.size(); i++) {
            if (map.containsKey(l1.get(i)))
                map.put(l1.get(i), map.get(l1.get(i)) + 1);
            else
                map.put(l1.get(i), 1);
        }

        for (int i = 0; i < l2.size(); i++) {
            if (map.containsKey(l2.get(i)))
                map.put(l2.get(i), map.get(l2.get(i)) + 1);
            else
                map.put(l2.get(i), 1);
        }
//        map.forEach((key, value) ->
//        {
//            if (map.get(key) > 1)
//                System.out.println(key);
//        });

        for(Integer key:map.keySet()){
            if (map.get(key) > 1)
                System.out.println(key);
        }
    }

}
