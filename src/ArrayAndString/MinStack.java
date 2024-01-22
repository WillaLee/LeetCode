package ArrayAndString;

import java.util.ArrayList;

public class MinStack {
  private int min;
  private ArrayList<Integer> minStack;
  private ArrayList<Integer> minRecord;

  public MinStack() {
    min = Integer.MAX_VALUE;
    minStack = new ArrayList<>();
    minRecord = new ArrayList<>();
  }

  public void push(int val) {
    minStack.add(val);
    if (val <= min) {
      minRecord.add(val);
      min = val;
    }
  }

  public void pop() {
    int temp = minStack.remove(minStack.size() - 1);
    if (temp == minRecord.get(minRecord.size() - 1)) {
      minRecord.remove(minRecord.size() - 1);
      if (!minRecord.isEmpty()) {
        min = minRecord.get(minRecord.size() - 1);
      } else {
        min = Integer.MAX_VALUE;
      }
    }
  }

  public int top() {
    return minStack.get(minStack.size() - 1);
  }

  public int getMin() {
    return min;
  }
}
