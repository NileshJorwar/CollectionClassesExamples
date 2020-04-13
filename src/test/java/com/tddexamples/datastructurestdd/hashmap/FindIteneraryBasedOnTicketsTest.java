package com.tddexamples.datastructurestdd.hashmap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FindIteneraryBasedOnTicketsTest {

    FindIteneraryBasedOnTickets findIteneraryBasedOnTickets;

    @BeforeAll
    public void setUp() {
        findIteneraryBasedOnTickets = new FindIteneraryBasedOnTickets();
    }

    @Test
    public void contextLoads() {
        assertThat(findIteneraryBasedOnTickets).isNotNull();
    }

    @Test
    public void test_findItenerary() {
        Map<String, String> tickets =
                new HashMap<>();
        tickets.put("Chennai", "Banglore");
        tickets.put("Bombay", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        findIteneraryBasedOnTickets.findItenerary(tickets);

//        assertEquals(false, actualResult);
    }


}