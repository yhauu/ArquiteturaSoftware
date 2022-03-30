/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula06Exercicio;

/**
 *
 * @author fabricio.vbelomo
 */
public class EfetuarMatriculaPosGraduacao implements Matricula {

    @Override
    public Curso factoryMethod(OpcoesCurso opcoesCurso) {
        Curso curso = null;

        if (opcoesCurso.equals(OpcoesCurso.PósGraduação)) {
            curso = new Graduacao("Unidade", "Pós Graduação");
        }

        return curso;
    }
}
