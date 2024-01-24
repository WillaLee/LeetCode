package LinkedList;

public class DesignLinkedList707 {
  private static class Node {
    public Node prev;
    public int val;
    public Node next;

    public Node() {}
    public Node(int val) {
      this.val = val;
    }
  }

  Node sentinel;
  int size;

  public DesignLinkedList707() {
    sentinel = new Node();
    sentinel.next = sentinel;
    sentinel.prev = sentinel;
    size = 0;
  }

  public int get(int index) {
    if (index >= size) {
      return -1;
    }
    Node result = sentinel.next;
    while (index > 0) {
      result = result.next;
      index--;
    }
    return result.val;
  }

  public void addAtHead(int val) {
    Node temp = sentinel.next;
    Node newNode = new Node(val);
    sentinel.next = newNode;
    newNode.prev = sentinel;
    newNode.next = temp;
    temp.prev = newNode;
    size++;
  }

  public void addAtTail(int val) {
    Node temp = sentinel.prev;
    Node newNode = new Node(val);
    sentinel.prev = newNode;
    newNode.next = sentinel;
    newNode.prev = temp;
    temp.next = newNode;
    size++;
  }

  public void addAtIndex(int index, int val) {
    if (index == size) {
      addAtTail(val);
    } else if (index < size) {
      Node pointer = sentinel;
      while (index > 0) {
        pointer = pointer.next;
        index--;
      }
      Node node = new Node(val);
      node.prev = pointer;
      node.next = pointer.next;
      pointer.next = node;
      node.next.prev = node;
      size++;
    }
  }

  public void deleteAtIndex(int index) {
    if (index < size) {
      Node pointer = sentinel;
      while (index > 0) {
        pointer = pointer.next;
        index--;
      }
      pointer.next = pointer.next.next;
      pointer.next.prev = pointer;
      size--;
    }
  }
}
