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
    public ListNode reverseList(ListNode head) {
        if (head == null) return null; 
        ListNode prevNode = head;
        ListNode cur = head.next;
        ListNode tempNext = head.next;
        ListNode newHead = head; 
        head.next = null;
        while(cur != null){
            tempNext = cur.next;
            if(tempNext == null){           
                newHead = cur;
            }
            cur.next = prevNode;
            prevNode = cur;
            cur = tempNext;
        }
        return newHead;
    }
}
