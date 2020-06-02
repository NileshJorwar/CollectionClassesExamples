package com.tddexamples.datastructurestdd.hashmap;

import java.util.HashMap;
import java.util.Map;

public class PalindromeString {

    public boolean isPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c))
                map.put(c, 1);
            else
                map.put(c, map.get(c) + 1);
        }

        int oddCount = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if ((entry.getValue() % 2) != 0 && ++oddCount > 1) {
                return false;
            }
        }
        return true;

        /*
        * Time Complexity -- O(n) length of string
        * Space Complexity -- O(c) number of characters appearing in the string
        * */
    }
}
