package com.tddexamples.datastructurestdd.hashmap;

import java.util.HashSet;
import java.util.Set;

/*
Input: arr[] = {1, 9, 3, 10, 4, 20, 2}
Output: 4
The subsequence 1, 3, 4, 2 is the longest subsequence
of consecutive elements



Input: arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42}
Output: 5
The subsequence 36, 35, 33, 34, 32 is the longest subsequence
of consecutive elements.
* */


public class LongestConsecutiveSubsequence {

    public int findSequence(int arr[]) {

        Set<Integer> set = new HashSet<>();

        int len = arr.length;

        for (int i = 0; i < len; i++) {
            set.add(arr[i]);
        }
        for (Integer i : set) {
            System.out.println(i);
        }
        int res = 0;
        for (int i = 0; i < len; i++) {
            if (!set.contains(arr[i] - 1)) {
                int j = arr[i];
                while (set.contains(j))
                    j++;
                if (res < j - arr[i])
                    res = j - arr[i];
            }
        }
        return res;
    }

}
