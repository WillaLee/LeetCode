import javax.xml.stream.events.Characters;

public class DecodeString {
    public static String decodeString(String s) {
        StringBuilder dcoSample = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ']') {
                dcoSample.append(s.charAt(i));
            } else {
                //generates the decoded string
                int popIndex = dcoSample.length() - 1;
                while (dcoSample.charAt(popIndex) != '[') {
                    popIndex--;
                }
                String temp = dcoSample.substring(popIndex + 1, dcoSample.length());
                //get the repeat number
                popIndex--;
                int repNum = 0;
                int ratio = 1;
                while (popIndex >= 0 && Character.isDigit(dcoSample.charAt(popIndex))) {
                    repNum += ratio * (dcoSample.charAt(popIndex) - 48);
                    ratio *= 10;
                    popIndex--;
                }
                dcoSample.delete(popIndex + 1, dcoSample.length());
                while (repNum != 0) {
                    dcoSample.append(temp);
                    repNum--;
                }
            }
        }
        return dcoSample.toString();
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        String result = decodeString(s);
        System.out.println(result);
    }
}
