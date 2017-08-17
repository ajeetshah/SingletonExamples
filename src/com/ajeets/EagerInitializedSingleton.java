package com.ajeets;

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){
        System.out.println("Instance of EagerInitializedSingleton created");
    }

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
