/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05;

/**
 *
 * @author fabricio.vbelomo
 */
public class FabricaFiat implements Fabrica {

    @Override
    public Carro factoryMethod(Lista lista) {
        Carro carro = null;

        if (lista.equals(Lista.ARGO)) {
            carro = new Fox(40000, "Argo II");
            
        } else if (lista.equals(Lista.UNO)) {
            carro = new Jetta(12000, "Uno Milli");
        }

        return carro;
    }
    
}
