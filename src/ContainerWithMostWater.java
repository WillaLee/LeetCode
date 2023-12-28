public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int leftPointer = 0, rightPointer = height.length - 1;
        int maxCapacity = (rightPointer - leftPointer) * Math.min(height[leftPointer],height[rightPointer]);
        while (leftPointer < rightPointer){
            int nextCapacity = (rightPointer - leftPointer) * Math.min(height[leftPointer],height[rightPointer]);
            maxCapacity = Math.max(nextCapacity, maxCapacity);
            if (height[leftPointer] < height[rightPointer]){
                leftPointer++;
            }else {
                rightPointer--;
            }
        }
        return maxCapacity;
    }

    public static void main(String[] args) {
        int[] height = {2,3,4,5,18,17,6};
        int result = maxArea(height);
        System.out.println(result);
    }
}


