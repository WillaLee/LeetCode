package Graph;

import java.util.Arrays;
import java.util.LinkedList;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        LinkedList<int[]> nextOrange = new LinkedList<>();
        int countFersh = 0;
        //put all rotten orange to the queue
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    countFersh++;
                }
                if (grid[i][j] == 2) {
                    nextOrange.add(new int[]{i, j});
                }
            }
        }
        if (countFersh == 0) { return 0; }

        int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        //start rotting
        while (!nextOrange.isEmpty()) {
            int[] currentOrange = nextOrange.poll();
            for (int[] direction : directions) {
                int nextCol = currentOrange[0] + direction[0];
                int nextRow = currentOrange[1] + direction[1];
                if (nextCol >= 0 && nextCol < grid.length && nextRow >= 0 && nextRow < grid[0].length && grid[nextCol][nextRow] == 1) {
                    countFersh--;
                    grid[nextCol][nextRow] = grid[currentOrange[0]][currentOrange[1]] + 1;
                    nextOrange.add(new int[]{nextCol, nextRow});
                }
                if (countFersh == 0) {
                    return grid[nextCol][nextRow] - 2;
                }
            }
        }

        return  -1;
    }
}
