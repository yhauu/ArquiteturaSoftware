package Aula06Exercicio;

public class MontaTanque implements FactoryMethod {

    @Override
    public Tanque factoryMethod(CoresRGB corTanque, CoresRGB corCanhao, double posicaoX, double posicaoY) {
        Tanque tanque = null;

        if (corTanque != null && corCanhao != null) {
            tanque = new TanqueM1(corTanque, corCanhao, posicaoX, posicaoY);
        }
        
        return tanque;
    }
}
