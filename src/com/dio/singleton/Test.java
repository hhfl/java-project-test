package com.dio.singleton;

import com.dio.strategy.ComportamentoDefensivo;
import com.dio.strategy.ComportamentoNormal;

public class Test {

    public static void main(String[] args) {
        SingletonF f = SingletonF.getInstancia();
        System.out.println(f);
        f = SingletonF.getInstancia();
        System.out.println(f);

        SingletonFast fast = SingletonFast.getInstancia();
        System.out.println(fast);
        fast = SingletonFast.getInstancia();
        System.out.println(fast);

        SingletonHolder holder = SingletonHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonHolder.getInstancia();
        System.out.println(holder);
    }
}
