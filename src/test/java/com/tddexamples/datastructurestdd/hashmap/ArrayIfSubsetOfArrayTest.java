package com.tddexamples.datastructurestdd.hashmap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ArrayIfSubsetOfArrayTest {


    ArrayIfSubsetOfArray arrayIfSubsetOfArray;

    @BeforeAll
    public void setUp(){
        arrayIfSubsetOfArray=new ArrayIfSubsetOfArray();
    }

    @Test
    public void contextLoads()
    {
        assertThat(arrayIfSubsetOfArray).isNotNull();
    }

    @Test
    public void test_subSetOfArray()
    {
//        int arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1};
//        int arr1[] = {11,11, 1,13, 13, 21, 3,3, 7}, arr2[] = {11, 3, 7, 1};
//        int arr1[] = {1, 2, 3, 4, 5, 6}, arr2[] = {1, 2,4};
//        int arr1[] = {10, 5, 2, 23, 19}, arr2[] = {19, 5, 3};
//        int arr1[] = {}, arr2[] = {};
//        int arr1[] = {10, 5, 2, 23, 19}, arr2[] = {};
        int arr1[] = {10, 5, 2, 23, 19}, arr2[] = {19, 5, 3};

        boolean actualResult= arrayIfSubsetOfArray.subSetOfArray(arr1,arr2);

        assertEquals(false,actualResult);
    }

    @Test
    public void test_usingHashSet()
    {
//        int arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1};
        int arr1[] = {11,11, 1,13, 13, 21, 3,3, 7}, arr2[] = {11, 3, 7, 1};
//        int arr1[] = {1, 2, 3, 4, 5, 6}, arr2[] = {1, 2,4};
//        int arr1[] = {10, 5, 2, 23, 19}, arr2[] = {19, 5, 3};
//        int arr1[] = {}, arr2[] = {};
//        int arr1[] = {10, 5, 2, 23, 19}, arr2[] = {};
//        int arr1[] = {10, 5, 2, 23, 19}, arr2[] = {19, 5, 3};

        boolean actualResult= arrayIfSubsetOfArray.usingHashSet(arr1,arr2);

        assertEquals(true,actualResult);
    }
}