package br.edu.ifpb.conta;

public class Conta {

    protected Dinheiro saldo;
    private String nomeDoCliente;

    public Conta(String cliente) {
        this.nomeDoCliente = cliente;
        this.saldo = new Dinheiro(0);
    }
    
    public void transferirPara (Conta destino, Dinheiro valor){
        this.sacar(valor);
        destino.depositar(valor);
    }
    //comportamento diferente nas subclasses
    public void sacar(Dinheiro valor){
//        if() pré-condição
        this.saldo = this.saldo.subtrair(valor);
    }
    
    public void depositar(Dinheiro valor){
        this.saldo = this.saldo.somar(valor);
    }
    
    public Dinheiro verificarSaldo(){
        return this.saldo;
    }
}
