package LinkedList;

public class MaximumTwinSumOfALinkedList {
    public int pairSum(ListNode head) {
        if (head.next.next == null){
            return head.val + head.next.val;
        }
        //Reverse the list from beginning to the middle.
        ListNode prev = null;
        ListNode current = head;
        ListNode currentDouble = head.next;
        while (currentDouble.next != null){
            currentDouble = currentDouble.next.next;
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        ListNode next = current.next;
        current.next = prev;
        prev = current;
        current = next;
        //Start finding the max. Current is right side and prev is the left side.
        int max = current.val + prev.val;
        while (current.next != null){
            current = current.next;
            prev = prev.next;
            max = Math.max(max, current.val + prev.val);
        }
        return max;
    }
}
