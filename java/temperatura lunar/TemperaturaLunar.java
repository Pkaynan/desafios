import java.util.Scanner;

public class TemperaturaLunar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantityN = scanner.nextInt();
        int intervalM = scanner.nextInt();

        int count = 1;

        while (quantityN != 0 && intervalM != 0) {
            int maxSum = 0;
            int minSum = 0;
            int temperature[] = new int[quantityN];

            for (int i = 0; i < temperature.length; i++) {
                int num = scanner.nextInt();
                temperature[i] = num;
            }

            System.out.println("Teste " + count);


            for (int i = 0; i <= temperature.length - intervalM; i++) {
                int currentSum = 0;

                for (int j = i; j < i + intervalM; j++) {
                    currentSum += temperature[j];
                }

                if (maxSum == 0 && minSum == 0) {
                    maxSum = currentSum;
                    minSum = currentSum;
                }

                maxSum = Math.max(maxSum, currentSum);
                minSum = Math.min(minSum, currentSum);

            }

            int maxMiddle = maxSum / intervalM;
            int minMiddle = minSum / intervalM;

            System.out.printf("%d %d\n\n", minMiddle, maxMiddle);

            quantityN = scanner.nextInt();
            intervalM = scanner.nextInt();
            count++;
        }
        scanner.close();
    }
}
