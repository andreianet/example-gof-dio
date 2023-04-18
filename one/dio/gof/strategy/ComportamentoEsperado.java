package one.dio.gof.strategy;


public class ComportamentoEsperado implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo de forma esperada!");
    }
}
