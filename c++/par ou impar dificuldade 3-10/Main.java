import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeberTries = scanner.nextInt();
        int tries = 1;

        while (numeberTries != 0) {
            String playerEven = scanner.next();
            String playerOdd = scanner.next();

            System.out.println("Teste " + tries);

            for (int i = 0; i < numeberTries; i++) {
                int hand1 = scanner.nextInt();
                int hand2 = scanner.nextInt();

                if ((hand1 + hand2) % 2 == 0) {
                    System.out.println(playerEven);
                } else {
                    System.out.println(playerOdd);
                }
            }
            System.out.println();

            tries++;
            numeberTries = scanner.nextInt();
        }

        scanner.close();
    }
}