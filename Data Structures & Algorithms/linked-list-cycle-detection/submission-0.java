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
    public boolean hasCycle(ListNode head) {
        ListNode runner = head;
        ListNode chaser = head;
        while (runner != null && runner.next != null) {
            runner = runner.next.next;
            chaser = chaser.next;
            if (runner == chaser){
                return true;
            }
        }
        return false;
    }
}
