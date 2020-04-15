package com.tddexamples.datastructurestdd.hashmap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DistinctELementsEveryWindowOfSizeKTest {
    private DistinctELementsEveryWindowOfSizeK distinctELementsEveryWindowOfSizeK;

    @BeforeAll
    public void setUp() {
        distinctELementsEveryWindowOfSizeK = new DistinctELementsEveryWindowOfSizeK();
    }

    @Test
    public void contextLoads() {
        assertThat(distinctELementsEveryWindowOfSizeK).isNotNull();
    }

    @Test
    public void test_subSetOfArray() {
//        int arr1[] = {1, 2, 1, 3, 4, 2, 3};
        int arr1[] = {1, 2, 4, 4};
        distinctELementsEveryWindowOfSizeK.getDistinctUsingBruteForce(arr1, 2);
    }

    @Test
    public void test_subSetOfArray1() {
//        int arr1[] = {1, 2, 1, 3, 4, 2, 3};
//        distinctELementsEveryWindowOfSizeK.getDistinctElemts(arr1, 4);

        int arr1[] = {1, 2, 4, 4};
        distinctELementsEveryWindowOfSizeK.getDistinctElemts(arr1, 2);
    }

}