package com.ajeets;

public class BillPughSingleton {

    private BillPughSingleton(){
        System.out.println("Instance of BillPughSingleton created");
    }

    // inner static helper class
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
