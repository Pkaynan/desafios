import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("insira o numero de jogadas");

        int numeberTries = scanner.nextInt();
        int tries = 1;

        while (numeberTries != 0) {

            System.out.println("\njogador par");
            String playerEven = scanner.next();

            System.out.println("\njogador impar");
            String playerOdd = scanner.next();

            System.out.println("Teste " + tries);

            for (int i = 0; i < numeberTries; i++) {
                System.out.println("\nnumero: ");
                int hand1 = scanner.nextInt();

                System.out.println("\nnumero: ");
                int hand2 = scanner.nextInt();

                if ((hand1 + hand2) % 2 == 0) {
                    System.out.println(playerEven);
                } else {
                    System.out.println(playerOdd);
                }
            }
            System.out.println();

            tries++;

            System.out.println("\ninsira o numero de jogadas");
            numeberTries = scanner.nextInt();
        }

        scanner.close();
    }
}