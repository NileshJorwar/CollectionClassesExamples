package com.tddexamples.datastructurestdd.hashmap;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FindAnagramGroupsTest {

    FindAnagramGroups findAnagramGroups;
    @Test
    void findAnagrams() {
        findAnagramGroups = new FindAnagramGroups();
        List<String> inputList = new ArrayList<>();
        inputList.add("algorithmic");
        inputList.add("logarithmic");
        inputList.add("clock");
        inputList.add("lockc");
        inputList.add("colkc");

        List<List<String>> actualList = findAnagramGroups.findAnagrams(inputList);

        assertThat(actualList).isNotNull();


    }
}