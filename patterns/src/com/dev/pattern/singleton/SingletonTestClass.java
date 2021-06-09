package com.dev.pattern.singleton;

/**
 * Singleton test class
 */
public class SingletonTestClass {
    public static void main(String[] args) {
        // 1st case
        SingletonClass singletonClass = SingletonClass.getInstance();
        singletonClass.setName("Ritesh");
        System.out.println(singletonClass.getName());
        System.out.println(singletonClass);

        // 2nd case
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        singletonClass1.setName("Kumar");
        System.out.println(singletonClass1.getName());
        System.out.println(singletonClass1);
    }
}
