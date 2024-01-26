package BinarySearch;

public class SearchA2DMatrix74 {
  public boolean searchMatrix(int[][] matrix, int target) {
    int top = 0, bottom = matrix.length - 1, mid;
    int row = -1;
    while (top <= bottom) {
      mid = (top + bottom) / 2;
      if (matrix[mid][matrix[0].length - 1] < target) {
        top = mid + 1;
      } else if (matrix[mid][0] > target) {
        bottom = mid - 1;
      } else {
        row = mid;
        break;
      }
    }
    if (row < 0) return false;
    int left = 0, right = matrix[0].length - 1;
    while (left <= right) {
      mid = (left + right) / 2;
      if (matrix[row][mid] < target) {
        left = mid + 1;
      } else if (matrix[row][mid] > target) {
        right = mid - 1;
      } else {
        return true;
      }
    }
    return false;
  }
}
