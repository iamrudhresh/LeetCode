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
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }

        //if value pointed by list1 pointer is less than or equal to value pointed by list2 pointer

        //calling recursively list1.next and whole list2
        if(list1.val <= list2.val)
        {
            list1.next =mergeTwoLists(list1.next,list2);
            return list1;
        }
        else
        //calling recursively list2.next and whole list1
        {
            list2.next=mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
}