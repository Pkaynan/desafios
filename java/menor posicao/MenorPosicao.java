import java.util.Scanner;

public class MenorPosicao {

    public void solution() {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int position = 0;
        int minimum = 0;

        for (int i = 0; i < size; i++) {
            int input = scanner.nextInt();

            if (minimum == 0) {
                minimum = input;
            }

            if (input < minimum) {
                minimum = Math.min(minimum, input);
                position = i;
            }

        }

        scanner.close();

        System.out.println("Menor valor: " + minimum + "\n" + "Posicao: " + position);
    }

    public static void main(String[] args) {
        MenorPosicao menorPosicao = new MenorPosicao();
        menorPosicao.solution();
    }
}
