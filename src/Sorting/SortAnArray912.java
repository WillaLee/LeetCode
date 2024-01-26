package Sorting;

import java.util.Arrays;

public class SortAnArray912 {
  public int[] sortArray(int[] nums) {
    if (nums.length < 2) {
      return nums;
    }
    //divide the array to 2 parts, and sort them
    int[] left = new int[nums.length / 2];
    int[] right = new int[nums.length - nums.length / 2];
    for (int i = 0; i < nums.length / 2; i++) { left[i] = nums[i]; }
    for (int i = 0; i < nums.length - nums.length / 2; i++) { right[i] = nums[i + nums.length / 2]; }
    left = sortArray(left);
    right = sortArray(right);

    //merge two parts
    int[] sorted = new int[nums.length];
    int leftPointer = 0, rightPointer = 0;
    for (int i = 0; i < sorted.length; i++) {
      if (leftPointer >= left.length) {
        sorted[i] = right[rightPointer];
        rightPointer++;
      } else if (rightPointer >= right.length) {
        sorted[i] = left[leftPointer];
        leftPointer++;
      } else if (left[leftPointer] > right[rightPointer]) {
        sorted[i] = right[rightPointer];
        rightPointer++;
      } else {
        sorted[i] = left[leftPointer];
        leftPointer++;
      }
    }
    return sorted;
  }
}
