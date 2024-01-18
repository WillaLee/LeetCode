package Graph;

import java.util.LinkedList;

public class NearestExitFromEntranceInMaze {
    public int nearestExit(char[][] maze, int[] entrance) {
        LinkedList<int[]> nextStep = new LinkedList<>();
        int[][] stepRecord = new int[maze.length][maze[0].length];
        nextStep.add(entrance);
        System.out.println(stepRecord.length + "," + stepRecord[0].length);
        int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while (!nextStep.isEmpty()) {
            int[] position = nextStep.poll();
            for (int[] direction : directions) {
                int newCol = position[0] + direction[0];
                int newRow = position[1] + direction[1];
                if (isWithin(newCol, newRow, maze) && maze[newCol][newRow] != '+') {
                    int currentStep = stepRecord[position[0]][position[1]] + 1;
                    if (isExit(newCol, newRow, maze, entrance)) {
                        return currentStep;
                    }
                    stepRecord[newCol][newRow] = currentStep;
                    maze[newCol][newRow] = '+';
                    nextStep.add(new int[]{newCol, newRow});
                }
            }
        }
        return -1;
    }

//    public int dfsExitFinder(int[] position, boolean[][] visited, char[][] maze, int[] entrance) {
//        if (isExit(position, maze, entrance)) {
//            return 0;
//        }
//        visited[position[0]][position[1]] = true;
//        int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
//        int countStep = maze.length * maze[0].length + 1;
//        for (int[] direction : directions) {
//            int newCol = position[0] + direction[0];
//            int newRow = position[1] + direction[1];
//            if (isWithin(newCol, newRow, maze) && !visited[newCol][newRow] && maze[newCol][newRow] != '+') {
//                countStep = Math.min(countStep, dfsExitFinder(new int[]{newCol,newRow}, visited, maze, entrance) + 1);
//                System.out.println(newCol + "," + newRow);
//            }
//        }
//        return countStep;
//    }

    public boolean isExit(int col, int row, char[][] maze, int[] entrance) {
        if (col == entrance[0] && row == entrance[1]) { return false; }
        return col == 0 || col == maze.length - 1 || row == 0 || row == maze[0].length - 1;
    }

    public boolean isWithin(int col, int row, char[][] maze) {
        return col >= 0 && col <= maze.length - 1 && row >= 0 && row <= maze[0].length - 1;
    }
}
