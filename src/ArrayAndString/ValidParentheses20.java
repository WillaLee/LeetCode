package ArrayAndString;

import java.util.ArrayList;

public class ValidParentheses20 {
  public boolean isValid(String s) {
    ArrayList<Character> brackets = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      switch (s.charAt(i)) {
        case '(' -> brackets.add(')');
        case '[' -> brackets.add(']');
        case '{' -> brackets.add('}');
        default -> {
          if (brackets.isEmpty() || brackets.remove(brackets.size() - 1) != s.charAt(i)) {
            return false;
          }
        }
      }
    }
    return brackets.isEmpty();
  }
}
