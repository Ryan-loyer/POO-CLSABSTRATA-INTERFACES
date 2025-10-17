package LISTA4.questao9;

public class Main {
    public static void main(String[] args) {
        ProdutoAlimenticio arroz = new ProdutoAlimenticio(10);

        System.out.println("Solicitando 5 unidades:");
        arroz.verificarDisponibilidade(5);

        System.out.println("\nSolicitando 10 unidades:");
        arroz.verificarDisponibilidade(10);

        System.out.println("\nSolicitando 15 unidades:");
        arroz.verificarDisponibilidade(15);
        }
}
