package com.tddexamples.datastructurestdd.java8;

interface Drawable {
    public void draw();

    public String draw(String str);
}

public class Java8InterfaceWithoutLambda implements Drawable {
    public static void main(String[] args) {
        int width = 10;

        //without lambda, Drawable implementation using anonymous class

        Drawable drawable = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Inside anonymous class");
            }

            @Override
            public String draw(String str) {
                System.out.println("Inside anonymous class:" + str);
                return "Inside anonymous class:" + str;
            }
        };
        drawable.draw();
        drawable.draw("Nilesh");
        //Using reference
        Drawable java8 = new Java8InterfaceWithoutLambda();
        java8.draw();
        java8.draw("Sachin");

    }


    @Override
    public void draw() {
        System.out.println("Printing in Interface");
    }

    @Override
    public String draw(String string) {
        System.out.println("Printing in Interface:" + string);
        return "Printing in Interface:" + string;
    }
}
