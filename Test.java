

import one.dio.gof.facade.Facade;
import one.dio.gof.singleton.SingletonEager;
import one.dio.gof.singleton.SingletonLazy;
import one.dio.gof.singleton.SingletonLazyHolder;
import one.dio.gof.strategy.Comportamento;
import one.dio.gof.strategy.ComportamentoAgressivo;
import one.dio.gof.strategy.ComportamentoDefensivo;
import one.dio.gof.strategy.ComportamentoEsperado;
import one.dio.gof.strategy.Robo;

public class Test {
    public static void main(String[] args) {

        //singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
   

        /*
        * Strategy
        */
        Comportamento esperado = new  ComportamentoEsperado();    
        Comportamento defensico = new  ComportamentoDefensivo();    
        Comportamento agressivo = new  ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(esperado);

        robo.mover();
        robo.mover();

        //facade
        Facade facade = new Facade();
        facade.migrarCliente("Andreia", "17509110");
    }
}
