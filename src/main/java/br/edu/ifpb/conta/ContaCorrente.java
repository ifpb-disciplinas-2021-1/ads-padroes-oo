package br.edu.ifpb.conta;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 15/06/2021, 10:52:40
 */
public class ContaCorrente extends Conta{

    private static final double TAXA = 1.01;
    public ContaCorrente(String cliente) {
        super(cliente);
    }
    
    public void sacar(Dinheiro valor){
//        Dinheiro saque = new Dinheiro(valor. * 1.01);
        saldo = saldo.subtrair(valor.aplicarTaxa(1.01));
    }

}
