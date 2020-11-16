# Exemplo e Descrição de Padrões de Projetos

**Padrões de Projetos** ou **Design Patterns** são arquiteturas testadas para construir Softwares orientados a objetos flexíveis e sustentáveis. Os padrões ajudam a reduzir substancialmente a complexidade do processo de Design.

Surgiu graças a um Arquiteto chamado `Christopher Alexander`, onde ele construiu 23 padrões de projetos orientado a software.

**Design Patterns** são uma coleção de padrões de projetos de software que contém soluções para problemas conhecidos e recorrentes no desenvolvimento de software descrevendo uma solução comprovada para um problema de projeto recorrente. Auxilia no reuso de software também.

---

# Singleton

* Permite criar objetos únicos para os quais há apenas uma instância.
* Oferece um ponto de acesso global.
* Singleton é necessário apenas dominar bem as variáveis e métodos de classe estáticos além dos modificadores de acesso.
  
Com o padrão Singleton uma Classe gerencia a própria instância dela além de evitar que qualquer outra Classe crie uma instância dela.

* Exemplo de implementação do Padrão Singleton:

```java
public class SingletonEx{
    private static SingletonEx uniqueInstance;

    private SingletonEx(){
        //...    
    }

    public static synchronized SingletonEx getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new SingletonEx();
        }
        return uniqueInstance;
    }
}
```
* Utiliza-se o `synchronized` para que o método não possa ser usado por duas Threads ao mesmo tempo.
* O construtor é privado evitando que essa Classe seja instânciada fora dela, dessa forma só pode ser instânciado utilizando o Método público _getInstance()_. Como o _getInstance()_ é estático ele pode ser chamado de outra classe sem precisar instanciar a classe Singleton. Caso a Classe já tenha sido instanciado o Atributo _uniqueInstance_ não será nulo, assim vai retornar a única instância já criada.

1. **VANTAGENS**:
   1. Uma Classe pode ser instânciada e usada apenas quando necessário
   2. É definido um único ponto de acesso global sendo inclusive muito mais de gerenciar a criação e utilização da instância.

---

# Observer

O padrão Observer é utilizado quando se precisa manter os objetos atualizados quando algo importante ocorre.

O Padrão Observer funciona como uma Assinatura de Jornal, onde tem uma Editora que publica as edições e as pessoas que assinam os jornais dessa editora recebem as novas edições assim que elas são Publicadas.

Nesse exemplo, a Editora no código é o **SUBJECT** e os Assinantes são os chamados **OBSERVER**

Os **OBSERVER**s registram-se no **SUBJECT** para receber atualizações quando os dados do **SUBJECT** são alterados. Os **OBSERVER**s também podem cancelar o seu registro e dessa forma não receber mais nenhuma atualização do **SUBJECT**.

Portanto existem MUITOS **OBSERVER**s para um único **SUBJECT**.

Em java, as APIs mais gerais possuem a interface Observer e a Classe Observable no pacote **java.util**.

A classe Observable possui os Seguintes Métodos:

Nome da Função|Uso
|---|---|
addObserver()| Adicina um Observer a um Subject
deleteObserver()| Deleta o Observer do Subject
notifyObservers()|Avisa os Observers de atualizações
setChanged()|Atualiza informações no Subject

A classe Observable nada mais faz do que monitorar todos os observadores e os notificar sobre alguma alteração no estado.