package longestSubstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubstring {

    public int mysolution(String palavra) {

        int maximo = 0;

        for (int i = 0; i < palavra.length(); i++) {

            HashSet<Character> palavraHashSet = new HashSet<>();

            for (int j = i; j < palavra.length(); j++) {
                if (palavraHashSet.contains(palavra.charAt(j))) {
                    break;
                }

                palavraHashSet.add(palavra.charAt(j));
                if (palavraHashSet.size() > maximo) {
                    maximo = palavraHashSet.size();
                }
            }
        }

        return maximo;
    }

    public int UsingStringbuilder(String palavra) {
        int maximo = 0;

        for (int i = 0; i < palavra.length(); i++) {

            StringBuilder palavracriada = new StringBuilder();

            for (int j = i; j < palavra.length(); j++) {
                if (palavracriada.indexOf(String.valueOf(palavra.charAt(j))) != -1) {
                    break;
                }

                palavracriada.append(palavra.charAt(j));
                if (palavracriada.length() > maximo) {
                    maximo = palavracriada.length();
                }
            }
        }

        return maximo;
    }

    public int slidingWindow(String palavra){
        int maximo = 0;

        Map<Character, Integer> letrasEncontradas = new HashMap<>();

        for(int direita = 0, esquerda = 0; direita < palavra.length(); direita++){
            char letraAtual = palavra.charAt(direita);

//              a letra ja esta armazenada?
//                              E
//              o indice da letra é maior ou igual que o ponteiro esquerda?
            if(letrasEncontradas.containsKey(letraAtual) && letrasEncontradas.get(letraAtual) >= esquerda){

                // recupera o indice antigo e pula 1 para frente da letra
                esquerda = letrasEncontradas.get(letraAtual) + 1;
            }

            // atualiza o indice
//              chave = letra     valor = indice da direita
            letrasEncontradas.put(letraAtual, direita);

            // armazena o meio entre direita e esquerda +1 (caso estejam no mesmo indice)
            maximo = Math.max(maximo, direita - esquerda + 1);
        }

        return maximo;
    }
}
