/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;

        if(l2 == null)
            return l1;

        ListNode head = null;
        ListNode tail = null;

        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                if(head == null) {
                    head = l1;
                    tail = l1;
                } else {
                    tail.next = l1;
                    tail = l1;
                }
                l1 = l1.next;
            } else {
                if(head == null) {
                    head = l2;
                    tail = l2;
                } else {
                    tail.next = l2;
                    tail = l2;
                }
                l2 = l2.next;
            }
        }

        if(l1 != null)
            tail.next = l1;

        if(l2 != null)
            tail.next = l2;

        return head;
    }
}
