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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode joinedListHead = new ListNode(0);
        ListNode joinedList = joinedListHead;
        
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                joinedList.next = list1;
                list1 = list1.next;
            } else {
                joinedList.next = list2;
                list2 = list2.next;
            }
            joinedList = joinedList.next;
        }
        if(list1 == null){
            joinedList.next = list2;
        } else {
            joinedList.next = list1;
        }
        return joinedListHead.next;
    }
}