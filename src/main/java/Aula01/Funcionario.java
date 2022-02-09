/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula01;

/**
 *
 * @author fabricio.vbelomo
 */
public class Funcionario extends PessoaFisica {

    private int matricula;

    public Funcionario() {
        
    }

    public Funcionario(String nome, long cpf, int matricula) {
        super(nome, cpf);
        setMatricula(matricula);
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
