package com.tddexamples.datastructurestdd.hashmap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PalindromeSubstringQueriesTest {
    private PalindromeSubstringQueries palindromeSubstringQueries;

    @BeforeAll
    public void setUp() {
        palindromeSubstringQueries = new PalindromeSubstringQueries();
    }

    @Test
    public void contextLoads() {
        assertThat(palindromeSubstringQueries).isNotNull();
    }

    @Test
    public void test_subSetOfArray() {
        String input="abaaabaaaba";
        ArrayList<ArrayList<Integer>> lists= new ArrayList<>();
        ArrayList<Integer> list= new ArrayList<>();
        list.add(0);
        list.add(10);
        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(5);
        list2.add(8);
        ArrayList<Integer> list3= new ArrayList<>();
        list3.add(2);
        list3.add(5);
        ArrayList<Integer> list4= new ArrayList<>();
        list4.add(5);
        list4.add(9);
        lists.add(list);
        lists.add(list2);
        lists.add(list3);
        lists.add(list4);
        palindromeSubstringQueries.ifPalindromes(lists, input);
    }


}