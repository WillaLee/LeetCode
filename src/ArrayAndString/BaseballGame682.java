package ArrayAndString;

import java.util.ArrayList;

public class BaseballGame682 {
  public int calPoints(String[] operations) {
    ArrayList<Integer> scores = new ArrayList<>();
    for (String operation : operations) {
      switch (operation) {
        case "+" -> scores.add(scores.get(scores.size() - 1) + scores.get(scores.size() - 2));
        case "D" -> scores.add(scores.get(scores.size() - 1) * 2);
        case "C" -> scores.remove(scores.size() - 1);
        default -> scores.add(Integer.parseInt(operation));
      }
    }
    int sum = 0;
    for (int score : scores) {
      sum += score;
    }
    return sum;
  }
}
