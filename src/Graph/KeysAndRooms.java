package Graph;

import java.util.*;

public class KeysAndRooms {
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
//        //solution 1
//        Queue<Integer> keys = new ArrayDeque<>(rooms.get(0));
//        boolean[] visited = new boolean[rooms.size()];
//        visited[0] = true;
//        int countVisited = 1;
//        while (keys.size() != 0) {
//            int room = keys.poll();
//            if (!visited[room]) {
//                visited[room] = true;
//                keys.addAll(rooms.get(room));
//                countVisited++;
//            }
//        }
//        return countVisited == rooms.size();

        //solution 2
        boolean[] visited = new boolean[rooms.size()];
        dfsVisit(0, rooms, visited);
        for (boolean b : visited) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    public static void dfsVisit(int room, List<List<Integer>> rooms, boolean[] visited) {
        visited[room] = true;
        for (int key : rooms.get(room)) {
            if (!visited[key]) {
                dfsVisit(key, rooms, visited);
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>();
        List<Integer> room0 = new ArrayList<>();
        room0.add(1);
        room0.add(3);
        List<Integer> room1 = new ArrayList<>();
        room1.add(3);
        room1.add(0);
        room1.add(1);
        List<Integer> room2 = new ArrayList<>();
        room2.add(2);
        List<Integer> room3 = new ArrayList<>();
        room3.add(0);
        rooms.add(room0);
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        boolean result = canVisitAllRooms(rooms);
        System.out.println(result);
    }
}
