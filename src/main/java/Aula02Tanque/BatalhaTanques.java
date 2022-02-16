package Aula02Tanque;

public class BatalhaTanques {

    public static void main(String[] args) {
        Tanque tanque = new Tanque();

        tanque.setCorTanque(CoresRGB.RED);
        tanque.setCorCanhao(CoresRGB.GREEN);
        tanque.setX(23.3F);
        tanque.setY(3.2F);
        
        System.out.println("Tanque: " + tanque.getCorTanque());
        System.out.println("Canhão: " + tanque.getCorCanhao());
        System.out.println("Posição x: " + tanque.getX());
        System.out.println("Posição y: " + tanque.getY());
        tanque.atirar();
        System.out.println(tanque);


    }
}
