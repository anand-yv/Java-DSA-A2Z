package Step06_LinkedList.Prep05_HardLL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P03_FlatteningDLL {

    Node flatten(Node head){
        if(head == null || head.next == null) return head;
        Node mergeHead = flatten(head.next);
        head = mergeLL(head, mergeHead);
        return head;
    }

    Node mergeLL(Node l1, Node l2){
        Node res = new Node(-1);
        Node resHead = res;
        while (l1 != null && l2 !=  null){
            if(l1.data <= l2.data){
                res.bottom = l1;
                res = l1;
                l1 = l1.bottom;
            }
            else{
                res.bottom = l2;
                res = l2;
                l2 = l2.bottom;
            }
        }

        if(l1 != null) res.bottom = l1;
        else res.bottom = l2;

        if (resHead.bottom != null) resHead.bottom.next = null;
        return resHead.bottom;
    }


    Node flattenBrute(Node head) {
        // code here
        Node temp = head;
        List<Integer> nodeEle = new ArrayList<>();
        while (temp != null){
            Node down = temp;
            while (down != null){
                nodeEle.add(down.data);
                down = down.bottom;
            }
            temp = temp.next;
        }
        Collections.sort(nodeEle);
        head = convertArrayToLL(nodeEle);
        return head;
    }

    private Node convertArrayToLL(List<Integer> nodeEle) {
        Node temp = new Node(-1);
        Node head = temp;
        for (Integer ele : nodeEle){
            temp.bottom = new Node(ele);
            temp = temp.bottom;
        }
        return head.bottom;
    }


    private static class Node{
        int data;
        Node next;
        Node bottom;

        Node(int data){
            this.data = data;
            this.next = null;
            this.bottom = null;
        }
    }

}
