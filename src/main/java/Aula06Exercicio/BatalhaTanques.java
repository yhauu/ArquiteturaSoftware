package Aula06Exercicio;

public class BatalhaTanques {

    public static void main(String[] args) {
        FactoryMethod fabrica = new MontaTanque();
        Tanque tanqueM1 = fabrica.factoryMethod(CoresRGB.values()[2], CoresRGB.values()[0], 23.3F, 3.2F);

        System.out.println("Tanque: " + tanqueM1.getCorTanque());
        System.out.println("Canhão: " + tanqueM1.getCorCanhao());
        System.out.println("Posição x: " + tanqueM1.getX());
        System.out.println("Posição y: " + tanqueM1.getY());
        tanqueM1.atirar();
        System.out.println(tanqueM1);


    }
}
