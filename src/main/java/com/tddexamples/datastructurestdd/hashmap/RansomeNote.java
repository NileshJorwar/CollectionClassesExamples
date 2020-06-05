package com.tddexamples.datastructurestdd.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RansomeNote {

    public boolean isLetterConstructibleFromMagazine(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int[] cnt = new int[26];
        for (char c : magazine.toCharArray()) {
            cnt[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            System.out.println(cnt[i]);
        }
        for (char c : ransomNote.toCharArray()) {
            if (cnt[c - 'a'] > 0) {
                cnt[c - 'a']--;
            } else {
                return false;
            }
        }
        return true;
    }
}
