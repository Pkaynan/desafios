public class TrianguloRetangulo {
    public static void main(String[] args) {
        escaleno(5, 5);
        invertido(5, 10, true);
        paraEsquerda(5, 10, true);

        isoceles(5, 10);
        invertido(5, 10, false);
        paraEsquerda(5, 10, false);
    }

    public static void escaleno(int linha, int coluna) {
        System.out.println("\nescaleno");

        for (int i = 0; i <= linha; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void isoceles(int linha, int coluna) {
        System.out.println("\nisoceles");

        for (int i = 0; i <= linha; i++) {

            int estrelas = (coluna * i) / linha;

            for (int j = 0; j < estrelas; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertido(int linha, int coluna, boolean escaleno) {

        if (escaleno) {
            System.out.println("\nescaleno invertido");

            for (int i = linha; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nisoceles invertido");

            for (int i = linha; i >= 0; i--) {

                int estrelas = (coluna * i) / linha;

                for (int j = 0; j < estrelas; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static void paraEsquerda(int linha, int coluna, boolean escaleno) {
        if (escaleno) {
            System.out.println("\nescaleno para direita");

            for (int i = 1; i <= linha; i++) {

                // espaços
                for (int j = 1; j <= linha - i; j++) {
                    System.out.print(" ");
                }

                // estrelas
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }

                System.out.println();
            }

        } else {
            System.out.println("\nIsoceles para direita");

            for (int i = linha; i > 0; i--) {

                int estrelas = (coluna * i) / linha;

                // imprimir espaços primeiro
                for (int k = 0; k < coluna - estrelas; k++) {
                    System.out.print(" ");
                }

                // imprimir estrelas
                for (int j = 0; j < estrelas; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }

        }
    }
}
