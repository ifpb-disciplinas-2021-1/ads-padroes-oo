package br.edu.ifpb.compra;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 29/06/2021, 10:36:22
 */
public class PersistirPessoaEmBancoDeDados{

    private Pessoas pessoas;
    
    public void salvarNoBanco(Pessoa pessoa){
        pessoas.salvar(pessoa);
    }
}
