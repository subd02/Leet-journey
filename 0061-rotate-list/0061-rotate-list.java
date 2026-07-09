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
    public ListNode rotateRight(ListNode head, int k) {
        int size=1;
        ListNode curr= head;
        if(head == null || head.next == null || k == 0){
            return head;
        }
        while(curr.next!=null){
            curr=curr.next;
            size++;
        }

        //find actual rotations
        k= k%size;
        if(k==0){
            return head;
        }

        ListNode tail= head;
        for(int i=1; i<size-k; i++){
            tail= tail.next;
        }   
        ListNode newHead= tail.next;
        tail.next=null;
        curr.next=head;
        return newHead;
    }
}