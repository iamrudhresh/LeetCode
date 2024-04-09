class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        if not nums:
            return 0
        
        increasing_length = 1
        decreasing_length = 1
        max_length = 1
        
        for i in range(1, len(nums)):
            if nums[i] > nums[i - 1]:
                increasing_length += 1
                decreasing_length = 1
            elif nums[i] < nums[i - 1]:
                decreasing_length += 1
                increasing_length = 1
            else:
                increasing_length = 1
                decreasing_length = 1
            
            max_length = max(max_length, increasing_length, decreasing_length)
        
        return max_length