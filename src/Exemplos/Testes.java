/**
 * Classe de Teste dos Design Patterns
 */

public class Testes {
    public static void main(String args[]){

        // Exemplo de uso do Singleton
        // não vai ser alterado o valor interno da Classe SingletonEx 
        SingletonEx x = SingletonEx.getInstance(3);
        int exit1 = x.getValue();
        System.out.println("Valor: " + exit1);
        SingletonEx y = SingletonEx.getInstance(4);
        int exit2 = x.getValue();
        System.out.println("Valor: " + exit2);
    }
}