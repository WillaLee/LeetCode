package SlidingWindow;

import java.util.Set;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int max = 0;
        for (int i = 0; i < k; i++){
            if (vowels.contains(s.charAt(i))){
                max++;
            }
        }
        int next = max;
        for (int j = k; j < s.length(); j++){
            if(vowels.contains(s.charAt(j - k))){next--;}
            if(vowels.contains(s.charAt(j))){next++;}
            max = Math.max(next, max);
        }
        return max;
    }
}
