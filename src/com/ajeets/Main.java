package com.ajeets;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Singleton");

        EagerInitializedSingleton.getInstance();
        StaticBlockSingleton.getInstance();
        LazyInitializedSingleton.getInstance();
        ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton.getInstanceUsingDoubleLocking();
        BillPughSingleton.getInstance();
        BillPughSingleton.getInstance();

        EnumSingleton enumSingletonInstanceOne = EnumSingleton.INSTANCE;
        System.out.println(enumSingletonInstanceOne.hashCode());

        EnumSingleton enumSingletonInstanceTwo = EnumSingleton.INSTANCE;
        System.out.println(enumSingletonInstanceTwo.hashCode());

        SerializedSingleton.getInstance();
    }
}
