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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1Cur = l1;
        ListNode l2Cur = l2;
        ListNode sum = new ListNode();
        ListNode sumCur = sum;
        int carryOver = 0;

        while(l1Cur != null || l2Cur != null){
            int l1Digit = 0;
            int l2Digit = 0;

            if(l1Cur != null){
                l1Digit = l1Cur.val;
            }
            if(l2Cur != null){
                l2Digit = l2Cur.val;
            }
            
            int nodeVal = (l1Digit + l2Digit + carryOver) % 10;
            carryOver = (l1Digit + l2Digit + carryOver) / 10;
            
            ListNode sumNode = new ListNode(nodeVal);
            sumCur.next = sumNode;
            sumCur = sumCur.next;
            
            if(l1Cur != null){
                l1Cur = l1Cur.next;
            }
            if(l2Cur != null){
                l2Cur = l2Cur.next;
            }
        }

        if(carryOver != 0){
            ListNode sumNode = new ListNode(carryOver);
            sumCur.next = sumNode;
        }

        return sum.next;
    }
}
