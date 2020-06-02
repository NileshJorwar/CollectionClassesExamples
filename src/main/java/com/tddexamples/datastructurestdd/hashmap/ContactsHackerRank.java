package com.tddexamples.datastructurestdd.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ContactsHackerRank {

    /*
     * Complete the contacts function below.
     */
    public int[] contacts(String[][] queries) {
        /*
         * Write your code here.
         */


        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < queries.length; i++) {
            if (queries[i][0] == "add") {
                if (map.get(queries[i][1]) == null)
                    map.put(queries[i][1], 1);
                else
                    map.put(queries[i][1], map.get(queries[i][1]) + 1);
            }
        }

        map.entrySet().stream().forEach(e -> System.out.println(e));

        for (int i = 0; i < queries.length; i++) {

            if (queries[i][0] == "find") {
                int count=0;
                for (String k : map.keySet()) {
                    if (k.contains(queries[i][1]))
                        count++;
                }
                System.out.println(count);
            }
        }

        //System.out.println(queries[0][0]);

        //System.out.println(queries[0][1]);
        //System.out.println(queries[1][0]);
        //System.out.println(queries[1][1]);
        //System.out.println(queries.length);

        int arr[] = new int[3];
        return arr;
    }

}