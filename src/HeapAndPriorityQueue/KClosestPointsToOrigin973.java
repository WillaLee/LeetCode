package HeapAndPriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin973 {
  public int[][] kClosest(int[][] points, int k) {
    PriorityQueue<int[]> pointsHeap = new PriorityQueue<>(new DistanceComparator());
    for (int[] point : points) pointsHeap.add(point);
    int[][] result = new int[k][2];
    for (int i = 0; i < result.length; i++) {
      result[i] = pointsHeap.poll();
    }
    return result;
  }

  private static class DistanceComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] point1, int[] point2) {
      int distance1 = point1[0] * point1[0] + point1[1] * point1[1];
      int distance2 = point2[0] * point2[0] + point2[1] * point2[1];
      return distance1 - distance2;
    }
  }
}
