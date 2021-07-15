package br.edu.ifpb.compra;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 29/06/2021, 10:24:24
 */
public class Main {
    public static void main(String[] args) {
        PessoasEmBancoDeDados banco = new PessoasEmBancoDeDados();
        banco.salvar(
            new Pessoa()
        );
    }
}
