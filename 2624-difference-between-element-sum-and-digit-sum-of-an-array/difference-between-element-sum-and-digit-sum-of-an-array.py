class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        sum1 = sum(nums)
        sum2 = 0
        for i in nums:
            for j in str(i):
                sum2 += int(j)
        return abs(sum1 - sum2)