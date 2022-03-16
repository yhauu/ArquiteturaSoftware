/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05;

/**
 *
 * @author fabricio.vbelomo
 */
public class FabricaCarro {
    public static void main(String[] args) {
        Fabrica fabrica = new FabricaFiat();
        Carro carro1 = fabrica.factoryMethod(Lista.values()[2]);
        //Carro c = new FabricaVW.factoryMethod(Lista.values()[0]);

        System.out.println(carro1);
    }
}
