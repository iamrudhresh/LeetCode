class Solution:
    def firstUniqChar(self, s: str) -> int:
        return (z:=Counter(s)) and next((i for i,c in enumerate(s) if z[c]<2),-1)