package com.dev.pattern.singleton;

/**
 * Singleton class
 */
public class SingletonClass {

    // Eager loading singleton
    private static SingletonClass singletonClass = new SingletonClass();
    private String name;
    private SingletonClass() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static SingletonClass getInstance() {
        return singletonClass;
    }
}
