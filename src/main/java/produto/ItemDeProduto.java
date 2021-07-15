package produto;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 29/06/2021, 11:00:09
 */
public class ItemDeProduto {

    private final Produto produto;
    private final int quantidade;

    public ItemDeProduto(Produto produto,int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public Produto produto(){
        return this.produto;
    }
    public int quantidade(){
        return this.quantidade;
    }
    
    public double totalParcial(){
        return this.produto.valor() * this.quantidade;
    }
    
}
