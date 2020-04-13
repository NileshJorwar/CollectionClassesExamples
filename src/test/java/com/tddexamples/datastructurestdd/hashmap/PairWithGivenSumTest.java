package com.tddexamples.datastructurestdd.hashmap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PairWithGivenSumTest {

    PairWithGivenSum pairWithGivenSum;

    @BeforeAll
    public void setUp() {
        pairWithGivenSum = new PairWithGivenSum();
    }

    @Test
    public void contextLoads() {
        assertThat(pairWithGivenSum).isNotNull();
    }

    @Test
    public void test_subSetOfArray() {
        int arr1[] = {10, 5, 2, 23,-23, 19}, sum = 0;

        boolean actualResult = pairWithGivenSum.checkIfPairExists(arr1, sum);

        assertEquals(true, actualResult);
    }

}