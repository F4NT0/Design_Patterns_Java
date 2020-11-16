public class Testes {
    public static void main(String args[]){
        
        // Teste Singleton
        CarrinhoCompras carrinho = CarrinhoCompras.getInstance();
        carrinho.addProduto("PS5");
        carrinho.addProduto("XBOX");
        carrinho.addProduto("PC");
        carrinho.getCarrinho();
        CarrinhoCompras carrinho2 = CarrinhoCompras.getInstance();
        carrinho2.getCarrinho();
    }
}