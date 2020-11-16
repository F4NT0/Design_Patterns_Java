/**
 * EXEMPLO DE OBSERVER EM JAVA
 */

import java.util.Observable;
import java.util.Observer;

public class ObserverEx{
    public static void main(String args[]){
        int novaEdicao = 2;
        Object none = null;
        Subject subject = new Subject();
        ObserverClient observer = new ObserverClient(subject);
        subject.setNovaEdição(novaEdicao);
        observer.update(subject,none);
    }
}

@Deprecated
class Subject extends Observable{
    private int edicao;

    public void setNovaEdição(int novo){
        edicao = novo;
        setChanged();
        notifyObservers();
    }

    public int getEdicao(){
        return edicao;
    }
}

@Deprecated
class ObserverClient implements Observer{
    Observable subject;
    int edicaoNova;

    public ObserverClient(Observable sub){
        super();
        subject = sub;
        subject.addObserver(this);
    }

    @Override
    public void update(Observable sub, Object arg1){
        if(sub instanceof Subject){
            Subject subject = (Subject) sub;
            edicaoNova = subject.getEdicao();
            System.out.println("Nova edição da Revista, Revista Número " + edicaoNova);
        }
    }
}