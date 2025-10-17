package LISTA4.questao10;

public class Main {
    public static void main(String[] args) {
        ITransferencia download = new TransferenciaHTTP();

        int tamanhoTotal = 100; 
        download.iniciarDownload(tamanhoTotal);
    }
}
