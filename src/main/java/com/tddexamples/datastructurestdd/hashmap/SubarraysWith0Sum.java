package com.tddexamples.datastructurestdd.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
* Input:  arr = [6, 3, -1, -3, 4, -2, 2,
             4, 6, -12, -7]
Output:
Subarray found from Index 2 to 4
Subarray found from Index 2 to 6
Subarray found from Index 5 to 6
Subarray found from Index 6 to 9
Subarray found from Index 0 to 10
* */


public class SubarraysWith0Sum {
    class Pair {
        int first, second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public ArrayList<Pair> findPairs(int arr[]) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Pair> out = new ArrayList<>();
        int len = arr.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += arr[i];
            if(sum==0)
                out.add(new Pair(0,i));
            ArrayList<Integer> al = new ArrayList();
            if(map.containsKey(sum)){
                al = map.get(sum);
                for(int j = 0;j < al.size(); j++){
                    out.add(new Pair(al.get(j)+1, i));
                }
            }

            al.add(i);
            map.put(sum,al);
        }


        return out;
    }
}
