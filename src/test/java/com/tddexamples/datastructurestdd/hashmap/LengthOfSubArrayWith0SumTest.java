package com.tddexamples.datastructurestdd.hashmap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LengthOfSubArrayWith0SumTest {

    private LengthOfSubArrayWith0Sum lengthOfSubArrayWith0Sum;

    @BeforeAll
    public void setUp() {
        lengthOfSubArrayWith0Sum = new LengthOfSubArrayWith0Sum();
    }

    @Test
    public void contextLoads() {
        assertThat(lengthOfSubArrayWith0Sum).isNotNull();
    }

    @Test
    public void test_subSetOfArray() {
        int arr1[] = {15, -2, 2, -8, 1, 7, 10, 23};
        lengthOfSubArrayWith0Sum.getLengthOfLargestSubarray(arr1);
    }

    @Test
    public void test_subSetOfArray2() {
        int arr1[] = {15, -2, 2, -8, 1, 7, 10, 23};
        lengthOfSubArrayWith0Sum.getLengthUsingMap(arr1);
    }
}