package com.tddexamples.datastructurestdd.hashmap;


import java.util.HashMap;
import java.util.Map;

public class FindFourEleABCDinArraySuchThatAnBEqualsCnD {
    class Pair {
        int first, second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public void getPairs(int arr[]) {
        Map<Integer, Pair> map =
                new HashMap<>();
        if(arr.length==0 || arr.length==1)
            System.out.println("No Pairs");
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (!map.containsKey(sum))
                    map.put(sum, new Pair(i, j));
                else {
                    Pair p = map.get(sum);
                    System.out.println("Pair: " + arr[p.first] + " ," + arr[p.second] + " and " +
                            arr[i] + ", " + arr[j]);
                }
            }
        }
    }
}
