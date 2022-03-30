/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula06Exercicio;

/**
 *
 * @author fabricio.vbelomo
 */
public class Graduacao implements Curso {

    private String local;

    private String cursoEscolhido;

    public Graduacao() {
        
    }

    public Graduacao(String local, String cursoEscolhido) {
        this.local = local;
        this.cursoEscolhido = cursoEscolhido;
    }

    @Override
    public String getLocal() {
        return this.local;
    }

    @Override
    public String toString() {
        return "Graduacao{" + "local=" + local + ", RequisitoDiploma=" + Diploma.EnsinoMédio + '}';
    }

    @Override
    public String getTipoGraduacao() {
        return this.cursoEscolhido;
    }

    @Override
    public Diploma getRequisitoDiploma() {
        return Diploma.EnsinoMédio;
    }
}
