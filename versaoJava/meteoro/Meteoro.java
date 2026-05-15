package versaoJava.meteoro;

import java.util.Scanner;

public class Meteoro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 1;

        while (true) {

            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            if ((x1 == 0 && x2 == 0) && (y1 == 0 && y2 == 0)) {
                break;
            }
            
            int xmax = Math.max(x1, x2);
            int ymax = Math.max(y1, y2);
            int xmin = Math.min(x1, x2);
            int ymin = Math.min(y1, y2);

            int quantidadeMeteoros = scanner.nextInt();
            int countMeteoro = 0;

            for (int i = 0; i < quantidadeMeteoros; i++) {
                int coordenadasX = scanner.nextInt();
                int coordenadasY = scanner.nextInt();
                if (coordenadasX >= xmin && coordenadasX <= xmax && coordenadasY >= ymin && coordenadasY <= ymax) {
                    countMeteoro++;
                }
            }

            System.out.println("Teste " + count);
            System.out.println(countMeteoro);

            count++;
        }

        scanner.close();
    }
}