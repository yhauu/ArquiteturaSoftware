package Aula02Tanque;

public class ExemploSingleton extends Thread {

    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
    
    public static void main(String[] args) {
        ExemploSingleton t1 = new ExemploSingleton();
        ExemploSingleton t2 = new ExemploSingleton();
        ExemploSingleton t3 = new ExemploSingleton();

        t1.start();
        t2.start();
        t3.start();
    }
}
