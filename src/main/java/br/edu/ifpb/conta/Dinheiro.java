package br.edu.ifpb.conta;

import java.text.DecimalFormat;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 15/06/2021, 10:21:35
 */
public class Dinheiro { //imutabilidade

    private final int centavos; // 2 reais (200 centavos)
    private final static int UNIDADE = 100;

    public Dinheiro(int centavos) {
        this.centavos = centavos;
    }
    private Dinheiro(double centavos) {
        this((int)centavos);
    }

    public Dinheiro somar(Dinheiro valor) {
        return new Dinheiro(
            valor.centavos + this.centavos
        );
    }

    public Dinheiro subtrair(Dinheiro valor) {
        return new Dinheiro(
            this.centavos - valor.centavos
        );
    }
    
    public Dinheiro aplicarTaxa(double taxa) {
        return new Dinheiro(
            this.centavos * taxa
        );
    }
    

    public String emReais() {// R$ 2,30
        DecimalFormat decimal = new DecimalFormat("###,###.00");
        return String.format(
            "R$ %s",decimal.format(centavos/UNIDADE)
        );
    }
    public String emCentavos() {// R$ 2,30
        return String.format(
            "%s",centavos
        );
    }

}
