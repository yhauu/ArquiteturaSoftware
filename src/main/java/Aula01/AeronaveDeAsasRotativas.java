package Aula01;

public class AeronaveDeAsasRotativas extends Aeronave {

    private boolean rotorDeCalda;

    public AeronaveDeAsasRotativas() {
        
    }

    public AeronaveDeAsasRotativas(int numeroOcupantes, float capacidadeCargo, boolean rotorDeCaldas) {
        super(numeroOcupantes, capacidadeCargo);
        setRotorDeCalda(rotorDeCalda);
    }

    public boolean isRotorDeCalda() {
        return rotorDeCalda;
    }

    public void setRotorDeCalda(boolean rotorDeCalda) {
        this.rotorDeCalda = rotorDeCalda;
    }
}
