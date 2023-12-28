package LinkedList;

public class DeleteTheMiddleNodeOfALinkedList {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        ListNode middle = head;
        ListNode end = head;
        while (end.next != null){
            end = end.next;
            if (end.next == null || end.next.next == null) {
                break;
            }
            end = end.next;
            middle = middle.next;
        }
        middle.next = middle.next.next;
        return head;
    }
}
