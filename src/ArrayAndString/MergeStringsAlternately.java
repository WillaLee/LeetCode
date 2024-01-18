package ArrayAndString;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();
        int lengthMin = Math.min(word1.length(), word2.length());
        int lengthMax = Math.max(word1.length(), word2.length());
        for(int i = 0; i < lengthMin; i++){
            mergedString.append(word1.charAt(i));
            mergedString.append(word2.charAt(i));
        }
        if (Integer.compare(word1.length(), word2.length()) > 0){
            for (int i = lengthMin; i < lengthMax; i++){
                mergedString.append(word1.charAt(i));
            }
        }else {
            for (int i = lengthMin; i < lengthMax; i++){
                mergedString.append(word2.charAt(i));
            }
        }
        return mergedString.toString();
    }

}
