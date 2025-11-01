class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        java.util.HashSet<Integer> mpp = new java.util.HashSet<>();
        for (int x : nums) mpp.add(x);
        while (head != null && mpp.contains(head.val)) head = head.next;
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            while (curr.next != null && mpp.contains(curr.next.val)) {
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }
}