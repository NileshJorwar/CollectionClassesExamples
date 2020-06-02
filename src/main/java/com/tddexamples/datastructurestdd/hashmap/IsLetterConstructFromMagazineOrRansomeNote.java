package com.tddexamples.datastructurestdd.hashmap;

import java.util.HashMap;
import java.util.Map;

public class IsLetterConstructFromMagazineOrRansomeNote {

    public boolean isLetterConstructibleFromMagazine(String letterText, String magazineText) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (int i = 0; i < letterText.length(); i++) {
            if (!characterIntegerMap.containsKey(letterText.charAt(i)))
                characterIntegerMap.put(letterText.charAt(i), 1);
            else
                characterIntegerMap.put(letterText.charAt(i), characterIntegerMap.get(letterText.charAt(i) + 1));
        }
        for (char c : magazineText.toCharArray()) {
            if (characterIntegerMap.containsKey(c)) {
                characterIntegerMap.put(c, characterIntegerMap.get(c) - 1);
                if (characterIntegerMap.get(c) == 0) {
                    characterIntegerMap.remove(c);
                    if (characterIntegerMap.isEmpty())
                        break;
                }
            }
        }

        return characterIntegerMap.isEmpty();
    }
}
