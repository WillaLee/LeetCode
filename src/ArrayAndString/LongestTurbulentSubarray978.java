package ArrayAndString;

public class LongestTurbulentSubarray978 {
  public int maxTurbulenceSize(int[] arr) {
    int index = 1;
    if (arr.length == 1) return 1;
    int count = arr[0] == arr[1] ? 1 : 2;
    int maxSize = count;
    while (index < arr.length - 1) {
      if ((arr[index + 1] > arr[index] && arr[index] > arr[index - 1]) ||
          (arr[index + 1] < arr[index] && arr[index] < arr[index - 1])) {
        count = 2;
      } else if (arr[index + 1] == arr[index]) {
        count = 1;
      } else if (arr[index] == arr[index - 1]) {
        count = 2;
      } else {
        count++;
      }
      maxSize = Math.max(count, maxSize);
      index++;
    }
    maxSize = Math.max(count, maxSize);
    return maxSize;
  }
}
