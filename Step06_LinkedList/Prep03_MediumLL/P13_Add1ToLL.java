package Step06_LinkedList.Prep03_MediumLL;

import Step06_LinkedList.Node;

public class P13_Add1ToLL {

    public Node addOne(Node head) {
        int carry = checkCarry(head);

        if (carry == 0) return head;
        Node node = new Node(carry);
        node.next = head;
        return node;
    }

    private int checkCarry(Node node){
        if(node == null) return 1;

        int carry = checkCarry(node.next);
        if(carry == 0) return 0;
        else if (node.data + carry > 9) {
            node.data = 0;
            return carry;
        }
        else {
            node.data += carry;
            return 0;
        }
    }

    public Node addOneBrute(Node head) {
        // code here.
        head = reverseLL(head);
        Node tempHead = head;
        int add = 1;
        while (tempHead != null){
            if (tempHead.data + add > 9){
                tempHead.data = 0;
            }
            else {
                tempHead.data += add;
                add = 0;
                break;
            }
            tempHead = tempHead.next;
        }
        head = reverseLL(head);
        if(add > 0){
            Node temp = new Node(1);
            temp.next = head;
            head = temp;
        }
        return head;
    }

    private Node reverseLL(Node head){
        if (head == null || head.next == null) return head;
        Node pres = head;
        Node prev = null;
        while (pres != null){
            Node next = pres.next;
            pres.next = prev;
            prev = pres;
            pres = next;
        }
        return prev;
    }
}
