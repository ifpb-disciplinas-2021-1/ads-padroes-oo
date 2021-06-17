package br.edu.ifpb.main;

import br.edu.ifpb.conta.Conta;
import br.edu.ifpb.conta.ContaCorrente;
import br.edu.ifpb.conta.Dinheiro;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 15/06/2021, 10:18:03
 */
public class Main {
    public static void main(String[] args) {
        // instanciar o objeto -> Cliente
        //pré-condição
        Conta conta = new Conta("Job");
        Conta contajoao = new ContaCorrente("João Gabriel");
        
        Dinheiro doze = new Dinheiro(1200);
        Dinheiro cinco = new Dinheiro(500);
        //depositar 12 reais (dinheiro)
        conta.depositar(doze);
        
        conta.transferirPara(contajoao,cinco);
        
        System.out.println(conta.verificarSaldo().emReais());
        
        System.out.println(contajoao.verificarSaldo().emReais());
        contajoao.sacar(
            new Dinheiro(100)
        );
        System.out.println(contajoao.verificarSaldo().emReais());
        System.out.println(contajoao.verificarSaldo().emCentavos());
        
        
        
    }
}
