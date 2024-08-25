package Step06_LinkedList.Prep03_MediumLL;

import Step06_LinkedList.ListNode;

public class P09_DeleteMiddleLL {

    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next ==  null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head.next.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(slow.next != null){
            slow.next = slow.next.next;
        }
        return head;
    }

    public ListNode deleteMiddleBrute(ListNode head) {
        ListNode tempHead = head;
        int length = 0;
        while(tempHead != null){
            length++;
            tempHead = tempHead.next;
        }

        int mid = length/2;
        tempHead = head;
        while (tempHead != null){
            mid--;
            if(mid == 0){
                tempHead.next = tempHead.next.next;
                break;
            }
            tempHead = tempHead.next;
        }
        return head;
    }
}
