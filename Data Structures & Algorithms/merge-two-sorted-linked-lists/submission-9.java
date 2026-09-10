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
        
        if (list1 == null){
            return list2;
        } else if (list2 == null){
            return list1;
        }

        ListNode joinedListHead = new ListNode(-1);
        ListNode joinedList = joinedListHead;
        
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                if (joinedListHead.next == null){
                    joinedListHead = list1;
                    joinedList = joinedListHead;
                } else{
                    joinedList.next = list1;
                    joinedList = joinedList.next;
                }
                list1 = list1.next;
                if (list1 == null){
                    break;
                }
            } else {
                if (joinedListHead.next == null){
                    joinedListHead = list2;
                    joinedList = joinedListHead;
                } else{
                    joinedList.next = list2;
                    joinedList = joinedList.next;
                }
                list2 = list2.next;
                if (list2 == null){
                    break;
                }
            }
        }
        if(list1 == null){
            joinedList.next = list2;
        } else {
            joinedList.next = list1;
        }
        return joinedListHead;
    }
}