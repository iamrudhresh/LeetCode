class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        self.curr = head
        return self.solve(head)

    def solve(self, head: Optional[ListNode]) -> bool:
        if head is None:
            return True
        ans = self.solve(head.next) and head.val == self.curr.val
        self.curr = self.curr.next
        return ans