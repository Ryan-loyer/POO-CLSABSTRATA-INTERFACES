package LISTA4.questao2;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, int codigoCargo) {
        super(nome, codigoCargo);
    }

    @Override
    public double calcularBonificacao(double salarioBase) {
        double bonusPercentual;

        switch (codigoCargo) {
            case 1:// desenvolvedor junior
                bonusPercentual = 0.10;
                break;
            case 2://desenvolvedor pleno
                bonusPercentual = 0.15;
                break;
            case 3://desenvolvedor sênior
                bonusPercentual = 0.20;
                break;
            default:
                bonusPercentual = 0.05;
                break;
        }

        return salarioBase * bonusPercentual;
    }
}
