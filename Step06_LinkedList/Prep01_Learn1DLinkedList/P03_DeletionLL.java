package Step06_LinkedList.Prep01_Learn1DLinkedList;
import Step06_LinkedList.ListNode;

public class P03_DeletionLL {

    public void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }


    public void deleteNodeBrute(ListNode node) {
        ListNode prev = null;
        while(node.next != null){
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }
        prev.next = null;
    }
}
