/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04;

/**
 *
 * @author fabricio.vbelomo
 */
public class Cesta {
    public static void main(String[] args) {
        Composite cesta = new Composite("Café da manhã");
        Leaf produto1 = new Leaf(12.45, "xícara");
        Leaf produto2 = new Leaf(8.6, "Café");
        Leaf produto3 = new Leaf(5.23, "Biscoito");
        Leaf produto4 = new Leaf(1.62, "Geleia de morango");
        Leaf produto5 = new Leaf(7.98, "Geleia de damasco");
        
        Composite caixaGeleia = new Composite("Caixa de Geléias");
        caixaGeleia.adicionar(produto4);
        caixaGeleia.adicionar(produto5);
        
        cesta.adicionar(produto1);
        cesta.adicionar(produto2);
        cesta.adicionar(produto3);
        cesta.adicionar(caixaGeleia);
        
        System.out.println("Total: " + cesta.getPreco());
    }
}
