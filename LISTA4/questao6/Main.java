package LISTA4.questao6;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();

        String logMsg1 = "Usuário Pablo fez login.";
        String logMsg2 = "Erro de conexão com servidor.";

        System.out.println("=== Salvando localmente ===");
        logger.salvarLocal(logMsg1);

        System.out.println("\n=== Salvando remotamente ===");
        logger.salvarRemoto(logMsg2);
    }
}
