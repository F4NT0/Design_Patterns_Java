import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

interface PagamentoEstrategia{
    boolean pago(int valorTotal);
    void detalhesPagamentos();
}

class PagamentoPaypal implements PagamentoEstrategia{
    private static final Map<String,String> database = new HashMap<String,String>();
    private String username;
    private String password;

    public PagamentoPaypal(String nome,String senha){
        username = nome;
        password = senha;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    @Override
    public void detalhesPagamentos(){
        database.put("Gabriel Fanto","1234");
        if(password.equals(database.get(username))){
            System.out.println("Verificação feita com sucesso!");
        }else{
            System.out.println("Usuário não encontrado");
        }
    }

    @Override
    public boolean pago(int valor){
        if(valor > 0){
            System.out.println("R$ " + valor + " pago em Paypal");
            return true;
        }else{
            return false;
        }
    }    
}

class PagamentoCartaoCredito implements PagamentoEstrategia{
    private static final Map<String,String> database = new HashMap<String,String>();
    private String username;
    private String password;

    public PagamentoCartaoCredito(String nome,String senha){
        username = nome;
        password = senha;
    }
    
    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    @Override
    public void detalhesPagamentos(){
        database.put("Gabriel Fanto","1234");
        if(password.equals(database.get(username))){
            System.out.println("Verificação feita com sucesso!");
        }else{
            System.out.println("Usuário não encontrado");
        }
    }

    @Override
    public boolean pago(int valor){
        if(valor > 0){
            System.out.println("R$ " + valor + " pago no Cartão de Crédito");
            return true;
        }else{
            return false;
        }
    }   
}


public class MetodosPagamento {
    private static PagamentoEstrategia estrategia;
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Selecione uma Forma de Pagamento: ");
        System.out.println("1 - Paypal");
        System.out.println("2 - Cartão de Crédito");
        int choice = entrada.nextInt();
        
        if(choice == 1){
            estrategia = new PagamentoPaypal("Gabriel Fanto", "1234");
        }else{
            if(choice == 2){
                estrategia = new PagamentoCartaoCredito("Gabriel Fanto","1234");
            }else{
                System.out.println("Escolha não permitida!");
            }
        }
        entrada.close();

        //Saída
        estrategia.detalhesPagamentos();
        estrategia.pago(200);
    }   
}