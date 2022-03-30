package Aula06;

public class Concluida implements State {

    private final String nome = "Concluída";
    private Context tarefa;

    public Concluida(Context tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void tarefaConcluida() {
        System.out.println("Já está concluída!");
    }

    @Override
    public void tarefaPendente() {
        this.tarefa.setEstado(new Pendente(this.tarefa));
    }

    @Override
    public void tarefaAtrasada() {
        System.out.println("Tarefa concluída!");
    }

    @Override
    public void enviar() {
        System.out.println("Tarefa concluída!");
        this.tarefa.requisitarConcluida();
    }
}
