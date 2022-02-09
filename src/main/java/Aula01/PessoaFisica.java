/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula01;

/**
 *
 * @author fabricio.vbelomo
 */
public class PessoaFisica extends Pessoa {

    private long cpf;

    public PessoaFisica() {
        
    }

    public PessoaFisica(String nome, long cpf) {
        super(nome);
        setCpf(cpf);
    }

    public long getCpf() {
        return this.cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}
