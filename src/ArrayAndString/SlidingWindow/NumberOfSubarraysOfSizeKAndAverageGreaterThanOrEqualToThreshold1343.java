package ArrayAndString.SlidingWindow;

public class NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThreshold1343 {
  public int numOfSubarrays(int[] arr, int k, int threshold) {
    int count = 0, sum = 0;
    for (int i = 0; i < k - 1; i++) sum += arr[i];
    for (int j = k - 1; j < arr.length; j++) {
      sum += arr[j];
      if (sum / k >= threshold) count++;
      sum -= arr[j - k + 1];
    }
    return count;
  }
}
