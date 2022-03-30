/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula06Exercicio;

public class TanqueM1 implements Tanque {
    
    private CoresRGB corTanque;

    private CoresRGB corCanhao;

    private double x;

    private double y;

    public TanqueM1(CoresRGB corTanque, CoresRGB corCanhao, double posicaoX, double posicaoY) {
        this.corTanque = corTanque;
        this.corCanhao = corCanhao;
        this.x = posicaoX;
        this.y = posicaoY;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public CoresRGB getCorTanque() {
        return this.corTanque;
    }

    @Override
    public CoresRGB getCorCanhao() {
        return this.corCanhao;
    }

    @Override
    public void atirar() {
        System.out.println("Atirando...");
    }

    @Override
    public String toString() {
        return "Tanque{" + "corTanque=" + corTanque + ", corCanhao=" + corCanhao + ", x=" + x + ", y=" + y + '}';
    }
}
