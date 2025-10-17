package LISTA4.questao4;

public class TarefaBase {
    protected boolean concluida = false;

    public void marcarConcluida() {
        concluida = true;
        System.out.println("Tarefa concluída!");
    }
}
