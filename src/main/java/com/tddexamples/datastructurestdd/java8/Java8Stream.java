package com.tddexamples.datastructurestdd.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Java8Stream {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        List<Float> floatList = new ArrayList<>();
        for (Product product : productsList) {
            if (product.price > 25000f) {
                floatList.add(product.price);
            }
        }
        System.out.println("Using forEach Loop");
        floatList.forEach(System.out::println);

        System.out.println("Using for Loop");

        for (Float price : floatList) {
            System.out.println(price);
        }

        System.out.println("Using fori iterative Loop");

        for (int i = 0; i < floatList.size(); i++) {
            System.out.println(floatList.get(i));
        }

        System.out.println("Using Stream Print");

        productsList.stream()
                .filter(product -> product.price > 25000f)
                .map(product -> product.price)
                .forEach(System.out::println);

        System.out.println("Using Stream Print Set");

        productsList.stream()
                .filter(product -> product.price > 25000f)
                .map(product -> product.price)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Using Stream Print List");

        productsList.stream()
                .filter(product -> product.price > 25000f)
                .map(product -> product.price)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        System.out.println("Using Stream Print Set with Seperate For");

        Set<Float> set = productsList.stream()
                .filter(product -> product.price > 25000f)
                .map(product -> product.price)
                .collect(Collectors.toSet());
        set.forEach(System.out::println);
        System.out.println(set);

        System.out.println("Using Stream to Iterate");

        Stream.iterate(10, e -> e + 3)
                .filter(e -> e % 2 == 0)
                .limit(5)
                .forEach(System.out::println);


        System.out.println("Using Stream wit ForEach Loop");

        productsList.stream()
                .filter(product -> product.price > 25000f)
//                .map(product -> product.price)
                .forEach(product -> System.out.println(product.name));

        System.out.println("ForEach Loop to Calculate n print");

        floatList.forEach(p -> {
            p = p + 1;
            System.out.println(p);
        });

        float reduce = floatList.stream()
                .reduce(0.0f, Float::sum);
        System.out.println("Reduce operation: " + reduce);

        float reduce2 = floatList.stream()
                .reduce(0.0f, (sum, price) -> sum + price);
        System.out.println("Reduce operation using Lambda: " + reduce2);

        float collect = (float) floatList.stream()
                .collect(Collectors.reducing(0.0f, Float::sum));

        System.out.println("Collect operation: " + collect);

        double d = productsList.stream()
                .collect(Collectors.summingDouble(p -> p.price));

        System.out.println("Collect operation Summing Double: " + d);

        Product max = productsList.stream()
                .max((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
        System.out.println("Max: " + max.price);

        Product min = productsList.stream()
                .min((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
        System.out.println("Min: " + min.price);

        long count = productsList.stream()
                .filter(product -> product.price > 25000f)
                .count();
        System.out.println("Count: " + count);

        System.out.println("Using Stream to Generate");

        Stream.generate(new Random()::nextInt)
                .limit(10)
                .forEach(System.out::println);

        /*
        * For Sorting in STreams Look for Employee.java*/

    }
}