package com.ajeets;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Singleton");

        EagerInitializedSingleton.getInstance();
        StaticBlockSingleton.getInstance();
        LazyInitializedSingleton.getInstance();
        ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton.getInstanceUsingDoubleLocking();
    }
}
