package com.tddexamples.datastructurestdd.hashmap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UnionIntersectionOfLinkedListsTest {

    UnionIntersectionOfLinkedLists unionIntersectionOfLinkedLists;

    @BeforeAll
    public void setUp() {
        unionIntersectionOfLinkedLists = new UnionIntersectionOfLinkedLists();
    }

    @Test
    public void contextLoads() {
        assertThat(unionIntersectionOfLinkedLists).isNotNull();
    }

    @Test
    public void test_subSetOfArray() {
        List<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(15);
        l1.add(4);
        l1.add(20);

        List<Integer> l2 = new LinkedList<>();
        l2.add(4);
        l2.add(10);
        l2.add(2);
        l2.add(8);

        //unionIntersectionOfLinkedLists.getUnion(l1, l2);
        unionIntersectionOfLinkedLists.getIntersection(l1, l2);
        //assertEquals(true, actualResult);
    }

}