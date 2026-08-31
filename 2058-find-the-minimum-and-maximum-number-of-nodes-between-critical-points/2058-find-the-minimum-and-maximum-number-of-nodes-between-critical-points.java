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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }
        int minDist= Integer.MAX_VALUE;
        int maxDist= Integer.MIN_VALUE;
        ListNode curr= head.next;
        ListNode prev= head;
        int idx=1;
        int firstidx=-1;
        int previdx=-1;
        while(curr.next!=null){
            //local minima & maxima
            if(curr.val<prev.val && curr.val<curr.next.val || curr.val>prev.val && curr.val>curr.next.val){
                if(firstidx==-1){
                    firstidx=idx;
                }else{
                    minDist= Math.min(minDist, idx-previdx);
                }
                previdx=idx;
            }
            prev=curr;
            curr=curr.next;
            idx++;
        }
        if (minDist == Integer.MAX_VALUE) {
            return new int[]{-1, -1};
        }
        maxDist= previdx-firstidx;
        return new int[]{minDist, maxDist};
    }
}