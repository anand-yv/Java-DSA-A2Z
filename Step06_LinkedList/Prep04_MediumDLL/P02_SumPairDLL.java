package Step06_LinkedList.Prep04_MediumDLL;


import java.util.ArrayList;
import java.util.Arrays;

public class P02_SumPairDLL {

    private static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Node left = head;
        Node right = findLastNode(head);
        while (left.data < right.data) {
            if (left.data + right.data == target) {
                res.add(new ArrayList<>(Arrays.asList(left.data, right.data)));
                left = left.next;
                right = right.prev;
            } else if (left.data + right.data > target) {
                right = right.prev;
            } else {
                left = left.next;
            }
        }
        return res;
    }

    private static Node findLastNode(Node head) {
        if (head == null || head.next == null) return head;
        while (head.next != null) {
            head = head.next;
        }
        return head;
    }


    private static ArrayList<ArrayList<Integer>> findPairsWithGivenSumBrute(int target, Node head) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Node temp1 = head;
        while (temp1 != null) {
            Node temp2 = temp1.next;
            while (temp2 != null && temp1.data + temp2.data <= target) {
                if (temp1.data + temp2.data == target) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(temp1.data);
                    temp.add(temp2.data);
                    res.add(temp);
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        return res;
    }

    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
