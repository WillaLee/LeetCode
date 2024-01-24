package LinkedList;

public class ReverseLinkedList206 {
    public ListNode reverseList(ListNode head) {
        //Iterative method
//        if (head == null || head.next == null){
//            return head;
//        }
//        ListNode toConnect = head;
//        ListNode toReverse = head.next;
//        head.next = null;
//        while (toReverse != null){
//            ListNode nextToReverse = toReverse.next;
//            toReverse.next = toConnect;
//            toConnect = toReverse;
//            toReverse = nextToReverse;
//        }
//        return toConnect;

        //recursion method
        return helper(null, head);
    }

    //recursion method
    private ListNode helper(ListNode head, ListNode next) {
        if (next == null) {
            return head;
        }
        ListNode temp = next.next;
        next.next = head;
        head = helper(next, temp);
        return head;
    }
}
