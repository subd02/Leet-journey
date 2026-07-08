/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        boolean isLoop= false;
        ListNode slow= head;
        ListNode fast= head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                isLoop = true;
                break;
            }
        }
        if(isLoop){
            slow=head;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }
        return null;
    }
}