package com.tddexamples.datastructurestdd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LinkedListTest {

    LinkedList linkedList;

    @BeforeAll
    public void setup() {
        linkedList = new LinkedList();
    }

    @Test
    public void contextLoads() {
        assertThat(linkedList).isNotNull();
    }

    @Test
    public void should_return_empty_list() {
        int testData = 0;
        NodeOfList nodeOfList = null;

        nodeOfList = linkedList.insert(nodeOfList, 10);
        nodeOfList = linkedList.insert(nodeOfList, 2);
        nodeOfList = linkedList.insert(nodeOfList, 1);
        nodeOfList = linkedList.insert(nodeOfList, 56);
        nodeOfList = linkedList.insert(nodeOfList, 23);
        nodeOfList = linkedList.insert(nodeOfList, 44);

        assertThat(nodeOfList.data).isEqualTo(10);
        assertThat(nodeOfList.next.data).isEqualTo(2);
        assertThat(nodeOfList.next.next.data).isEqualTo(1);
        assertThat(nodeOfList.next.next.next.data).isEqualTo(56);
        assertThat(nodeOfList.next.next.next.next.data).isEqualTo(23);
        assertThat(nodeOfList.next.next.next.next.next.data).isEqualTo(44);

        linkedList.show(nodeOfList);
    }

    @Test
    public void test_insertAtPosition() {
        NodeOfList nodeOfList = null;

        nodeOfList = linkedList.insertAt(nodeOfList, 10, 3);//will neglect the position
        nodeOfList = linkedList.insertAt(nodeOfList, 5, 1);
        nodeOfList = linkedList.insertAt(nodeOfList, 7, 3);
        nodeOfList = linkedList.insertAt(nodeOfList, 44, 2);
        nodeOfList = linkedList.insertAt(nodeOfList, 23, 2);

        assertThat(nodeOfList.data).isEqualTo(5);
        assertThat(nodeOfList.next.data).isEqualTo(23);
        assertThat(nodeOfList.next.next.data).isEqualTo(44);
        assertThat(nodeOfList.next.next.next.data).isEqualTo(10);
        assertThat(nodeOfList.next.next.next.next.data).isEqualTo(7);

        //linkedList.show(nodeOfList);

//        nodeOfList = linkedList.deleteAt(nodeOfList,1);
        nodeOfList = linkedList.deleteAt(nodeOfList,2);
        nodeOfList = linkedList.deleteAt(nodeOfList,4);

        linkedList.show(nodeOfList);

    }

    @Test
    public void test_deleteNode() {
        NodeOfList nodeOfList = null;

        nodeOfList = linkedList.insertAt(nodeOfList, 10, 3);//will neglect the position
        nodeOfList = linkedList.insertAt(nodeOfList, 5, 1);
        nodeOfList = linkedList.insertAt(nodeOfList, 7, 3);
        nodeOfList = linkedList.insertAt(nodeOfList, 44, 2);
        nodeOfList = linkedList.insertAt(nodeOfList, 23, 2);

        assertThat(nodeOfList.data).isEqualTo(5);
        assertThat(nodeOfList.next.data).isEqualTo(23);
        assertThat(nodeOfList.next.next.data).isEqualTo(44);
        assertThat(nodeOfList.next.next.next.data).isEqualTo(10);
        assertThat(nodeOfList.next.next.next.next.data).isEqualTo(7);


        nodeOfList = linkedList.delete(nodeOfList,5);
        nodeOfList = linkedList.delete(nodeOfList,44);
        nodeOfList = linkedList.delete(nodeOfList,23);
        linkedList.show(nodeOfList);

    }

    }