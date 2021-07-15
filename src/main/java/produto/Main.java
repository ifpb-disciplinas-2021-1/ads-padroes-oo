package produto;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 29/06/2021, 10:57:59
 */
public class Main {
    public static void main(String[] args) {
        Produto arroz = new Produto(
            "arroz", 2.65
        );
        Produto leite = new Produto(
            "leite", 6.89
        );
        
        Carrinho carrinho =new Carrinho();
        carrinho.adicionar(
            new ItemDeProduto(arroz,3)
        );
        carrinho.adicionar(
            new ItemDeProduto(leite,2)
        );
        
        double valorTotal = carrinho.valorTotal();
        System.out.println("valorTotal = " + valorTotal);
    }
}
