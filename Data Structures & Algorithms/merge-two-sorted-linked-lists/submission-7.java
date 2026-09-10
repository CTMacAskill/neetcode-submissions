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
        ListNode joinedList = new ListNode(-1);
        ListNode firstNode = list1;
        ListNode secondNode = list2;
        
        while (firstNode != null && secondNode != null){
            if (firstNode.val < secondNode.val){
                if (joinedListHead.next == null){
                    joinedListHead = firstNode;
                    joinedList = joinedListHead;
                } else{
                    joinedList.next = firstNode;
                    joinedList = joinedList.next;
                }
                firstNode = firstNode.next;
                if (firstNode == null){
                    break;
                }
            } else {
                if (joinedListHead.next == null){
                    joinedListHead = secondNode;
                    joinedList = joinedListHead;
                } else{
                    joinedList.next = secondNode;
                    joinedList = joinedList.next;
                }
                secondNode = secondNode.next;
                if (secondNode == null){
                    break;
                }
            }
        }
        if(joinedList.next == firstNode){
            joinedList.next = secondNode;
        } else {
            joinedList.next = firstNode;
        }
        return joinedListHead;
    }
}