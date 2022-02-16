/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

import java.util.Scanner;

/**
 *
 * @author fabricio.vbelomo
 */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Veiculo v;
        int velocidade;

        System.out.println("Insira uma opção:\n" + "1 - Acelerar Carro\n" + "2 - Acelerar Moto");
        velocidade = input.nextInt();

        if (velocidade == 1) {
            v = new Carro();
            v.acelerar();
            v.painel();
        } else if (velocidade == 2) {
            v = new Moto();
            v.acelerar();
            v.painel();
        } else {
            System.out.println("ERROR");
        }
            
    }
}
