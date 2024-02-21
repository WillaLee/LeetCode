package ArrayAndString.TwoPointers;

public class TrappingRainWater42 {
  public int trap(int[] height) {
    int highest = 0, right = 0, waterSum = 0, currWater = 0;
    while (right < height.length) {
      if (height[right] >= height[highest]){
        waterSum += currWater;
        currWater = 0;
        highest = right;
      } else {
        currWater += height[highest] - height[right];
      }
      right++;
    }
    currWater = 0;
    right--;
    int left = right;
    while (left >= highest) {
      if (height[left] >= height[right]){
        waterSum += currWater;
        currWater = 0;
        right = left;
      } else {
        currWater += height[right] - height[left];
      }
      left--;
    }
    return waterSum;
  }
}
