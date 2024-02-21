package WeeklyContest.WC385;

import java.util.Arrays;

public class CountPrefixAndSuffixPairsII {
  public int countPrefixSuffixPairs(String[] words) {
    int[] pairCount = new int[words.length];
    for (int i = words.length - 1; i >= 0; i--) {
      int finder = i - 1;
      while (finder >=0 && !isPrefixAndSuffix(words[finder], words[i])) finder--;
      if (finder != -1) pairCount[finder] += pairCount[i] + 1;
    }
    int count = 0;
    for (int pairs : pairCount) count += pairs;
    System.out.println(Arrays.toString(pairCount));
    return count;
  }

  public boolean isPrefixAndSuffix(String str1, String str2) {
    if (str1.length() > str2.length()) return false;
    for (int i = 0; i < str1.length(); i++) {
      if (str1.charAt(i) != str2.charAt(i) ||
          str1.charAt(i) != str2.charAt(str2.length() - str1.length() + i))
        return false;
    }
    return true;
  }
}
