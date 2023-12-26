public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        int str1ASCII = addASCII(str1);
        int str2ASCII = addASCII(str2);
        int strGCD = gcd(str1ASCII, str2ASCII);
        StringBuilder result = new StringBuilder();
        if(strGCD >= 65){
            int i = 0;
            while (strGCD >= 65){
                char c = str1.charAt(i);
                if (c != str2.charAt(i)){
                    return "";
                }
                result.append(c);
                strGCD -= c;
                i++;
            }
        }
        String resultToString = result.toString();
        if(strGCD != 0 || !verifyGCD(resultToString, str1) || !verifyGCD(resultToString, str2)){
            return "";
        }
        return resultToString;
    }

    public int gcd(int a, int b){
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }

    public int addASCII(String str){
        int i = 0;
        int result = 0;
        while (i < str.length()){
            result += str.charAt(i);
            i++;
        }
        return result;
    }

    public boolean verifyGCD(String strGCD, String str){
        int i = 0, j = 0;
        while (i < str.length()){
            while (j < strGCD.length()){
                if(str.charAt(i) != strGCD.charAt(j)){
                    return false;
                }
                i++;
                j++;
            }
            j = 0;
        }
        return true;
    }
}
