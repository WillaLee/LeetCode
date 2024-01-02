import edu.princeton.cs.algs4.Count;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {
    public static int equalPairs(int[][] grid) {
        int result = 0;

        //count the occurrences of different rows
        Map<String, Integer> numRows = new HashMap<>();
        for (int[] row : grid) {
            String numRow = Arrays.toString(row);
            int count = numRows.getOrDefault(numRow, 0);
            numRows.put(numRow, count + 1);
            System.out.println(numRow);
        }

        for (int i = 0; i < grid.length; i++) {
            int[] col = new int[grid.length];
            for (int j = 0; j < grid.length; j++) {
                col[j] = grid[j][i];
            }
            result += numRows.getOrDefault(Arrays.toString(col), 0);
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] grid = {{3,2,1}, {1,7,6}, {2,7,7}};
        int result = equalPairs(grid);
    }

}
