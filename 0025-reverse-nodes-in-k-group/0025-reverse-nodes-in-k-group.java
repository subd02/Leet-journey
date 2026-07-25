class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroup = dummy;
        
        while (true) {
            ListNode end = prevGroup;
            for (int i = 0; i < k; i++) {
                end = end.next;
                if (end == null) {
                    return dummy.next;
                }
            }
            
            ListNode curr = prevGroup.next; 
            ListNode windowTail = curr;     
            
            ListNode prev = null;
            ListNode nextGroupHead = end.next;
            
            while (curr != nextGroupHead) {
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }
            prevGroup.next=prev;
            windowTail.next=curr;

            prevGroup=windowTail;
            
        }
    }
}