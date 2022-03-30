package Aula07;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fabricio.vbelomo
 */
public class Jogador implements Subject {

    private static Jogador jogador = new Jogador();

    private List<Observer> navesInimigas = new ArrayList<>();
    
    private List<Acoes> listaAcoes = new ArrayList<>();

    private int index = -1;

    private Jogador() {
        
    }

    public static Jogador getInstance() {
        return jogador;
    }

    @Override
    public void adicionarObservador(Observer observer) {
        this.navesInimigas.add(observer);
    }

    @Override
    public void adicionarAcoes(Acoes acao) {
        this.listaAcoes.add(acao);
        index++;
        notificar();
    }

    @Override
    public void notificar() {
        for (Observer obs : navesInimigas) {
            obs.update(this.listaAcoes.get(index));
        }
    }

    @Override
    public void eliminarObservador(Observer observer) {
        this.navesInimigas.remove(observer);
        System.out.println("Nave destruida");
    }
}
