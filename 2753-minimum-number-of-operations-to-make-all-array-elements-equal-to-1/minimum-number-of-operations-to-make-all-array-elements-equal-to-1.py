class Solution:
    def minOperations(self, nums: List[int]) -> int:
        n = len(nums)
        # check if there is 1 in `nums`
        ones = nums.count(1)
        # if so, we can make all the other elements equal to 1 with one operation each
        # e.g. [2,6,1,4] -> [2,1,1,4] -> [1,1,1,4] -> [1,1,1,1]
        # the number of operation to make all equal to 1 is simply n - number of 1s
        if ones: return n - ones
        res = inf
        # try finding the shortest subarray with a gcd equal to 1.
        for i in range(n):
            # subarray starting from i
            g = nums[i]
            # try each element after i
            for j in range(i + 1, n):
                # to calculate gcd
                g = gcd(g, nums[j])
                # if the gcd is 1
                if g == 1:
                    # then we calculate the min ops
                    res = min(res, j - i)
        # no result -> return -1
        if res == inf: return -1
        # otherwise, return res + n - 1
        # i.e. the min ops to turn the shortest subarray to 1 + 
        #      use that 1 to convert n - 1 elements to 1
        return res + n - 1