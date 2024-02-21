package Graph;

public class NumberOfIslands200 {
  int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
  public int numIslands(char[][] grid) {
    int count = 0;
    for (int col = 0; col < grid.length; col++) {
      for (int row = 0; row < grid[0].length; row++) {
        if (grid[col][row] == '1') {
          help(col, row, grid);
          count++;
        }
      }
    }
    return count;
  }

  private void help(int col, int row, char[][] grid) {
    grid[col][row] = '0';
    for (int[] direction : directions) {
      int newCol = col + direction[0];
      int newRow = row + direction[1];
      if (isWithin(newCol, newRow, grid) && grid[newCol][newRow] == '1')
        help(newCol, newRow, grid);
    }
  }

  private boolean isWithin(int col, int row, char[][] grid) {
    return col >= 0 && col < grid.length && row >=0 && row < grid[0].length;
  }
}
