import java.text.Normalizer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContandoLetras {
    public static void main(String[] args) {
        System.out.println("digite o texto: ");
        Scanner scanner = new Scanner(System.in);
        

        HashMap<Character, Integer> letrasEncontradas = new HashMap<>();

        while (scanner.hasNextLine()) {

            String text = scanner.nextLine();

            if(text.isEmpty()){
                break;
            }

            text = Normalizer.normalize(text, Normalizer.Form.NFD)
                    .replaceAll("[^\\p{ASCII}]", "");

            text = text.toUpperCase();

            for (int i = 0; i < text.length(); i++) {

                Character letra = text.charAt(i);

                if (Character.isLetter(letra)) {
                    int quantidade = letrasEncontradas.getOrDefault(letra, 0);
                    letrasEncontradas.put(letra, quantidade + 1);
                }

                // if (Character.isLetter(letra)){
                //     int quantidade;

                //     if(letrasEncontradas.containsKey(letra)){
                //         quantidade = letrasEncontradas.get(letra);
                //     }else{
                //         quantidade = 0;
                //     }

                //     letrasEncontradas.put(letra, quantidade + 1);
                // }

            }
        }

        scanner.close();

        int maiorValor = 0;
        Character chave = null;

        for (Map.Entry<Character, Integer> entry : letrasEncontradas.entrySet()) {
            if (entry.getValue() > maiorValor) {
                maiorValor = entry.getValue();
                chave = entry.getKey();
            }
        }

        System.out.println("letra com a maior ocorrencia: " + chave + " com " + maiorValor);
    }
}