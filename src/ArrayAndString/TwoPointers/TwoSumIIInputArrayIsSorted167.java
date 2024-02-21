package ArrayAndString.TwoPointers;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIIInputArrayIsSorted167 {
  public int[] twoSum(int[] numbers, int target) {
    //brute force
//    Map<Integer, Integer> nums = new HashMap<>();
//    for (int i = 0; i < numbers.length; i++) {
//      if (nums.containsKey(numbers[i])) {
//        return new int[] {nums.get(numbers[i]) + 1, i + 1};
//      }
//      nums.put(target - numbers[i], i);
//    }
//    return null;

    //two pointer
    int left = 0, right = numbers.length - 1;
    while (left < right) {
      if (numbers[right] + numbers[left] > target) {
        right--;
        
      } else if (numbers[right] + numbers[left] < target) {
        left++;
      } else {
        return new int[] {left + 1, right + 1};
      }
    }
    return null;
  }
}
