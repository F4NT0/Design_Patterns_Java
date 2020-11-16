/**
 * Atualiza o Carrinho usando Observer
 */
import java.util.Observable;
import java.util.Observer;

@Deprecated
class Subject extends Observable{
    CarrinhoCompras carrinho;
    String produto;

    public Subject(CarrinhoCompras car){
        carrinho = car;
    }

    public void setNovoProduto(String prod){
        produto = prod;
        carrinho.addProduto(produto);
        setChanged();
        notifyObservers();
    }

    public String getProduto(){
        return produto;
    }

    public void getProdutos(){
        carrinho.getCarrinho();
    }

}

@Deprecated
class ObserverClient implements Observer{   
    Observable subject;
    String produtoNovo;

    public ObserverClient(Observable sub){
        super();
        subject = sub;
        subject.addObserver(this);
    }

    @Override
    public void update(Observable sub, Object arg1){
        if(sub instanceof Subject){
            Subject subject = (Subject) sub;
            produtoNovo = subject.getProduto();
            System.out.println("Produto " + produtoNovo + " adicionado com sucesso!");
        }
    }
}

public class AtualizaCarrinho {
    public static void main(String args[]){
        String novoProduto = "PS5";
        Object none = null;
        CarrinhoCompras carrinho = CarrinhoCompras.getInstance();
        Subject subject = new Subject(carrinho);
        ObserverClient observer = new ObserverClient(subject);
        subject.setNovoProduto(novoProduto);
        observer.update(subject,none);
    }
}