package HeapAndPriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementInAStream703 {
  int k;
  private PriorityQueue<Integer> nums;
  public KthLargestElementInAStream703(int k, int[] nums) {
    this.k = k;
    this.nums = new PriorityQueue<>();
    for (int num : nums) {
      this.nums.add(num);
    }
    while (this.nums.size() > k) this.nums.poll();
  }

  public int add(int val) {
    nums.add(val);
    while (this.nums.size() > k) this.nums.poll();
    return nums.peek();
  }
}
