package com.tddexamples.datastructurestdd.hashmap;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class ArrayIfSubsetOfArray {

    public boolean subSetOfArray(int arr1[], int arr2[])
    {
        Map<Integer,Integer> map=
                new HashMap<>();
        boolean flag=true;
        if((arr1.length==0) && (arr2.length==0))
        {
            return false;
        }
        if((arr1.length!=0) && (arr2.length==0))
        {
            return true;
        }

        for(int i=0;i<arr1.length;i++)
        {
            map.put(arr1[i],1);
        }

        for(int i=0;i<arr2.length;i++)
        {
            if(!map.containsKey(arr2[i]))
            {
                flag=false;
                break;
            }
        }

        return flag;
    }

    public boolean usingHashSet(int arr1[], int arr2[])
    {
        if((arr1.length==0) && (arr2.length==0))
        {
            return false;
        }
        if((arr1.length!=0) && (arr2.length==0))
        {
            return true;
        }
        Set<Integer> set= new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            if(!set.contains(arr1[i]))
                set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(!set.contains(arr2[i]))
                return false;
        }
        return true;
    }
}
