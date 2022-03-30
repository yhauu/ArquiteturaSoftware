/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula06Exercicio;

/**
 *
 * @author fabricio.vbelomo
 */
public class MatriculaCurso {

    public static void main(String[] args) {
        Matricula matricula = new EfetuarMatriculaPosGraduacao();
        Curso curso = matricula.factoryMethod(OpcoesCurso.values()[0]);

        System.out.println(curso);
    }
}
