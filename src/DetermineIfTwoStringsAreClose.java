import java.util.*;

public class DetermineIfTwoStringsAreClose {
    public static boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) { return false; }

        int[] charOccurrence1 = new int[26];
        int[] charOccurrence2 = new int[26];
        //count the occurrence of each character
        for (int i = 0; i < word1.length(); i++) {
            charOccurrence1[word1.charAt(i) - 97] += 1;
        }
        for (int i = 0; i < word2.length(); i++) {
            charOccurrence2[word2.charAt(i) - 97] += 1;
        }

        for (int i = 0; i < charOccurrence1.length; i++){
            if (charOccurrence1[i] == 0 ^ charOccurrence2[i] == 0) {
                return false;
            }
        }

        Arrays.sort(charOccurrence1);
        Arrays.sort(charOccurrence2);
        for (int i = 0; i < charOccurrence1.length; i++){
            if (charOccurrence1[i] != charOccurrence2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "bca";
        boolean result = closeStrings(word1, word2);
        System.out.println(result);
    }
}
