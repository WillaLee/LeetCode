package Graph;

import java.util.LinkedList;

public class ShortestPathInBinaryMatrix1091 {
  public int shortestPathBinaryMatrix(int[][] grid) {
    int[][] directions = new int[][]{{1, 1}, {0, 1}, {1, 0}, {0, -1}, {-1, 0}, {1, -1}, {-1, 1}, {-1, -1}};
    LinkedList<int[]> nextStep = new LinkedList<>();
    nextStep.add(new int[]{-1, -1});
    int pathCount = 0;
    while (!nextStep.isEmpty()) {
      for (int i = nextStep.size(); i > 0; i--) {
        int[] curr = nextStep.poll();
        for (int[] direction : directions) {
          int col = curr[0] + direction[0];
          int row = curr[1] + direction[1];
          if (col == grid.length - 1 && row == grid.length - 1 && grid[col][row] == 0) {
            pathCount++;
            return pathCount;
          }
          if (col >= 0 && row >= 0 && col < grid.length && row < grid.length && grid[col][row] == 0) {
            grid[col][row] = 1;
            nextStep.add(new int[]{col, row});
          }
        }
      }
      pathCount++;
    }
    return -1;
  }
}
