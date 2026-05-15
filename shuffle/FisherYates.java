package shuffle;

import java.util.Random;
import java.util.Scanner;

public class FisherYates
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite os nomes separados por vírgula:");

        String linha = scanner.nextLine();

        // separa os nomes
        String[] nomes = linha.split(",");

        // remove espaços extras
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }

        // Fisher-Yates (correto)
        for (int i = nomes.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            // troca nomes[i] com nomes[j]
            String temp = nomes[i];
            nomes[i] = nomes[j];
            nomes[j] = temp;
        }

        System.out.println("\nNomes embaralhados:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        scanner.close();
    }
}