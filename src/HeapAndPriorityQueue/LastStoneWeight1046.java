package HeapAndPriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight1046 {
  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> stoneHeap = new PriorityQueue<>(Collections.reverseOrder());
    for (int stone : stones) stoneHeap.add(stone);
    while (stoneHeap.size() > 1) {
      int y = stoneHeap.poll();
      int x = stoneHeap.poll();;
      if (x == y) continue;
      y -= x;
      stoneHeap.add(y);
    }
    if (stoneHeap.isEmpty()) return 0;
    return stoneHeap.peek();
  }
}
