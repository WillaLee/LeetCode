package ArrayAndString.SlidingWindow;

public class MinimumSizeSubarraySum209 {
  public int minSubArrayLen(int target, int[] nums) {
    int length = Integer.MAX_VALUE, sum = 0;
    int right = 0, left = 0;
    while (right < nums.length) {
      sum += nums[right];
      while (sum >= target) {
        length = Math.min(length, right - left + 1);
        sum -= nums[left];
        left++;
      }
      right++;
    }
    return length == Integer.MAX_VALUE ? 0 : length;
  }
}
