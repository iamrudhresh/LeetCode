class Solution:
    def countMaxOrSubsets(self, a: List[int]) -> int:
        return (f:=lambda i,o,O=reduce(or_,a):a[i:] and f(i+1,o)+f(i+1,o|a[i]) or o==O)(0,0)