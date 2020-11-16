
/**
 * Carrinho de Compras usando Singleton
 */

import java.util.ArrayList;

public class CarrinhoCompras {
    private static CarrinhoCompras unicoCarrinho;
    private ArrayList<String> produtosGuardados = new ArrayList<>();

    private CarrinhoCompras(){}

    public static synchronized CarrinhoCompras getInstance(){
        if(unicoCarrinho == null){
            unicoCarrinho = new CarrinhoCompras();
        }
        return unicoCarrinho;
    }

    public void addProduto(String prod){
        produtosGuardados.add(prod);
    }

    public void getCarrinho(){
        System.out.println("\nCARRINHO:\n");
        for(String valor : produtosGuardados){
            System.out.println("Produto Adicionado: " + valor);
        }
    }
}