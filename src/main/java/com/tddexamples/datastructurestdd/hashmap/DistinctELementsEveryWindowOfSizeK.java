package com.tddexamples.datastructurestdd.hashmap;

import java.util.HashMap;

public class DistinctELementsEveryWindowOfSizeK {
    public String getDistinctUsingBruteForce(int arr[], int k) {

        for (int i = 0; i <= arr.length - k; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i; j < i + k; j++) {
                map.put(arr[j], 1);
            }
            System.out.println("Size--" + map.size());
        }
        return "";
    }

    public String getDistinctElemts(int arr[], int k) {
        String strArr = "";
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i]))
                map.put(arr[i], 1);
            else
                map.put(arr[i], map.get(arr[i]) + 1);
        }
        for (int i = 0; i < arr.length - k; i++) {

        }
        return strArr;
    }
}
