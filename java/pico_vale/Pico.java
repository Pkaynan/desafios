package pico_vale;

import java.util.Scanner;

public class Pico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int medidasQuantidade = scanner.nextInt();
        int arrayMedidas[] = new int[medidasQuantidade];

        for (int i = 0; i < arrayMedidas.length; i++) {
            arrayMedidas[i] = scanner.nextInt();
        }

        for (int i = 1; i < arrayMedidas.length - 1; i++) {
            if (arrayMedidas[i] > arrayMedidas[i - 1] && arrayMedidas[i] > arrayMedidas[i + 1]) {

                System.out.println("1");
                break;

            }else if(arrayMedidas[i] < arrayMedidas[i - 1] && arrayMedidas[i] < arrayMedidas[i + 1]){

                System.out.println("1");
                break;

            }else{
                System.out.println("0");
            }
        }

        scanner.close();
    }
}
