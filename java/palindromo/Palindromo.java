package palindromo;

public class Palindromo {

    public Boolean twoPointerSolution(String word) {

       String fixedString =  word.toLowerCase().replaceAll("[^a-z0-9]", "");

        int low = 0;
        int high = fixedString.length() - 1;

        while(low < high){
            if(fixedString.charAt(low) != fixedString.charAt(high)){
                return false;
            }

            low++;
            high--;
        }

        return true;
    }

    public boolean mySolution(String word) {

        String fixedString = word.trim().replaceAll(" ", "").replaceAll("[^a-zA-z0-9]", "").toLowerCase();

        for (int i = 0, j = fixedString.length() - 1; i < fixedString.length() && j > 0; i++, j--) {
            if (fixedString.charAt(i) != fixedString.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}

class Main {
    public static void main(String[] args) {
        Palindromo palindromo = new Palindromo();

        System.out.println("Solucao two pointer");
        System.out.println(
                "Resposta " + palindromo.twoPointerSolution("A man, a plan, a canal: Panama") + " esperado true");
        System.out.println("Resposta " + palindromo.twoPointerSolution("race a car") + " esperado false");
        System.out.println("Resposta " + palindromo.twoPointerSolution(" ") + " esperado true");
        System.out.println("Resposta " + palindromo.twoPointerSolution("0P") + " esperado false");
        System.out.println("Resposta " + palindromo.twoPointerSolution("ab_a") + " esperado true");
        System.out.println("Resposta " + palindromo.twoPointerSolution("v' 5:UxU:5 v'") + " esperado true");

        System.out.println("\nMinha solucao");
        System.out.println(
                "Resposta " + palindromo.twoPointerSolution("A man, a plan, a canal: Panama") + " esperado true");
        System.out.println("Resposta " + palindromo.twoPointerSolution("race a car") + " esperado false");
        System.out.println("Resposta " + palindromo.twoPointerSolution(" ") + " esperado true");
        System.out.println("Resposta " + palindromo.twoPointerSolution("0P") + " esperado false");
        System.out.println("Resposta " + palindromo.twoPointerSolution("ab_a") + " esperado true");
        System.out.println("Resposta " + palindromo.twoPointerSolution("v' 5:UxU:5 v'") + " esperado true");
    }
}