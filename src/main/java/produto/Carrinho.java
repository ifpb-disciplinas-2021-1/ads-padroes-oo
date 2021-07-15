package produto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 29/06/2021, 10:44:37
 */
// wmc - média 3/2 - 1.5
public class Carrinho {
    private List<ItemDeProduto> itens = new ArrayList<>();
    public void adicionar(ItemDeProduto item){ // 2 complexidade ciclomática
        if(!itens.contains(item)) 
            itens.add(item);
    }
    public void remover(ItemDeProduto item){ // 1 complexidade ciclomática
        itens.remove(item);
    }
    double valorTotal() {
        
//        return itens.stream()
//            .mapToDouble(ItemDeProduto::totalParcial)
//            .sum();
        
        double soma =0;
        for (ItemDeProduto item : itens) {
            soma +=item.totalParcial();
        }
        return soma;    
    }
}
