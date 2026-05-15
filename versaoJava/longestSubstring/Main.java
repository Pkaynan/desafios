package versaoJava.longestSubstring;

public class Main {
    public static void main(String[] args) {
        LongestSubstring longestSubstring = new LongestSubstring();

        int quantidade = longestSubstring.mysolution("abcabcbb");
        System.out.println(quantidade);

        quantidade = longestSubstring.UsingStringbuilder("bbbbb");
        System.out.println(quantidade);

        quantidade = longestSubstring.slidingWindow("abcabcbb");
        System.out.println(quantidade);
    }
}
