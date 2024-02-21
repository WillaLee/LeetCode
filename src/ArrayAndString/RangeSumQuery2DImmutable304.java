package ArrayAndString;

public class RangeSumQuery2DImmutable304 {
  int[][] matrixSum;
  public RangeSumQuery2DImmutable304(int[][] matrix) {
    matrixSum = new int[matrix.length + 1][matrix[0].length + 1];
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[0].length; col++) {
        matrixSum[row + 1][col + 1] = matrixSum[row][col + 1] + matrixSum[row + 1][col] - matrixSum[row][col] + matrix[row][col];
      }
    }
  }

  public int sumRegion(int row1, int col1, int row2, int col2) {
    return matrixSum[row2 + 1][col2 + 1] + matrixSum[row1][col1] - matrixSum[row1][col2 + 1] - matrixSum[row2 + 1][col1];
  }
}

  