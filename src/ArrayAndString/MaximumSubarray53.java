package ArrayAndString;

public class MaximumSubarray53 {
  public int maxSubArray(int[] nums) {
    //Kadane Algorithm
    int max = Integer.MIN_VALUE;
    int sum = 0;
    for (int num : nums) {
      sum += num;
      if (sum > max) max = sum;
      if (sum < 0) sum = 0;
    }
    return max;
  }
}
