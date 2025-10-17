package LISTA4.questao7;

public class Carro extends Veiculo {

    private String modelo;

    public Carro(String cor, String modelo) {
        super(cor); 
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
}
