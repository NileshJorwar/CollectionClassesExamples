package com.tddexamples.datastructurestdd.hashmap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FindFourEleABCDinArraySuchThatAnBEqualsCnDTest {

    FindFourEleABCDinArraySuchThatAnBEqualsCnD findFourEleABCDinArraySuchThatAnBEqualsCnD;

    @BeforeAll
    public void setUp() {
        findFourEleABCDinArraySuchThatAnBEqualsCnD = new FindFourEleABCDinArraySuchThatAnBEqualsCnD();
    }

    @Test
    public void contextLoads() {
        assertThat(findFourEleABCDinArraySuchThatAnBEqualsCnD).isNotNull();
    }

    @Test
    public void test_subSetOfArray() {
//        int arr1[] = {3, 4, 7, 1, 2, 9, 8};
//        int arr1[] = {3, 4, 7, 1, 12, 9};
        int arr1[] = {65, 30, 7, 90, 1, 9, 8};
        findFourEleABCDinArraySuchThatAnBEqualsCnD.getPairs(arr1);

    }

}