package LinkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode toConnect = head;
        ListNode toReverse = head.next;
        head.next = null;
        while (toReverse != null){
            ListNode nextToReverse = toReverse.next;
            toReverse.next = toConnect;
            toConnect = toReverse;
            toReverse = nextToReverse;
        }
        return toConnect;
    }
}
