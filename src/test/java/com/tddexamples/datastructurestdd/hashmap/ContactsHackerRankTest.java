package com.tddexamples.datastructurestdd.hashmap;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ContactsHackerRankTest {

    @Autowired
    ContactsHackerRank contactsHackerRank;

    @Test
    public void test(){
        String queries[][] = new String[4][2];
        queries[0][0] = "add";
        queries[0][1] = "hack";
        queries[1][0] = "add";
        queries[1][1] = "hackerrank";
        queries[2][0] = "find";
        queries[2][1] = "hac";
        queries[3][0] = "find";
        queries[3][1] = "hak";
        contactsHackerRank = new ContactsHackerRank();
        contactsHackerRank.contacts(queries);
    }

}