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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reverse(slow.next);
        slow.next = null;
        ListNode cur = head;        

        while(cur != null && secondHalf != null){
            ListNode tempNext = cur.next;
            ListNode secTemp = secondHalf.next;
            cur.next = secondHalf;      
            secondHalf.next = tempNext;
            cur = tempNext;
            secondHalf = secTemp;
        }
    }

    public ListNode reverse(ListNode head){
        ListNode cur = head;
        ListNode prev = null;

        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
}
