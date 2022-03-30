package Aula07;
/**
 * @author fabricio.vbelomo
 */
public class JogoNaves {
    public static void main(String[] args) {
        Subject jogador = Jogador.getInstance();
        Observer nave1 = new NavesInimigas("inimigo1", jogador);

        jogador.adicionarAcoes(Acoes.AVANCAR);
        jogador.adicionarAcoes(Acoes.ESQUERDA);

        Observer nave2 = new NavesInimigas("inimigo2", jogador);

        jogador.adicionarAcoes(Acoes.DIREITA);

        jogador.eliminarObservador(nave2);

        jogador.adicionarAcoes(Acoes.AVANCAR);
    }
}
