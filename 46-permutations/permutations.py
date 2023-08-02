class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        n=len(nums)
        return list(itertools.permutations(nums,n))