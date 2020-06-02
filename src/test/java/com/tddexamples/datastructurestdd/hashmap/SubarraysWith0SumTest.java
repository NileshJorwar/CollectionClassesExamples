package com.tddexamples.datastructurestdd.hashmap;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SubarraysWith0SumTest {

    @Autowired
    SubarraysWith0Sum subarraysWith0Sum;


    @Test
    void findPairs() {
        subarraysWith0Sum = new SubarraysWith0Sum();
        ArrayList<SubarraysWith0Sum.Pair> expectedPair =
                new ArrayList<>();
        int arr[] = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        ArrayList<SubarraysWith0Sum.Pair> actual = subarraysWith0Sum.findPairs(arr);

    }
}