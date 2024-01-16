package Graph;

import java.util.*;

public class ReorderRoutesToMakeAllPathsLeadToTheCityZero {
    static int count = 0;
    public static int minReorder(int n, int[][] connections) {
        boolean[] visited = new boolean[n];
        Map<Integer, Set<Integer>> connectionMap = new HashMap<>();
        Map<Integer, List<Integer>> neighbors = new HashMap<>();
        for (int[] connection : connections) {
            Set<Integer> roads = connectionMap.getOrDefault(connection[0], new HashSet<>());
            roads.add(connection[1]);
            connectionMap.put(connection[0], roads);
            List<Integer> neighbor = neighbors.getOrDefault(connection[0], new ArrayList<>());
            neighbor.add(connection[1]);
            neighbors.put(connection[0], neighbor);
            neighbor = neighbors.getOrDefault(connection[1], new ArrayList<>());
            neighbor.add(connection[0]);
            neighbors.put(connection[1], neighbor);
        }
        bfsHelp(0, visited, connectionMap, neighbors);
        return count;
    }

    public static void bfsHelp(int key, boolean[] visited, Map<Integer, Set<Integer>> connectionMap, Map<Integer, List<Integer>> neighbors) {
        visited[key] = true;
        for (int neighbor : neighbors.get(key)) {
            if (!visited[neighbor]) {
                if (!(connectionMap.containsKey(neighbor) && connectionMap.get(neighbor).contains(key))) { count++; }
                bfsHelp(neighbor, visited, connectionMap, neighbors);
            }
        }
    }

    public static void main(String[] args) {
        int[][] connections = new int[][]{{1,0}, {1,2}, {3,2}, {3,4}};
        int result = minReorder(5, connections);
        System.out.println(result);
    }
}
