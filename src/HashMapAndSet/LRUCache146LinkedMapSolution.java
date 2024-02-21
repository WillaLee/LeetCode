package HashMapAndSet;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache146LinkedMapSolution extends LinkedHashMap<Integer, Integer> {

  int capacity;
  public LRUCache146LinkedMapSolution(int capacity) {
    super(capacity, 0.75f, true);
    this.capacity = capacity;
  }

  public int get(int key) {
    Integer val = super.get(key);
    return val == null ? -1 : val;
  }

  @Override
  protected boolean removeEldestEntry(Map.Entry eldest) {
    return size() > capacity;
  }
}
