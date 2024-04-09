class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        longinc=1
        longdec=1
        i=0
        j=0
        for i in range(len(nums)-1):
            if(i<len(nums)-1 and nums[i]<nums[i+1]):
                j=i
                while(j<len(nums)-1 and nums[j]<nums[j+1]):
                    j+=1
                longdec=max(j-i+1,longdec)
                i=j
            i+=1
        i=0
        j=0
        for i in range(len(nums)-1):
            if(i<len(nums)-1 and nums[i]>nums[i+1]):
                j=i
                while(j<len(nums)-1 and nums[j]>nums[j+1]):
                    j+=1
                longinc=max(j-i+1,longinc)
                i=j
            i+=1
        return max(longdec,longinc)
            
            
                    
                
        