package Aula01;

public class JatoDeCaca extends Aeronave {

    private String armamento;

    public JatoDeCaca() {
        
    }

    public JatoDeCaca(int numeroOcupantes, float capacidadeCargo, String armamento) {
        super(numeroOcupantes, capacidadeCargo);
        setArmamento(armamento);
    }

    public String getArmamento() {
        return armamento;
    }

    public void setArmamento(String armamento) {
        this.armamento = armamento;
    }
}
