package versaoJava.Botas_Perdidas;

import java.util.Scanner;

public class BotasPerdidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            
            int botasQuantidade = scanner.nextInt();

            // quantidade de tamanhos definidos pelo o enunciado
            int botasEsquerda[] = new int[61];
            int botasDireita[] = new int[61];

            // usando o tamanho da bota como indice do array
            // imagine o array como uma gaveta que guarda a quantidade de botas de acordo
            // com o tamanho. Exemplo-> botasEsquerda[41] = 3
            for (int i = 0; i < botasQuantidade; i++) {
                int indiceBota = scanner.nextInt();
                String ladoBota = scanner.next().toUpperCase();

                if (ladoBota.equals("E")) {
                    botasEsquerda[indiceBota] += 1;
                } else {
                    botasDireita[indiceBota] += 1;
                }
            }

            int pares = 0;

            // os pares sao definidos de acordo com a menor quantidade
            // 41 E = 2 41 D = 3 -> 2 pares e sobra uma bota direita
            // o i começa com o tamanho minimo e continua ate o final do array
            for (int i = 30; i <= 60; i++) {
                pares += Math.min(botasDireita[i], botasEsquerda[i]);
            }

            System.out.println(pares);
        }
        
        scanner.close();
    }
}
