package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
  Queue<Integer> dataQueue;

  public ImplementStackUsingQueues() {
    dataQueue = new LinkedList<>();
  }

  public void push(int x) {
    dataQueue.add(x);
  }

  public int pop() {
    Queue<Integer> tempQueue = new LinkedList<>();
    for (int i = dataQueue.size(); i > 1; i--) {
      tempQueue.add(dataQueue.poll());
    }
    int popVal = dataQueue.poll();
    dataQueue = tempQueue;
    return popVal;
  }

  public int top() {
    Queue<Integer> tempQueue = new LinkedList<>();
    for (int i = dataQueue.size(); i > 1; i--) {
      tempQueue.add(dataQueue.poll());
    }
    int topVal = dataQueue.poll();
    dataQueue = tempQueue;
    dataQueue.add(topVal);
    return topVal;
  }

  public boolean empty() {
    return dataQueue.isEmpty();
  }
}
