/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula01;

/**
 *
 * @author fabricio.vbelomo
 */
public class PessoaJuridica extends Pessoa {

    private long cnpj;

    public PessoaJuridica() {
        
    }

    public PessoaJuridica(String nome, long cpf) {
        super(nome);
        setCnpj(cpf);
    }

    public long getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
}
