package Aula04;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    
    private List<Component> lista = new ArrayList<>();

    private String nome;

    public Composite() {
        
    }

    public Composite(String nome) {
        this.nome = nome;
    }
    
    /**
     * Adicionar componentes na lista.
     * @param c Component
     */
    public void adicionar(Component c) {
        this.lista.add(c);
    }
    
    public void remover(Component c) {
        this.lista.remove(c);
    }

    

    @Override
    public double getPreco() {
        double total = 0;

        for (Component comp : lista) {
            total += comp.getPreco();
        }
        
        return total;
    }

    @Override
    public String toString() {
        return "Composite{" + "lista=" + lista + ", nome=" + nome;
    }
}
