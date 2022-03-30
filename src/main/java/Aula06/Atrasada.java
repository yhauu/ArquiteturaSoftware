package Aula06;

public class Atrasada implements State {

    private final String nome = "Atrasada";
    private Context tarefa;

    public Atrasada(Context tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void tarefaConcluida() {
        this.tarefa.setEstado(new Concluida(this.tarefa));
    }

    @Override
    public void tarefaPendente() {
        System.out.println("Já está atrasada!");
    }

    @Override
    public void tarefaAtrasada() {
        System.out.println("Já está atrasada!");
    }

    @Override
    public void enviar() {
        System.out.println("Tarefa concluída!");
        this.tarefa.requisitarConcluida();
    }
}
