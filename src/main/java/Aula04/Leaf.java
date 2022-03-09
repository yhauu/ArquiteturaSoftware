/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04;

/**
 *
 * @author fabricio.vbelomo
 */
public class Leaf implements Component {
    
    private double preco;
    
    private String nome;
    
    public Leaf() {
        
    }
    
    public Leaf(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public String toString() {
        return "Leaf{" + "preco=" + preco + ", nome=" + nome + '}';
    }
}
