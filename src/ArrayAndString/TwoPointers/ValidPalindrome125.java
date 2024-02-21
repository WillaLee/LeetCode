package ArrayAndString.TwoPointers;

public class ValidPalindrome125 {
  public boolean isPalindrome(String s) {
    int left = 0, right = s.length() - 1;
    while (left < right) {
      if (!Character.isLetterOrDigit(s.charAt(left))) {
        left++;
      } else if (!Character.isLetterOrDigit(s.charAt(right))) {
        right--;
      } else {
        char lChar = s.charAt(left);
        char rChar = s.charAt(right);
        if (lChar != rChar && Character.toUpperCase(lChar) != Character.toUpperCase(rChar)) {
          return false;
        }
        left++;
        right--;
      }
    }
    return true;
  }
}
