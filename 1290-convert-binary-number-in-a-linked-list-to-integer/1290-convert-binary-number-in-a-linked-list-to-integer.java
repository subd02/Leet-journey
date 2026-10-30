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
    public int getDecimalValue(ListNode head) {
        ListNode curr= head;
        String ans= "";
        while(curr!=null){
            ans+= curr.val;
            curr=curr.next;
        }
        return Integer.parseInt(ans, 2);
    }
}