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
        ListNode temp = new ListNode(0, head);
        temp.next = head; 

        ListNode curLeft = temp;
        ListNode curRight = temp;

        for(int i = 0; i < n; i++){
            curRight = curRight.next;
        }

        while(curRight.next != null){
            curRight = curRight.next;
            curLeft = curLeft.next;
        }

        curLeft.next = curLeft.next.next;

        return temp.next;
    }
}
