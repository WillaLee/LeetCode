package ArrayAndString.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII219 {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    int i = 0;
    Set<Integer> numsInWindow = new HashSet<>();
    while (i < nums.length) {
      if (numsInWindow.size() > k) {
        numsInWindow.remove(nums[i - k - 1]);
      }
      if (numsInWindow.contains(nums[i])) return true;
      numsInWindow.add(nums[i]);
      i++;
    }
    return false;
  }
}
