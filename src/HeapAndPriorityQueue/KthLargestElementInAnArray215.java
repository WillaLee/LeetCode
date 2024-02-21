package HeapAndPriorityQueue;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray215 {
    public int findKthLargest(int[] nums, int k) {
        //Min-Heap solution
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for (int num : nums) {
//            if (pq.size() >= k) {
//                if (num > pq.peek()) {
//                    pq.add(num);
//                    pq.poll();
//                }
//            } else {
//                pq.add(num);
//            }
//        }
//        return pq.peek();

        //Quick select solution
        return quickSelect(nums, nums.length - k, 0, nums.length - 1);
    }

    private int quickSelect(int[] nums, int k, int left, int right) {
        int pivot = nums[right], pointer = left;
        for (int i = left; i < right; i++) {
          if (nums[i] < pivot) {
            int temp = nums[pointer];
            nums[pointer] = nums[i];
            nums[i] = temp;
            pointer++;
          }
        }
        if (pointer == k) return pivot;
        nums[right] = nums[pointer];
        nums[pointer] = pivot;
        if (pointer > k) {
            return quickSelect(nums, k, left, pointer - 1);
        } else {
            return quickSelect(nums, k, pointer + 1, right);
        }
    }
}
