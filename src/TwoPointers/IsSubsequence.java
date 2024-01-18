package TwoPointers;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if(s.length() == 0) {return true;}
        if(t.length() == 0) {return false;}
        char charToFind = s.charAt(0);
        int sCharIndex = 1;
        for (int i = 0; i < t.length(); i++){
            if (t.charAt(i) == charToFind){
                if (sCharIndex == s.length()){
                    return true;
                }
                charToFind = s.charAt(sCharIndex);
                sCharIndex++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "acb";
        String t = "ahbgdc";
        boolean result = isSubsequence(s, t);
    }
}
