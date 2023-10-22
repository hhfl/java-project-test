package com.dio.singleton;

public class SingletonFast {

    private static SingletonFast instancia = new SingletonFast();

    public SingletonFast() {
        super();
    }

    public static SingletonFast getInstancia() {
        return instancia;
    }
}
