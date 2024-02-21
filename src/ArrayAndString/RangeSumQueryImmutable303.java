package ArrayAndString;

public class RangeSumQueryImmutable303 {
  private int[] numsSum;
  public RangeSumQueryImmutable303(int[] nums) {
    numsSum = new int[nums.length + 1];
    for (int i = 0; i < nums.length; i++) {
      numsSum[i + 1] = numsSum[i] + nums[i];
    }
  }

  public int sumRange(int left, int right) {
    return numsSum[right + 1] - numsSum[left];
  }
}
