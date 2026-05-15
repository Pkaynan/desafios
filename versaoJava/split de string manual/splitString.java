public class splitString {
    public static void main(String[] args) {
        String palavra = "abacate, uva, maca, pera";
        String palavraCriada = "";
        String arrayPalavras[] = new String[palavra.length()];

        int count = 0;

        for (int i = 0; i < palavra.length(); i++) {
            
            char letra;

            if (Character.isLetter(palavra.charAt(i))) {
                letra = palavra.charAt(i);
                palavraCriada += letra;
            }else{
                
                if(!palavraCriada.isBlank()){
                    arrayPalavras[count] = palavraCriada;
                    count++;
                    palavraCriada = "";
                }
            }
        }

        for(String palavraEncontrada : arrayPalavras){
            if (palavraEncontrada != null) {
                System.out.println(palavraEncontrada);
            }
        }
    }
}