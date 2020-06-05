package com.tddexamples.datastructurestdd.java8;

interface Sayable {
    void say(String s);
}

public class MethodReference {
    public static void referStaticMethod(String s) {
        System.out.println("Static method reference: "+s);
    }

    public void referInstanceMethod(String s) {
        System.out.println("Instance method reference: "+s);
    }

    public static void main(String[] args) {
        Sayable sayable = MethodReference::referStaticMethod;
        sayable.say("Nilesh");
        MethodReference methodReference = new MethodReference();
        Sayable sayable1 = methodReference::referInstanceMethod;
        sayable1.say("Sachin");
        /*Thread thread = new Thread(MethodReference::referStaticMethod);
        thread.start();
        Thread thread1 = new Thread(methodReference::referInstanceMethod);
        thread1.start();
        */

    }
}
