

package br.cefetmg.altomare.idao;


public interface IPassageiro {
    void InserirDadosPassageiro(String nome, String dataNascimento, String sexo, String cpf, String rg,String  civil, String email, String telefone, Pacote pacote, Despesas Despesa);
         
    Passageiro ConsultarCliente(String cpf);
    Passageiro Procurar(String cpf);
    
}
