package com.dio.singleton;

public class SingletonF {

    private static SingletonF instancia;

    public SingletonF() {
        super();
    }

    public static SingletonF getInstancia() {
        if ( instancia == null ){
            instancia = new SingletonF();
        }
        return instancia;
    }
}
