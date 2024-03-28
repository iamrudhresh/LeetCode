class Solution:
    def firstUniqChar(self, s: str) -> int:
        setval = []

        for i in s:
            if i not in setval:
                setval.append(i)

        for i in setval:
            if s.count(i) == 1:
                return s.index(i)

        return -1