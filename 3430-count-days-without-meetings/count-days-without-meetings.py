class Solution:
    def countDays(self, days: int, meetings: List[List[int]]) -> int:
        ans = 0
        previ = 0
        for x, y in sorted(meetings):
            mini = min(x,days)
            ans = ans + max(0, mini - previ - 1)
            previ = max(previ, y)
        return ans + max(0,days - previ)