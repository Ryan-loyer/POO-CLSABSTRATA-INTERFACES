package LISTA4.questao3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<IProcessadorDeDados> processadores = new ArrayList<>();
        
        processadores.add(new ProcessadorCSV());

        String[] dadosCSV = {
            "nome,idade,cidade",
            "Pablo,20,Alexandria",
            "Ediana,48,Alexandria"
        };
        
        for (IProcessadorDeDados p : processadores) {
            p.processar(dadosCSV);
        }
    }
}
