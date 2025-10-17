package LISTA4.questao2;

public class Main {
    public static void main(String[] args) {
        
    
    Desenvolvedor devJunior = new Desenvolvedor("Pedro", 1);
    
    Desenvolvedor devPleno = new Desenvolvedor("Jennefy", 2);
    
    Desenvolvedor devSenior = new Desenvolvedor("Pablo", 3);

    double salarioBase = 10000.0;

    System.out.println("Bonificação do " + devJunior.nome + ": R$" + devJunior.calcularBonificacao(salarioBase));
    System.out.println("Bonificação do " + devPleno.nome + ": R$" + devPleno.calcularBonificacao(salarioBase));
    System.out.println("Bonificação do " + devSenior.nome + ": R$" + devSenior.calcularBonificacao(salarioBase));
    }
}
