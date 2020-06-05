package com.tddexamples.datastructurestdd.java8;

interface Drawable1 {
    public String drawString(String string);
}

public class Java8InterfaceWithLambda {
    public static void main(String[] args) {
        Drawable1 drawable1 = (s) -> {

            System.out.println("Lambda : " + s);
            return ""+s;
        };

        String res = drawable1.drawString("nils");
        System.out.println(res+ " from Lambda method");

        Drawable1 drawable2 = s -> {
            System.out.println("Lambda : " + s);
            return ""+s;
        };

        String ress = drawable2.drawString("Nilesh");
        System.out.println(res + " from Lambda method");

        Runnable runnable = ()-> {
            System.out.println("Inside runnable run method");
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

}
