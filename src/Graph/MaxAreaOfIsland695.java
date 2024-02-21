package Graph;

public class MaxAreaOfIsland695 {
  int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
  public int maxAreaOfIsland(int[][] grid) {
    int maxArea = 0;
    for (int col = 0; col < grid.length; col++) {
      for (int row = 0; row < grid[0].length; row++) {
        if (grid[col][row] == 1) {
          maxArea = Math.max(help(col, row, grid), maxArea);
        }
      }
    }
    return maxArea;
  }

  private int help(int col, int row, int[][] grid) {
    if (!isWithin(col, row, grid) || grid[col][row] == 0) return 0;
    grid[col][row] = 0;
    int sum = 0;
    for (int[] direction : directions) {
      sum += help(col + direction[0], row + direction[1], grid);
    }
    sum++;
    return sum;
  }

  private boolean isWithin(int col, int row, int[][] grid) {
    return col >= 0 && col < grid.length && row >=0 && row < grid[0].length;
  }
}
