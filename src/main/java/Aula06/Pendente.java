package Aula06;

public class Pendente implements State {

    private final String nome = "Pendente";
    private Context tarefa;

    public Pendente(Context tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void tarefaConcluida() {
        this.tarefa.setEstado(new Concluida(this.tarefa));
    }

    @Override
    public void tarefaPendente() {
        System.out.println("Já está pendente!");
    }

    @Override
    public void tarefaAtrasada() {
        this.tarefa.setEstado(new Atrasada(this.tarefa));
    }

    @Override
    public void enviar() {
        System.out.println("Tarefa concluída!");
        this.tarefa.requisitarConcluida();
    }
}
