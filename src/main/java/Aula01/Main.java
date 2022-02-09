/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula01;

import java.util.Scanner;

/**
 *
 * @author fabricio.vbelomo
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("*****Instancia Pessoa Contrutor vazio*****");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Gerson");
        System.out.println(pessoa.getNome());

        System.out.println("*****Instancia Pessoa Contrutor parametros*****");
        Pessoa pessoaConstrutor = new Pessoa("Felype");
        System.out.println(pessoaConstrutor.getNome());
        
    }
}
