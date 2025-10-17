package LISTA4.questao1;

public class Fatura implements IImprimivel{
    @Override
    public void imprimir(int copias){
        if(copias>5){
            System.out.println("Imprimindo " + copias + " em modo rascunho.");
        }
        else{
            System.out.println("Imprimindo " + copias + " em modo alta qualidade");
        }
    }
}
