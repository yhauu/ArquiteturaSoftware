package Aula06;

public class ExemploState {

    public static void main(String[] args) {
        Context contexto = Context.getContext();
        
        contexto.requisitarPendente();
        contexto.requisitarAtrasada();
        contexto.requisitarAtrasada();
        contexto.requisitarPendente();
        contexto.requisitarEnviar();
        contexto.requisitarConcluida();
    }
}
