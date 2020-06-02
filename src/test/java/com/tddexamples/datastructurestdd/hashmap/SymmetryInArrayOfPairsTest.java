package com.tddexamples.datastructurestdd.hashmap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SymmetryInArrayOfPairsTest {

    private SymmetryInArrayOfPairs symmetryInArrayOfPairs;

    @BeforeEach
    public void setup() {
        symmetryInArrayOfPairs = new SymmetryInArrayOfPairs();
    }


    @Test
    void findPairs() {
        int arr[][] = new int[5][2];
        arr[0][0] = 11;
        arr[0][1] = 20;
        arr[1][0] = 30;
        arr[1][1] = 40;
        arr[2][0] = 5;
        arr[2][1] = 10;
        arr[3][0] = 40;
        arr[3][1] = 30;
        arr[4][0] = 10;
        arr[4][1] = 5;
        ArrayList<ArrayList<Integer>> res = symmetryInArrayOfPairs.findPairs(arr);
        assertThat(res).isNotNull();
        assertThat(res.get(0).get(0)).isEqualTo(40);
        assertThat(res.get(0).get(1)).isEqualTo(30);
        assertThat(res.get(0).get(2)).isEqualTo(10);
        assertThat(res.get(0).get(3)).isEqualTo(5);
    }
}