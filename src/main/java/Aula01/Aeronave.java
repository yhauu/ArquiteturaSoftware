package Aula01;

public class Aeronave {

    private int numeroOcupantes;

    private float capacidadeCargo;

    public Aeronave() {
        
    }

    public Aeronave(int numeroOcupantes, float capacidadeCargo) {
        setNumeroOcupantes(numeroOcupantes);
        setCapacidadeCargo(capacidadeCargo);
    }

    @Override
    public String toString() {
        return "numero de ocupantes";
    }

    public int getNumeroOcupantes() {
        return numeroOcupantes;
    }

    public void setNumeroOcupantes(int numeroOcupantes) {
        this.numeroOcupantes = numeroOcupantes;
    }

    public float getCapacidadeCargo() {
        return capacidadeCargo;
    }

    public void setCapacidadeCargo(float capacidadeCargo) {
        this.capacidadeCargo = capacidadeCargo;
    }    
}
