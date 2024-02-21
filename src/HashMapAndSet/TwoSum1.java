package HashMapAndSet;

import java.util.HashMap;

public class TwoSum1 {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> numsIndex = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (numsIndex.containsKey(nums[i])) {
        return new int[]{numsIndex.get(nums[i]), i};
      }
      numsIndex.put(target - nums[i], i);
    }
    return null;
  }
}
