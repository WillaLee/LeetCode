package ArrayAndString;

public class MaximumSumCircularSubarray918 {
  public int maxSubarraySumCircular(int[] nums) {
    int max = Integer.MIN_VALUE, maxSum = 0;
    int min = Integer.MAX_VALUE, minSum = 0;
    int sum = 0;
    for (int num : nums) {
      maxSum = Math.max(maxSum + num, num);
      max = Math.max(maxSum, max);
      minSum = Math.min(minSum + num, num);
      min = Math.min(minSum, min);
      sum += num;
    }
    System.out.println(max + "," + min + "," + sum);
    return max > 0 ? Math.max(max, sum - min) : max;
  }
}
