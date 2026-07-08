/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        int size= 0;
        ListNode currNode= head;
        while(currNode!=null){
            currNode= currNode.next;
            size++;
        }
        if(n==size){
            return head.next;
        }
        int prevNode= size-n;
        ListNode curr= head;
        
        int i=1;
        while(i<prevNode){
            curr= curr.next;
            i++;
        }
        curr.next= curr.next.next;
        return head;
    }
}