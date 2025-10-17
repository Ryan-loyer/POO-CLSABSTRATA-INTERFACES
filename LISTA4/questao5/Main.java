package LISTA4.questao5;

public class Main {
    public static void main(String[] args) {
        ValidadorSeguranca Validador = new ValidadorSeguranca();

        String senha1 = "testAndo123";
        
        String senha2 = "inseguro";

        System.out.println("Senha 1: " + senha1);
        Validador.validarAcesso(senha1); 

        System.out.println("\nSenha 2: " + senha2);
        Validador.validarAcesso(senha2); 
    }
}
