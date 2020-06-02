package com.tddexamples.datastructurestdd.hashmap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IsLetterConstructFromMagazineTest {

    @Test
    void isLetterConstructibleFromMagazine() {
        IsLetterConstructFromMagazineOrRansomeNote isLetterConstructFromMagazineOrRansomeNote =
                new IsLetterConstructFromMagazineOrRansomeNote();
        String letter = "abcd";
        String magazine = "abcd";
        boolean res = isLetterConstructFromMagazineOrRansomeNote.isLetterConstructibleFromMagazine(letter, magazine);
        assertThat(res).isTrue();
        String letter1 = "abcd";
        String magazine1 = "abc";
        boolean res1 = isLetterConstructFromMagazineOrRansomeNote.isLetterConstructibleFromMagazine(letter1, magazine1);
        assertThat(res1).isFalse();
        String letter2 = "abcd";
        String magazine2 = "abcdefg";
        boolean res2 = isLetterConstructFromMagazineOrRansomeNote.isLetterConstructibleFromMagazine(letter2, magazine2);
        assertThat(res2).isTrue();


    }
}