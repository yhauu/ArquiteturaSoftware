package Aula07;

import java.util.List;

/**
 * @author fabricio.vbelomo
 */
public interface Subject {

    public void adicionarObservador(Observer observer);

    public void adicionarAcoes(Acoes acao);

    public void notificar();

    public void eliminarObservador(Observer observer);
}