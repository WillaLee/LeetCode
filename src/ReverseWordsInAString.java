public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] sToWords = s.split("\\\\s*[^a-zA-Z0-9]+\\\\s*");
        for (int i = 0; i < (int) sToWords.length / 2; i++){
            String temp = sToWords[i];
            sToWords[i] = sToWords[sToWords.length - 1 - i];
            sToWords[sToWords.length - 1 - i] = temp;
        }
        return String.join(" ",sToWords).strip();
    }
}
