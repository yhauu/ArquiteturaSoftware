package Aula02Tanque;


public class Tanque implements Cores, Posicao, Canhao {

    private CoresRGB corTanque;

    private CoresRGB corCanhao;

    private double x;

    private double y;

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void atirar() {
        System.out.println("Atirando...");
    }

    @Override
    public void setCorTanque(CoresRGB cor) {
        this.corTanque = cor;
    }

    @Override
    public void setCorCanhao(CoresRGB cor) {
        this.corCanhao = cor;
    }

    @Override
    public CoresRGB getCorTanque() {
      return corTanque;  
    }

    @Override
    public CoresRGB getCorCanhao() {
        return corCanhao;
    }

    @Override
    public String toString() {
        return "Tanque{" + "corTanque=" + corTanque + ", corCanhao=" + corCanhao + ", x=" + x + ", y=" + y + '}';
    }
}
