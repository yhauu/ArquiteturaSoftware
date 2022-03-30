package Aula06;

public class Context {

    private State estado = new Pendente(this);
    private static Context contexto = null;

    private Context() {
        
    }

    public static Context getContext() {
        if (contexto == null) {
            contexto = new Context();
        }
        return contexto;
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }

    public void requisitarAtrasada() {
        this.estado.tarefaAtrasada();
    }

    public void requisitarConcluida() {
        this.estado.tarefaConcluida();
    }

    public void requisitarPendente() {
        this.estado.tarefaPendente();
    }

    public void requisitarEnviar() {
        this.estado.enviar();
    }
}
