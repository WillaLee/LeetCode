package Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subsets78 {
  List<Integer> subset = new ArrayList<>();
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    help(0, result, nums);
    return result;
  }

  private void help(int index, List<List<Integer>> result, int[] nums) {
    if (index >= nums.length) {
      result.add(new ArrayList<>(subset));
      return;
    }
    subset.add(nums[index]);
    help(index + 1, result, nums);
    subset.remove(subset.size() - 1);
    help(index + 1, result, nums);
  }
}
