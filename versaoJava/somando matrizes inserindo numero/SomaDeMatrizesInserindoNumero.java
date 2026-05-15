import java.util.Random;
import java.util.Scanner;


// SOMANDO MATRIZES INSERINDO COLUNA E LINHAS
public class SomaDeMatrizesInserindoNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("linhas: ");
        int linha = scanner.nextInt();

        System.out.print("colunas: ");
        int coluna = scanner.nextInt();
        scanner.close();

        int matriz1[][] = new int[linha][coluna];
        int matriz2[][] = new int[linha][coluna];

        int soma[][] = new int[linha][coluna];

        Random random = new Random();

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz1[i][j] = random.nextInt(5);
                matriz2[i][j] = random.nextInt(5);
            }
        }

        System.out.println("\nmatriz 1");

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nmatriz 2");

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nsoma");

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }
    }
}