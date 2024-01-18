package HashMapAndSet;

import edu.princeton.cs.algs4.Count;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {
    public static int equalPairs(int[][] grid) {
        int result = 0;

        //count the occurrences of different rows
        Map<Integer, Integer> hashRows = new HashMap<>();
        for (int[] row : grid) {
            int hashRow = 0;
            int ratio = 1;
            for (int num : row) {
                hashRow += num * ratio;
                ratio *= 233;
            }
            int count = hashRows.getOrDefault(hashRow, 0);
            hashRows.put(hashRow,count + 1);
        }

        Map<Integer, Integer> hashCols = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            int hashCol = 0;
            int ratio = 1;
            for (int[] row : grid) {
                hashCol += row[i] * ratio;
                ratio *= 233;
            }
            int count = hashCols.getOrDefault(hashCol, 0);
            hashCols.put(hashCol,count + 1);
        }

        for (int key : hashRows.keySet()) {
            if (hashCols.containsKey(key)) {
                result += hashRows.get(key) * hashCols.get(key);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] grid = {{3,2,1}, {1,7,6}, {2,7,7}};
        int result = equalPairs(grid);
    }

}
