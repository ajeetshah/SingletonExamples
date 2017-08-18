package com.ajeets;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){
        System.out.println("Instance of SerializedSingleton created");
    }

    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    protected Object readResolve() {
        return getInstance();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }
}
