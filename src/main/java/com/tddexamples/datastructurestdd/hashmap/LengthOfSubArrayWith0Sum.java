package com.tddexamples.datastructurestdd.hashmap;

import java.util.HashMap;

public class LengthOfSubArrayWith0Sum {

    public int getLengthOfLargestSubarray(int arr[]) {
        int maxLen = 0;
        int arrLen = arr.length;
        for (int i = 0; i < arrLen; i++) {
            int curr_sum = 0;
            for (int j = i; j < arrLen; j++) {
                curr_sum += arr[j];
                if (curr_sum == 0)
                    maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }

    public int getLengthUsingMap(int arr[]) {

        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
        int sum = 0;
        int max_len = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] == 0 && max_len == 0)
                max_len = 1;
            if (sum == 0)
                max_len = i + 1;
            Integer prev = hM.get(sum);
            if (prev == null)
                hM.put(sum, i);
            else
                max_len = Math.max(max_len, i - prev);
        }
        return max_len;
    }
}
