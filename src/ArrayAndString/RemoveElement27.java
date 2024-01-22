package ArrayAndString;

import java.util.Arrays;

public class RemoveElement27 {
  public int removeElement(int[] nums, int val) {
//    int valPointer = 0;
//    int pointer = nums.length - 1;
//    if (pointer < 0) { return 0; }
//    while (valPointer <= pointer) {
//      if (nums[valPointer] == val && nums[pointer] != val) {
//        nums[valPointer] = nums[pointer];
//        nums[pointer] = val;
//      }
//      if (nums[valPointer] != val) {
//        valPointer++;
//      }
//      if (nums[pointer] == val) {
//        pointer--;
//      }
//    }
//    if (pointer == 0) {
//      if (nums[0] == val) {
//        return 0;
//      }else {
//        return 1;
//      }
//    }
//    return pointer + 1;

    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == val) {
        count++;
      } else {
        nums[i - count] = nums[i];
      }
    }
    return nums.length - count;
  }
}
