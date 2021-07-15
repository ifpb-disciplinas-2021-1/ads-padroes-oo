package br.edu.ifpb.compra;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 29/06/2021, 10:23:09
 */
public class Pessoa {

    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa(String nome,String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void caminhar(){
        
    }
    public Pessoa() {
    }

}
