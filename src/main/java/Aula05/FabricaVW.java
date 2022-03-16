/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05;

/**
 *
 * @author fabricio.vbelomo
 */
public class FabricaVW implements Fabrica {

    @Override
    public Carro factoryMethod(Lista lista) {
        Carro carro = null;

        if (lista.equals(Lista.FOX)) {
            carro = new Fox(60000, "Cross Fox");
            
        } else if (lista.equals(Lista.JETTA)) {
            carro = new Jetta(120000, "Jetta TSI");
        }

        return carro;
    }
}
