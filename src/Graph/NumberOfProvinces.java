package Graph;

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int countProvinces = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                dfsVisitCities(i, visited, isConnected);
                countProvinces++;
            }
        }
        return countProvinces;
    }

    public void dfsVisitCities(int cityNum, boolean[] visited, int[][] isConnected) {
        if (!visited[cityNum]) {
            visited[cityNum] = true;
            for (int i = 0; i < isConnected[cityNum].length; i++) {
                if (isConnected[cityNum][i] == 1) {
                    dfsVisitCities(i, visited, isConnected);
                }
            }
        }
    }
}
