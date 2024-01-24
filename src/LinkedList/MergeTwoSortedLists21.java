package LinkedList;

public class MergeTwoSortedLists21 {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//    ListNode result = new ListNode();
//    ListNode tail = result;
//    while (list1 != null && list2 != null) {
//      if (list1.val > list2.val) {
//        tail.next = list2;
//        tail = tail.next;
//        list2 = list2.next;
//      } else {
//        tail.next = list1;
//        tail = tail.next;
//        list1 = list1.next;
//      }
//    }
//    if (list1 != null) {
//      tail.next = list1;
//    }
//    if (list2 != null) {
//      tail.next = list2;
//    }
//    return result.next;

    //recursion
    if (list1 == null) { return list2; }
    if (list2 == null) { return list1; }
    if (list1.val > list2.val) {
      list2.next = mergeTwoLists(list1, list2.next);
      return list2;
    } else {
      list1.next = mergeTwoLists(list1.next, list2);
      return list1;
    }
  }
}
