package com.tddexamples.datastructurestdd.hashmap;

import java.util.*;

public class FindAnagramGroups {

    public List<List<String>> findAnagrams(List<String> dict) {
        Map<String, List<String>> inputMap = new HashMap<>();
        for (String s : dict) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            if (!inputMap.containsKey(sortedString)) {
                inputMap.put(sortedString, new ArrayList<>());
            }
            inputMap.get(sortedString).add(s);
        }
        List<List<String>> anagrams = new ArrayList<>();

        for (String key: inputMap.keySet()) {
            if (inputMap.get(key).size() >= 2)
                anagrams.add(inputMap.get(inputMap.get(key)));
        }
        for (List<String> l : anagrams) {
            System.out.println(l);
        }

        return anagrams;
    }
    /*The computation consists of n calls to sort and n insertions into the hash table. Sorting
    all the keys has time complexity 0(nm log m). The insertions add a time complexity
    of 0(nm), yielding0(nm log m) time complexity in total.
    * */
}
