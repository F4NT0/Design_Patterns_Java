# Exercício de Utilização de Design Patterns

Neste exercício de avaliação os alunos deverão explorar os padrões de projeto trabalhados nos últimos dias:

- **Singleton**

- **Observer**

- **Fachada**

- **Factory**

- **Strategy**

O problema a ser resolvido continua o mesmo do exercício proposto, o e-commerce. 

Sugestões de aplicação destes padrões para este problema:

Nome do Padrão|Para o que vai servir
|---|---|
singleton|para garantir um único carrinho de compras para um cliente
observer|atualização do carrinho a cada produto selecionado pelo cliente
strategy e factory |para implementar as diferentes formas de pagamento e o acesso ao cliente a estas informações (cartão de débito, cartão de crédito, boleto bancário e paypal)
fachada|classe a ser definida na camada de negócios como um único ponto de acesso da camada de apresentação a ela

Cada grupo deve entregar um arquivo texto com uma  **descrição** e **screenshots** das classes/métodos implementados para cada padrão de projeto.

Enviar o Link desse Repositório também.

# Como testar

Acesse o Diretório _src/Exercício/_ para usar os comando Abaixos

Design Pattern|Comando de Terminal
|---|---|
Singleton| `javac CarrinhoCompras.java Testes.java ` e depois `java Testes`
Observer| `javac CarrinhoCompras.java AtualizaCarrinho.java ` e depois `java AtualizaCarrinho`
Strategy|`javac MetodosPagamento.java` e depois `java MetodosPagamento`
Facade|`javac FacadeEx.java ` e depois `java FacadeEx`

# Explicação Simples dos Design Patterns

* [Clique Aqui](src/Exercício/README.md) para ver a explicação.