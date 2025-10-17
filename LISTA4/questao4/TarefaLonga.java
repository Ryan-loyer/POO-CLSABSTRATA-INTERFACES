package LISTA4.questao4;

public class TarefaLonga extends TarefaBase implements IExecutavel {

    public void executar() {
        int progresso = 0;
        System.out.println("Iniciando tarefa longa...");

        while (progresso < 100) {
            progresso += 1;
            System.out.println("Progresso: " + progresso + "%");
        }

        marcarConcluida();
    }
}
