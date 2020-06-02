package com.tddexamples.datastructurestdd.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSubsequenceTest {
    LongestConsecutiveSubsequence longestConsecutiveSubsequence;

    @Test
    public void test(){
        int arr[] = {1, 9, 3, 10, 4, 20, 2};
        longestConsecutiveSubsequence = new LongestConsecutiveSubsequence();
        longestConsecutiveSubsequence.findSequence(arr);
    }

}