package LISTA4.questao10;

public class TransferenciaHTTP implements ITransferencia {

    @Override
    public void iniciarDownload(int tamanhoTotal) {
        int bytesRecebidos = 0;
        boolean continuar = true;

        System.out.println("Iniciando download via HTTP...");

        while (bytesRecebidos < tamanhoTotal && continuar) {
            bytesRecebidos++;
            System.out.println("Progresso: " + bytesRecebidos + "/" + tamanhoTotal);

           
            if (bytesRecebidos >= tamanhoTotal / 2) {
                continuar = false;
                System.out.println("Download Pausado Automaticamente!");
            }
        }

        if (bytesRecebidos >= tamanhoTotal) {
            System.out.println("Download Completo!");
        } else {
            System.out.println("Download Pausado/Interrompido!");
        }
    }
}
