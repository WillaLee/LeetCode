package ArrayAndString.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters3 {
  public int lengthOfLongestSubstring(String s) {
    System.out.println(s.length());
    Set<Character> substring = new HashSet<>();
    int left = 0, right = 0, length = 0;
    while (right < s.length()) {
      while (substring.contains(s.charAt(right))) {
        length = Math.max(length, right - left);
        substring.remove(s.charAt(left));
        left++;
      }
      substring.add(s.charAt(right));
      right++;
    }
    length = Math.max(length, right - left);
    return length;
  }
}
