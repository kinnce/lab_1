package Singletone;

public class Planet {

    private static Planet instance;
    private Planet(){
        //приватный конструктор
    }
    public static Planet getInstance() {
        if(instance == null) instance = new Planet();
        return instance;
    }

}