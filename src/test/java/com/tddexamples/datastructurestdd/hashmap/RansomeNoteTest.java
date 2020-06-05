package com.tddexamples.datastructurestdd.hashmap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomeNoteTest {

    RansomeNote ransomeNote;

    @BeforeEach
    void setUp() {
        ransomeNote = new RansomeNote();
    }

    @Test
    void isLetterConstructibleFromMagazine() {
        ransomeNote.isLetterConstructibleFromMagazine("abcd", "abcdhfjfj");

    }
}