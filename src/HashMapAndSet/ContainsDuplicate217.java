package HashMapAndSet;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> distinctNums = new HashSet<>();
    for (int num : nums) {
      if (distinctNums.contains(num)) return true;
      distinctNums.add(num);
    }
    return false;
  }
}
