package LISTA4.questao8;

public class ComandoArquivo implements IComando {

    @Override
    public void executar(String[] parametros) {
        System.out.println("Executando Comando de Arquivo...");
        if (parametros != null) {
            for (String p : parametros) {
                System.out.println("Parâmetro: " + p);
            }
        }
    }
}
