public class SomandoMatrizes {
    public static void main(String[] args) {
        int matriz1[][] = { { 1, 2 }, { 1, 2 } };
        int matriz2[][] = { { 1, 1 }, { 1, 1 } };

        int soma[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }
    }
}
