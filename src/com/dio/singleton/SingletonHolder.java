package com.dio.singleton;

public class SingletonHolder {

    private static class Holder {
        public static SingletonHolder instancia = new SingletonHolder();
    }
    public SingletonHolder() {
        super();
    }

    public static SingletonHolder getInstancia() {
        return Holder.instancia;
    }
}
