/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula03Exercicio;

/**
 *
 * @author fabricio.vbelomo
 */
public class Exemplo {
    
    public static void main(String[] args) {
        char[] lista = {'a', 'a', 'c', 'e', 'f', 'h', 't', 'u', 'i', 'a', 'e', 'b'};
        //Strategy strategy;
        //strategy = new Strategy();
        int n = 2;
        switch (n) {
            case 1:
                //strategy.converteMaiuculos(lista);
                break;
            case 2:
                //strategy.contarVogal(lista);
                break;
            default:
                //strategy.mostrarCaracteres(lista);
                break;
        }
    }
    
    //toString de uma classe n
    public void mostrarCaracteres(char[] lista){
        for(char c:lista){
            System.out.print(c+" ");
        }
    }

    //toUpperCase
    public void converteMaiuculos(char[] lista) {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = Character.toUpperCase(lista[i]);
        }
    }
    
    public void contarVogal(char[] lista) {
        char[] vogal = {'a', 'e', 'i', 'o', 'u'};
        int cont = 0;
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < vogal.length; j++) {
                if (lista[i] == vogal[j]) {
                    cont++;
                }
            }
        }
        System.out.println(cont);
    }

}
