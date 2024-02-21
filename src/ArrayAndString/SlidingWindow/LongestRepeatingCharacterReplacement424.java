package ArrayAndString.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement424 {
  public int characterReplacement(String s, int k) {
    Map<Character, Integer> charFreqs = new HashMap<>();
    int left = 0, right = 0, length = 0, maxRepeat = 0;
    while (right < s.length()) {
      int charFreq = charFreqs.getOrDefault(s.charAt(right), 0) + 1;
      charFreqs.put(s.charAt(right), charFreq);
      maxRepeat = Math.max(charFreqs.get(s.charAt(right)), maxRepeat);
      while (right - left + 1 - maxRepeat > k) {
        char charToDel = s.charAt(left);
        charFreqs.put(charToDel, charFreqs.get(charToDel) - 1);
        left++;
      }
      length = Math.max(length, right - left + 1);
      right++;
    }
    return length;
  }
}
