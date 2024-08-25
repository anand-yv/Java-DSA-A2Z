package Step06_LinkedList.Prep03_MediumLL;

import Step06_LinkedList.ListNode;

public class P07_EvenOddLL {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

    public ListNode oddEvenListBrute(ListNode head) {
        ListNode odd = new ListNode(0);
        ListNode oddHead = odd;
        ListNode even = new ListNode(0);
        ListNode evenHead = even;
        ListNode tempHead = head;
        int check = 0;
        while (tempHead != null){
            if(check == 0){
                odd.next = tempHead;
                odd = odd.next;
            }
            else{
                even.next = tempHead;
                even = even.next;
            }
            check = 1 - check;
            tempHead = tempHead.next;
        }
        even.next = null;
        odd.next = evenHead.next;
        return oddHead.next;
    }
}
