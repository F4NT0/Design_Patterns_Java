

/**
 * Exemplo de Utilização de Singleton
 */

public class SingletonEx{
    private static SingletonEx uniqueInstance;
    private int value;

    private SingletonEx(int v){
        value = v;
    }

    public static synchronized SingletonEx getInstance(int v){
        if(uniqueInstance == null){
            uniqueInstance = new SingletonEx(v);
        }
        return uniqueInstance;
    }

    public int getValue(){
        return value;
    }
}