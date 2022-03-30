/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula07;

/**
 *
 * @author fabricio.vbelomo
 */
public class NavesInimigas implements Observer {

    private String nome;

    public NavesInimigas(String nome, Subject subject) {
        this.nome = nome;
        subject.adicionarObservador(this);
    }

    @Override
    public void update(Acoes acoes) {
        System.out.println(nome + " " + acoes);
    }
}
