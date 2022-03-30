package Aula06;

public interface State {
    public void tarefaConcluida();
    public void tarefaPendente();
    public void tarefaAtrasada();
    public void enviar();
}
