package com.tddexamples.datastructurestdd.hashmap;

import java.util.HashMap;

public class DistinctELementsEveryWindowOfSizeK {

    public String getDistinctUsingBruteForce(int arr[], int k) {

        if (arr.length == 0)
            return "0";
        if (arr.length > 0 && k == 0)
            return "1";

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
        int dist_count = 0;
        for (int i = 0; i < k; i++) {
            if (map.get(arr[i]) == null) {
                map.put(arr[i], 1);
                dist_count++;
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        System.out.println("First Window: " + dist_count);
        for (int i = k; i < arr.length; i++) {
            if (map.get(arr[i - k]) == 1) {
                map.remove(arr[i - k]);
                dist_count--;
            } else
                map.put(arr[i - k], map.get(arr[i - k]) - 1);
            if (map.get(arr[i]) == null) {
                map.put(arr[i], 1);
                dist_count++;
            } else
                map.put(arr[i], map.get(arr[i]) + 1);
            System.out.println("Other Windows: " + dist_count);
        }

        return strArr;
    }
}
