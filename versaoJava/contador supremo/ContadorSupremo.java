import java.io.File;
import java.io.FileNotFoundException;
import java.text.Normalizer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorSupremo {
    public static void main(String[] args) {
        try {
            File arquivo = new File("C:\\Users\\pieyr\\Desktop\\teste\\java\\arquivo para teste.txt");
            Scanner scanner = new Scanner(arquivo);

            int qtdPalavras = 0;
            int totalLetras = 0;

            HashMap<Character, Integer> letrasEncontradas = new HashMap<>();

            while (scanner.hasNextLine()) {
                String linhas = scanner.nextLine();
                String palavras[] = linhas.split("\\s+");

                // CONTANDO A QUANTIDA DE PALAVRAS
                // INICIO
                qtdPalavras += palavras.length;
                //FIM

                // CONTANDO A QUANTIDADE DE LETRAS
                //INICIO
                linhas = Normalizer.normalize(linhas, Normalizer.Form.NFD)
                        .replaceAll("[^\\p{ASCII}]", "");

                linhas = linhas.toUpperCase();

                for (int i = 0; i < linhas.length(); i++) {
                    Character letras = linhas.charAt(i);

                    if (Character.isLetter(letras)) {

                        totalLetras++;

                        int quantidade = letrasEncontradas.getOrDefault(letras, 0);
                        letrasEncontradas.put(letras, quantidade + 1);
                    }
                }
                //FIM
            }

            int maiorvalor = 0;
            Character key = null;

            for (Map.Entry<Character, Integer> entry : letrasEncontradas.entrySet()) {
                if (entry.getValue() > maiorvalor) {
                    key = entry.getKey();
                    maiorvalor = entry.getValue();
                }
            }

            System.out.println("numero de palavras: " + qtdPalavras);
            System.out.println("numero total de letras: " + totalLetras);
            System.out.println("letra com maior ocorrencia: " + key + " com " + maiorvalor);
            System.out.println("ocorrencia de cada letra: " + letrasEncontradas);

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
