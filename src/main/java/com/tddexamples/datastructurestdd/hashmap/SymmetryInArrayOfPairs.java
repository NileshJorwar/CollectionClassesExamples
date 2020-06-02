package com.tddexamples.datastructurestdd.hashmap;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.*;

public class SymmetryInArrayOfPairs {

    public ArrayList<ArrayList<Integer>> findPairs(int arr1[][]) {
        ArrayList<Integer> res1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            int first = arr1[i][0];
            int second = arr1[i][1];
            Integer value = map.get(second);
            if (value != null && value == first) {
                System.out.println("(" + first + ", " + second + ")");
                res1.add(first);
                res1.add(second);

            } else
                map.put(first, second);

        }
        res.add(res1);
        return res;
    }
}
