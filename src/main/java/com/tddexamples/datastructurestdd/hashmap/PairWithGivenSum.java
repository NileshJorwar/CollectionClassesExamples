package com.tddexamples.datastructurestdd.hashmap;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PairWithGivenSum {

    public boolean checkIfPairExists(int arr1[], int sum) {
        Set<Integer> set = new HashSet<>();
        boolean flag = true;
        if(arr1.length==0)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!set.contains(arr1[i]))
                set.add(arr1[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            if (set.contains(sum - arr1[i]))
            {
                System.out.println("Pair is: "+ arr1[i]+ " and "+(sum-arr1[i]));
                flag = true;
                break;
            }
            else
                flag = false;
        }
        return flag;
    }

}

