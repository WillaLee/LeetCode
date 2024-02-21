package ArrayAndString.TwoPointers;

public class RemoveDuplicatesFromSortedArrayII80 {
  public int removeDuplicates(int[] nums) {
    int pointer = 1, countNum = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[pointer - 1] && countNum < 2) {
        nums[pointer] = nums[i];
        countNum++;
        pointer++;
      }
      if (nums[i] != nums[pointer - 1]) {
        nums[pointer] = nums[i];
        countNum = 1;
        pointer++;
      }
    }
    return pointer;
  }
}
