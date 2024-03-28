class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        cumm = []

        i, j = 0, 0

        while i < len(nums1) and j < len(nums2):
            if nums1[i] < nums2[j]:
                cumm.append(nums1[i])
                i += 1
            elif nums1[i] > nums2[j]:
                cumm.append(nums2[j])
                j += 1
            else:
                cumm.append(nums1[i])
                cumm.append(nums2[j])
                i, j = i+1, j+1

        while i < len(nums1):
            cumm.append(nums1[i])
            i+=1
        
        while j < len(nums2):
            cumm.append(nums2[j])
            j+=1

        le = len(cumm)

        if le % 2 == 0:
            return (cumm[le // 2] + cumm[(le // 2) - 1])/2
        else:
            return cumm[le // 2]