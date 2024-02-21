package ArrayAndString.TwoPointers;

public class ContainerWithMostWater11 {
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1, maxWater = 0;
        while (left < right) {
            maxWater = Math.max(maxWater, Math.min(height[left], height[right]) * (right - left));
            if (height[left] > height[right]) right--;
            else left++;
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int[] height = {2,3,4,5,18,17,6};
        int result = maxArea(height);
        System.out.println(result);
    }
}


