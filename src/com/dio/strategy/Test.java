package com.dio.strategy;

import com.dio.facade.Facade;
import com.dio.singleton.SingletonF;
import com.dio.singleton.SingletonFast;
import com.dio.singleton.SingletonHolder;

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

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Higor","09450000");

    }
}
