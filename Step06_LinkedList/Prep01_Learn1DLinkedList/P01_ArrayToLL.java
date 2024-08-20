package Step06_LinkedList.Prep01_Learn1DLinkedList;

public class P01_ArrayToLL {
    static Node constructLL(int[] arr) {
        // code here
        Node node = new Node(arr[0]);
        Node head = node;
        for(int i = 1; i < arr.length; i++){
            node.next = new Node(arr[i]);
            node = node.next;
        }
        return head;
    }

    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

}
