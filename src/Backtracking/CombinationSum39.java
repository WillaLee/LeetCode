package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum39 {
  List<List<Integer>> result = new ArrayList<>();
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    help(candidates, target, 0, new ArrayList<>(), 0);
    return result;
  }

  private void help(int[] candidates, int target, int sum, List<Integer> combination, int index) {
    if (sum == target) {
      result.add(new ArrayList<>(combination));
      return;
    }
    if (sum > target) return;
    for (int i = index; i < candidates.length; i++) {
      sum += candidates[i];
      combination.add(candidates[i]);
      help(candidates, target, sum, combination, i);
      sum -= candidates[i];
      combination.remove(combination.size() - 1);
    }
  }
}
