package ArrayAndString.SlidingWindow;

public class MaximumAverageSubArrayI {
    public static double findMaxAverage(int[] nums, int k) {
        int max = 0;
        for (int i = 0; i < k; i++){
            max += nums[i];
        }
        int next = max;
        for (int j = k; j < nums.length; j++){
            next = next + nums[j] - nums[j - k];
            max = Math.max(max, next);
        }
        return (double) max / k;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        double result = findMaxAverage(nums,k);
        System.out.println(result);
    }
}
