package com.tddexamples.datastructurestdd.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class Java8FunctionalInterface {

    public static void show(String name, int age) {
        System.out.println(name + "," + age);
    }

    public static void showDetails(Map<String, Integer> map, String name) {
        map.forEach((k, v) -> System.out.println(k + v + name));
    }

    public static void showConsumer(String name) {
        System.out.println("Consumer:" + name);
    }

    public static String showFunction(String name) {
        return "Function:" + name;
    }

    public static boolean showPredicate(int age) {
        return age > 20 ? true : false;
    }

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

        BiConsumer<String, Integer> biConsumer = Java8FunctionalInterface::show;
        biConsumer.accept("Nilesh", 10);
        biConsumer.accept("Sachin", 12);

        Map<String, Integer> map = new HashMap<>();
        map.put("Mohan", 100);
        map.put("Sachin", 100);
        map.put("Anil", 100);
        map.put("Anil", 100);

        // BiConsumer takes two arguments
        BiConsumer<Map<String, Integer>, String> biConsumer2 = Java8FunctionalInterface::showDetails;
        biConsumer2.accept(map, "Student");

        //Consumer takes one argument
        Consumer<String> consumer = Java8FunctionalInterface::showConsumer;
        consumer.accept("Sachin");
        consumer.accept("Nilesh");

        // Function takes one argument and returns the second
        Function<String, String> function = Java8FunctionalInterface::showFunction;
        function.apply("Sachin");
        function.apply("Nilesh");

        //Predicate returns boolean value taking one Input
        Predicate<Integer> pr = a -> a > 19;
        System.out.println("Predicate:" + pr.test(20));
        System.out.println("Predicate:" + pr.test(17));

        Predicate<Integer> predicate = Java8FunctionalInterface::showPredicate;
        System.out.println("Predicate Func:" + predicate.test(10));
        System.out.println("Predicate Func:" + predicate.test(21));

        //Supplier takes no argument but returns a value
        Supplier<String> supplier = () -> {
            return "Nilesh";
        };
        System.out.println("Supplier :" + supplier.get());


    }
}
