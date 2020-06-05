package com.tddexamples.datastructurestdd.java8;

import java.util.function.Function;

public class Java8FunctionalInterface {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = i -> i * i * i;
        Function<Integer, Integer> f2 = i -> i * 2;

        System.out.println(f1.compose(f2).apply(3));

        Function<Integer, Integer> multiply = (value) -> value * 2;
        Function<Integer, Integer> add = (value) -> value + 3;

        Function<Integer, Integer> addThenMultiply = multiply.compose(add);

        Integer result1 = addThenMultiply.apply(3);
        System.out.println(result1);
        //When called with the value 3, the composed Function will first call the add Function and then the multiply Function. The resulting calculation will be (3 + 3) * 2 and the result will be 12.
    }
}
