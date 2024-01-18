package ArrayAndString;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        char[] sToChar = s.toCharArray();
        int leftPointer = 0, rightPointer = sToChar.length - 1;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        while (leftPointer < rightPointer){
            if(!vowels.contains(sToChar[leftPointer])){leftPointer++;}
            if(!vowels.contains(sToChar[rightPointer])){rightPointer--;}
            if(vowels.contains(sToChar[leftPointer]) && vowels.contains(sToChar[rightPointer])){
                char temp = sToChar[rightPointer];
                sToChar[rightPointer] = sToChar[leftPointer];
                sToChar[leftPointer] = temp;
                leftPointer++;
                rightPointer--;
            }
        }
        return new String(sToChar);
    }
}
