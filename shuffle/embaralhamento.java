package shuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class embaralhamento {
    public static void main(String[] args) {
        System.out.println("digite o texto");
        Scanner scanner = new Scanner(System.in);

        String linhas = scanner.nextLine();
        String nomes[] = linhas.split(",");

        List<String> nomesList = new ArrayList<>();

        for(String nome : nomes){
            nomesList.add(nome.trim());
        }

        Collections.shuffle(nomesList);

        System.out.println("\nnomes embaralhados\n");
        for (String nome : nomesList) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
