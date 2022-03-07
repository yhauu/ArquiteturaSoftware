/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula03;

/**
 *
 * @author fabricio.vbelomo
 */
public class Main {
    public static void main(String[] args) {
        Distancia distancia = new Distancia(100);
        System.out.println(calcularFrete(distancia, 0));
    }
  
    public static double calcularFrete(Distancia distancia, int indice) {
        return Empresas.values()[indice].frete(distancia);
    }
}
