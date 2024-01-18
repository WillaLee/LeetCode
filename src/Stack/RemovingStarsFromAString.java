package Stack;

import edu.princeton.cs.algs4.Stack;


public class RemovingStarsFromAString {
    public String removeStars(String s) {
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                if (!characters.isEmpty()) {
                    characters.pop();
                }
            } else {
                characters.push(s.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        for (Character c : characters) {
            result.append(c);
        }
        return result.toString();
    }
}
