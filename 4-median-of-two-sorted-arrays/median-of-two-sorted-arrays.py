class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        ans = sorted(nums1 + nums2)

        le = len(ans)

        if le % 2 == 0:
            return (ans[le // 2] + ans[(le // 2) - 1])/2

        else:
            return ans[le // 2]