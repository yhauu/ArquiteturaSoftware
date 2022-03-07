/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Aula03;

/**
 *
 * @author fabricio.vbelomo
 */
public enum Empresas implements StrategyInterface {

    ABC {
        @Override
        public double frete(Distancia distancia) {
            return distancia.getDistancia() * 0.1;
        }
    },
    
    CBA {
        @Override
        public double frete(Distancia distancia) {
            return distancia.getDistancia() * 0.2;
        }
    },
    
    XPTO {
        @Override
        public double frete(Distancia distancia) {
            return distancia.getDistancia() * 0.3;
        }
    }
}
