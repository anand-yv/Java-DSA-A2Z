package Step06_LinkedList.Prep03_MediumLL;

import Step06_LinkedList.ListNode;

public class P10_SortLL {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode midNode = middleOfList(head);
        ListNode leftNode = sortList(head);
        ListNode rightNode = sortList(midNode);

        return mergeList(leftNode, rightNode);
    }

    private ListNode middleOfList(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode midPrev = null;
        while (head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }

        ListNode midNode = midPrev.next;
        midPrev.next = null;
        return midNode;
    }

    private ListNode mergeList(ListNode left, ListNode right){
        ListNode sortedNode = new ListNode(0);
        ListNode head = sortedNode;
        while (left != null && right != null){
            if (left.val <= right.val){
                sortedNode.next = left;
                left = left.next;
            }
            else {
                sortedNode.next = right;
                right = right.next;
            }
            sortedNode = sortedNode.next;
        }
        sortedNode.next = (left != null) ? left : right;
        return head.next;
    }
}
