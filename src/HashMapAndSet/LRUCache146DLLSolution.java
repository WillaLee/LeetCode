package HashMapAndSet;

import java.util.HashMap;
import java.util.Map;

public class LRUCache146DLLSolution {
  private class Node{
    public int key;
    public int val;
    public Node prev;
    public Node next;

    public Node(int key, int val) {
      this.key = key;
      this.val = val;
    }
  }

  private class DLinkedList {
    private final Node sentinel;

    public DLinkedList() {
      sentinel = new Node(-1, -1);
      sentinel.next = sentinel;
      sentinel.prev = sentinel;
    }

    public void add(Node node) {
      node.next = sentinel;
      node.prev = sentinel.prev;
      node.prev.next = node;
      sentinel.prev = node;
    }

    public void pop(Node node) {
      node.prev.next = node.next;
      node.next.prev = node.prev;
    }

    public int poll() {
      Node temp = sentinel.next;
      sentinel.next = temp.next;
      temp.next.prev = sentinel;
      return temp.key;
    }
  }
  Map<Integer, Node> numPairs;
  int capacity;
  DLinkedList dLinkedList;

  public LRUCache146DLLSolution(int capacity) {
    numPairs = new HashMap<>(capacity);
    this.capacity = capacity;
    dLinkedList = new DLinkedList();
  }

  public int get(int key) {
    if (!numPairs.containsKey(key)) return -1;
    Node node = numPairs.get(key);
    dLinkedList.pop(node);
    dLinkedList.add(node);
    return node.val;
  }

  public void put(int key, int value) {
    Node node = new Node(key, value);
    //delete old num pair from DLL
    if (numPairs.containsKey(key)) {
      dLinkedList.pop(numPairs.get(key));
    }
    //add the pair
    numPairs.put(key, node);
    dLinkedList.add(node);
    //evict the least used key
    if (numPairs.size() > capacity) {
      int keyToEvict = dLinkedList.poll();
      numPairs.remove(keyToEvict);
    }
  }
}
