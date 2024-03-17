class Solution:
    def countDigits(self, num: int) -> int:
        s1 = str(num)
        n = len(s1)
        if n==1:
            return 1
        else:
            ans = 0 
            for i in s1:
                if num % int(i)==0:
                    ans = ans + 1
            return ans