package HeapAndPriorityQueue;

import java.util.Arrays;

public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            swim(i, nums);
        }
        System.out.println(Arrays.toString(nums));
        int result = 0;
        for (int i = 0; i < k; i++) {
            result = poll(nums);
            System.out.println(Arrays.toString(nums));
        }
        return result;
    }

    public void swim(int key, int[] nums) {
        int parent = (key - 1) / 2;
        if (nums[parent] < nums[key]) {
            int temp = nums[parent];
            nums[parent] = nums[key];
            nums[key] = temp;
            swim(parent, nums);
        }
    }

    public int poll(int[] nums) {
        int val = nums[0];
        int current = 0;
        int next = 1;
        while (next < nums.length) {
            if (next + 1 >= nums.length || nums[next] > nums[next + 1]) {
                nums[current] = nums[next];
                current = next;
                next = next * 2 + 1;
            } else {
                nums[current] = nums[next + 1];
                current = next + 1;
                next = (next + 1) * 2 + 1;
            }
        }
        return val;
    }
}
