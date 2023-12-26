import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class StringCompression {
    public static int compress(char[] chars) {
        char tempChar = chars[0];
        int charCount = 1;
        int indexToReplace = 1;
        int compressedLength = 1;
        for(int i = 1; i < chars.length; i++){
            if (chars[i] == tempChar){
                charCount += 1;
            }else {
                if (charCount > 1){
                    String charCountToString = Integer.toString(charCount);
                    for(int j = 0; j < charCountToString.length(); j++){
                        chars[indexToReplace] = charCountToString.charAt(j);
                        indexToReplace++;
                        compressedLength++;
                    }
                }
                tempChar = chars[i];
                chars[indexToReplace] = tempChar;
                indexToReplace++;
                compressedLength++;
                charCount = 1;
            }
        }
        if (charCount > 1){
            String charCountToString = Integer.toString(charCount);
            for(int j = 0; j < charCountToString.length(); j++){
                chars[indexToReplace] = charCountToString.charAt(j);
                indexToReplace++;
                compressedLength++;
            }
        }
        return compressedLength;
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','b','c','c','c','c'};
        int result = compress(chars);
        System.out.println(Arrays.toString(chars));
    }
}
