/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }
        Node curr = head;

        while (curr != null) {
            if (curr.child != null) {
                //flatten
                Node nextNode = curr.next;
                Node newNode = flatten(curr.child);
                curr.next = newNode;
                curr.next.prev = curr;
                curr.child=null;

                //find tail
                while (curr.next != null) {
                    curr = curr.next;
                }
                //join tail nd next
                if (nextNode != null) {
                    curr.next = nextNode;
                    nextNode.prev = curr;
                }
                
            }
            curr= curr.next;
        }
        return head;
    }
}