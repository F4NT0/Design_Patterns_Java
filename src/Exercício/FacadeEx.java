class Ecommerce{

    String nome;

    public Ecommerce(String nome){
        this.nome = nome;
    }

    public String getNomeEcommerce(){
        return nome;
    }
}

class Produto{
    String nome;

    public Produto(String nome){
        this.nome = nome;
    }

    public String getNomeProduto(){
        return nome;
    }
}

class Pedido{
    int quantidade;

    public Pedido(int quant){
        quantidade = quant;
    }

    public int getQuantidade(){
        return quantidade;
    }
}

class Facade{
    public void infos(String ecommerce,String produto, int quantidade){
        Ecommerce novoEcommerce = new Ecommerce(ecommerce);
        Produto novoProduto = new Produto(produto);
        Pedido novoPedido = new Pedido(quantidade);

        System.out.println("Ecommerce se chama " + novoEcommerce.getNomeEcommerce());
        System.out.println("Produto se chama " + novoProduto.getNomeProduto());
        System.out.println("Numero de Itens no Pedido são " + novoPedido.getQuantidade());
    }
}

public class FacadeEx {
    public static void main(String[] args){
        Facade testeFacade = new Facade();
        testeFacade.infos("Playstation","PS5",1);
    }    
}