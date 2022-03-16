/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05;

/**
 *
 * @author fabricio.vbelomo
 */
public class Fox implements Carro {
    
    private double preco;
    private String modelo;

    public Fox() {
        
    }

    public Fox(double preco, String modelo) {
        this.preco = preco;
        this.modelo = modelo;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public String getModelo() {
        return this.modelo;
    }

    @Override
    public String toString() {
        return "Fox{" + "preco=" + preco + ", modelo=" + modelo + '}';
    }
}
