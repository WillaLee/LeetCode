package WeeklyContest.WC385;

import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class FindTheLengthOfTheLongestCommonPrefix {
  public int longestCommonPrefix(int[] arr1, int[] arr2) {
    Set<Integer> prefixes = new HashSet<>();
    for (int num : arr1) {
      while (num != 0) {
        prefixes.add(num);
        num /= 10;
      }
    }
    int max = 0;
    for (int num : arr2) {
      while (num != 0 && num > max) {
        if (prefixes.contains(num)) max = num;
        num /= 10;
      }
    }
    int len = 0;
    while (max != 0) {
      len++;
      max /= 10;
    }
    return len;
  }
}
