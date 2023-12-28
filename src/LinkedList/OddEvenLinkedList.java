package LinkedList;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return head;
        }
        ListNode oddEnd = head;
        ListNode evenEnd = head.next;
        while (evenEnd != null && evenEnd.next != null){
            ListNode temp = evenEnd.next;
            evenEnd.next = evenEnd.next.next;
            temp.next = oddEnd.next;
            oddEnd.next = temp;
            evenEnd = evenEnd.next;
            oddEnd = oddEnd.next;
        }
        return head;
    }
}
