/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
import java.util.*;
class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        HashMap<Node, Node> map = new HashMap<>();
        Node newHead = new Node(head.val);
        Node newNode = newHead;
        map.put(head, newHead);
        Node oldNode = head.next;
        while (oldNode != null) {
            Node nextNode = new Node(oldNode.val);
            map.put(oldNode, nextNode);
            newNode.next = nextNode;
            newNode = nextNode;
            oldNode = oldNode.next;
        }
        oldNode= head;
        newNode= newHead;
        while(oldNode!=null){
            newNode.random= map.get(oldNode.random);
            oldNode= oldNode.next;
            newNode= newNode.next;
        }
        return newHead;
    }
}