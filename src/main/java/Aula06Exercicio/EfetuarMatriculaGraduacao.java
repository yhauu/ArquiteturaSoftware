/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula06Exercicio;

/**
 *
 * @author fabricio.vbelomo
 */
public class EfetuarMatriculaGraduacao implements Matricula {

    @Override
    public Curso factoryMethod(OpcoesCurso opcoesCurso) {
        Curso curso = null;

        if (opcoesCurso.equals(OpcoesCurso.GraduaçãoEAD)) {
            curso = new Graduacao("Polo", "Graduação");
            
        } else if (opcoesCurso.equals(OpcoesCurso.GraduaçãoPresencial)) {
            curso = new Graduacao("Unidade", "Graduação");
        }

        return curso;
    }
}
