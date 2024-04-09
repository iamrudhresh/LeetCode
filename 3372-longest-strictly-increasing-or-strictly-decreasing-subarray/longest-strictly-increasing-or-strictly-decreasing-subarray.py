class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        count=1
        for i in range(len(nums)):
            for j in range(i+1,len(nums)+1):
                if nums[i:j]==sorted(nums[i:j]) and len(nums[i:j])==len(set(nums[i:j])) or nums[i:j]==sorted(nums[i:j])[::-1] and len(nums[i:j])==len(set(nums[i:j])):
                    count=max(count,len(nums[i:j]))
        return count