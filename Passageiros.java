/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.altomare.dto;


public class Passageiros extends Usuario{

    private Pacote pacote;
    private Despesas despesa;
            
    public Passageiros(Pacote pacote, Despesas despesa, String cpf, long rg, String nome, String dataNascimento, String email, String senha, long telefone, String sexo, String estadoCivil){
        super(cpf, rg, nome, dataNascimento, email, senha, telefone, sexo, estadoCivil);
         this.pacote = pacote;
         this.despesa = despesa;
    }
}
