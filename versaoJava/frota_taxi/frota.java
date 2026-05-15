package versaoJava.frota_taxi;

import java.util.Arrays;
import java.util.Scanner;

public class frota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();

        double valoresDouble[] = Arrays.stream(entrada.split(" ")).mapToDouble(Double::parseDouble).toArray();

        if(valoresDouble[2] / valoresDouble[0] > valoresDouble[3] / valoresDouble[1]){
            System.out.println("A");
        }else{
            System.out.println("G");
        }
        
        scanner.close();
    }
}
