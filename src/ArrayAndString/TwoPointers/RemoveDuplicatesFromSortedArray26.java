package ArrayAndString.TwoPointers;

public class RemoveDuplicatesFromSortedArray26 {
  public int removeDuplicates(int[] nums) {
    int pointer = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != nums[pointer]) {
        pointer++;
        nums[pointer] = nums[i];
      }
    }
    return pointer + 1;
  }
}
